package Senati;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int numero =  0 ;
		
		System.out.println("Número de ingreso : ");
		numero = scn.nextInt();
		
		String estado =  "numero impar";
		
		if (numero %  2  ==  0 )
			estado =  "numero par";
				
		System.out.println("El numero "  + numero +  " es "  + estado);

	}

}
