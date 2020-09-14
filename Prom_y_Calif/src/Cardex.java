import java.util.Scanner;

public class Cardex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creación de método para recibir datos de entrada
		Scanner entrada = new Scanner(System.in);
		
		//Declaración de variables
		String nombre = new String();
		int rango [] = new int[5];
		int suma = 0;
		float promedio = 0;
		String calif = "";
		
		//Mandar mensajes al usuario
		System.out.println("Hola, me puedes decir tu nombre, por favor.");
		nombre = entrada.nextLine();
		
		System.out.println();
		System.out.println(nombre + ", aquí podrás ver tu cardex.");
		System.out.println("Vamos a introducir las calificaciones. Colócalas en formato 100, no uses puntos.");
		
		System.out.println();
		
		System.out.println("Introduce la Calificación de Matemáticas: ");
		rango[0] = entrada.nextInt();
		
		System.out.println("Introduce la Calificación de Física: ");
		rango[1] = entrada.nextInt();
		
		System.out.println("Introduce la Calificación de Química: ");
		rango[2] = entrada.nextInt();
		
		System.out.println("Introduce la Calificación de Ingles: ");
		rango[3] = entrada.nextInt();
		
		System.out.println("Introduce la Calificación de Programación: ");
		rango[4] = entrada.nextInt();
		
		System.out.println();//Salto de línea para mejor distribución de la información.
		
		//Sumamos las calificaciones con un ciclo "for".
		for(int i=0; i<rango.length; i++) {
			
			suma = suma + rango[i];
		}
		
		//Obteniendo el promedio
		promedio = suma/rango.length;
		
		//Evaluando el promedio
		if(promedio <= 50) {
			calif = "F";
			System.out.println("Tu calificación en tabulador es: F");
		}
		else if(promedio >= 61 && promedio <= 70) {
			calif = "E";
			System.out.println("Tu calificación en tabulador es: E");
		}
		
		else if(promedio >= 71 && promedio <= 80) {
			calif = "D";
			System.out.println("Tu calificación en tabulador es: D");
		}
		
		else if(promedio >= 81 && promedio <= 90) {
			calif = "C";
			System.out.println("Tu calificación en tabulador es: C");
		}
		
		else if(promedio >= 91 && promedio <= 100) {
			calif = "B";
			System.out.println("Tu calificación en tabulador es: B");
		}
		
		else{
			calif = "A";
			System.out.println("Tu calificación en tabulador es: A");
		}
		
		System.out.println();
		System.out.println("Tu cardex completo se muestra a continuación:");
		
		System.out.println();
		System.out.println("Nombre del estudiante: " + nombre);
		System.out.println("Calificación 1: " + rango[0]);
		System.out.println("Calificación 2: " + rango[1]);
		System.out.println("Calificación 3: " + rango[2]);
		System.out.println("Calificación 4: " + rango[3]);
		System.out.println("Calificación 5: " + rango[4]);
		System.out.println("Promedio: " + promedio);
		System.out.println("Calificación: " + calif);

	}

}
