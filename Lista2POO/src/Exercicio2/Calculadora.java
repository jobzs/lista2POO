package Exercicio2;

public class Calculadora {

	// atributos

	private double valorA;
	private double valorB;
	private double resultadoDoCalculo;
	private String operacaoSelecionada;
	private String operacaoNula;

	// construtor

	public void ReceberNum(double var1, double var2, String operador, String Anular) {
		this.valorA = var1;
		this.valorB = var2;
		this.operacaoSelecionada = operador;
		this.operacaoNula = Anular;
	}

	public double getResultado() {
		return resultadoDoCalculo;
	}

	public void setValorA(double valorA) {
		this.valorA = valorA;
	}

	public void setValorB(double valorB) {
		this.valorB = valorB;
	}

	public void setOperacao(String operacaoSelecionada) {
		this.operacaoSelecionada = operacaoSelecionada;
	}

	private double somarDados(double valorA, double valorB) {
		this.resultadoDoCalculo = valorA + valorB;
		return resultadoDoCalculo;
	}

	private double multiplicarDados(double valorA, double valorB) {
		this.resultadoDoCalculo = valorA * valorB;
		return resultadoDoCalculo;
	}

	private double dividirDados(double valorA, double valorB) {
		this.resultadoDoCalculo = valorA / valorB;
		return resultadoDoCalculo;
	}

	private double subtrairDados(double valorA, double valorB) {
		this.resultadoDoCalculo = valorA - valorB;
		return resultadoDoCalculo;
	}

	

	public String getOperacaoNula() {
		return operacaoNula;
	}

	public void setOperacaoNula(String operacaoNula) {
		this.operacaoNula = operacaoNula;
	}

	public void Calcular() {
		if (this.operacaoSelecionada == "+") {
			if (this.operacaoNula == "+") {
				System.out.println("Opera��o anulada");
			} else {
				System.out.println("O resultado da SOMA �: " + this.somarDados(valorA, valorB));
			}
		}
		if (this.operacaoSelecionada == "/") {
			if (this.operacaoNula == "/") {
				System.out.println("Opera��o anulada");
			} else {
				System.out.println("o resultado da DIVIS�O �: " + this.dividirDados(valorA, valorB));
			}

		}
		if (this.operacaoSelecionada == "*") {
			if (this.operacaoNula == "*") {
				System.out.println("Opera��o anulada");
			} else {
				System.out.println("o resultado da MULTIPLICA��O �: " + this.multiplicarDados(valorA, valorB));
			}

		}
		if (this.operacaoSelecionada == "-") {
			if (this.operacaoNula == "-") {
				System.out.println("Opera��o anulada");
			} else {
				System.out.println("o resultado da SUBTRA��O �: " + this.subtrairDados(valorA, valorB));
			}

		}
	}
}
