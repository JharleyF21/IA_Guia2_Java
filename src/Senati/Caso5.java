package Senati;

import  java.text.DecimalFormat ;
import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df =  new  DecimalFormat ( " # .00 " );
		
		System.out.print("Ingrese precio: ");
		float precio  = scn.nextFloat();
		
		System.out.print("Ingrese cantidad: ");
		int cantidad = scn.nextInt();
		
		float total = precio * cantidad;
		
		float dscto =  0 ;
		
		if (cantidad >  8 )
			dscto =  0.1f  * total;
		
		float neto = total - dscto;
		
		System.out.println("===============");
		System.out.println("RESULTADOS");
		System.out.println("===============");
		System.out.println("Total .......: "  + df.format(total));
		System.out.println("Descuento ...: "  + df.format(dscto));
		System.out.println("Neto ........: "  + df.format(neto));

	}

}
