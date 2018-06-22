/**
 * 
 */
package com.mamouz.touri.dao.entity.f_Famille;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import javax.persistence.JoinColumn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.format.annotation.DateTimeFormat;

import com.mamouz.touri.annotations.phone.Phone;
import com.mamouz.touri.dao.entity.Pays;
import com.mysql.jdbc.Blob;

//import javax.persistence.Entity;

@Entity
public class FamilyAcc extends Familly_register implements Serializable {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long idFamilly;
	

	@NotEmpty
	@Min(18)
	@Max(100)
	private Integer age;

	@NotEmpty(message="Please choose your gender.")
	private Gender gender;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@NotEmpty
	@Past
	private Date birthday;

	@Phone
	@NotEmpty
	private String phone;
	
	@NotEmpty
	public enum Gender {
		MALE, FEMALE
	}
	
	@Size(min=100, max=300)
	@NotNull
	private String whoIam;
	
	@NotNull @Min(1)
	private int compositionFamily;
	
	@Size(min=100, max=300)
	@NotNull
	private String Loisirs;
	
	private Pays pays;
	
	//private Blob img;

	/**
	 * 
	 */
	public FamilyAcc() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param age
	 * @param gender
	 * @param birthday
	 * @param phone
	 * @param whoIam
	 * @param compositionFamily
	 * @param loisirs
	 * @param pays
	 */
	public FamilyAcc(Integer age, Gender gender, Date birthday, String phone, String whoIam, int compositionFamily,
			String loisirs, Pays pays) {
		super();
		this.age = age;
		this.gender = gender;
		this.birthday = birthday;
		this.phone = phone;
		this.whoIam = whoIam;
		this.compositionFamily = compositionFamily;
		Loisirs = loisirs;
		this.pays = pays;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
//
//	/**
//	 * @return the gender
//	 */
//	public Gender getGender() {
//		return gender;
//	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the whoIam
	 */
	public String getWhoIam() {
		return whoIam;
	}

	/**
	 * @param whoIam the whoIam to set
	 */
	public void setWhoIam(String whoIam) {
		this.whoIam = whoIam;
	}

	/**
	 * @return the compositionFamily
	 */
	public int getCompositionFamily() {
		return compositionFamily;
	}

	/**
	 * @param compositionFamily the compositionFamily to set
	 */
	public void setCompositionFamily(int compositionFamily) {
		this.compositionFamily = compositionFamily;
	}

	/**
	 * @return the loisirs
	 */
	public String getLoisirs() {
		return Loisirs;
	}

	/**
	 * @param loisirs the loisirs to set
	 */
	public void setLoisirs(String loisirs) {
		Loisirs = loisirs;
	}

	/**
	 * @return the pays
	 */
	public Pays getPays() {
		return pays;
	}

	/**
	 * @param pays the pays to set
	 */
	public void setPays(Pays pays) {
		this.pays = pays;
	}

	
}
