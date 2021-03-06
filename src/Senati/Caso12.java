package Senati;

import  java.text.DecimalFormat;
import java.util.Scanner;

public class Caso12 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df =  new  DecimalFormat ( " # .00 " );
		
		System.out.print("Nombre del empleado: ");
		String nombre = scn.nextLine();
		System.out.print("Nivel [1-4]: ");
		int nivel = scn.nextInt();
		System.out.print("Sueldo: ");
		float sueldo = scn.nextFloat();
		
		float incremento =  0 ;
		
		switch (nivel) {
		 case  1 :
				incremento =  0.045f ; break;
		 case  2 :
				incremento =  0.06f ; break;
		 case  3 :
				incremento =  0.085f ; break;
		 case  4 :
				incremento =  0.11f ; break;
		}
		
		float n_sueldo = sueldo * ( 1  + incremento);
			
		System.out.println(" RESULTADOS ");
		System.out.println("=============== ");
		System.out.println("Empleado .....: "  + nombre);
		System.out.println("Nivel .....: "  + nivel);
		System.out.println("Sueldo .....: "  + sueldo);
		System.out.println("Incremento .....: "  + incremento *  100  +  " % ");
		System.out.println("Nuevo sueldo .....: "  + n_sueldo);

	}

}
