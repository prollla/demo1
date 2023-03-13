package com.example.demo.services;

import com.example.demo.models.Station;
import com.example.demo.repositories.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
@Transactional(readOnly = true)
public class StationService {
    private final StationRepository stationRepository;
    @Autowired
    public StationService(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }


    public List<Station> getStationByColor(String color) {
        return stationRepository.findByColor(color);
    }

    public List<Station> getStation() {
        return stationRepository.findAll();
    }

    @Transactional
    public void save(Station station) {
        stationRepository.save(station);
    }

    @Transactional
    public void deleteByColor(String color) {
        stationRepository.deleteByColor(color);
    }
}
