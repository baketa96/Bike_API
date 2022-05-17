package com.example.Bike_API;

import com.example.Bike_API.Models.Extra;
import com.example.Bike_API.Models.Station;
import com.example.Bike_API.Models.Wrapper;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class APIService {

    private final RestTemplate restTemplate;

    public APIService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }



    public Wrapper getAllData() {
        return this.restTemplate.getForObject(Endpoints.BIKE_API.value, Wrapper.class);
    }


    private Boolean isOperational(Extra extra){
        return extra != null && extra.getRenting() != null && extra.getRenting().equals(1);
    }

    private List<Station> getAllStations(){
        Wrapper wrapper = getAllData();
        return  wrapper != null && wrapper.getNetwork() != null && wrapper.getNetwork().getStations() != null
                ? wrapper.getNetwork().getStations() : new ArrayList<>();
    }
    public List<Station> getOperational() {
        List<Station> allStations = getAllStations();
        return allStations.stream().filter(a -> isOperational(a.getExtra())).collect(Collectors.toList());

    }

    public WSSStats getStats() {
        int noOfOperational = 0;
        int noOfBikes = 0;
        int noOfSlots = 0;

        List<Station> allStations = getOperational();
        for (Station station : allStations) {
                noOfOperational++;
                noOfBikes+=station.getFreeBikes();
                noOfSlots+=station.getEmptySlots();
        }
        return new WSSStats(noOfOperational, noOfBikes, noOfSlots);
    }

    public Station getClosest(Double lat, Double lon) {
        List<Station> operationalStations = getOperational();
        Station closest = null;
        Double minDistance = null;
        for (Station station : operationalStations) {
            Double distance = DistanceHelper.calculateDistance(lat, station.getLatitude(), lon, station.getLongitude());
            if (minDistance == null || minDistance > distance) {
                minDistance = distance;
                closest = station;
            }
        }
        return closest;
    }

}
