package com.example.demo.controllers;

import com.example.demo.models.Timetable;
import com.example.demo.services.TimetableService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/timetable")
public class TimetableController {
    private final TimetableService timetableService;
    public TimetableController(TimetableService timetableService){
        this.timetableService = timetableService;
    }

    @GetMapping()
    public List<Timetable> getTimetable(){
        return timetableService.getTimetable();
    }
}
