package eje22;

import java.util.Scanner;

public class eje22 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numero_elegido;
		int numero_intentos;
		int intentos = 1;
		System.out.println("ingresa un numero: ");
		numero_elegido = entrada.nextInt();

		double numero = (Math.random() * 99);
		int resultado = (int) numero;

		while (numero_elegido != resultado) {

			if (numero_elegido > resultado) {
				System.out.println("el numero es menor que " + numero_elegido + " suerte la proxima");
			}

			else if (numero_elegido < resultado) {
				System.out.println("el numero es mayor que " + numero_elegido + " suerte la proxima");
			}

			else if (numero_elegido > 99 || numero_elegido < 0) {
				System.out.println("el numero:" + numero_elegido
						+ "esta fuera del rango permitido suerte la proxima, pedazo de mandioca ");
			}

			intentos++;
			System.out.println("ingresa un numero: ");
			numero_elegido = entrada.nextInt();

		}

		System.out.println("ganaste !!! :) lo conseguiste en " + intentos + " intentos");

	}
}
