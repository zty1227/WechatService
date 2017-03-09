package com.jackson.service.weixin.impl;

import com.jackson.dao.WeixinMediaMapper;
import com.jackson.entity.WeixinMedia;
import com.jackson.entity.WxMedia;
import com.jackson.service.weixin.WxMediaService;
import me.chanjar.weixin.mp.api.WxMpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhangtianyu on 2017/2/18.
 */
@Service
public class WxMediaServiceImpl implements WxMediaService {

    @Autowired
    protected WeixinMediaMapper mapper;
    @Autowired
    protected WxMpService wxMpService;

    @Override
    public WxMedia sendOpenid(String openid) throws Exception {
        WxMedia wxMedia = new WxMedia();
        wxMedia.setOpenid(openid);
        return wxMedia;
    }

    @Override
    public WeixinMedia updateTmpMedia(String type, String mediaFileUrl) throws Exception {
//        WxMediaImgUploadResult wxMediaImgUploadResult = wxMpService.getMaterialService().mediaUpload(
        return null;
    }

    @Override
    public String downloadMeida(String mediaId, String savePath) throws Exception {
        return null;
    }

    @Override
    public int saveMeida(WeixinMedia weixinMedia) {
        return this.mapper.insert(weixinMedia);
    }

    @Override
    public int deleteMeidaByMediaId(String MediaId) {
//        WeixinMediaExample weChatMediaExample = new WeixinMediaExample();
//        WeixinMediaExample.Criteria criteria = weChatMediaExample.createCriteria();
//
//        return weChatMediaMapper.deleteByExample(weChatMediaExample)
        return 0;
    }
}
