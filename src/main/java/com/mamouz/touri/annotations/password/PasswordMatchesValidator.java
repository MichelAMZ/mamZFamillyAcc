package com.mamouz.touri.annotations.password;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.mamouz.touri.dao.entity.f_Famille.Familly_register;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> { 
   
  @Override
  public void initialize(PasswordMatches constraintAnnotation) {       
  }
  
  @Override
  public boolean isValid(Object obj, ConstraintValidatorContext context){   
      Familly_register famil = (Familly_register) obj;
      return famil.getPassword().equals(famil.getConfirmPassword());    
  }
  
}
