package com.example.petstore.api;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Ordering, String> {
}
