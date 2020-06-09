/**
 * 
 */
package com.formation.ajc.spring.ioc;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

/**
 * @author AgLounes
 *
 */
@Configuration
@ImportResource("classpath:application-context.xml")
@EnableAspectJAutoProxy
public class AppConfig {

}
