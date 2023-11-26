package com.dogapi.dog.service;

import com.dogapi.dog.model.Dog;

import java.util.List;

public interface DogService {
    Dog getDogById(Long id);
    List<Dog> getAllDogs();
    Dog saveDog(Dog dog);
    void deleteDog(Long id);
    List<Dog> searchDogsByBreed(String breedName);
}
