package com.nurlan.spring.example_site.spring_mvc.entity;

import javax.persistence.*;

@Entity
@Table(name = "companies")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "country")
    private String country;

    @Column(name = "name")
    private String name;

    public Company(String country, String name) {
        this.country = country;
        this.name = name;
    }

    public Company() {
    }
// GETTERS AND SETTERS

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // END GETTERS AND SETTERS
}