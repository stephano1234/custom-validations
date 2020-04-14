package br.com.contmatic.validacoes;

import javax.validation.Constraint;
import javax.validation.Payload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * The Interface CPFbr.
 */
@Target({ FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = CPFValidador.class)
public @interface CPF {
    
    /**
     * Message.
     *
     * @return the string
     */
    String message() default "invalid";

    /**
     * Groups.
     *
     * @return the class[]
     */
    Class<?>[] groups() default {};

    /**
     * Payload.
     *
     * @return the class<? extends payload>[]
     */
    Class<? extends Payload>[] payload() default {};

}
