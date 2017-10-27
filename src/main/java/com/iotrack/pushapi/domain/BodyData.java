package com.iotrack.pushapi.domain;

import java.util.ArrayList;
import java.util.List;

public class BodyData {

    private String apMac;
    private List<String> apTags;
    private List<String> apFloors=new ArrayList<>();
    private List<Observations> observations=new ArrayList<>();

    public String getApMac() {
        return apMac;
    }

    public void setApMac(String apMac) {
        this.apMac = apMac;
    }

    public List<String> getApTags() {
        return apTags;
    }

    public void setApTags(List<String> apTags) {
        this.apTags = apTags;
    }

    public List<String> getApFloors() {
        return apFloors;
    }

    public void setApFloors(List<String> apFloors) {
        this.apFloors = apFloors;
    }

    public List<Observations> getObservations() {
        return observations;
    }

    public void setObservations(List<Observations> observations) {
        this.observations = observations;
    }
}
