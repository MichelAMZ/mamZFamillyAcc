package com.mamouz.touri.dao.interfaces;

import java.util.List;

import com.mamouz.touri.dao.entity.Continent;
import com.mamouz.touri.dao.entity.Pays;

public interface IPaysDao {
	public void addPays(Pays p);
	public void removeContinent(Long id); 
	public void updateContinent(Pays p);
	public Pays findPaysById(Long id);
	public List<Pays> findPaysByCriteria(String criteria);
	public List<Pays> findAllPays();

}
