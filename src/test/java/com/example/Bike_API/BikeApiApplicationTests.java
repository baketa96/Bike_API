package com.example.Bike_API;

import com.example.Bike_API.Models.Station;
import com.example.Bike_API.Models.Wrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BikeApiApplicationTests {

	@Autowired
	private RestController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

	@Test
	void shouldReturnAllData(){
		assertThat(controller.getAllData()).isNotNull();
	}


	@Test
	void shouldReturnOperationalData() {
		List<Station> allStations = ((Wrapper) Objects.requireNonNull(controller.getAllData().getBody())).getNetwork().getStations();
		List<Station> operationalStations = (List<Station>) controller.getAllOperational().getBody();
		assertThat(allStations).isNotNull();
		assertThat(operationalStations).isNotNull();
		assertThat(allStations.size()).isGreaterThan(operationalStations.size());
	}



	@Test
	void shouldReturnStats() {
		WSSStats stats = ((WSSStats) controller.getStats().getBody());
		assertThat(stats).isNotNull();
		assertThat(stats.getNoBikes()).isGreaterThan(0);
		assertThat(stats.getEmpty_slots()).isGreaterThan(0);
		assertThat(stats.getNoOperational()).isGreaterThan(0);
	}


	@Test
	void shouldReturnClosest() {
		double latitude = 48.867872484749;
		double longitude = 2.3648982158072;
		Station closest = ((Station) controller.getNearest(latitude, longitude).getBody());
		assertThat(closest).isNotNull();
		assertThat(closest.getLatitude()).isEqualTo(latitude);
		assertThat(closest.getLongitude()).isEqualTo(longitude);
	}



}
