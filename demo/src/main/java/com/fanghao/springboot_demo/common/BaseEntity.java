package com.fanghao.springboot_demo.common;

import java.util.Date;

/**
 * Created by FangHao on 2020/6/3 22:04.
 */
public class BaseEntity {
    private static String IS_NO = "n";
    protected Integer id;
    protected Integer creator;
    protected Date gmtCreate;
    protected Integer modifier;
    protected Date gmtModified;
    private String isDelete;

    public BaseEntity() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCreator() {
        return this.creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Date getGmtCreate() {
        return this.gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Integer getModifier() {
        return this.modifier;
    }

    public void setModifier(Integer modifier) {
        this.modifier = modifier;
    }

    public Date getGmtModified() {
        return this.gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getIsDelete() {
        return this.isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? IS_NO : isDelete.trim();
    }

    public void setDefaultBizValue(Integer userId) {
        if (userId == null) {
            userId = 0;
        }

        Date date = new Date();
        if (this.id == null) {
            this.creator = this.creator == null ? userId : this.creator;
            this.gmtCreate = this.gmtCreate == null ? date : this.gmtCreate;
            this.isDelete = this.isDelete == null ? IS_NO : this.isDelete;
        }

        this.modifier = this.modifier == null ? userId : this.modifier;
        this.gmtModified = this.gmtModified == null ? date : this.gmtModified;
    }
}
