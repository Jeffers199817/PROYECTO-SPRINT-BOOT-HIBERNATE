package com.pruebajpa.pruebajpa.service;

import com.pruebajpa.pruebajpa.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService {

    @Autowired
    private IMascotaRepository mascotaRepository;



}
