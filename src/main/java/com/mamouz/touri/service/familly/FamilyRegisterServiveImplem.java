/**
 * 
 */
package com.mamouz.touri.service.familly;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mamouz.touri.dao.entity.f_Famille.Familly_register;
import com.mamouz.touri.dao.interfaces.IFamilly_Register;
import com.mamouz.touri.dao.interfaces.IFamilyAccDao;
import com.mamouz.touri.service.interfaces.f_familly.IFamillyRegistService;

/**
 * @author famille AMOUZOU
 *
 */
@Service("family_RegisterService")
public class FamilyRegisterServiveImplem implements IFamillyRegistService {

	@Resource(name="family_RegisterDao")
	IFamilly_Register familyDao;
	
	/* (non-Javadoc)
	 * @see com.mamouz.touri.service.interfaces.f_familly.IFamillyRegistService#addFamilly_register(com.mamouz.touri.dao.entity.f_Famille.Familly_register)
	 */
	@Override
	public void addFamilly_register(Familly_register f) {
		familyDao.addFamily(f);

	}

	/* (non-Javadoc)
	 * @see com.mamouz.touri.service.interfaces.f_familly.IFamillyRegistService#removeFamilly_register(java.lang.Long)
	 */
	@Override
	public void removeFamilly_register(Long id) {
		familyDao.removeFamily(id);

	}

	/* (non-Javadoc)
	 * @see com.mamouz.touri.service.interfaces.f_familly.IFamillyRegistService#updateFamilly_register(com.mamouz.touri.dao.entity.f_Famille.Familly_register)
	 */
	@Override
	public void updateFamilly_register(Familly_register c) {
		familyDao.updateFamily(c);

	}

	/* (non-Javadoc)
	 * @see com.mamouz.touri.service.interfaces.f_familly.IFamillyRegistService#findFamilly_registerById(java.lang.Long)
	 */
	@Override
	public Familly_register findFamilly_registerById(Long id) {

		return familyDao.findFamilyById(id);
	}

	/* (non-Javadoc)
	 * @see com.mamouz.touri.service.interfaces.f_familly.IFamillyRegistService#findFamilly_registertByCriteria(java.lang.String)
	 */
	@Override
	public List<Familly_register> findFamilly_registertByCriteria(String criteria) {
		return familyDao.findFamilyByCriteria(criteria);
	}

	/* (non-Javadoc)
	 * @see com.mamouz.touri.service.interfaces.f_familly.IFamillyRegistService#findAllFamilly_register()
	 */
	@Override
	public List<Familly_register> findAllFamilly_register() {
		return familyDao.findAllFamily();
	}

}
