package Exercicio2_3;

public class Pizzaria {

	public static void main(String[] args) {
		
		Pizza pizza = new Pizza();
		pizza.adicionarPizza("Queijo", "bacon", 32.50);
		pizza.adicionarPizza("Bacon", "queijo", 30.50);
		pizza.adicionarPizza("Brocolis", "queijo", 30.50);
		pizza.listarPizza();
		System.out.println("-------------------");
		pizza.removerPizza(0);
		pizza.listarPizza();
		
		
	}

}
