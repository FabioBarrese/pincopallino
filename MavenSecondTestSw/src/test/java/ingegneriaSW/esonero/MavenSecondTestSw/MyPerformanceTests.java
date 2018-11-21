package ingegneriaSW.esonero.MavenSecondTestSw;

import java.util.Scanner;

import org.junit.BeforeClass;
import org.junit.Test;

public class MyPerformanceTests {
	private static App app = new App();
	private static int[][] m = new int[2][3];
	private static Scanner in = new Scanner(System.in);
	
	@BeforeClass
	public static void init() {
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[0].length; j++)
				m[i][j]=in.nextInt();
	}
	
	@Test(timeout=1000)
	public void OrderspeedTest() {
		app.ordinamento(m);
	}
}
