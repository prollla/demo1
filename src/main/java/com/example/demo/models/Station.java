package com.example.demo.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "station")
@Data
public class Station {
    @Id
    @Field("id")
    private String id;

    @Field("color")
    private String color;
}
