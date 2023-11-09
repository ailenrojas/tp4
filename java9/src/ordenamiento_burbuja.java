package ordenamiento_burbuja;

public class ordenamiento_burbuja {
	public static void main(String[] args) {
		int[] arreglo = { 5, 2, 8, 3, 1 };

		// Mostrar el arreglo desordenado
		System.out.println("Arreglo desordenado:");
		for (int num : arreglo) {
			System.out.print(num + " ");
		}

		// Aplicar el algoritmo de ordenamiento burbuja
		
		for (int i = 0; i < (arreglo.length - 1) /* i < 4 (5-1) */; i++) {
			 
			for (int j = 0; j < (arreglo.length - i - 1) ; j++) {
			/* arreglo.length - i - 1:
			  	elimina pasadas innecesarias ya que el valor mas alto 
			  	siempre quedará en la última posición desde el 
			  	inicio del ordenamiento. 
			*/
				
				if (arreglo[j] > arreglo[j + 1]) {
					// Intercambiar los elementos
					int temporal = arreglo[j];
					/* temporal sirve para guardar por un momento
						al valor mas alto. 
					*/
					arreglo[j] = arreglo[j + 1];
					// La primera posición de las dos, toma el valor de la segunda (que es mas chico).
					arreglo[j + 1] = temporal;
					// La segunda posición, toma el valor mas alto.
				}
			}
		}

		// Mostrar el arreglo ordenado
		System.out.println("\nArreglo ordenado:");
		for (int num : arreglo) {
			System.out.print(num + " ");
		}
	}
}