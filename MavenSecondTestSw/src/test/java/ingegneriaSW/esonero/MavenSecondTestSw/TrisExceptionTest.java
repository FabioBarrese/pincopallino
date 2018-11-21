package ingegneriaSW.esonero.MavenSecondTestSw;

import org.junit.BeforeClass;
import org.junit.Test;

public class TrisExceptionTest {
	private static Tris tris;
	@BeforeClass
	public static void init() {
		tris = new Tris();
	}
	//un test in cui si verifica che venga sollevata un'eccezione, 
	//nel caso in cui venisse invocato il metodo play dopo la vittoria di un giocatore
	@Test(expected=InvalidPlayException.class)
	public void testEccezioneFineGioco() {
		tris.play(0, 1);
		tris.play(1, 1);
		tris.play(2, 1);
		tris.play(2, 2);
		tris.play(2, 0);
		tris.play(0, 0);
		tris.play(0, 2);
	}
	
	//un test in cui si verifica che venga sollevata un'eccezione, 
	//nel caso in cui venisse invocato il metodo play su una posizione già occupata
	@Test(expected=InvalidPlayException.class)
	public void testaPosOcccupata() {
		tris.reset();
		tris.play(0, 1);
		tris.play(1, 1);
		tris.play(2, 1);
		tris.play(2, 2);
		tris.play(1, 1);
		tris.play(0, 0);
	}
}
