package Cliente;

public class GenerarPaquete {

	public GenerarPaquete() {
		
		// TODO Auto-generated constructor stub
	}

	public void generarLectura(int tipoMatriz, int fila, int columna, int b ) {

		String unformatedString = tipoMatriz +"_"+fila+"_"+columna+"_"+b;
		System.out.println(unformatedString);
		new EnviarPaquete().enviarPaquete(unformatedString);
	}

}
