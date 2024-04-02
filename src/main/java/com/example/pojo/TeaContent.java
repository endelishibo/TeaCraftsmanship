package com.example.pojo;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.repository.cdi.Eager;

@Data
@Entity
public class TeaContent {
    @Id
    private Long id;
    private String name;
    private String title;
    private String history;
    private Long makeId;
}
