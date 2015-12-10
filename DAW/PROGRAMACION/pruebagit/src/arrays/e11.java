package arrays;

import java.util.Scanner;

public class e11 {

	public static void main(String[] args) {
		// Robot
		
		String orden [] = new String [1000];
		Scanner entrada = new Scanner(System.in);
		
		int i;
		
		for (i=0; i<orden.length; i++){
			System.out.println("Introduzca orden nº" + (i+1) + ": ");
			orden[i] = entrada.nextLine().toLowerCase();
			
			if (orden[i].equals("ejecutar")) {
				break;
			}
		}
		
		System.out.println("\nLista de ordenes" + "=========================");
		
		for (int j=0; j<i; j++){
			System.out.println("Orden nº " + (j+1) + ": " + orden[j]);
		}
		
		entrada.close();
	}

}

