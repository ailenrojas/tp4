package Desaf�ointegrador;

import java.util.Scanner;

public class Desaf�ointegrador {
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
		                    System.out.println("Opci�n no v�lida.");
		                    break;
		            }

		            System.out.println("El resultado es: " + resultado);

		            System.out.print("�Desea realizar otra operaci�n? (s�/no): ");
		            String respuesta = scanner.next();

		            if (!respuesta.equalsIgnoreCase("s�")) {
		                continuar = false;
		            }
		        }

		        System.out.println("�Gracias por usar la calculadora!");
		        scanner.close();
		    }

		    public static void mostrarMenu() {
		        System.out.println("Calculadora");
		        System.out.println("1. Suma");
		        System.out.println("2. Resta");
		        System.out.println("3. Multiplicaci�n");
		        System.out.println("4. Divisi�n");
		    }

		    public static int obtenerOpcion(Scanner scanner) {
		        int opcion = 0;
		        boolean entradaValida = false;

		        while (!entradaValida) {
		            System.out.print("Elija una opci�n (1-4): ");
		            try {
		                opcion = scanner.nextInt();
		                if (opcion >= 1 && opcion <= 4) {
		                    entradaValida = true;
		                } else {
		                    System.out.println("Opci�n no v�lida. Ingrese un n�mero del 1 al 4.");
		                }
		            } catch (Exception e) {
		                scanner.nextLine(); 
		                System.out.println("Entrada no v�lida. Ingrese un n�mero del 1 al 4.");
		            }
		        }

		        return opcion;
		    }

		    public static double realizarSuma(Scanner scanner) {
		        System.out.print("Ingrese el primer n�mero: ");
		        double num1 = scanner.nextDouble();
		        System.out.print("Ingrese el segundo n�mero: ");
		        double num2 = scanner.nextDouble();
		        return num1 + num2;
		    }

		    public static double realizarResta(Scanner scanner) {
		        System.out.print("Ingrese el primer n�mero: ");
		        double num1 = scanner.nextDouble();
		        System.out.print("Ingrese el segundo n�mero: ");
		        double num2 = scanner.nextDouble();
		        return num1 - num2;
		    }

		    public static double realizarMultiplicacion(Scanner scanner) {
		        System.out.print("Ingrese el primer n�mero: ");
		        double num1 = scanner.nextDouble();
		        System.out.print("Ingrese el segundo n�mero: ");
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
		                System.out.println("Entrada no v�lida. Ingrese n�meros v�lidos.");
		            }
		        }
		        
		        return resultado;
		    }
}