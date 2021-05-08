package com.hscastro.hsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hscastro.hsvendas.entites.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {
  
}
