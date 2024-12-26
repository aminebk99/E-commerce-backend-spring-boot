package com.microservicesapp.ecommercebackend;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String username;
    private String password;
}
