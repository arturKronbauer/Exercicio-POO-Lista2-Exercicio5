package aplicacao;

import java.util.Scanner;

import util.ConversorMoeda;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual é o preço do dolar? ");
		double precoDolar = sc.nextDouble();
		System.out.print("Quantos dolares será comprado? ");
		double quantidade = sc.nextDouble();
		double resultado = ConversorMoeda.dolarParaReal(quantidade, precoDolar);
		System.out.printf("O valor a ser pago em reias = %.2f%n", resultado);
		sc.close();
	}
}
