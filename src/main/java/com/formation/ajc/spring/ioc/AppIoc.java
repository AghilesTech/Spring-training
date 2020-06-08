/**
 * 
 */
package com.formation.ajc.spring.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author AgLounes
 *
 */
public class AppIoc {
	public static void main(String[] args) {
		 ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("classpath:application-context.xml");
		
//		IInstrument instrumentBean = app.getBean(IInstrument.class);
//		if (instrumentBean != null) {
//			System.out.println("instrumentBean not null");
//		}
		
		IMusicien musicienBean = app.getBean(IMusicien.class);
    	musicienBean.play();
    	
    	
    	app.close();
	}
}
