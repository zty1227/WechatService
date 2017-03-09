package com.jackson.entity;

public class WeixinMedia {
    private Integer id;

    private String type;

    private String tmp;

    private String mediaid;

    private String savepath;

    private Long creatat;

    private String openid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTmp() {
        return tmp;
    }

    public void setTmp(String tmp) {
        this.tmp = tmp == null ? null : tmp.trim();
    }

    public String getMediaid() {
        return mediaid;
    }

    public void setMediaid(String mediaid) {
        this.mediaid = mediaid == null ? null : mediaid.trim();
    }

    public String getSavepath() {
        return savepath;
    }

    public void setSavepath(String savepath) {
        this.savepath = savepath == null ? null : savepath.trim();
    }

    public Long getCreatat() {
        return creatat;
    }

    public void setCreatat(Long creatat) {
        this.creatat = creatat;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    @Override
    public String toString() {
        return "WeixinMedia{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", tmp='" + tmp + '\'' +
                ", mediaid='" + mediaid + '\'' +
                ", savepath='" + savepath + '\'' +
                ", creatat=" + creatat +
                ", openid='" + openid + '\'' +
                '}';
    }
}