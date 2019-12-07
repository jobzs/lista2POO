package Exercicio3;


//3)Elabore uma classe que adicione o nome de 10 alunos em um vetor de String. A classe ter�
//atributos de nomeCompleto e Sobrenome, sendo que o sobrenome ser� retirado do nome colocado.
//Ex:�Joao da Silva�, guardado na posi��o 3, ao chamar o m�todo removerSobrenome, separar� a
//String em 2, sendo a primeira parte �Joao da� e a �ltima parte �Silva�. Outro exemplo, �Joao
//Miguel Arcanjo dp Carmo�. A primeira parte ficar� �Joao Miguel Arcanjo do� e a �ltima parte
//�Carmo�. Elaborar um m�todo para mostrar as Strings.

import java.util.Locale;

public class Principal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Alunos[] estudantes = new Alunos[10];
		
		estudantes[0] = new Alunos("Sofia Souza Cavalcanti");
		estudantes[1]= new Alunos("Jessica A. Harris");
		estudantes[2]= new Alunos("Milagro R. Lewis");
		estudantes[3]= new Alunos("Clara Oliveira Cunha");
		estudantes[4]= new Alunos("Luan Araujo Lima");
		estudantes[5]= new Alunos("Brenda Dias Rodrigues");
		estudantes[6]= new Alunos("Rafael Araujo Alves");
		estudantes[7]= new Alunos("Kai Santos Barros");
		estudantes[8]= new Alunos("Mateus Rodrigues Barbosa");
		estudantes[9]= new Alunos("Emilly Dias Gomes");
		
		estudantes[0].removeSobrenome(estudantes);
		estudantes[0].removeNome(estudantes);

		
	}

}
