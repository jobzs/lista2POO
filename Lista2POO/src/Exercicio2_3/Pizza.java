package Exercicio2_3;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

	private String sabor;
	private String adicional;
	private double preco;

	public Pizza(String sabor, String adicional, double preco) {
		this.sabor = sabor;
		this.adicional = adicional;
		this.preco = preco;
	}
	
	public Pizza() {
		
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getAdicional() {
		return adicional;
	}

	public void setAdicional(String adicional) {
		this.adicional = adicional;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	List<Pizza> pizza = new ArrayList<>();

	public void adicionarPizza(String sabor, String adicional, double preco) {
		this.sabor = sabor;
		this.adicional = adicional;
		this.preco = preco;
		pizza.add(new Pizza(this.sabor, this.adicional, this.preco));
	}

	public void removerPizza(int numeropizza) {
		int i = numeropizza;
		pizza.remove(i);
	}

	public void listarPizza() {
		for (int i = 0; i < pizza.size(); i++) {
			Pizza pi = pizza.get(i);
			System.out.println("Sabor: " + pi.getSabor());
			System.out.println("Adicional: " + pi.getAdicional());
			System.out.println("Preço: " + pi.getPreco());
		}
	}

	public void editarPizza(String sabor, String adicional, double preco) {
		for (int i = 0; i < pizza.size(); i++) {
			if (pizza.get(i).getSabor().equals(sabor) && pizza.get(i).getAdicional().equals(adicional)
					&& pizza.get(i).getPreco() == preco) {
				pizza.get(i).setSabor(sabor);
				pizza.get(i).setAdicional(adicional);
				pizza.get(i).setPreco(preco);
			}
		}
	}

}
