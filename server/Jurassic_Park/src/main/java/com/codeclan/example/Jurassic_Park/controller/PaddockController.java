package com.codeclan.example.Jurassic_Park.controller;

import com.codeclan.example.Jurassic_Park.models.Paddock;
import com.codeclan.example.Jurassic_Park.repositories.PaddockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/paddocks")
public class PaddockController {

    @Autowired
    PaddockRepository paddockRepository;

    @GetMapping
    public List<Paddock> getAllPaddocks() {
        return paddockRepository.findAll();
    }
}