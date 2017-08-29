package com.example.petstore.api;

import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, String> {
}
