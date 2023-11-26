package com.dogapi.dog.repository;

import com.dogapi.dog.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Long> {

}