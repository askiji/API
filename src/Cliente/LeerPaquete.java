package Cliente;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class LeerPaquete extends Thread {
	//private Socket socket;
	public LeerPaquete() {
		
	}
	@Override
	public void run() {
		lectura();
		super.run();
	}
	public void lectura() {
		// TODO Auto-generated method stub
		DataInputStream in;
		try {
			in = new DataInputStream(Cliente.socket.getInputStream());
			System.out.println(in.readUTF());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
