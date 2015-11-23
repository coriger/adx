package com.xmxedu.oaken.biz;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Appinfo;
import com.xmxedu.oaken.dao.bll.*;
import com.xmxedu.oaken.sql.*;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 数据库中根据广告位id进行数据业务收集的工具类,根据最小粒度广告来映射整个数据
 * 将数据库中的数据进行收集，并提供一个完整广告位的广告请求数据
 *
 * @author xmzheng
 * @version 1.0.1
 */
@Service
public class AdBasicDataCollect {
    private final static Logger logger = LoggerFactory.getLogger(AdBasicDataCollect.class);

    @Autowired
    private AdInfoBLL adInfoBLL;

    @Autowired
    private AdTypeBLL adTypeBLL;

    @Autowired
    private BizAdShowTypeBLL adShowTypeBLL;

    @Autowired
    private AppInfoBLL appInfoBLL;

    @Autowired
    private BizAppAdBLL bizAppAdBLL;

    public AdInfo getAdInfoByShowId(String showId) {
        if (StringUtils.isBlank(showId)) {
            logger.error("empty showid from Ad Basic Data Collect");
            return null;
        }

        AdInfo adInfo = this.adInfoBLL.getAdInfoByShowId(showId);
        return adInfo;
    }

    public AdType getAdTypeByAdId(int adId){
        if (adId < 0){
            logger.error("invalid id,its value: {}",adId);
            return null;
        }

        BizAdShowType bizAdShowType = this.adShowTypeBLL.getBizAdShowTypeByAdId(adId);

        if (null == bizAdShowType){
            logger.warn("can not get bizAdShowType by adId of {}",adId);
            return null;
        }

        AdType adType = this.adTypeBLL.getAdTypeById(bizAdShowType.getShowTypeId());
        return adType;
    }

    public AppInfo getAppInfoByAdId(int adId){
        if (adId < 0){
            logger.error("invalid id,its value: {}",adId);
            return null;
        }

        BizAppAd bizAppAd = this.bizAppAdBLL.getBizAppAdByAdId(adId);
        if (null == bizAppAd){
            logger.warn("can not get bizAppAdBLL by adId of {}",adId);
            return null;
        }

        AppInfo appInfo = this.appInfoBLL.getAppInfoByAppId(bizAppAd.getAppId());
        return appInfo;
    }
}
