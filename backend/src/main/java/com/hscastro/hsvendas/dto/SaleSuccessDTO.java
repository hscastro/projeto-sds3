package com.hscastro.hsvendas.dto;

import java.io.Serializable;

import com.hscastro.hsvendas.entites.Seller;


public class SaleSuccessDTO implements Serializable { 

	private static final long serialVersionUID = 1967814009108913017L;
	
	private String salerName;
	private Long visited;
	private Long deals;
	
	public SaleSuccessDTO() {
		// TODO Auto-generated constructor stub
	}

	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {		
		this.salerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}

	public String getSalerName() {
		return salerName;
	}

	public void setSalerName(String salerName) {
		this.salerName = salerName;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}
		
}

