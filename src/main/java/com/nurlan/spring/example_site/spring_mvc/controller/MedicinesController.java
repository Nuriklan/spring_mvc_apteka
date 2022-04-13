package com.nurlan.spring.example_site.spring_mvc.controller;

import com.nurlan.spring.example_site.spring_mvc.entity.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nurlan.spring.example_site.spring_mvc.service.MedicineService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MedicinesController {

    @Autowired
    private MedicineService medicineService;

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/medicines")
    public List<Medicine> showAllMedicines() {
        List<Medicine> allMedicines = medicineService.getAllMedicines();
        return allMedicines;
    }
}
