/**
 * 
 */
package com.mamouz.touri.dao.interfaces;

import java.util.List;

import com.mamouz.touri.dao.entity.Continent;
import com.mamouz.touri.dao.entity.Pays;
/**
 * @author famille AMOUZOU
 *
 */
public interface IContinentDao {
	public void addContient(Continent c);
	public void removeContinent(Long id); 
	public void updateContinent(Continent c);
	public Continent findContinentById(Long id);
	public List<Continent> findContinentByCriteria(String criteria);
	public List<Continent> findAllContinent();
}
