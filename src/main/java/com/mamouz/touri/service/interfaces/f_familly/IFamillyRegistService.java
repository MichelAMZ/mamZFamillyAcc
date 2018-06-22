package com.mamouz.touri.service.interfaces.f_familly;

import java.util.List;

import com.mamouz.touri.dao.entity.f_Famille.Familly_register;

public interface IFamillyRegistService {

	public void addFamilly_register(Familly_register f);
	public void removeFamilly_register(Long id); 
	public void updateFamilly_register(Familly_register c);
	public Familly_register findFamilly_registerById(Long id);
	public List<Familly_register> findFamilly_registertByCriteria(String criteria);
	public List<Familly_register> findAllFamilly_register();

}
