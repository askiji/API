package Servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class PipeLine {
	
	ServerSocket socket;
	public void foo() {

		
		try {
			socket = new ServerSocket(7000);
//			System.out.println("Esperando a que alguien conecte");
			Socket socket_cli = socket.accept();
//			System.out.println("Ha conectado con " + socket_cli.getRemoteSocketAddress().toString());
//			System.out.println("Esperando a recibir mensage");
			DataInputStream in = new DataInputStream(socket_cli.getInputStream());
			DataOutputStream out = new DataOutputStream(socket_cli.getOutputStream());
			String[] formateado = in.readUTF().split("_");
			String dimensionEnteros = "0123";
			String dimensionDecimales = "012";
			// Comprobamos si es editar datos o pedir datos :  0 pedir  , 1 recivir
			if(formateado[3].equals("0")) {
				// vemos que tipo de matriz es 1 matriz enteros  : 2 matriz decimales 
				if(formateado[0].equals("1")){
					// Comprovamos que tenga las dimensiones adecuadas
					if(!dimensionEnteros.contains(formateado[1]) || !dimensionEnteros.contains(formateado[2])) {
						out.writeUTF("Limite fuera de rango");
					}else {
						out.writeUTF("El dato recivido es "+GeneradorMatrices.getEntero(Integer.valueOf(formateado[1]), Integer.valueOf(formateado[2])));
					}
				}
				else {
					if(!dimensionDecimales.contains(formateado[1]) || !dimensionDecimales.contains(formateado[2])) {
						out.writeUTF(new String("Limite fuera de rango"));
					}
					else {
						out.writeUTF("El dato recivido es "+GeneradorMatrices.getDecimal(Integer.valueOf(formateado[1]), Integer.valueOf(formateado[2])));
					}
				}
			}
			else {
				if(formateado[0].equals("1")){
					System.out.println("Filtro 1");
					// Comprovamos que tenga las dimensiones adecuadas
					if(!dimensionEnteros.contains(formateado[1]) || !dimensionEnteros.contains(formateado[2])) {
						out.writeUTF(new String("Limite fuera de rango"));
					}else {
						GeneradorMatrices.setEntero(Integer.valueOf(formateado[1]), Integer.valueOf(formateado[2]) , formateado[4]);
						out.writeUTF(new String("Dato insertado en el servidor correctamente"));
					}
				}
				else {
					if(!dimensionDecimales.contains(formateado[1]) || !dimensionDecimales.contains(formateado[2])) {
						out.writeUTF(new String("Limite fuera de rango"));
					}
					else {
						GeneradorMatrices.setDecimal(Integer.valueOf(formateado[1]), Integer.valueOf(formateado[2]) , formateado[4]);
						out.writeUTF(new String("Dato insertado en el servidor correctamente"));
					}
				}
			}
			socket.close();
		}

		catch (Exception e) {
//			System.err.println(e.getMessage());
			System.exit(1);

		}

	}
	
}
