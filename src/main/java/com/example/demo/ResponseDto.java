package com.example.demo;

public class ResponseDto {

    private String version;
    private String health;
    private String message;

    public String getVersion() {

        return version;
    }

    public String getHealth() {

        return health;
    }

    public String getMessage() {

        return message;
    }

    public void setVersion(String version) {

        this.version = version;
    }

    public void setHealth(String health) {

        this.health = health;
    }

    public void setMessage(String message) {

        this.message = message;
    }
}
