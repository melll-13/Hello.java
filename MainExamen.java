package examenparcial1;

import java.util.Scanner;

public class MainExamen {
	public static void main (String[] Args ) {

		try (Scanner entrada = new Scanner (System.in)) {
		
		System.out.println("¿Que operación quieres realizar? Ingresa el numero que correspoda a la lista de operaciónes"); 
		System.out.println("\n1 - Convierte la primera letra en mayúscula de una cadena");
		System.out.println("2 - Dada una cadena inicial, invierte el orden de los caracteres");
		System.out.println("3 - Convierte las vocales de una cadena en mayúscula");
		System.out.println("4 - Imprime los números del 1 al 100, pero sustituye los múltiplos de 3 por \"Fizz\", los múltiplos de 5 en \"Buzz\" y los de 3 y 5 por \"FizzBuzz\"");
		System.out.println("5 - Comprueba si una cadena es un palindromo");
		
		int operacion = entrada.nextInt();
	       while(operacion <= 0 || operacion >= 6){
	         System.out.println("Numero invalido, ingrese nuevamente el numero de la operación");
	         operacion = entrada.nextInt();
	         
	       }
	         if(operacion == 1){
	        	 System.out.println(primeraMayuscula("anita lava la tina"));
		}
	         if(operacion == 2){
	        	 System.out.println(invertirCadena("hello"));
		}   
	         if(operacion == 3){
	        	 System.out.println(vocalesMayuscula("Hasta luego cocodrilo"));
		}   
	         if(operacion == 4){
	        	 fizzBuzz();
		}   
	         if(operacion == 5){
	        	 System.out.println(palindromo("sugus"));
		}   
		}
	}

	public static String primeraMayuscula(String frase) {
		
		String resultado = frase.substring(0, 1).toUpperCase() + frase.substring(1);
		
		System.out.println("frase original: " + frase);
		System.out.print("frase nueva: ");

		return resultado;
	}

	public static String invertirCadena(String frase) {
		 
		String[] arr = frase.split(""); 
		String inverso="";
		 
		for (int i = arr.length-1; i >=0; i--) {
			
			inverso = inverso + arr[i];
		}
		System.out.println("Cadena original: " + frase );
		System.out.print ("Cadena invertida: " );
		
	return inverso;
	
	}

	public static String vocalesMayuscula(String frase) {
		
		frase = "Hasta luego cocodrilo";
		
		frase = frase.replace('a', 'A');
		frase = frase.replace('e', 'E');
		frase = frase.replace('i', 'I');
		frase = frase.replace('o', 'O');
		frase = frase.replace('u', 'U');
		
		return frase;
	}
	
	public static void fizzBuzz() {
			for (int i = 1; i <= 100; i++){
				if (i % 3 == 0 && i % 5 == 0){
					System.out.println("FizzBuzz");
				}
				else if (i % 3 == 0) {
					System.out.println("Fizz");
				}
				else if (i % 5 == 0) { 
					System.out.println("Buzz");
				}
				else {
					System.out.println(i);
				}
			}
	}
	
public static boolean palindromo(String string) { 
		
		String inverso = "";
		
		boolean respuesta = false; 
		
		for (int i = string.length() - 1; i >= 0; i--) {
			inverso = inverso + string.charAt(i); 
		}
		if (string.equals(inverso)) {
			respuesta = true;
		}
		return respuesta;
	}

}
