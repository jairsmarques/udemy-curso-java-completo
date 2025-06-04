import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);

		char y;
		y = sc.next().charAt(0);
		System.out.println("Você digitou: " + y);

		sc.close();
	}

}
