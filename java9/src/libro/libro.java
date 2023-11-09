package libro;

import java.util.Scanner;

public class libro {


public class Biblioteca {
}
		public void mostrarListaLibros() {
		
			
		}

		public void buscarLibroPorTitulo(String tituloBuscado) {
		
			
		}

		public void agregarLibro(String titulo, String autor, int numPaginas) {
		
		}
	}



	class Libro {
	    String titulo;
	    String autor; 
	int numPaginas;

	    public Libro(String titulo, String autor, int numPaginas) {
	        this.titulo = titulo;
	        this.autor = autor;
	        this.numPaginas = numPaginas;
	    }

	public void agregarLibro(String titulo, String autor, int numPaginas) {
	    }
	public void mostrarListaLibros() {
	        System.out.println("Lista de libros en la biblioteca:");
	        Libro[] bibliotecas2 = null;
			for (Libro libro : bibliotecas2) {
	            System.out.println("Título: " + libro.titulo);
	            System.out.println("Autor: " + libro.autor);
	            System.out.println("Número de páginas: " + libro.numPaginas);
	        }
	    }

	    public void buscarLibroPorTitulo(String tituloBuscado) {
	        System.out.println("Libros que coinciden con el título \"" + tituloBuscado + "\":");
	        Libro[] bibliotecas = null;
			for (Libro libro : bibliotecas) {
	            if (libro.titulo.toLowerCase().contains(tituloBuscado.toLowerCase())) {
	                System.out.println("Título: " + libro.titulo);
	                System.out.println("Autor: " + libro.autor);
	                System.out.println("Número de páginas: " + libro.numPaginas);
	   
	            }
	            
	            }
	    }

	    
	               
	public static void main(String[] args) {


		Biblioteca biblioteca = new Biblioteca();
		try (Scanner input1 = new Scanner(System.in)) {
				while (true) {
				    System.out.println("\nMenú de opciones:");
				    System.out.println("1. Agregar libro");
				    System.out.println("2. Mostrar lista de libros");
				    System.out.println("3. Buscar libro por título");
				    System.out.println("4. Salir");

				    int opcion1 = input1.nextInt();

				    switch (opcion1) {
				        case 1:
				            System.out.println("Ingrese el título del libro:");
				            input1.nextLine();
				            String titulo = input1.nextLine();
				            System.out.println("Ingrese el autor del libro:");
				            String autor = input1.nextLine();
				            System.out.println("Ingrese el número de páginas del libro:");
				            
				           
int numPaginas = input1.nextInt();

				            biblioteca.agregarLibro(titulo, autor, numPaginas);
				            break;
				        case 2:
				            biblioteca.mostrarListaLibros();
				            break;
				        case 3:
				            System.out.println("Ingrese el título a buscar:");
				            input1.nextLine(); 
				            String tituloBuscado = input1.nextLine();
				            biblioteca.buscarLibroPorTitulo(tituloBuscado);
				            break;
				        case 4:
				            System.out.println("Saliendo del programa. ¡Hasta luego!");
				            System.exit(0);
				        default:
				            System.out.println("Opción no válida. Por favor, elija una opción válida.");
				    }
				}
			}
	}
}


