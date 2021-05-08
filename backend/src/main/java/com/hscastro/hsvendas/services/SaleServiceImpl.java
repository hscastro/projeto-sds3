package com.hscastro.hsvendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.hscastro.hsvendas.dto.SaleDTO;
import com.hscastro.hsvendas.entites.Sale;
import com.hscastro.hsvendas.repositories.SaleRepository;

@Service
public class SaleServiceImpl implements SaleService {

	@Autowired
	private SaleRepository repository;
	
	@Override
	public Page<SaleDTO> findAll(Pageable pageable) {
		Page<Sale> result = repository.findAll(pageable); 
		return result.map(x-> new SaleDTO(x));
	}

}
