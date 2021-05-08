package com.hscastro.hsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hscastro.hsvendas.entites.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
  
}
