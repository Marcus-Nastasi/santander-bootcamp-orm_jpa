package com.pan.ormJpa.Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "viagensDIO")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }
}


