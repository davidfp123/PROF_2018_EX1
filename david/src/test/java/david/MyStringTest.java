package david;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyStringTest {

	@Test
	public void testLongitudDistinta() {
		MyString prueba = new MyString("prueba");
		MyString prueb = new MyString("prueb");
		assertEquals(1,prueba.compareTo(prueb));
	}
	
	@Test
	public void testPalabrasDistintas(){
		MyString palabra = new MyString("palabra");
		MyString palo = new MyString("palo");
		assertEquals(-14,palabra.compareTo(palo));
	}
	
}
