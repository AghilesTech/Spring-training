/**
 * 
 */
package com.formation.ajc.spring.ioc;

import org.springframework.stereotype.Component;

/**
 * @author AgLounes
 *
 */
@Component("ukele")
public class Ukulele implements IInstrument {
	public String toString() {
		return "Ukele Ukele Ukele";
		}
}
