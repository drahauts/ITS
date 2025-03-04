import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.jupiter.api.Test;

class CalcolatriceTest {

	@Test
	void testSomma() {
		Calcolatrice c = new Calcolatrice();
		assertEquals(65, c.somma(12, 53));
	}

	@Test
	void testSottrazione() {
		Calcolatrice c = new Calcolatrice();
		assertEquals(19, c.sottrazione(24, 5));
	}

	@Test
	void testMoltiplicazione() throws IOException{
		Calcolatrice c = new Calcolatrice();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String sNum = reader.readLine();
		int num1 = Integer.parseInt(sNum);
		System.out.println("Stampo num1: " + num1);
		
		assertEquals(144, c.moltiplicazione(num1, 12));
	}

	@Test
	void testDivisione() {
		Calcolatrice c = new Calcolatrice();
		assertEquals(23.0, c.divisione(69.0, 3.0));
	}

}
