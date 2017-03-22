package com.jackson.entity;

public class WeiboData {
    private String contentid;

    private String content;

    private String imgurl;

    private String time;

    private Integer zan;

    private Integer zhuanfa;

    private Integer pinglun;

    private String weiboname;

    private String zone;

    private Boolean ischeck;

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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public Integer getZan() {
        return zan;
    }

    public void setZan(Integer zan) {
        this.zan = zan;
    }

    public Integer getZhuanfa() {
        return zhuanfa;
    }

    public void setZhuanfa(Integer zhuanfa) {
        this.zhuanfa = zhuanfa;
    }

    public Integer getPinglun() {
        return pinglun;
    }

    public void setPinglun(Integer pinglun) {
        this.pinglun = pinglun;
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

    public Boolean getIscheck() {
        return ischeck;
    }

    public void setIscheck(Boolean ischeck) {
        this.ischeck = ischeck;
    }

    @Override
    public String toString() {
        return "WeiboData{" +
                "contentid='" + contentid + '\'' +
                ", content='" + content + '\'' +
                ", imgurl='" + imgurl + '\'' +
                ", time='" + time + '\'' +
                ", zan=" + zan +
                ", zhuanfa=" + zhuanfa +
                ", pinglun=" + pinglun +
                ", weiboname='" + weiboname + '\'' +
                ", zone='" + zone + '\'' +
                ", ischeck=" + ischeck +
                '}';
    }
}