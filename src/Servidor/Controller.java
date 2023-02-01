package Servidor;

import java.util.Scanner;

public class Controller extends Thread{

	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Que matriz desea ver");
			System.out.println("1.- Enteros");
			System.out.println("2.- decimales");
			int key = sc.nextInt();
			GeneradorMatrices.mostrarMatriz(key);


		} while (true);
	}
	@Override
	public void run() {
		menu();
		super.run();
	}
}
