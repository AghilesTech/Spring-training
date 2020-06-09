/**
 * 
 */
package com.formation.ajc.spring.ioc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author AgLounes
 *
 */
@Aspect
@Component("myAspectInterceptor")
public class MyAspectInterceptor {
	
	public static Logger log = LogManager.getLogger(MyAspectInterceptor.class);


	public MyAspectInterceptor() {}
	
	@Pointcut("execution(* com.formation.ajc.spring.ioc.*.toString(..))")
	public void intercept() { }
	
	
	@Pointcut("@annotation(com.formation.ajc.spring.ioc.MyFirstAnnotation)")
	public void interceptForMyAnnotation() { }

	
	@Pointcut("@annotation(com.formation.ajc.spring.ioc.MyDaoAnnotation)")
	public void interceptForMyDaoAnnotation() { }
	
	
	@Before("intercept()")
	public void interceptToString() {
        log.info(" log Before ");
	}
	
	@Before("interceptForMyAnnotation()")
	public void beforeAnnotation() {
			log.info("from my first Annotation !");
	}	
	

	@AfterReturning("intercept()")
	public void interceptorToStringReturning() {
		log.info(" after returning  ");
	}
	
	
	@Around("interceptForMyDaoAnnotation()")
	public void forDaoArtistAnnotation(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		log.info(" my doa start transaction ");
		proceedingJoinPoint.proceed();
		log.info(" my doa end transaction ");
	}
	
}
