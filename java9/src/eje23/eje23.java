+package eje23;

import java.util.Scanner;

public class eje23 {
public static void main(String[] args) {

Scanner datos = new Scanner(System.in);


int num1,num2,suma;

    System.out.println("ingrese num1: " );
    num1 =datos.nextInt();
    System.out.println("ingrese num2");
    num2 = datos.nextInt();
    
    suma=num1 + num2 ;
    
    System.out.println("el resultado es :"+suma+"recuerde que puede salir poniendo 0 en todas las opciones");
    
    while (suma != 0) {
    	System.out.println("ingrese num1 :");
    	num1 = datos.nextInt();
    	System.out.println("ingrese num2");
    	num2=datos.nextInt();
    suma =num1 + num2;
    System.out.println("el resultado es : " +suma+"recuerde que puede salir poniendo 0 ");
    	
    }
    System.out.println("adios y tenga buen dia");







}
}