package com.hscastro.hsvendas.dto;

import java.io.Serializable;

import com.hscastro.hsvendas.entites.Seller;


public class SaleSumDTO implements Serializable { 

	private static final long serialVersionUID = 1967814009108913017L;
	
	private String salerName;
	private Double sum;
	
	public SaleSumDTO() {
		// TODO Auto-generated constructor stub
	}

	public SaleSumDTO(Seller seller, Double sum) {
		this.salerName = seller.getName();
		this.sum = sum;
	}

	public String getSalerName() {
		return salerName;
	}

	public void setSalerName(String salerName) {
		this.salerName = salerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
}

