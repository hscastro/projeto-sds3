package com.hscastro.hsvendas.dto;

import java.io.Serializable;

import com.hscastro.hsvendas.entites.Seller;

public class SellerDTO implements Serializable {
	
	private static final long serialVersionUID = -3743187480012545317L;

	private Long id;
	
	private String name;
	
	public SellerDTO() {
		// TODO Auto-generated constructor stub
	}

	public SellerDTO(Long id, String name) {		
		this.id = id;
		this.name = name;
	}

	public SellerDTO(Seller seller) {		
		id = seller.getId();
		name = seller.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SellerDTO other = (SellerDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
