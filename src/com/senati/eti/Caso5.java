package com.senati.eti;
import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arrCodigo = {"A-456", "A-789", "A-777"};
		String[] arrNombre = {"Noe Valencia", "Rosa Flores", "Ricardo Montes", "Teresa Aguilar"};
		int[] arrNota = {15, 8, 17, 11};
		
		System.out.println("BÚSQUEDA DE DATOS");
		System.out.println("-----------------");
		System.out.print("Código a buscar: ");
		String codigo = sc.nextLine(); // A-456
		
		int pos = -1;
		
		for (int x = 0; x < arrCodigo.length; x++) {
			if (codigo.equals(arrCodigo)) {
				pos = x;
				break;
			}
		}

		if (pos == -1 ) {
			System.out.println("\n------------------");
			System.out.println("CÓDIGO NO ENCONTRADO");
			System.out.println("\n------------------");
		}
		
		if (pos == -1) {
			System.out.println("\n------------------");
			System.out.println("CÓDIGO NO ENCONTRADO");
			System.out.println("\n------------------");
			
		}
		else {
			System.out.println("\n---------------");
			System.out.println("CÓDIGO ENCONTRADO");
			System.out.println("\n---------------");
			System.out.println("Código........: " + arrCodigo[pos]);
			
			
		}

	}

}
