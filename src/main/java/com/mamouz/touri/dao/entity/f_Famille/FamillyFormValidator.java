/**
 * 
 */
package com.mamouz.touri.dao.entity.f_Famille;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author famille AMOUZOU
 *
 */
public class FamillyFormValidator implements Validator{

	@Override
	public boolean supports(Class<?> paramClass) {
		return Familly_register.class.equals(paramClass);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "idFamilly", "idFamilly.reqyured");
		
		Familly_register fam = (Familly_register) obj;
		
		if(fam.getIdFamily() <= 0){
			errors.rejectValue("idFamilly", "negativeValue", new Object[]{" 'idFamilly'"}, "id can't be negative");
		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name.required");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "role", "role.required");
	}
	

}
