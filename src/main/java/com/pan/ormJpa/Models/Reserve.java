package com.pan.ormJpa.Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "reserve")
public class Reserve {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "id_user")
    private int id_user;

    @Column(name = "id_destiny")
    private int id_destiny;

    @Column(name = "reserve_date")
    private LocalDate reserve_date;

    @Column(name = "status")
    private String status;

    @Override
    public String toString() {
        return(
            "Reserve{" + "id=" + id + ", id_user=" + id_user + ", id_destiny=" + id_destiny +
            ", reserve_date=" + reserve_date + ", status='" + status + '\'' + '}'
        );
    }

    public int getId() {
        return id;
    }

    public int getId_user() {
        return id_user;
    }

    public int getId_destiny() {
        return id_destiny;
    }

    public LocalDate getReserve_date() {
        return reserve_date;
    }

    public String getStatus() {
        return status;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setId_destiny(int id_destiny) {
        this.id_destiny = id_destiny;
    }

    public void setReserve_date(LocalDate reserve_date) {
        this.reserve_date = reserve_date;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}


