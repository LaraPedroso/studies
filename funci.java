import java.util.Locale;
import java.util.Scanner;

public class funci {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, horas;
		double salario, total;
		
		
		System.out.println("Digite o numero do funcionario:");
		num = sc.nextInt();
		
		System.out.println("Digite as horas: ");
		horas = sc.nextInt();
		
		Locale.setDefault(Locale.US);
		System.out.println("Digite o valor das horas: ");
		total = sc.nextDouble();
		
		salario = horas * total;
		
		System.out.printf("Number = %d \n", num);
		System.out.printf("Salary = U$ %.2f %n", salario);
	
		sc.close();
		
		
	}

}
