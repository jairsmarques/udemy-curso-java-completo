/*
 * Fazer um programa que lê números inteiros até que um zero seja lido. Ao final mostra a soma dos 
 * números lidos.
 */

import java.util.Scanner;

public class EstruturaRepetitivaWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int soma = 0;
		while (n != 0) {
			soma += n;
			n = sc.nextInt();
		}

		System.out.println(soma);

		sc.close();

	}

}
