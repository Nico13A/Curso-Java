package ejerciciosJava;

public class Practico3 {

	public static void main(String[] args) {
		
		// EJERCICIO 1
		System.out.println("-- EJERCICIO 1 --");
		
		// ACTIVIDAD A
		System.out.println("Dado un String y una letra, que cuente la "
				+ "cantidad de apariciones de la letra.");
		char letra = 'n';
		String frase = "Cantidad de letras";
		int contador = 0;
		for(int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == letra) {
				contador++;
			}
		}
		System.out.println("La cantidad de veces que aparece la letra " + letra + " "
				+ "es: " + contador);
		
		//ACTIVIDAD B
		System.out.println("\nDados 3 números y un orden (ascendente o decreciente) "
				+ "que ordene los mismos y los retorne en un vector de 3.");
		int mayor, medio, menor;
		int num1 = -4;
		int num2 = 1;
		int num3 = 12;
		boolean ascendente = false;
		
		if(num1 > num2 && num1 > num3) {
			mayor = num1;
		} else if(num2 > num1 && num2 > num3) {
			mayor = num2;
		} else {
			mayor = num3;
		}
		if(num1 < num2 && num1 < num3) {
			menor = num1;
		} else if(num2 < num1 && num2 < num3) {
			menor = num2;
		} else {
			menor = num3;
		}
		medio = (num1+num2+num3) - (mayor + menor);
		
		if (ascendente) {
			System.out.println(menor + " " + medio + " " + mayor);
		} else {
			System.out.println(mayor + " " + medio + " " + menor);
		}
			
		
		//ACTIVIDAD C
		System.out.println("\nDado un vector de números, y un número X, que sume todos los números > X y "
				+ "retorne el resultado.");
		int numeroX = 5;
		int vectorNumeros[] = {4, 1, 6, 2, 10, 43};
		int sumatoria = 0;
		for (int i=0; i<vectorNumeros.length; i++) {
			if(vectorNumeros[i]>numeroX) {
				sumatoria = sumatoria + vectorNumeros[i];
			}
		}
		System.out.println(sumatoria);
		
		// EJERCICIO 2
		
		System.out.println("\n-- EJERCICIO 2 --");
		System.out.println("Genere una clase que tenga los métodos para realizar la codificación y decodificación\r\n"
				+ "de un string, dado un número de desplazamiento.");
		String unaOracion = "hola que tal";
	    	//Transformar el string al codigo numero de la tabla ASCII.
	   	byte[] decodedBytes = unaOracion.getBytes();
		
	    	//Validar que puedo hacer revertible el array de bytes a un String.
	    	//System.out.println(new String(decodedBytes));
	    	for (int i=0; i<decodedBytes.length; i++) {
			decodedBytes[i]++;
	    	}
	    	String otraOracion = new String(decodedBytes);
	    	System.out.println("Texto sin desplazo: " + unaOracion);
	    	System.out.println("Texto con desplazo 1: " + otraOracion);
		
	}

}
