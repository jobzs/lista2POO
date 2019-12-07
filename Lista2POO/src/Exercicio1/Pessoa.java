package Exercicio1;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private int passosCaminhados;

	public Pessoa(String nome, String sobrenome, int passosCaminhados) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.passosCaminhados = passosCaminhados;
	}

	public void imprimirPessoa() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Sobrenome: " + this.getSobrenome());
	}

	public void imprimirPassos() {
		System.out.println("Passos: " + this.getPassosCaminhados());
		if (this.passosCaminhados > 12) {
			System.out.println("número de passos foi excedido!");
		}
	}

	public void inserirPassos(int passosCaminhados) {
		this.passosCaminhados += passosCaminhados;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getPassosCaminhados() {
		return passosCaminhados;
	}

	public void setPassosCaminhados(int passosCaminhados) {
		this.passosCaminhados = passosCaminhados;
	}

}
