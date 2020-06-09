/**
 * 
 */
package com.formation.ajc.spring.ioc;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author AgLounes
 *
 */
@Retention(RUNTIME)
@Target(METHOD)
public @interface MyDaoAnnotation {

}
