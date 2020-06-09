package com.formation.ajc.spring.ioc;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component("fakeArtistDaoImpl")
public class FakeArtistDaoImpl implements FakeArtistDao {
	
	public static Logger log = LogManager.getLogger(FakeArtistDaoImpl.class);

	private static List<Artist> artists = new ArrayList<Artist>();
	
	static {
		artists.add(new Artist(0, "aghiles0", "lounes0"));
		artists.add(new Artist(1, "aghiles1", "lounes1"));
		artists.add(new Artist(2, "aghiles2", "lounes2"));
		artists.add(new Artist(3, "aghiles3", "lounes3"));
	}
	
	public FakeArtistDaoImpl() {
	}
	

	
	@MyDaoAnnotation
	public void add(Artist artist) {
		artists.add(artist);
		// log.info(" artist added");
	}

	@MyDaoAnnotation
	public List<Artist> findAll() {
		// log.info(" artists findAll");
		return artists;
	}

	@MyDaoAnnotation
	public Artist getById(int index) {
		// log.info(" artists find b y id");
		return artists.get(index);
	}

	
	public String toString() {
		// log.info("toString()");
		return " FakeArtistDaoImpl - toString()";
	}
}
