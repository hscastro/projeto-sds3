package com.hscastro.hsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hscastro.hsvendas.dto.SellerDTO;
import com.hscastro.hsvendas.entites.Seller;
import com.hscastro.hsvendas.repositories.SellerRepository;

@Service
public class SellerServiceImpl implements SellerService {

	@Autowired
	private SellerRepository repository;
	
	@Override
	public List<SellerDTO> findAll() {
		List<Seller> list = repository.findAll(); 
		return list.stream().map(x-> new SellerDTO(x)).collect(Collectors.toList()) ;
	}

}
