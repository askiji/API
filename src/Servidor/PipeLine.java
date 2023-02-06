package Servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class PipeLine {
	
	public void foo() {
		ServerSocket socket;

		
		try {
			System.out.println("Esperando a que alguien conecte");

			socket = new ServerSocket(7000);

			Socket socket_cli = socket.accept();
			System.out.println("Ha conectado con " + socket_cli.getRemoteSocketAddress().toString());
			System.out.println("Esperando a recibir mensage");
			DataInputStream in = new DataInputStream(socket_cli.getInputStream());
			DataOutputStream out = new DataOutputStream(socket_cli.getOutputStream());
			String mensajeIn = "";
			String mensajeOut = "";
			String[] formateado = in.readUTF().split("_");
			System.out.println(in.readUTF());
			System.out.println("Comunicación finalizada");
		}

		catch (Exception e) {
			System.err.println(e.getMessage());
			System.exit(1);

		}

	}
	
}
