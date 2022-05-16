package com.example.Bike_API.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class License  {

    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "url")
    private String url;

    public License() {

    }

    public License(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
