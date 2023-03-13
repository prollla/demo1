package com.example.demo.services;

import com.example.demo.models.Timetable;
import com.example.demo.repositories.TimetableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class TimetableService {
    private final TimetableRepository timetableRepository;

    @Autowired
    public TimetableService(TimetableRepository timetableRepository){
        this.timetableRepository = timetableRepository;
    }

    public List<Timetable> getTimetable(){
        return timetableRepository.findAll();
    }
}
