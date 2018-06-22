/**
 * 
 */
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.context.annotation.Lazy;

/**
 * @author famille AMOUZOU
 *
 */
@Entity
public class Continent implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long idContinent;
	private String nomContinent;
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@Lazy(false)
	@JoinTable(name = "CONTINENT_PAYS", joinColumns = { @JoinColumn(name = "idContinent") },
	inverseJoinColumns = {@JoinColumn(name = "idPays") })
	private Set<Pays>  listPays = new HashSet<Pays>(0); 
	//private String ocean;

	// RegionConstructeur

	public Continent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Continent(Long idContinent, String nomContinent) {
		super();
		this.nomContinent = nomContinent;
		//this.ocean = ocean;
	}// EndRegion

	// RegionGetters_Setters

	public String getNomContinent() {
		return nomContinent;
	}

	public Long getIdContinent() {
		return idContinent;
	}

	public void setIdContinent(Long idContinent) {
		this.idContinent = idContinent;
	}

	public void setNomContinent(String nomContinent) {
		this.nomContinent = nomContinent;
	}

//	public String getOcean() {
//		return ocean;
//	}
//
//	public void setOcean(String ocean) {
//		this.ocean = ocean;
//	}
	// EndRegion
}
