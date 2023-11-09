package Desafíointegrador;

import java.util.Scanner;

public class Desafíointegrador {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        boolean continuar = true;
		        

		        while (continuar) {
		            mostrarMenu();  

		            int opcion = obtenerOpcion(scanner);

		            double resultado = 0.0;

		            switch (opcion) {
		                case 1:
		                    resultado = realizarSuma(scanner);
		                    break;
		                case 2:
		                    resultado = realizarResta(scanner);
		                    break;
		                case 3:
		                    resultado = realizarMultiplicacion(scanner);
		                    break;
		                case 4:
		                    resultado = realizarDivision(scanner);
		                    break;
		                default:
		                    System.out.println("Opción no válida.");
		                    break;
		            }

		            System.out.println("El resultado es: " + resultado);

		            System.out.print("¿Desea realizar otra operación? (sí/no): ");
		            String respuesta = scanner.next();

		            if (!respuesta.equalsIgnoreCase("sí")) {
		                continuar = false;
		            }
		        }

		        System.out.println("¡Gracias por usar la calculadora!");
		        scanner.close();
		    }

		    public static void mostrarMenu() {
		        System.out.println("Calculadora");
		        System.out.println("1. Suma");
		        System.out.println("2. Resta");
		        System.out.println("3. Multiplicación");
		        System.out.println("4. División");
		    }

		    public static int obtenerOpcion(Scanner scanner) {
		        int opcion = 0;
		        boolean entradaValida = false;

		        while (!entradaValida) {
		            System.out.print("Elija una opción (1-4): ");
		            try {
		                opcion = scanner.nextInt();
		                if (opcion >= 1 && opcion <= 4) {
		                    entradaValida = true;
		                } else {
		                    System.out.println("Opción no válida. Ingrese un número del 1 al 4.");
		                }
		            } catch (Exception e) {
		                scanner.nextLine(); 
		                System.out.println("Entrada no válida. Ingrese un número del 1 al 4.");
		            }
		        }

		        return opcion;
		    }

		    public static double realizarSuma(Scanner scanner) {
		        System.out.print("Ingrese el primer número: ");
		        double num1 = scanner.nextDouble();
		        System.out.print("Ingrese el segundo número: ");
		        double num2 = scanner.nextDouble();
		        return num1 + num2;
		    }

		    public static double realizarResta(Scanner scanner) {
		        System.out.print("Ingrese el primer número: ");
		        double num1 = scanner.nextDouble();
		        System.out.print("Ingrese el segundo número: ");
		        double num2 = scanner.nextDouble();
		        return num1 - num2;
		    }

		    public static double realizarMultiplicacion(Scanner scanner) {
		        System.out.print("Ingrese el primer número: ");
		        double num1 = scanner.nextDouble();
		        System.out.print("Ingrese el segundo número: ");
		        double num2 = scanner.nextDouble();
		        return num1 * num2;
		    }

		    public static double realizarDivision(Scanner scanner) {
		        double resultado = 0.0;
		        boolean divisionValida = false;

		        while (!divisionValida) {
		            try {
		                System.out.print("Ingrese el numerador: ");
		                double numerador = scanner.nextDouble();
		                System.out.print("Ingrese el denominador: ");
		                double denominador = scanner.nextDouble();

		                if (denominador == 0) {
		                    System.out.println("Error: No se puede dividir por cero.");
		                } else {
		                    resultado = numerador / denominador;
		                    divisionValida = true;
		                }
		            } catch (Exception e) {
		                scanner.nextLine(); 
		                System.out.println("Entrada no válida. Ingrese números válidos.");
		            }
		        }
		        
		        return resultado;
		    }
}