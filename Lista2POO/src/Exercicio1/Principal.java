package Exercicio1;


//1)Elabore uma classe que represente uma pessoa, com todos os seus atributos. Um dos atributos
//dever� ser passosCaminhados, o qual guardar� o n�mero de passos que a pessoa deu em um dia.
//Voc� dever� criar um m�todo para incrementar o n�mero de passos. Se a pessoa ultrapassar 12
//passos, o programa automaticamente dever� exibir uma mensagem falando que o n�mero de passos
//foi excedido, e que mesmo que o m�todo seja invocado, o n�mero de passos n�o ser� incrementado.
//Criar os getters e setters. Criar um m�todo para mostrar todos os dados da pessoa. Criar um m�todo
//para mostrar os passos. 

public class Principal {

	public static void main(String[] args) {
		
		Pessoa person = new Pessoa("Jo�o", "Silva", 6);
		person.imprimirPessoa();
		person.imprimirPassos();
		person.inserirPassos(5);
		person.imprimirPassos();
		person.inserirPassos(1);
		person.imprimirPassos();
		person.inserirPassos(3);
		person.imprimirPassos();

	}

}
