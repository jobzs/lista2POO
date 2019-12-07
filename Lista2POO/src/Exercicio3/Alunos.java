package Exercicio3;


public class Alunos {

	private String nomeCompleto;
	private String Sobrenome;

	public Alunos(String nomecompleto) {
		this.nomeCompleto = nomecompleto;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getSobrenome() {
		return Sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}

    
    public void removeSobrenome(Alunos estudantes[]) {
		for (int i = 0; i < estudantes.length; i++) {

			String[] split = estudantes[i].getNomeCompleto().split(" ");
			String teste = split[split.length - 1];
			estudantes[i].setSobrenome(teste);
			System.out.println("Sobrenome: " + estudantes[i].getSobrenome());

		}

	}
    
    public void removeNome(Alunos estudantes[]) {
		String nome = "";
		for (int i = 0; i < estudantes.length; i++) {

			String[] split = estudantes[i].getNomeCompleto().split(" ");
			for (int k = 0; k < split.length - 1; k++) {
				nome += split[k] + " ";
			}
			estudantes[i].setNomeCompleto(nome);
			nome = "";
			System.out.println("Nome: " + estudantes[i].getNomeCompleto());

		}

	}
    
    /*public void removeSobrenome(Alunos estudantes[]) {
		String nome = "";
		for (int i = 0; i < estudantes.length; i++) {

			String[] split = estudantes[i].getNomeCompleto().split(" ");
			for (int k = 0; k < split.length - 1; k++) {
				nome += split[k] + " ";
			}
			String teste = split[split.length - 1];
			estudantes[i].setSobrenome(teste);
			estudantes[i].setNomeCompleto(nome);
			nome = "";
			System.out.println("Nome: " + estudantes[i].getNomeCompleto());
			System.out.println("Sobrenome: " + estudantes[i].getSobrenome());

		}

	}*/

}
