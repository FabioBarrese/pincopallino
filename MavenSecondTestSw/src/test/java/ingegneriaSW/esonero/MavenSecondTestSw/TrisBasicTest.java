package ingegneriaSW.esonero.MavenSecondTestSw;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TrisBasicTest {
	private static Tris tris;
	
	//un metodo che inizializza l'istanza statica tris una sola volta, 
	//prima di tutti i test	
	@BeforeClass
	public static void inizializza() {
		tris = new Tris();
	}
	
	
	//un metodo che invoca il metodo reset sull'istanza prima di ogni test
	@Before
	public void resettaMatrice() {
		tris.reset();
	}
	
	
	//un test in cui si verifica la vittoria del giocatore O
	@Test
	public void vinceO() {
		System.out.println();
		tris.play(0, 1);
		tris.play(1, 1);
		tris.play(2, 1);
		tris.play(2, 2);
		tris.play(2, 0);
		tris.play(0, 0);
		tris.print();
		assertEquals(Tris.O, tris.getWinner());
	}
	
	//un test in cui si verifica la vittoria del giocatore X
	@Test
	public void vinceX() {
		System.out.println();
		tris.play(1, 1);
		tris.play(0, 1);
		tris.play(2, 2);
		tris.play(2, 1);
		tris.play(0, 0);
		tris.print();
		assertEquals(Tris.X, tris.getWinner());
	}
	
	
	//un test in cui si verifica un pareggio
	@Test
	public void testPareggio() {
		tris.play(0,0);
		tris.play(0, 1);
		tris.play(0, 2);
		tris.play(1,0);
		tris.play(1, 2);
		tris.play(1, 1);
		tris.play(2, 0);
		tris.play(2, 2);
		tris.play(2, 1);
		assertEquals(Tris.PAREGGIO, tris.getWinner());
	}
	
	//un test in cui si verifica che il metodo play restituisca falso dopo 3 mosse
	@Test
	public void testFalso() {
		tris.play(1, 2);
		tris.play(2, 1);
		assertEquals(false, tris.play(0, 0));
	}

	
	
}
