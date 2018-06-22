package com.mamouz.touri.service.interfaces;

import java.util.List;

import com.mamouz.touri.dao.entity.Continent;


public interface IContinentService {
	public void addContinent(Continent c);
//	public void removeContinent(Long id); 
//	public void updateContinent(Continent c);
	public Continent findContinentById(Long id);
	public List<Continent> findContinentByCriteria(String criteria);
	public List<Continent> findAllContinent();
}
