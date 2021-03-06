package com.demo.guoziyuan.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 市
 * Created by guoziyuan on 2017/8/10.
 */

public class City extends DataSupport {

    private int id;
    private String cityName;
    private int cityCode;

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
