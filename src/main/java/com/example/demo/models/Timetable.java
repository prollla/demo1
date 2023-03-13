package com.example.demo.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
@Data
public class Timetable {
    @Id
    @Field("id")
    private String id;

    @Field("station")
    private String station;

    @Field("train")
    private String train;
}
