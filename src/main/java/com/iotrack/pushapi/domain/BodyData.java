package com.iotrack.pushapi.domain;

import java.util.List;

public class BodyData {

    private String apMac;
    private List<String> apTags;
    private List<String> apFloors;
    private Observations observations;

    public String getApMac() {
        return apMac;
    }

    public void setApMac(String apMac) {
        this.apMac = apMac;
    }

    public String getApTags() {
        return apTags;
    }

    public void setApTags(String apTags) {
        this.apTags = apTags;
    }

    public List<String> getApFloors() {
        return apFloors;
    }

    public void setApFloors(List<String> apFloors) {
        this.apFloors = apFloors;
    }

    public Observations getObservations() {
        return observations;
    }

    public void setObservations(Observations observations) {
        this.observations = observations;
    }
}
