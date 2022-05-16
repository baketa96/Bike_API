package com.example.Bike_API.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Network {

    @JsonProperty(value = "company")
    private String company;
    @JsonProperty(value = "ebikes")
    private Boolean ebikes;
    @JsonProperty(value = "gbfs_href")
    private String gbfsHref;
    @JsonProperty(value = "href")
    private String href;
    @JsonProperty(value = "id")
    private String id;
    @JsonProperty(value = "license")
    private License license;
    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "location")
    private Location location;
    @JsonProperty(value = "stations")
    private List<Station> stations;


    public Network() {
    }

    public Network(String company, Boolean ebikes, String gbfsHref, String href, String id, License license, String name, Location location, List<Station> stations) {
        this.company = company;
        this.ebikes = ebikes;
        this.gbfsHref = gbfsHref;
        this.href = href;
        this.id = id;
        this.license = license;
        this.name = name;
        this.location = location;
        this.stations = stations;
    }


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Boolean getEbikes() {
        return ebikes;
    }

    public void setEbikes(Boolean ebikes) {
        this.ebikes = ebikes;
    }

    public String getGbfsHref() {
        return gbfsHref;
    }

    public void setGbfsHref(String gbfsHref) {
        this.gbfsHref = gbfsHref;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }
}
