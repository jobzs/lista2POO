package Exercicio2;

//2)Elabore uma classe que implemente uma calculadora. Essa classe implementar� todas as

//opera��es b�sicas. Ela ter� um atributo especial, o qual receber� uma instru��o dizendo que uma
//determinada opera��o n�o poder� ser realizada. Criar um m�todo para cada opera��o matem�tica, e
//bloquear a opera��o se a instru��o especial receber um char representando qualquer uma das
//opera��es. Ex: �+�, portanto a calculadora n�o far� a opera��o de adi��o, mesmo que voc� chame o
//m�todo somarDados.

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
