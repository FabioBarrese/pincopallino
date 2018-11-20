package ingegneriaSW.esonero.MavenSecondTestSw;;;


/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
	}

	public int sommaMatrice(int[][] m) {
		int somma = 0;
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[0].length; j++)
				somma += m[i][j];
		if(somma<0)
			throw new IllegalArgumentException("la somma non può essere negativa");
		return somma;
	}

	public void ordinamento(int[][] m) {
		for (int h = 0; h < m.length; h++) {
			for (int i = 0; i < m[0].length - 1; i++) {
				for (int j = i + 1; j < m[0].length; j++) {
					if (m[h][i] > m[h][j]) {
						int t = m[h][i];
						m[h][i] = m[h][j];
						m[h][j] = t;
					}
				}
			}
		}

	}
}
