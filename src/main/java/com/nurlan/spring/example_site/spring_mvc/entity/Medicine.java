package com.nurlan.spring.example_site.spring_mvc.entity;

import javax.persistence.*;

@Entity
@Table(name = "medicines")
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    public Medicine(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Medicine() {
    }

    @Column(name = "name")
    private String name;

    @Column(name = "price", nullable = false)
    private int price;

    @Column(name = "company_id", nullable = false)
    private int companyId;

    // GETTERS AND SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }
    // END GETTERS AND SETTERS
}