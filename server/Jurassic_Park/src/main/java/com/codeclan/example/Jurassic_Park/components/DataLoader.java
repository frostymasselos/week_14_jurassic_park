package com.codeclan.example.Jurassic_Park.components;

import com.codeclan.example.Jurassic_Park.models.*;
import com.codeclan.example.Jurassic_Park.repositories.DinosaurRepository;
import com.codeclan.example.Jurassic_Park.repositories.PaddockRepository;
import com.codeclan.example.Jurassic_Park.repository.banks.BankRepository;
import com.codeclan.example.Jurassic_Park.repository.foods.FoodRepository;
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
    FoodRepository foodRepository;

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

        Paddock paddock1 = new Paddock("West Paddock", 1, 3, 4, true, false, game1);
        paddockRepository.save(paddock1);
        Paddock paddock2 = new Paddock("East Paddock", 2, 6, 8, false, false, game1);
        paddockRepository.save(paddock2);
        Paddock paddock3 = new Paddock("North Paddock", 2, 6, 8, false, false, game1);
        paddockRepository.save(paddock3);
        Paddock paddock4 = new Paddock("South Paddock", 2, 6, 8, false, false, game1);
        paddockRepository.save(paddock4);
        Paddock paddock5 = new Paddock("North West Paddock", 2, 6, 8, false, false, game1);
        paddockRepository.save(paddock5);
        Paddock paddock6 = new Paddock("North East Paddock", 2, 6, 8, false, false, game1);
        paddockRepository.save(paddock6);
        Paddock paddock7 = new Paddock("South West Paddock", 2, 6, 8, false, false, game1);
        paddockRepository.save(paddock7);
        Paddock paddock8 = new Paddock("South East Paddock", 2, 6, 8, false, false, game1);
        paddockRepository.save(paddock8);
        Paddock paddock9 = new Paddock("Mountain Paddock", 2, 6, 8, false, false, game1);
        paddockRepository.save(paddock9);
        Paddock paddock10 = new Paddock("River Paddock", 2, 6, 8, false, false, game1);
        paddockRepository.save(paddock10);


        Dinosaur tRex = new Dinosaur("T-Rex",10, 5, "Carnivore", 5, paddock1);
        dinosaurRepository.save(tRex);
        Dinosaur tRex2 = new Dinosaur("Triceratops", 10, 5, "Herbivore", 5, paddock1);
        dinosaurRepository.save(tRex2);
        Dinosaur dino3 = new Dinosaur("Triceratops", 10, 4, "Herbivore", 5, paddock1);
        dinosaurRepository.save(dino3);

        Food food1 = new Food("Beef", 10, 2, "Carnivore");
        Food food2 = new Food("Chicken", 5, 1, "Carnivore");
        Food food3 = new Food("Shrubbery", 10, 2, "Herbivore");
        Food food4 = new Food("Berries", 5, 1, "Herbivore");
        foodRepository.save(food1);
        foodRepository.save(food2);
        foodRepository.save(food3);
        foodRepository.save(food4);

    }

}
