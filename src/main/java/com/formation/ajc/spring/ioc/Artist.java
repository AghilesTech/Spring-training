/**
 * 
 */
package com.formation.ajc.spring.ioc;

/**
 * @author AgLounes
 *
 */

public class Artist  {

    private long id;
    private String firstName;
    private String lastName;
	
    public Artist() {}
    
    /**
	 * @param id
	 * @param firstName
	 * @param lastName
	 */
	public Artist(long id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Artist [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
     
}
