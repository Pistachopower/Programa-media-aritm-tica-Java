import java.util.Locale;
import java.util.Scanner;

public class EjercicioLongitudArea {
	/**
	 * Diseñar una aplicación que calcule la longitud y el área
	 * de una circunferencia. Para ello, el usuario debe introducir 
	 * el radio (que puede contener decimales).
	 * 
	 * 						Fórmula: 
	 * Longitud = 2* PI (3,14) * RADIO 
	 *			  ÁREA= PI (3,14) * RADIO ^2
	 *
	 * 						Programa
	 * Crear tres variables double llamadas Rad, Log, Area
	 * Invocar el Scanner y asignarle un nombre 
	 * Mostrar un syso que pida el radio 
	 * Guardar el valor en la variable Rad
	 * 
	 * Usar la variable Log para realizar el cálculo de la longitud 
	 * Multiplicar 2 * PI
	 * Llamar a la clase Math para calcular PI * el Rad (valor usuario)
	 * 
	 * Usar la variable Area
	 * Llamar a la clase Math para calcular PI, * (por) Math POW, Rad elevado a 2
	 * 
	 * Mostrar el pantalla la longitud y el area
	 * 
	 */
	
	public static void main(String[] args) {
	double Rad, Log, Area;
	
	Scanner sc=new Scanner(System.in);
	sc.useLocale(Locale.US);
	
	System.out.println("Digite el radio a calcular: ");
	Rad=sc.nextDouble();
	
	Log= 2*Math.PI*Rad;
	Area= Math.PI *Math.pow(Rad,2);
	
	System.out.println("La longitud es: " +Log);
	
	System.out.println("El área es: "+ Area);
	

	}

}
