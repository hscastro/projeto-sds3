package com.hscastro.hsvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hscastro.hsvendas.dto.SaleDTO;
import com.hscastro.hsvendas.dto.SaleSumDTO;
import com.hscastro.hsvendas.dto.SaleSuccessDTO;
import com.hscastro.hsvendas.entites.Sale;
import com.hscastro.hsvendas.repositories.SaleRepository;

@Service
public class SaleServiceImpl implements SaleService {

	@Autowired
	private SaleRepository repository;
	
	@Override @Transactional(readOnly = true) 
	public Page<SaleDTO> findAll(Pageable pageable) {
		Page<Sale> result = repository.findAll(pageable); 
		return result.map(x-> new SaleDTO(x));
	}

	@Override @Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupBySeller() {
		return repository.amountGroupBySeller(); 
		
	}

	@Override
	public List<SaleSuccessDTO> successGroupBySeller() {		
		return repository.successGroupBySeller();
	}
	
}
