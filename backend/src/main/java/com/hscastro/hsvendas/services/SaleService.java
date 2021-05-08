package com.hscastro.hsvendas.services;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.hscastro.hsvendas.dto.SaleDTO;

public interface SaleService {

	Page<SaleDTO> findAll(Pageable pageable);
}
