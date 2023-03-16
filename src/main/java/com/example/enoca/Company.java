package com.example.enoca;

import jakarta.persistence.*;
import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table(appliesTo = "company")
public class Company {

    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
