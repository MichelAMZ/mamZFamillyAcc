package com.mamouz.touri.service.familly;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mamouz.touri.dao.entity.f_Famille.FamilyAcc;
import com.mamouz.touri.dao.interfaces.IFamilyAccDao;
import com.mamouz.touri.service.interfaces.f_familly.IFamilyService;

@Service("familyService")
public class FamilyServiceImpl implements IFamilyService {
	
	@Resource(name="familyDao")
	IFamilyAccDao familyDao;

	@Override
	public void addFamilyAcc(FamilyAcc family) {
		familyDao.addFamily(family);
		
	}

	@Override
	public void removeFamilyAcc(Long id) {
		familyDao.removeFamily(id);
		
	}

	@Override
	public void updateFamilyAcc(FamilyAcc family) {
		familyDao.updateFamily(family);
		
	}

	@Override
	public FamilyAcc findFamilyAccById(Long id) {
		
		return familyDao.findFamilyById(id);
	}

	@Override
	public List<FamilyAcc> findFamilyByCriteria(String criteria) {
		return familyDao.findFamilyByCriteria(criteria);
	}

	@Override
	public List<FamilyAcc> findAllFamily() {
		return familyDao.findAllFamily();
	}

}
