package com.jackson.service.weixin;

import com.jackson.entity.WeixinMedia;
import com.jackson.entity.WxMedia;

/**
 * Created by zhangtianyu on 2017/2/18.
 */
public interface WxMediaService {

    //实现上传功能时往页面传递用户参数
    WxMedia sendOpenid(String openid)throws Exception;

    /**
     * 上传媒体文件到微信，获取MediaID
     * @param type
     * @param mediaFileUrl
     * @return mediaID
     */
    public WeixinMedia updateTmpMedia(String type, String mediaFileUrl) throws Exception;

    /**
     * 下载媒体文件到指定路径
     * @param mediaId
     * @param savePath
     * @return
     */
    public String downloadMeida(String mediaId, String savePath) throws Exception;

    /**
     * 保存media到数据库
     * @param weixinMedia
     * @return
     */
    public int saveMeida(WeixinMedia weixinMedia);

    /**
     * 删除数据库中保存的media文件
     * @param MediaId
     * @return
     */
    public int deleteMeidaByMediaId(String MediaId);
}
