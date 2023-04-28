package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.resource.Product;


@Repository

public interface RepositoryIface extends JpaRepository<Product,Long> {

}
