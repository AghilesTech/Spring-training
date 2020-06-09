/**
 * 
 */
package com.formation.ajc.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author AgLounes
 *
 */
@Component
public class Guitarist implements IMusicien {

	@Autowired
	@Qualifier("myGuitar")
	private IInstrument instrument;
	
	private String guitaristName;


	@Override
	public void play() {
			System.out.println("The guitarist  plays : " +
					this.instrument);		
	}
	
	@MyFirstAnnotation
	@Override
	public void play2() {
			System.out.println(" play 2 method");		
	}

	/**
	 * @return the instrument
	 */
	public IInstrument getInstrument() {
		return instrument;
	}

	/**
	 * @param instrument the instrument to set
	 */
	public void setInstrument(IInstrument instrument) {
		this.instrument = instrument;
	}

	/**
	 * @return the guitaristName
	 */
	public String getGuitaristName() {
		return guitaristName;
	}

	/**
	 * @param guitaristName the guitaristName to set
	 */
	public void setGuitaristName(String guitaristName) {
		this.guitaristName = guitaristName;
	}
	
}
