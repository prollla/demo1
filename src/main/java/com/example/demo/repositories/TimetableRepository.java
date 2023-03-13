package com.example.demo.repositories;

import com.example.demo.models.Timetable;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
public interface TimetableRepository extends MongoRepository<Timetable, String> {


}
