package ingegneriaSW.esonero.MavenSecondTestSw;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class MyTests {
	private static App app = new App();
	private static int[][] m = new int[3][2];
	private static Scanner input = new Scanner(System.in);

	
	@Before
	public void RiempiMatrice() {
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[0].length; j++)
				m[i][j]=input.nextInt();
	}
	
	@Test
	public void testSommaMatrice() {
		assertEquals(2, app.sommaMatrice(m));
	}
	@Test(expected=IllegalArgumentException.class)
	public void testEccezioneSommaMatrice() {
		app.sommaMatrice(m);
	}
	@AfterClass
	public static void close() {
		input.close();
	}
	
}
