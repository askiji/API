package Cliente;

public class GenerarPaquete {

	public GenerarPaquete() {
		
		// TODO Auto-generated constructor stub
	}

	public void generarLectura(int tipoMatriz, int fila, int columna, int b , String st ) {

		String unformatedString = tipoMatriz +"_"+fila+"_"+columna+"_"+b + "_"+ st;
		System.out.println(unformatedString);
		new EnviarPaquete().enviarPaquete(unformatedString);
	}

}
