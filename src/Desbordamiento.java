import java.util.Locale;
import java.util.Scanner;


public class Desbordamiento {
	/**
	 * Calcular la media aritmetica de 4 números:
	 * crear 4 variables 
	 * Leer por teclado los tres números almacenados 
	 * Dividir el total de los tres valores 
	 * Mostrar resultado
	 * 
	 */

	public static void main(String[] args){
	int var1, var2, var3, var4; 
	double result;
	
	
	Scanner sc=new Scanner(System.in);
	sc.useLocale(Locale.US);
	
	var1= sc.nextInt();
	System.out.println("Digite el primer valor:\n ");

	System.out.println("Digite el segundo valor:\n ");
	var2= sc.nextInt();
	
	System.out.println("Digite el tercer valor:\n ");
	var3= sc.nextInt();
	
	System.out.println("Digite el cuarto valor:\n ");
	var4= sc.nextInt();
	
	result= (var1+ var2+ var3+ var4) /4.0;
	System.out.println("La media de los 4 número es: "+ result);		
		
	}

}
