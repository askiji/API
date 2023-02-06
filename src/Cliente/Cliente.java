package Cliente;

import java.net.Socket;

public class Cliente {
	public static Socket socket; 
	public static void main(String[] args) {
		try {
			do {
				socket = new Socket("127.0.0.1",7000);
				new Menu().innit();
				socket.close();
			} while (true);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
