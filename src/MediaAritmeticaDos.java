import java.util.Scanner;

public class MediaAritmeticaDos {
	/**
	 * Este es un programa que calcula la media aritm�tica de tres valores 
	 * enteros y devuelve un valor decimal. 
	 * @author Nelson
	 * @param args
	 */

	public static void main(String[] args) {
		int var1, var2, var3;
		double result;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite la primera nota: ");
		var1= sc.nextInt(); 
		
		System.out.println("Digite la segunda nota: ");
		var2= sc.nextInt();
		
		System.out.println("Digite la tercera nota: ");
		var3= sc.nextInt();
		
		result= (var1+var2+var3) /3.0;
		
		System.out.println("La media aritm�tica de las tres notas es: "+  result);
		
		

	}

}
