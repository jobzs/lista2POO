package Exercicio2;

//2)Elabore uma classe que implemente uma calculadora. Essa classe implementará todas as

//operações básicas. Ela terá um atributo especial, o qual receberá uma instrução dizendo que uma
//determinada operação não poderá ser realizada. Criar um método para cada operação matemática, e
//bloquear a operação se a instrução especial receber um char representando qualquer uma das
//operações. Ex: ‘+’, portanto a calculadora não fará a operação de adição, mesmo que você chame o
//método somarDados.

public class Principal {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		calc.ReceberNum(30, 40, "+", "-");
		calc.Calcular();
		calc.ReceberNum(26, 32, "+", "+");
		calc.Calcular();
		calc.ReceberNum(30, 5, "/", "-");
		calc.Calcular();
		calc.ReceberNum(25, 40, "*", "-");
		calc.Calcular();
		calc.ReceberNum(7, 40, "*", "*");
		calc.Calcular();
	}
}
