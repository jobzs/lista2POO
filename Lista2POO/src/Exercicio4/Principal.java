package Exercicio4;



//4)Elaborar uma classe para guardar os pontos de uma figura genérica. Usar List e ArrayList, e um
//método adicionarPontos(int x, int y), e removerPontos(int x, int y).



public class Principal {

	public static void main(String[] args) {

		//List<Figura> list = new ArrayList<>();
		
		Figura figura = new Figura();
		
		figura.adicionarPonto(5, 6);
		figura.adicionarPonto(4, 6);
		figura.adicionarPonto(23, 11);
		figura.adicionarPonto(47, 13);
		
		figura.removerPonto(2);
		

		for(int i=0; i<figura.list.size(); i++) {
			int k = figura.list.get(i).getX();
			int l = figura.list.get(i).getY();
			System.out.printf("%d , %d\n", k, l);
		}
		
		
	}

}
