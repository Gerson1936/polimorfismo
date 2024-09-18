package calculadora;

public class CalculadoraBase {

	/*
	 * está classe é uma super classe. Será utilizada como base para estudos de
	 * polimorfimo.
	 */
	public CalculadoraBase() {

	}

	// Sobrecarga de método para somar dois inteiros.
	public double somar(double a, double b) {
		return a + b;
	}
	public int somar(int a, int b) {
		return a + b;
	}

	public int subtrair(int a, int b) {
		return a - b;
	}
	
	public double subtrair(double a, double b) {
		return a - b;
	}
	
	public int multiplicacao(int a, int b) {
		return a * b;
	}
	public double multiplicacao(double a, double b) {
		return a * b;
	}

	public int dividir(int a, int b) {
		return a / b;
	}
	public double dividir(double a, double b) {
		return a / b;
	}

}
