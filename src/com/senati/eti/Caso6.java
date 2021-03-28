package com.senati.eti;

public class Caso6 {

	public static void main(String[] args) {
		String[][] datos = {{"Joe Castillo","Rosa Flores","Ricardo"},
				{"Callao","Comas","Puente Piedra"}};
		// datos.leght  --> Cantidad de filas(f) de la matriz....(2)
		// datos[0].lemght --> Cantidad de elementos del arreglo de la 1ra...(3)
		// Impresion de valores de la matriz por filas
		System.out.println("........ IMPRESION POR FILAS ........");
		System.out.println("=====================================");
		for (int f = 0; f < datos.length; f++) {
			for (int c = 0; c < datos[0].length; c++)
				System.out.print(String.format("%-20s", datos[f][c]) + "\t");
			
			System.out.println();
		}
		
		// Impresión de valores de la matriz por columnas
		System.out.println("\n........ IMPRESION POR COLUMNAS ........");
		System.out.println("=====================================");
		
		for (int c = 0; c < datos[0].length; c++) {
			for (int f = 0; f < datos.length; f++)
				System.out.print(String.format("%-20s", datos[f][c]) + "\t");
			System.out.println();
	}

	}

}
