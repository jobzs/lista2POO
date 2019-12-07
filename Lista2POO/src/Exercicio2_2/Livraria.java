package Exercicio2_2;

public class Livraria {

	public static void main(String[] args) {
		Livro livro = new Livro();
		
		livro.adicionarLivro("Harry Potter", "J. K. Rowling", 2);
		livro.adicionarLivro("The Hunger Games", "Suzanne Collins", 1);
		livro.listarLivro();
		livro.removerLivro(1);
		System.out.println("------------------");
		livro.listarLivro();
		//livro.EditarNome("Harry Potter", "Senhor dos Aneis");
		

	}

}
