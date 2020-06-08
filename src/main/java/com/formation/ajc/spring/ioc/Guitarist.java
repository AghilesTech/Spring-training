/**
 * 
 */
package com.formation.ajc.spring.ioc;

/**
 * @author AgLounes
 *
 */
public class Guitarist implements IMusicien {

	private IInstrument instrument;
	private String guitaristName;

	/**
	 * @param instrument
	 * @param guitaristName
	 */
	public Guitarist(IInstrument instrument, String guitaristName) {
		super();
		this.instrument = instrument;
		this.guitaristName = guitaristName;
	}

	@Override
	public void play() {
			System.out.println("The guitarist " + this.guitaristName + " plays : " +
					this.instrument);		
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
