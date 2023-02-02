package Cliente;

import java.net.Socket;

public class Cliente {
	public static void main(String[] args) {
		System.out.println("hola");
		Socket socket;
		try {
			socket = new Socket("127.0.0.1",7000);
			new Menu().innit();;
			new LeerPaquete(socket).start();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
