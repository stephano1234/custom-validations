package br.com.contmatic.validacoes;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NaoNuloValidador implements ConstraintValidator<NaoNulo, Object>{

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		return value != null;
	}

}
