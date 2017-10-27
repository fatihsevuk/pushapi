package com.iotrack.pushapi.domain;

public class Body {

    private String version;
    private String secret;
    private String type;
    private BodyData data;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BodyData getData() {
        return data;
    }

    public void setData(BodyData data) {
        this.data = data;
    }
}
