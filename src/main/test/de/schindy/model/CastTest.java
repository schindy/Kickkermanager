package de.schindy.model;

import org.junit.Test;

public class CastTest {
	
	@Test
	public void testCastAll() {
		Cast c = new Cast();
		c.castAll();
		assert(c.getDice1().getNumber() <= 6 && c.getDice1().getNumber() >= 1);
		assert(c.getDice2().getNumber() <= 6 && c.getDice2().getNumber() >= 1);
		assert(c.getDice3().getNumber() <= 6 && c.getDice3().getNumber() >= 1);
		assert(c.getDice4().getNumber() <= 6 && c.getDice4().getNumber() >= 1);
		assert(c.getDice5().getNumber() <= 6 && c.getDice5().getNumber() >= 1);
		assert(c.getDice6().getNumber() <= 6 && c.getDice6().getNumber() >= 1);
	}
	
}
