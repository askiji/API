package Cliente;

import java.util.Scanner;

public class Menu {

	public void innit() {
		System.out.println("1.-Recibir");
		System.out.println("2.-Enviar");
		System.out.println("Pulse (1/2)");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		do {
			switch (key) {
			case 1:
				System.out.println("PETICION DE DATO");
				System.out.println("1.- Matriz de enteros");
				System.out.println("2.- Matriz de decimales");
				System.out.println("Pulse (1/2)");
				int tipoMatriz = sc.nextInt();
				if(tipoMatriz==1) System.out.println("Matriz de enteros");
				if(tipoMatriz==2) System.out.println("Matriz de decimales");
				System.out.println("Fila del dato");
				int fila = sc.nextInt();
				System.out.println("Columna del dato");
				int columna = sc.nextInt();
				new GenerarPaquete().generarLectura(tipoMatriz , fila , columna , 0);
		
				break;
			case 2:
				System.out.println("Sobreescritura de dato");
				System.out.println("1.- Matriz de enteros");
				System.out.println("2.- Matriz de decimales");
				System.out.println("Pulse (1/2)");
				tipoMatriz = sc.nextInt();
				System.out.println("Fila del dato");
				fila = sc.nextInt();
				System.out.println("Columna del dato");
				columna = sc.nextInt();
				new GenerarPaquete().generarLectura(tipoMatriz , fila , columna ,1);
				break;

			default:
				break;
			}
		} while (true);

	}
}
