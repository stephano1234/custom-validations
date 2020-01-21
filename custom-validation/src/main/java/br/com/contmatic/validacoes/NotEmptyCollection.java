package br.com.contmatic.validacoes;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * The Interface CollectionComElementoNaoNulo.
 */
@Target({ FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = NotEmptyCollectionValidador.class)
public @interface NotEmptyCollection {
    
    /**
     * Message.
     *
     * @return the string
     */
    String message() default "valor inválido";

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