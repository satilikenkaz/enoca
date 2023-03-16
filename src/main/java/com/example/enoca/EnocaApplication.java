package com.example.enoca;

import jakarta.persistence.*;
import org.hibernate.annotations.Table;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class EnocaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnocaApplication.class, args);
	}

}
