import java.util.Scanner;

public class PruebaCal {

	/**
	 * Se crea las variables  y se llama al método scanner 
	 */
	
	public static void main(String[] args) {
		int anio;
		int edad;
		int respuesta;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Por favor, ingrese el año actual: ");
		anio=sc.nextInt();
		
		System.out.println("Por favor, ingrese la fecha de nacimiento: ");
		edad=sc.nextInt();
		
		respuesta= anio-edad;
		
		System.out.println("La edad actual es " + respuesta + "años.");
		
	 
		
		
	}

}
