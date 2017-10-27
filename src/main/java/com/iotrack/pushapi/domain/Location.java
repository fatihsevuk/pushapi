package com.iotrack.pushapi.domain;

import java.util.ArrayList;
import java.util.List;

public class Location {

    private double lat;
    private double lang;
    private double unc;

    private List<Double> x = new ArrayList<>();
    private List<Double> y = new ArrayList<>();

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLang() {
        return lang;
    }

    public void setLang(double lang) {
        this.lang = lang;
    }

    public double getUnc() {
        return unc;
    }

    public void setUnc(double unc) {
        this.unc = unc;
    }

    public List<Double> getX() {
        return x;
    }

    public void setX(List<Double> x) {
        this.x = x;
    }

    public List<Double> getY() {
        return y;
    }

    public void setY(List<Double> y) {
        this.y = y;
    }
}
