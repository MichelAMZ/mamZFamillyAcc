/**
 * 
 */
package com.mamouz.touri.dao.entity.f_Famille;

import java.awt.Image;
import java.io.File;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.mamouz.touri.annotations.mail.ValidEmail;
import com.mamouz.touri.annotations.password.PasswordMatches;
import com.mamouz.touri.annotations.phone.Phone;
import com.mysql.jdbc.Blob;

/**
 * @author famille AMOUZOU
 *
 */
@Entity
public class Familly_register implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFamily;

	@NotEmpty(message="Please enter your name.")
	@Size(min = 2, max = 30)
	private String name;

	@NotEmpty(message="Please enter your firstname.")
	@Size(min = 2, max = 30)
	private String firstName;

	@ValidEmail
	@NotNull(message="Please enter your email addresss.")
	@NotEmpty(message="Please enter your email addresss.")
	@Email
	private String email;

	@NotEmpty(message="Please enter your password.")
	@Size(min = 5, max = 15)
	private String password;

	@PasswordMatches
	@NotEmpty
	@Size(min = 5, max = 15)
	private String confirmPassword;
	
	@NotEmpty
	private byte[] image_F;

	public Familly_register() {
	}

	/**
	 * @return the idFamily
	 */
	public Long getIdFamily() {
		return idFamily;
	}

	/**
	 * @param idFamily the idFamily to set
	 */
	public void setIdFamily(Long idFamily) {
		this.idFamily = idFamily;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the confirmPassword
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}

	/**
	 * @param confirmPassword the confirmPassword to set
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	/**
	 * @return the image_F
	 */
	public byte[] getImage_F() {
		return image_F;
	}

	/**
	 * @param image_F the image_F to set
	 */
	public void setImage_F(byte[] image_F) {
		this.image_F = image_F;
	}

}
