package ejerciciosJava;

public class Practico1 {

	public static void main(String[] args) {
		
		// EJERCICIO 1
		
		/* 
		a) Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
		y “b”. 
		*/
		System.out.println("**** EJERCICIO 1 ****");
		System.out.println("-- Parte a --");
		int numeroInicio = 5;
		int numeroFin = 14;
		while (numeroInicio <= numeroFin) {
			System.out.println(numeroInicio);
			numeroInicio++;
		}
		
		// b) A lo anterior, solo muestre los números pares.
		System.out.println("-- Parte b --");
		numeroInicio = 5;
		while (numeroInicio <= numeroFin) {
			if (numeroInicio % 2 == 0) {
				System.out.println(numeroInicio);
			}
			numeroInicio++;
		}
		
		// c) A lo anterior, con una variable extra, elija si se deben mostrar los números pares o impares.
		System.out.println("-- Parte c --");
		numeroInicio = 5;
		char parOImpar = 'p'; 
		//p es impar e i es impar.
		while(numeroInicio <= numeroFin) {
			switch (parOImpar) {
			case 'p':
				if(numeroInicio % 2 == 0) {
					System.out.println(numeroInicio);
				}
				break;
			case 'i':
				if(numeroInicio % 2 != 0) {
					System.out.println(numeroInicio);
				}
				break;
			default:
				System.out.println("La opción ingresada es incorrecta.");
				break;
			}
			numeroInicio++;
		}
		
		// d) Utilizando la sentencia for, hacer lo mismo que b pero invirtiendo el orden.
		System.out.println("-- Parte d --");
		numeroInicio = 5;
		for(numeroFin = 14; numeroInicio<=numeroFin; numeroFin--) {
			if (numeroFin % 2 == 0) {
				System.out.println(numeroFin);
			}
		}
		
		// EJERCICIO 2
		
		System.out.println("**** EJERCICIO 2 ****");
		
		float ingresosMensuales = 850000;
		int cantidadVehiculosMenorA5Anios = 4;
		int cantidadInmuebles = 1;
		int cantidadVehiculosLujo = 0;
		
		if(ingresosMensuales >= 489083 || cantidadVehiculosMenorA5Anios >= 3 || cantidadInmuebles >= 3 
				|| cantidadVehiculosLujo > 0) {
			System.out.println("El hogar pertenece al segmento de ingresos altos.");
		} else {
			System.out.println("El hogar no pertenece al segmento de ingresos altos.");
		}

		
	}

}
