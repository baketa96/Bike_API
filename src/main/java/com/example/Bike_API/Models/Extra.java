package com.example.Bike_API.Models;

import java.io.Serializable;
import java.util.Date;

public class Extra  {


        private Boolean banking;
        private Integer ebikes;
        private Date last_updated;
        private Integer renting;
        private Integer returning;
        private Long station_id;
        private String uid;

    public Extra() {
    }

    public Extra(Boolean banking, Integer ebikes, Date last_updated, Integer renting, Integer returning, Long station_id, String uid) {
        this.banking = banking;
        this.ebikes = ebikes;
        this.last_updated = last_updated;
        this.renting = renting;
        this.returning = returning;
        this.station_id = station_id;
        this.uid = uid;
    }

    public Boolean getBanking() {
        return banking;
    }

    public void setBanking(Boolean banking) {
        this.banking = banking;
    }

    public Integer getEbikes() {
        return ebikes;
    }

    public void setEbikes(Integer ebikes) {
        this.ebikes = ebikes;
    }

    public Date getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(Date last_updated) {
        this.last_updated = last_updated;
    }

    public Integer getRenting() {
        return renting;
    }

    public void setRenting(Integer renting) {
        this.renting = renting;
    }

    public Integer getReturning() {
        return returning;
    }

    public void setReturning(Integer returning) {
        this.returning = returning;
    }

    public Long getStation_id() {
        return station_id;
    }

    public void setStation_id(Long station_id) {
        this.station_id = station_id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
