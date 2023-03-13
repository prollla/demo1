package com.example.demo.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "trains")
@Data
public class Trains {
    @Id
    @Field("id")
    private String id;

    @Field("name")
    private String name;
}
