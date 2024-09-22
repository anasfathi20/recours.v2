package com.example.recours.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.recours.Entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long>{
}