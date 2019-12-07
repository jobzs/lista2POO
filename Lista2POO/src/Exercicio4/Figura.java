package Exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Figura {

	private int x;
	private int y;

	public Figura(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Figura() {
		// TODO Auto-generated constructor stub
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	List<Figura> list = new ArrayList<>();

	public void adicionarPonto(int x, int y) {
		this.x = x;
		this.y = y;
		list.add(new Figura(this.x, this.y));
	}

	public void removerPonto(int x) {
		list.remove(x);
	}
	
	

}
