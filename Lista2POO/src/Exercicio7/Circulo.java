package Exercicio7;

public class Circulo {

	private double raioR;
	private double CentroR;

	public double getRaio() {
		return raioR;
	}

	public void setRaio(double raio) {
		this.raioR = raio;
	}

	public void Forma(double raio, double centro) {
		this.CentroR = centro;
		this.raioR = raio + this.CentroR;
		double r_in = this.raioR - 0.4;
		double r_out = this.raioR + 0.4;

		for (double y = this.raioR; y >= -this.raioR; --y) {
			for (double x = -this.raioR; x < r_out; x += 0.5) {
				double value = x * x + y * y;
				if (value >= r_in * r_in && value <= r_out * r_out) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
