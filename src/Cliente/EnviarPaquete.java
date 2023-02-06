package Cliente;

import java.io.DataOutputStream;
import java.io.IOException;

public class EnviarPaquete {

	
	public void enviarPaquete(String texto) {
		DataOutputStream out;
		try {
			out = new DataOutputStream(Cliente.socket.getOutputStream());
			out.writeUTF(texto);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
