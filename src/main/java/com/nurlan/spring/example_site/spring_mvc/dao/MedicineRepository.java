package com.nurlan.spring.example_site.spring_mvc.dao;

import com.nurlan.spring.example_site.spring_mvc.entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepository extends JpaRepository<Medicine, Integer> {
}