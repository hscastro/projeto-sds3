package com.hscastro.hsvendas.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.hscastro.hsvendas.dto.SaleDTO;
import com.hscastro.hsvendas.dto.SaleSumDTO;
import com.hscastro.hsvendas.dto.SaleSuccessDTO;

public interface SaleService {

	Page<SaleDTO> findAll(Pageable pageable);
	List<SaleSumDTO> amountGroupBySeller();
	List<SaleSuccessDTO> successGroupBySeller();
}
