package com.codeclan.example.Jurassic_Park.components;

import com.codeclan.example.Jurassic_Park.controller.DinosaurController;
import com.codeclan.example.Jurassic_Park.models.Paddock;
import com.codeclan.example.Jurassic_Park.models.Dinosaur;
import com.codeclan.example.Jurassic_Park.models.Triceratops;
import com.codeclan.example.Jurassic_Park.models.inheritance.Dino;
import com.codeclan.example.Jurassic_Park.repositories.DinosaurRepository;
import com.codeclan.example.Jurassic_Park.repositories.PaddockRepository;
import com.codeclan.example.Jurassic_Park.repositories.DinosaurRepository;
import com.codeclan.example.Jurassic_Park.repositories.TriceratopsRepository;
import com.codeclan.example.Jurassic_Park.repositories.inheritance.TriceratopsInheritRepository;


import com.codeclan.example.Jurassic_Park.models.Bank;
import com.codeclan.example.Jurassic_Park.models.Game;
import com.codeclan.example.Jurassic_Park.repository.banks.BankRepository;
import com.codeclan.example.Jurassic_Park.repository.games.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    DinosaurRepository dinosaurRepository;

    @Autowired
    PaddockRepository paddockRepository;

    @Autowired
    TriceratopsRepository triceratopsRepository;

//    @Autowired
//    TriceratopsInheritRepository triceratopsInheritRepository;

    @Autowired
    BankRepository bankRepository;

    @Autowired
    GameRepository gameRepository;


    public DataLoader() {

    }


    public void run(ApplicationArguments args) {

        Bank bank1 = new Bank(1000);
        bankRepository.save(bank1);

        Game game1 = new Game(bank1);
        gameRepository.save(game1);

        Paddock paddock = new Paddock("West Paddock", 1, 3, 4, false, game1);
        paddockRepository.save(paddock);

        Dinosaur tRex = new Dinosaur("T-Rex",4, 5, "carnivore", 5, paddock);
        dinosaurRepository.save(tRex);
        Dinosaur tRex2 = new Dinosaur("Triceratops", 10, 5, "herbivore", 5, paddock);
        dinosaurRepository.save(tRex2);

//        Triceratops triceratops = new Triceratops(4, 5, "herbivore", 5, paddock);
//        triceratopsRepository.save(triceratops);

//      TriceratopsInherit triceratops = new TriceratopsInherit(10, 30, "Shrubbery", 3, paddock);
//      triceratopsInheritRepository.save(triceratops);


    }

}
