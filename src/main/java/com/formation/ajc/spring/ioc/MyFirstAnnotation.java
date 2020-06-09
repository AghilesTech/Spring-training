/**
 * 
 */
package com.formation.ajc.spring.ioc;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.aspectj.lang.annotation.Before;

/**
 * @author AgLounes
 *
 */
@Retention(RUNTIME)
@Target(METHOD)
public @interface MyFirstAnnotation {


}
