package com.example.demo.models;

import javax.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;

@Entity
@Table(name= "Usuario")
public class UserModels {
    private Long id;
    private String username;
    private String password;
}