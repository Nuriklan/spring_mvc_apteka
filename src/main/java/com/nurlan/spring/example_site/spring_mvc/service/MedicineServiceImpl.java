package com.nurlan.spring.example_site.spring_mvc.service;

import com.nurlan.spring.example_site.spring_mvc.dao.MedicineRepository;
import com.nurlan.spring.example_site.spring_mvc.entity.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineServiceImpl implements MedicineService {

    @Autowired
    private MedicineRepository medicineRepository;

    @Override
    public List<Medicine> getAllMedicines() {
        return medicineRepository.findAll();
    }
}
