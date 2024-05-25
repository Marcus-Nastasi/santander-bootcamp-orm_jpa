package com.pan.ormJpa.Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "birth")
    private LocalDate birth;

    @Override
    public String toString() {
        return(
            "User{" + "id=" + id + ", name='" + name + '\'' +
            ", email='" + email + '\'' + ", birth=" + birth + '}'
        );
    }

    public void update(String name, String email, LocalDate birth) {
        this.setName(name);
        this.setEmail(email);
        this.setBirth(birth);
    }

    public void update(String name, String email) {
        this.setName(name);
        this.setEmail(email);
    }

    public void update(String name) {
        this.setName(name);
    }

    public int getId() {
        return id;
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

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }
}


