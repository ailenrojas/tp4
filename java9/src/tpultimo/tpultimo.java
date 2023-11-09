package tpultimo;

public class tpultimo {

	  static String[] nombres = new String[3];
	    static String[] apellidos = new String[3];
	    static int[] numerosCamiseta = new int[3];

	    public static void main(String[] args) {
	        ingresarDatos();
	        agregarJugador();
	    }

	    public static void ingresarDatos() {
	        
	    }

	    public static void agregarJugador() {
	        String respuestaAgregarJugador = ;
	        boolean respuestaAgregarIncorrecta = true;

	        while (respuestaAgregarIncorrecta) {
	            System.out.println("¿Desea agregar los datos de un jugador suplente? (si/no)");
	            respuestaAgregarJugador = respuestaAgregarJugador.toLowerCase();

	            if (respuestaAgregarJugador.equals("si")) {
	                analizarDatosCuatroJugadores(); 
	                respuestaAgregarIncorrecta = false;
	            } else if (respuestaAgregarJugador.equals("no")) {
	                analizarDatosTresJugadores(); 
	                respuestaAgregarIncorrecta = false;
	            } else {
	                System.out.println("Respuesta incorrecta. Por favor, responda 'si' o 'no'.");
	            }
	        }
	    }
 
	    public static void analizarDatosTresJugadores() {
	   
	    }

	    public static void analizarDatosCuatroJugadores() {
	
	    }
	}
