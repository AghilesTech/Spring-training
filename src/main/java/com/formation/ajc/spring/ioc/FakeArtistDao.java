/**
 * 
 */
package com.formation.ajc.spring.ioc;

import java.util.List;

/**
 * @author AgLounes
 *
 */
public interface FakeArtistDao {

	public void add(Artist artist);
	
	public List<Artist> findAll();
	
	public Artist getById(int index);
	
}
