package com.webshop.demo.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class TestUsers {

    @Positive
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Column(name = "username")
    private String username;

    @NotBlank
    @Column(name = "email", unique = true)
    private String email;


    public TestUsers() {
    }


    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
