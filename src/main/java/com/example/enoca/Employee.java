package com.example.enoca;

import jakarta.persistence.*;
import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table(appliesTo = "employee")
public class Employee {

    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public com.example.enoca.Company getCompany() {
        return company;
    }

    public void setCompany(com.example.enoca.Company company) {
        this.company = company;
    }
}
