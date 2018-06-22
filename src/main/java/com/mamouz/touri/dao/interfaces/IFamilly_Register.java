/**
 * 
 */
package com.mamouz.touri.dao.interfaces;

import java.util.List;

import com.mamouz.touri.dao.entity.f_Famille.Familly_register;

/**
 * @author famille AMOUZOU
 *
 */
public interface IFamilly_Register {
	
	public void addFamily(Familly_register f);

	public void removeFamily(Long id);

	public void updateFamily(Familly_register f);

	public Familly_register findFamilyById(Long id);

	public List<Familly_register> findFamilyByCriteria(String criteria);

	public List<Familly_register> findAllFamily();

}
