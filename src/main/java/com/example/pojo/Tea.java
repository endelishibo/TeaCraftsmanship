package com.example.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Tea {
    @Id
    private Long id;
    private String title;
    private String place;
    private String text;

    // Getters and Setters
}
