package com.jackson.service.weixin;


import com.jackson.entity.ShareCount;

/**
 * Created by yanglin on 2017/1/7.
 */
public interface ShareCountService {
    /**
     * 统计分析
     * @param shareCount
     * @return
     */
    public int insertCount(ShareCount shareCount) throws Exception;


    /**
     * 总共有多少分享
     * @return
     */
    public int countAll(int commentId) throws Exception;

    /**
     * 统计分享到QQ的次数
     * @return
     * @throws Exception
     */
    public int couantQQ(int commentId)throws Exception;

    /**
     * 统计分享到QQ空间的次数
     * @return
     * @throws Exception
     */
    public int countQZone(int commentId)throws Exception;

    /**
     * 统计分享到微博的次数
     * @return
     * @throws Exception
     */
    public int countweibo(int commentId) throws Exception;

    /**
     * 统计分享到好友的次数
     * @return
     * @throws Exception
     */
    public int countAppmessage(int commentId) throws Exception;

    /**
     * 统计分享到好友圈的次数
     * @return
     * @throws Exception
     */
    public int countTimeLine(int commentId) throws Exception;

    /**
     * 通过传入的类型来统计分享的次数
     * @return
     * @throws Exception
     */
    public int countType(int commentId, String types) throws Exception;
}
