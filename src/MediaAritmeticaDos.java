import java.util.Locale;
import java.util.Scanner;

public class MediaAritmeticaDos {
	/**
	 * Este es un programa que calcula la media aritmética de tres valores 
	 * enteros y devuelve un valor decimal. 
	 * @version
	 * @author Nelson
	 * @param args
	 */

	public static void main(String[] args) {
		int var1, var2, var3;
		double result;
		
		Scanner sc= new Scanner(System.in);
		sc.useLocale(Locale.US); //se llama la librería Locale para 
								//que 
		
		System.out.println("Digite la primera nota: ");
		var1= sc.nextInt(); 
		
		System.out.println("Digite la segunda nota: ");
		var2= sc.nextInt();
		
		System.out.println("Digite la tercera nota: ");
		var3= sc.nextInt();
		
		result= (var1+var2+var3) /3.0;
		
		System.out.println("La media aritmética de las tres notas es: "+  result);
		
		

	}

}
