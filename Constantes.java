/*
 * Ejercicios relacionados con constantes, 
 * variables y operadores.
 * */
public class Constantes {
	public static void main(String[] args) {
		
		/*
		 *  Constante y Operadores I
		 * 
		 * double a = 5;
		 * double b;
		 * b = 7;
		 * double c = b/a;
		 *		 
		 * division de a mas b, si a es igual 5 y b es 
		 * igual a 7 como resultado nos deberia dar 1,4
		 * pero como a y b son enteros nos ignora la 
		 * parte decimal y se queda con la parte entera.
		 * 
		 * int c = b/a; imprime 1
		 * 
		 * Para que esto no ocurra debemos cambiar el tipo
		 * de datoa double.
		 * 
		 * double c = b/a; imprime 1.4
		 * 
		 * Suma de valores enteros b+a
		 * donde a es igual a 5 y b es igual a 7
		 * 
		 * int c=b+a;
		 * 
		 * Si c vale 12. 
		 * 
		 * c++; 
		 * Con esto aumentara en uno el valor de c 
		 * imprimiendo en pantalla 13.
		 * 
		 * c+=6;
		 * Con esto le decimos que aumente en seis la
		 * variable c con lo cual nos dara 18 como 
		 * resultado.
		 *
		 * c-=6;
		 * Al ejecutar esta instrucción la decimos que
		 * le reste seis numeros a la variable c, con 
		 * lo cual en pantalla nos debe mostrar el valor 
		 * de 6.
		 *
		 */
		
		/*
		 * Constante y operadores II
		 * 
		 * Si tenemos una variable instanciada y declarada
		 * de la siguiente forma:
		 * 
		 * int c = 5;
		 * 
		 * Para transformarla en una constante debemos agregar
		 * la palabra reservada final antes de la misma quedando:
		 * 
		 * final int c = 5;
		 * 
		 * De esta manera nuestra variable se transforma en una 
		 * constante y no puede ser modificada durante la ejecu-
		 * ción del programa.
		 * 
		 * Si intentamos asignarle un valor a c cuando queramos
		 * ejecutar el programa nos generara un mensaje de error,
		 * como el siguiente:
		 * 
		 * "The final local variable c cannot be assigned. 
		 * It must be blank and not using a compound assignment"
		 * 
		 * indicando que la variable local c no se le puede asignar
		 * un valor.
		 * 
		 * 
		 * */
		
		/*
		 * Ejercicio:
		 * 
		 * Convierte centimetros a pulgadas.
		 */
		
		final double apulgadas = 2.54; //Una pulgada equivale a 2.54 cm
		double cm = 6;
		double resultado = cm/apulgadas;
		System.out.println("En "+cm+" cm hay "+resultado+" pulgadas");
		
		int operadoruno = 8, operadordos = 7, resultadotest = operadoruno + operadordos;
		System.out.println("El resultado de "+operadoruno+" + "+operadordos+" es igual a "+resultadotest);
		
	}

}
