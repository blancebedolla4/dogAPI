package com.dogapi.dog.service;

import com.dogapi.dog.model.Dog;
import com.dogapi.dog.repository.DogRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceImpl implements DogService {
    private final DogRepository dogRepository;
    private static final Logger logger = LoggerFactory.getLogger(DogServiceImpl.class);

    @Autowired
    public DogServiceImpl(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @Override
    public Dog getDogById(Long id) {
        return null;
    }

    @Override
    public List<Dog> getAllDogs() {
        return null;
    }

    @Override
    public Dog saveDog(Dog dog) {
        return null;
    }

    @Override
    public void deleteDog(Long id) {

    }

    @Override
    public List<Dog> searchDogsByBreed(String breedName) {
        return null;
    }

}

