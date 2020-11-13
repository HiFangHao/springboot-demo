package com.fanghao.springboot_demo.entity;

/**
 * Created by FangHao on 2020/6/3 21:33.
 */
public class Page {
    private int begin = 0;
    private int end = 10000;
    private int length = 10000;
    private int count = 0;
    private int current = 1;
    private int total;

    public Page() {
    }

    public Page(int current, int length, int count) {
        this.length = length > 10000 ? 100000 : length;
        this.count = count;
        this.current = current;
        this.begin = (this.current - 1) * this.length;
        this.end = this.begin + this.length;
        this.end = this.end > this.count ? this.count : this.end;
        this.total = (this.count - 1) / this.length + 1;
    }

    public void init(int current, int length, int count) {
        this.length = length > 10000 ? 100000 : length;
        this.count = count;
        this.current = current;
        this.begin = (this.current - 1) * this.length;
        this.end = this.begin + this.length;
        this.end = this.end > this.count ? this.count : this.end;
        this.total = (this.count - 1) / this.length + 1;
    }

    public int getBegin() {
        return this.begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
        this.init(this.current, this.length, this.count);
    }

    public int getEnd() {
        return this.end;
    }

    public void setEnd(int end) {
        this.end = end;
        this.init(this.current, this.length, this.count);
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
        this.init(this.current, this.length, this.count);
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
        this.init(this.current, this.length, this.count);
    }

    public int getCurrent() {
        return this.current;
    }

    public void setCurrent(int current) {
        this.current = current;
        this.init(this.current, this.length, this.count);
    }

    public int getTotal() {
        return this.total == 0 ? 1 : this.total;
    }

    public void setTotal(int total) {
        this.total = total;
        this.init(this.current, this.length, this.count);
    }
}
