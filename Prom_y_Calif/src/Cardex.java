import java.util.Scanner;

public class Cardex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creaci�n de m�todo para recibir datos de entrada
		Scanner entrada = new Scanner(System.in);
		
		//Declaraci�n de variables
		String nombre = new String();
		int rango [] = new int[5];
		int suma = 0;
		float promedio = 0;
		String calif = "";
		
		//Mandar mensajes al usuario
		System.out.println("Hola, me puedes decir tu nombre, por favor.");
		nombre = entrada.nextLine();
		
		System.out.println();
		System.out.println(nombre + ", aqu� podr�s ver tu cardex.");
		System.out.println("Vamos a introducir las calificaciones. Col�calas en formato 100, no uses puntos.");
		
		System.out.println();
		
		System.out.println("Introduce la Calificaci�n de Matem�ticas: ");
		rango[0] = entrada.nextInt();
		
		System.out.println("Introduce la Calificaci�n de F�sica: ");
		rango[1] = entrada.nextInt();
		
		System.out.println("Introduce la Calificaci�n de Qu�mica: ");
		rango[2] = entrada.nextInt();
		
		System.out.println("Introduce la Calificaci�n de Ingles: ");
		rango[3] = entrada.nextInt();
		
		System.out.println("Introduce la Calificaci�n de Programaci�n: ");
		rango[4] = entrada.nextInt();
		
		System.out.println();//Salto de l�nea para mejor distribuci�n de la informaci�n.
		
		//Sumamos las calificaciones con un ciclo "for".
		for(int i=0; i<rango.length; i++) {
			
			suma = suma + rango[i];
		}
		
		//Obteniendo el promedio
		promedio = suma/rango.length;
		
		//Evaluando el promedio
		if(promedio <= 50) {
			calif = "F";
			System.out.println("Tu calificaci�n en tabulador es: F");
		}
		else if(promedio >= 61 && promedio <= 70) {
			calif = "E";
			System.out.println("Tu calificaci�n en tabulador es: E");
		}
		
		else if(promedio >= 71 && promedio <= 80) {
			calif = "D";
			System.out.println("Tu calificaci�n en tabulador es: D");
		}
		
		else if(promedio >= 81 && promedio <= 90) {
			calif = "C";
			System.out.println("Tu calificaci�n en tabulador es: C");
		}
		
		else if(promedio >= 91 && promedio <= 100) {
			calif = "B";
			System.out.println("Tu calificaci�n en tabulador es: B");
		}
		
		else{
			calif = "A";
			System.out.println("Tu calificaci�n en tabulador es: A");
		}
		
		System.out.println();
		System.out.println("Tu cardex completo se muestra a continuaci�n:");
		
		System.out.println();
		System.out.println("Nombre del estudiante: " + nombre);
		System.out.println("Calificaci�n 1: " + rango[0]);
		System.out.println("Calificaci�n 2: " + rango[1]);
		System.out.println("Calificaci�n 3: " + rango[2]);
		System.out.println("Calificaci�n 4: " + rango[3]);
		System.out.println("Calificaci�n 5: " + rango[4]);
		System.out.println("Promedio: " + promedio);
		System.out.println("Calificaci�n: " + calif);

	}

}
