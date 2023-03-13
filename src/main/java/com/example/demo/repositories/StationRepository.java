package com.example.demo.repositories;

import com.example.demo.models.Station;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface StationRepository extends MongoRepository<Station,String> {
    List<Station> findByColor(String color);

    void deleteByColor(String Color);
}
