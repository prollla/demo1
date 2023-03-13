package com.example.demo.controllers;
import com.example.demo.models.Station;
import com.example.demo.models.Trains;
import com.example.demo.services.TrainsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/trains")
public class TrainsController {
    private final TrainsService trainsService;
    @Autowired
    public TrainsController(TrainsService trainsService){
        this.trainsService = trainsService;
    }
    @GetMapping()
    public List<Trains> getStation(){
        return trainsService.getTrains();
    }

}
