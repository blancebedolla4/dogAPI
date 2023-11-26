package com.dogapi.dog.controller;

import com.dogapi.dog.model.Dog;
import com.dogapi.dog.service.DogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dogs")
public class DogController {
    private final DogService dogService;
    private static final Logger logger = LoggerFactory.getLogger(DogController.class);

    @Autowired
    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<Dog>> searchDogsByBreed(@RequestParam("breedName") String breedName) {
        List<Dog> dogs = dogService.searchDogsByBreed(breedName);
        return new ResponseEntity<>(dogs, HttpStatus.OK);
    }
}
