package com.nurlan.spring.example_site.spring_mvc.dao;

import com.nurlan.spring.example_site.spring_mvc.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
}