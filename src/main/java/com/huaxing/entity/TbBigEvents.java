package com.huaxing.entity;

import java.util.Date;

public class TbBigEvents {
    private Integer id;
    private String title;
    private String surnameId;
    private String clanDetail;
    private Integer scan;
    private Date createTime;
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSurnameId() {
        return surnameId;
    }

    public void setSurnameId(String surnameId) {
        this.surnameId = surnameId;
    }

    public String getClanDetail() {
        return clanDetail;
    }

    public void setClanDetail(String clanDetail) {
        this.clanDetail = clanDetail;
    }

    public Integer getScan() {
        return scan;
    }

    public void setScan(Integer scan) {
        this.scan = scan;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
