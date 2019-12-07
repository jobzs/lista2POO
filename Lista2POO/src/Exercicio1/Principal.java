package Exercicio1;


//1)Elabore uma classe que represente uma pessoa, com todos os seus atributos. Um dos atributos
//deverá ser passosCaminhados, o qual guardará o número de passos que a pessoa deu em um dia.
//Você deverá criar um método para incrementar o número de passos. Se a pessoa ultrapassar 12
//passos, o programa automaticamente deverá exibir uma mensagem falando que o número de passos
//foi excedido, e que mesmo que o método seja invocado, o número de passos não será incrementado.
//Criar os getters e setters. Criar um método para mostrar todos os dados da pessoa. Criar um método
//para mostrar os passos. 

public class Principal {

	public static void main(String[] args) {
		
		Pessoa person = new Pessoa("João", "Silva", 6);
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
