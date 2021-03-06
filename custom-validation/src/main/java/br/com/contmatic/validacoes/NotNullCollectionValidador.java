package br.com.contmatic.validacoes;

import java.util.Collection;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * The Class CollectionComElementoNaoNuloValidador.
 */
public class NotNullCollectionValidador implements ConstraintValidator<NotNullCollection, Collection<?>> {
	
	/**
	 * Checks if is valid.
	 *
	 * @param value the value
	 * @param constraintValidatorContext the constraint validator context
	 * @return true, if is valid
	 */
	@Override
	public boolean isValid(Collection<?> value, ConstraintValidatorContext constraintValidatorContext) {
		if (value == null) {
			return false;
		}		
		for (int i = 0; i < value.toArray().length; i++) {
			if (value.toArray()[i] == null) {
				return false;
			}
		}
		return true;
	}

}
