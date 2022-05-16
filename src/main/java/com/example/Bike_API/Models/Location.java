package com.example.Bike_API.Models;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Location  {

        @JsonProperty(value = "city")
        private String city;

        @JsonProperty(value = "country")
        private String country;

        @JsonProperty(value = "latitude")
        private Double latitude;
        @JsonProperty(value = "longitude")
        private Double longitude;


        public Location() {
        }

        public Location(String city, String country, Double latitude, Double longitude) {
                this.city = city;
                this.country = country;
                this.latitude = latitude;
                this.longitude = longitude;
        }

        public String getCity() {
                return city;
        }

        public void setCity(String city) {
                this.city = city;
        }

        public String getCountry() {
                return country;
        }

        public void setCountry(String country) {
                this.country = country;
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
}
