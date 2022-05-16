package com.example.Bike_API;

public enum Endpoints {

    BIKE_API("https://api.citybik.es/v2/networks/velib");

    public final String value;

    Endpoints(String value){
        this.value = value;
    }
}
