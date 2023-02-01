package Servidor;

public class Servidor {
	public static void main(String[] args) {
		GeneradorMatrices g = new GeneradorMatrices();
		g.generar();
		g.mostrarMatriz(1);
		g.mostrarMatriz(2);
		new Controller().start();
		new PipeLine().foo();
	}
}
