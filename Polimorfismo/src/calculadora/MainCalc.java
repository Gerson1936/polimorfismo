package calculadora;

import java.util.Scanner;

public class MainCalc {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		CalculadoraBase operacao = new CalculadoraBase();

		System.out.println("Informe o primeiro número: ");
		String input1 = scanner.nextLine();

		System.out.println("Informe o primeiro número: ");
		String input2 = scanner.nextLine();

//		Identificar se o primeiro número é um inteiro
		boolean isInt1 = input1.matches("-?\\d+");
//		Identificar se o segundo número é um inteiro
		boolean isInt2 = input1.matches("-?\\d+");

		boolean isDouble1 = input1.matches("-?\\d+\\.\\d+");
		boolean isDouble2 = input2.matches("-?\\d+\\.\\d+");

		System.out.println("Escolha a operação: ");
		System.out.println("1. Adição");
		System.out.println("2. Substração");
		System.out.println("3. Multiplicação");
		System.out.println("4. Divisão");

		int escolha = scanner.nextInt();

		try {
			switch (escolha) {
			case 1:
				if (isInt1 && isInt2) {
					System.out.println(
							"Adição (int): " + operacao.somar(Integer.parseInt(input1), Integer.parseInt(input2)));
				} else {
					System.out.println(
							"Adição (double)" + operacao.somar(Double.parseDouble(input1), Double.parseDouble(input2)));
				}
				break;

			case 2:
				if (isInt1 && isInt2) {
					System.out.println("Subtração (int): "
							+ operacao.subtrair(Integer.parseInt(input1), Integer.parseInt(input2)));
				} else {
					System.out.println("Subtração (double)"
							+ operacao.subtrair(Double.parseDouble(input1), Double.parseDouble(input2)));
				}
				break;
			case 3:
				if (isInt1 && isInt2) {
					System.out.println("Multiplicação (int): "
							+ operacao.multiplicacao(Integer.parseInt(input1), Integer.parseInt(input2)));
				} else {
					System.out.println("Multiplicação (double)"
							+ operacao.multiplicacao(Double.parseDouble(input1), Double.parseDouble(input2)));
				}
				break;

			case 4:
				if (isInt1 && isInt2) {
					System.out.println(
							"Divisão (int): " + operacao.dividir(Integer.parseInt(input1), Integer.parseInt(input2)));
				} else {
					System.out.println("Divisão (double)"
							+ operacao.dividir(Double.parseDouble(input1), Double.parseDouble(input2)));
				}
				break;

			default:
				System.out.println("Operação Invalida!");
				break;
			}
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			scanner.close();
		}

	}

}
