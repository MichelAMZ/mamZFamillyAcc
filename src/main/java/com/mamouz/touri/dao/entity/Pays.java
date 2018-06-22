package com.mamouz.touri.dao.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import org.springframework.context.annotation.Lazy;

import com.mamouz.touri.dao.entity.f_Famille.FamilyAcc;

/**
 * @author famille AMOUZOU
 *
 */
@Entity
public class Pays implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long idPays;
	private String nomPays;
	private String capital;
	private String VilleAccueil;
	
//	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
//	@Lazy(false)
//	@JoinTable(name = "PAYS_FAMILY", joinColumns = { @JoinColumn(name = "idPays") },
//	inverseJoinColumns = {@JoinColumn(name = "idFamilly") })
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinTable(name = "PAYS_FAMILY", 
	           joinColumns = @JoinColumn(name = "idPays"))
	private Set<FamilyAcc>  listFamilyAcc = new HashSet<FamilyAcc>(0); 

	public Pays() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pays(Long idPays, String nomPays, String capital, String villeAccueil) {
		super();
		this.nomPays = nomPays;
		this.capital = capital;
		VilleAccueil = villeAccueil;
	}

	/**
	 * @return the idPays
	 */
	public Long getIdPays() {
		return idPays;
	}

	/**
	 * @param idPays
	 *            the idPays to set
	 */
	public void setIdPays(Long idPays) {
		this.idPays = idPays;
	}

	/**
	 * @return the nomPays
	 */
	public String getNomPays() {
		return nomPays;
	}

	/**
	 * @param nomPays
	 *            the nomPays to set
	 */
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	/**
	 * @return the capital
	 */
	public String getCapital() {
		return capital;
	}

	/**
	 * @param capital
	 *            the capital to set
	 */
	public void setCapital(String capital) {
		this.capital = capital;
	}

	/**
	 * @return the villeAccueil
	 */
	public String getVilleAccueil() {
		return VilleAccueil;
	}

	/**
	 * @param villeAccueil
	 *            the villeAccueil to set
	 */
	public void setVilleAccueil(String villeAccueil) {
		VilleAccueil = villeAccueil;
	}

	/**
	 * @return the listFamilyAcc
	 */
	public Set<FamilyAcc> getListFamilyAcc() {
		return listFamilyAcc;
	}

	/**
	 * @param listFamilyAcc the listFamilyAcc to set
	 */
	public void setListFamilyAcc(Set<FamilyAcc> listFamilyAcc) {
		this.listFamilyAcc = listFamilyAcc;
	}


}
