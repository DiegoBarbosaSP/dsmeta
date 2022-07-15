package com.devsuperior.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SalesReposity;
@Service
public class SaleService {
	
	@Autowired
	private SalesReposity repository; 
	
	public List<Sale> findSales() {
		return repository.findAll();

  }
}