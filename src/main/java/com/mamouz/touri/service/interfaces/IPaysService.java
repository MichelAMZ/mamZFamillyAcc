package com.mamouz.touri.service.interfaces;

import java.util.List;

import com.mamouz.touri.dao.entity.Continent;
import com.mamouz.touri.dao.entity.Pays;

public interface IPaysService {
	public void addPays(Pays p);
	public void removePays(Long id); 
	public void updatePays(Pays p);
	public Pays findPaysById(Long id);
	public List<Pays> findPaysByCriteria(String criteria);
	public List<Pays> findAllPays();
}
