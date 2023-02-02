package Cliente;

import java.net.Socket;

public class LeerPaquete extends Thread {
	private Socket socket;
	public LeerPaquete(Socket socket) {
		this.socket = socket;
	}
	@Override
	public void run() {
		lectura();
		super.run();
	}
	private void lectura() {
		// TODO Auto-generated method stub
		
	}

}
