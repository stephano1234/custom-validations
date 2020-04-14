package br.com.contmatic.validacoes;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NotNullValidador implements ConstraintValidator<NotNull, Object>{

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		return value != null;
	}

}
