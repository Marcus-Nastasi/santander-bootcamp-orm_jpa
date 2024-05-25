package com.pan.ormJpa.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "destiny")
public class Destiny {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Override
    public String toString() {
        return("Destiny{" + "id=" + id + ", name='" + name + '\'' + ", description='" + description + '\'' + '}');
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


