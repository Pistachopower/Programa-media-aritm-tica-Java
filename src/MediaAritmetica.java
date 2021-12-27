import java.util.Locale;
import java.util.Scanner;

public class MediaAritmetica {

	public static void main(String[] args) {
	int var1, var2,var3;
	double result;
	
	Scanner sc=new Scanner(System.in);
	sc.useLocale(Locale.US);
	
	System.out.println("Ingrese el primer valor: ");
	var1=sc.nextInt();
	
	System.out.println("Ingrese el segundo valor: ");
	var2=sc.nextInt();
	
	System.out.println("Ingrese el tercer valor: ");
	var3=sc.nextInt();
	
	result= (var1+var2+var3) / 3.0;
	
	System.out.println("La media es: "+ result);

	}

}
