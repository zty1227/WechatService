package com.jackson.entity;

public class ShareCount {
    private Integer id;

    private Long ctime;

    private Integer contentId;

    private String openId;

    private String shareType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getCtime() {
        return ctime;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getShareType() {
        return shareType;
    }

    public void setShareType(String shareType) {
        this.shareType = shareType == null ? null : shareType.trim();
    }
}