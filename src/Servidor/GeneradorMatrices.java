package Servidor;

import java.text.DecimalFormat;
import java.util.Random;

public class GeneradorMatrices {
	public static int[][] enteros = new int[4][4];
	public static double[][] decimales = new double[3][3];

	public void generar() {
		Random r = new Random();
		DecimalFormat df = new DecimalFormat("#.00");
		for (int i = 0; i < enteros.length; i++) {
			for (int j = 0; j < enteros[i].length; j++) {
				enteros[i][j] = r.nextInt(9) + 1;
			}
		}
		for (int i = 0; i < decimales.length; i++) {
			for (int j = 0; j < decimales[i].length; j++) {
				double numero = Math.random();
				decimales[i][j] =  Math.round(numero * 100.0) / 100.0;
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
