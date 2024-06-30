package com.steven.curso.springboot.app.springboot_crud.repositories;

import org.springframework.data.repository.CrudRepository;

import com.steven.curso.springboot.app.springboot_crud.entities.Product;

public interface ProductRepository extends CrudRepository<Product,Long> {

}
