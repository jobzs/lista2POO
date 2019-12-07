package Exercicio6;

public class Pinheiro {

	private int basePinheiro;

	public Pinheiro() {

	}

	public void setBasePinheiro(int basePinheiro) {
		this.basePinheiro = basePinheiro;
	}

	public void imprimirPinheiro(int basePinheiro) {
		this.basePinheiro = basePinheiro;
		int i, j, k;

		for (i = 1; i <= this.basePinheiro; i++) {
			for (k = this.basePinheiro - i; k >= 1; k--) {
				System.out.printf(" ");
			}
			for (j = i; j >= 1; j--) {
				System.out.printf("* ");
			}
			System.out.printf("\r\n");
		}
	}

}
