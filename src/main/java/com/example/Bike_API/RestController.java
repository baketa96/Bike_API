package com.example.Bike_API;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private APIService service;

    @GetMapping("/")
    public String index() {
        return "Hello World!";
    }


    @GetMapping(value = "/all_data")
    public ResponseEntity getAllData(){
        try {
            return ResponseEntity.ok().body(service.getAllData());
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }



    @GetMapping(value = "/operational")
    public ResponseEntity getAllOperational(){
        try {
            return ResponseEntity.ok().body(service.getOperational());
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


    @GetMapping("/stats")
    public ResponseEntity getStats(){
        try {
            return ResponseEntity.ok().body(service.getStats());
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }



    @GetMapping("/closest")
    public ResponseEntity getNearest( @RequestParam(value = "latitude") double latitude,
                                      @RequestParam(value = "longitude") double longitude){
        try {
            return ResponseEntity.ok().body(service.getClosest(latitude, longitude));
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }



}
