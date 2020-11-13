package com.fanghao.springboot_demo.common;


import com.fanghao.springboot_demo.entity.Page;

/**
 * Created by FangHao on 2020/6/3 22:04.
 */
public class BaseExample<T extends BaseEntity> {
    protected Page page;

    public BaseExample() {
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Page getPage() {
        return this.page;
    }
}