package com.demo.guoziyuan.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 省
 * Created by guoziyuan on 2017/8/10.
 */

public class Provice extends DataSupport {

    private int id;
    private String proviceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProviceName() {
        return proviceName;
    }

    public void setProviceName(String proviceName) {
        this.proviceName = proviceName;
    }
}
