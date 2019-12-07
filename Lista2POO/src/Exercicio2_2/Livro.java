package Exercicio2_2;

import java.util.ArrayList;
import java.util.List;

public class Livro {

	private String nomeLivro;
	private String autorLivro;
	private int edicaoLivro;

	public Livro(String nomeLivro, String autorLivro, int edicaoLivro) {
		this.nomeLivro = nomeLivro;
		this.autorLivro = autorLivro;
		this.edicaoLivro = edicaoLivro;
	}

	public Livro() {
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getAutorLivro() {
		return autorLivro;
	}

	public void setAutorLivro(String autorLivro) {
		this.autorLivro = autorLivro;
	}

	public int getEdicaoLivro() {
		return edicaoLivro;
	}

	public void setEdicaoLivro(int edicaoLivro) {
		this.edicaoLivro = edicaoLivro;
	}

	List<Livro> livros = new ArrayList<>();

	public void adicionarLivro(String nome, String autor, int edicao) {
		this.nomeLivro = nome;
		this.autorLivro = autor;
		this.edicaoLivro = edicao;
		livros.add(new Livro(this.nomeLivro, this.autorLivro, this.edicaoLivro));
	}

	

	public void editarLivro(String nome, String autor, int edicao) {
		for (int i = 0; i < livros.size(); i++) {
			if (livros.get(i).getNomeLivro().equals(nome) && livros.get(i).getAutorLivro().equals(autor)
					&& livros.get(i).getEdicaoLivro() == edicao) {
				livros.get(i).setNomeLivro(nome);
				livros.get(i).setAutorLivro(autor);
				livros.get(i).setEdicaoLivro(edicao);
			}
		}
	}

	public void removerLivro(int numerolivro) {
		int i = numerolivro;
		livros.remove(i);
	}

	public void listarLivro() {
		for (int i = 0; i < livros.size(); i++) {
			Livro li = livros.get(i);
			System.out.println("Livro: " + li.getNomeLivro());
			System.out.println("Autor: " + li.getAutorLivro());
			System.out.println("Edição: " + li.getEdicaoLivro());
		}
	}

}
