package com.example.Bike_API.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Wrapper{

    @JsonProperty(value = "network")
    private Network network;

    public Wrapper(Network network) {
        this.network = network;
    }

    public Wrapper() {
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }
}
