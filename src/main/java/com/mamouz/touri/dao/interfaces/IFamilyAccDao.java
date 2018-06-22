/**
 * 
 */
package com.mamouz.touri.dao.interfaces;

import java.util.List;

import com.mamouz.touri.dao.entity.f_Famille.FamilyAcc;

/**
 * @author famille AMOUZOU
 *
 */
public interface IFamilyAccDao {
	public void addFamily(FamilyAcc f);
	public void removeFamily(Long id); 
	public void updateFamily(FamilyAcc f);
	public FamilyAcc findFamilyById(Long id);
	public List<FamilyAcc> findFamilyByCriteria(String criteria);
	public List<FamilyAcc> findAllFamily();
}
