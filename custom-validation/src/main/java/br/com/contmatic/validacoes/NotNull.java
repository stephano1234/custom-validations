package br.com.contmatic.validacoes;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = NotNullValidador.class)
public @interface NotNull {

	String message() default "null value";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};

}
