package com.example.Bike_API.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Station  {

    @JsonProperty(value = "empty_slots")
    private Integer emptySlots;

    @JsonProperty(value = "extra")
    private Extra extra;
    @JsonProperty(value = "free_bikes")
    private Integer freeBikes;
    @JsonProperty(value = "id")
    private String id;
    @JsonProperty(value = "latitude")
    private Double latitude;
    @JsonProperty(value = "longitude")
    private Double longitude;
    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "timestamp")
    private Date timestamp;

    public Station() {
    }

    public Station(Integer emptySlots, Extra extra, Integer freeBikes, String id, Double latitude, Double longitude, String name, Date timestamp) {
        this.emptySlots = emptySlots;
        this.extra = extra;
        this.freeBikes = freeBikes;
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.timestamp = timestamp;
    }

    public Integer getEmptySlots() {
        return emptySlots;
    }

    public void setEmptySlots(Integer emptySlots) {
        this.emptySlots = emptySlots;
    }

    public Extra getExtra() {
        return extra;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }

    public Integer getFreeBikes() {
        return freeBikes;
    }

    public void setFreeBikes(Integer freeBikes) {
        this.freeBikes = freeBikes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
