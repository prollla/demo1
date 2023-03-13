package com.example.demo.services;

import com.example.demo.models.Trains;
import com.example.demo.repositories.StationRepository;
import com.example.demo.repositories.TrainsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
@Transactional(readOnly = true)
public class TrainsService {
    private final TrainsRepository trainsRepository;

    @Autowired
    public TrainsService(TrainsRepository trainsRepository) {
        this.trainsRepository = trainsRepository;
    }
    public List<Trains> getTrains(){
        return trainsRepository.findAll();
    }
    @Transactional
    public void save(Trains trains) {
        trainsRepository.save(trains);
    }
}
