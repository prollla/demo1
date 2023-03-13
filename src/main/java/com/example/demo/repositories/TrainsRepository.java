package com.example.demo.repositories;

import com.example.demo.models.Trains;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrainsRepository extends MongoRepository<Trains,String> {
}
