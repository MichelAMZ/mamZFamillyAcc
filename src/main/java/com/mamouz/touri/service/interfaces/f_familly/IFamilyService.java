package com.mamouz.touri.service.interfaces.f_familly;

import java.util.List;

import com.mamouz.touri.dao.entity.f_Famille.FamilyAcc;


public interface IFamilyService {

	public void addFamilyAcc(FamilyAcc family);
	public void removeFamilyAcc(Long id); 
	public void updateFamilyAcc(FamilyAcc family);
	public FamilyAcc findFamilyAccById(Long id);
	public List<FamilyAcc> findFamilyByCriteria(String criteria);
	public List<FamilyAcc> findAllFamily();
}
