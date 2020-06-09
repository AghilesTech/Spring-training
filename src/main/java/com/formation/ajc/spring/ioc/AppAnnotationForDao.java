/**
 * 
 */
package com.formation.ajc.spring.ioc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author AgLounes
 *
 */
public class AppAnnotationForDao {
	
	public static Logger log = LogManager.getLogger(AppAnnotationForDao.class);

	public static void main(String[] args) {	

		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		
		FakeArtistDao dao = app.getBean("fakeArtistDaoImpl", FakeArtistDao.class);

		// FakeArtistDaoImpl dao = FakeArtistDaoImpl.getInstance(); 
		 
		dao.add(new Artist(5, "aghiles5", "lounes5"));
		
		dao.findAll();
		
		
    	app.close();
	}
}
