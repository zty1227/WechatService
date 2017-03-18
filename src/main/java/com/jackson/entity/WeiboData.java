package com.jackson.entity;

public class WeiboData {
    private String contentid;

    private String content;

    private String imgurl;

    private String weiboname;

    private String zone;

    public String getContentid() {
        return contentid;
    }

    public void setContentid(String contentid) {
        this.contentid = contentid == null ? null : contentid.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public String getWeiboname() {
        return weiboname;
    }

    public void setWeiboname(String weiboname) {
        this.weiboname = weiboname == null ? null : weiboname.trim();
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone == null ? null : zone.trim();
    }

    @Override
    public String toString() {
        return "WeiboData{" +
                "contentid='" + contentid + '\'' +
                ", content='" + content + '\'' +
                ", imgurl='" + imgurl + '\'' +
                ", weiboname='" + weiboname + '\'' +
                ", zone='" + zone + '\'' +
                '}';
    }
}