package calculadora;

public class CalculadoraBase {

	/*
	 * está classe é uma super classe. Será utilizada como base para estudos de
	 * polimorfimo.
	 */

	// Sobrecarga de método para somar dois inteiros.
	public int somar(int a, int b) {
		return a + b;
	}

	// Sobrecarga de método para somar três inteiros
	public int somar(int a, int b, int c) {
		return a + b + c;
	}
// sobrecarga de método para somar dois numeros flutuantes
	public double somar(double a, double b) {
		return a + b;
	}
	

}
