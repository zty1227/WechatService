package com.jackson.service.weixin.impl;

import com.jackson.dao.ShareCountMapper;
import com.jackson.entity.ShareCount;
import com.jackson.entity.ShareCountExample;
import com.jackson.service.weixin.ShareCountService;
import com.jackson.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yanglin on 2017/1/7.
 */
@Service
public class ShareCountServiceImpl implements ShareCountService{

    @Autowired
    protected ShareCountMapper shareCountMapper;

    public int insertCount(ShareCount shareCount) {
        /*//先查看是否已经分享
        ShareCountExample shareCountExample = new ShareCountExample();
        ShareCountExample.Criteria criteria = shareCountExample.createCriteria();
        criteria.andOpenIdEqualTo(shareCount.getOpenId());
        criteria.andContentIdEqualTo(shareCount.getContentId());
        criteria.andShareTypeEqualTo(shareCount.getShareType());
        List<ShareCount> shareCounts = shareCountMapperl.selectByExample(shareCountExample);

        if(shareCounts.size()==0){
            return shareCountMapperl.insert(shareCount);
        }else {
            return 0;
        }*/
        return  shareCountMapper.insert(shareCount);
    }

    public int countAll(int commentId) {
        ShareCountExample shareCountExample = factory(commentId, null);
        return shareCountMapper.countByExample(shareCountExample);
    }

    public int couantQQ(int commentId) throws Exception {
        ShareCountExample shareCountExample = factory(commentId, Constants.QQ);
        return shareCountMapper.countByExample(shareCountExample);
    }

    public int countQZone(int commentId) throws Exception {
        ShareCountExample shareCountExample = factory(commentId, Constants.QZONE);
        return shareCountMapper.countByExample(shareCountExample);
    }

    public int countweibo(int commentId) throws Exception {
        ShareCountExample shareCountExample = factory(commentId, Constants.WEIBO);
        return shareCountMapper.countByExample(shareCountExample);
    }

    public int countAppmessage(int commentId) throws Exception {
        ShareCountExample shareCountExample = factory(commentId, Constants.APPMESSAGE);
        return shareCountMapper.countByExample(shareCountExample);
    }

    public int countTimeLine(int commentId) throws Exception {
        ShareCountExample shareCountExample = factory(commentId, Constants.TIMELINE);
        return shareCountMapper.countByExample(shareCountExample);
    }

    public int countType(int commentId,String types) throws Exception {
        ShareCountExample shareCountExample = factory(commentId, types);
        return shareCountMapper.countByExample(shareCountExample);
    }

    private ShareCountExample factory(int commentId,String types){
        ShareCountExample shareCountExample = new ShareCountExample();
        ShareCountExample.Criteria criteria = shareCountExample.createCriteria();
        criteria.andContentidEqualTo(commentId);
        if(types!=null){
            criteria.andSharetypeEqualTo(types);
        }
        return shareCountExample;
    }
}
