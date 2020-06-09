/**
 * 
 */
package com.formation.ajc.spring.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author AgLounes
 *
 */
public class AppIocWithAnnotation {
	public static void main(String[] args) {
		 AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		
//		IInstrument instrumentBean = app.getBean(IInstrument.class);
//		if (instrumentBean != null) {
//			System.out.println("instrumentBean not null");
//		}

		IMusicien musicienBean = app.getBean(IMusicien.class);
    	musicienBean.play();
    	System.out.println("-- test new annotation ");
    	musicienBean.play2();
    	
    	app.close();
	}
}
