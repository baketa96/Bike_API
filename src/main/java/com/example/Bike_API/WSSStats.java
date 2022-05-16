package com.example.Bike_API;

public class WSSStats  {

    private Integer noOperational;
    private Integer noBikes;
    private Integer empty_slots;

    public WSSStats(){

    }

    public WSSStats(Integer noOperational, Integer noBikes, Integer empty_slots) {
        this.noOperational = noOperational;
        this.noBikes = noBikes;
        this.empty_slots = empty_slots;
    }

    public Integer getNoOperational() {
        return noOperational;
    }

    public void setNoOperational(Integer noOperational) {
        this.noOperational = noOperational;
    }

    public Integer getNoBikes() {
        return noBikes;
    }

    public void setNoBikes(Integer noBikes) {
        this.noBikes = noBikes;
    }

    public Integer getEmpty_slots() {
        return empty_slots;
    }

    public void setEmpty_slots(Integer empty_slots) {
        this.empty_slots = empty_slots;
    }
}
