package Servidor;

import java.util.Arrays;
import java.util.Random;

public class GeneradorMatrices {
	public static int[][] enteros = new int[4][4];
	public static double[][] decimales = new double[3][3];

	public void generar() {
		Random r = new Random();
		for (int i = 0; i < enteros.length; i++) {
			for (int j = 0; j < enteros[i].length; j++) {
				enteros[i][j] = r.nextInt(9) + 1;
			}
		}
		for (int i = 0; i < decimales.length; i++) {
			for (int j = 0; j < decimales[i].length; j++) {
				decimales[i][j] = Math.random();
			}
		}
	}

	public int getEntero(int i, int j) {

		return enteros[i][j];
	}

	public static void mostrarMatriz(int x) {
		if (x == 1) {

			for (int i = 0; i < enteros.length; i++) {
				for (int j = 0; j < enteros[i].length; j++) {
					System.out.print(enteros[i][j]+ "\t");
				}
				System.out.println();
			}
		} else {
			for (int i = 0; i < decimales.length; i++) {
				for (int j = 0; j < decimales[i].length; j++) {
					System.out.print(decimales[i][j]+ "\t");
				}
				System.out.println();
			}
		}
	}
}
