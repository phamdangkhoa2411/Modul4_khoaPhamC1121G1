package com.example.quan_ly_dien_thoai.service.impl;

import com.example.quan_ly_dien_thoai.Repository.ISmartphoneRepository;
import com.example.quan_ly_dien_thoai.model.Smartphone;
import com.example.quan_ly_dien_thoai.service.ISmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class SmartphoneService implements ISmartphoneService {
    @Autowired
    private ISmartphoneRepository smartPhoneRepository;

    @Override
    public Iterable<Smartphone> findAll() {
        return smartPhoneRepository.findAll();
    }

    @Override
    public Optional<Smartphone> findById(Long id) {
        return smartPhoneRepository.findById(id);
    }

    @Override
    public Smartphone save(Smartphone smartPhone) {
        return smartPhoneRepository.save(smartPhone);
    }

    @Override
    public void remove(Long id) {
        smartPhoneRepository.deleteById(id);
    }
}
