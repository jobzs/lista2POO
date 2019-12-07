package Exercicio5;

public class Personagem {
	private String x = "";
	private String y;

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public void andarFrente() {
		System.out.printf("%s&\n", this.x);
		this.x += " ";
	}

}
