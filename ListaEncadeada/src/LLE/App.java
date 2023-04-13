package LLE;

public class App {
	public static void main(String[] args) {
		
		ListaLinearEncadeada lista = new ListaLinearEncadeada();
		
		lista.inserir(2);
		lista.inserir(3);
		lista.inserir(4);
		lista.inserir(5);
		lista.inserir(6);

		
		//lista.imprimir(lista.getNodo());
		//System.out.println("-----");
		lista.imprimir();
		
		// Pesquisa nodo
		System.out.println("-----");
		System.out.printf("Posicao do nodo com valor %d: %d\n",6,lista.pesquisarNodo(6));
		
		// insere no inicio
		System.out.println("-----");
		lista.inserirNoInicio(1);
		lista.imprimir();
		System.out.println("-----");
		lista.inserirNoInicio(0);
		lista.imprimir();
		
		// Remover do final
		System.out.println("-----");
		lista.removeDoFinal();
		//lista.removeDoFinal();
		//lista.removeDoFinal();
		lista.imprimir();
		
		/* Remove inicio
		System.out.println("-----");
		lista.removeInicio();
		lista.removeInicio();
		lista.removeInicio();
		lista.removeInicio();
		lista.removeInicio();
		lista.removeInicio();
		lista.imprimir();*/
		System.out.println("-----");
		lista.inserirNoMeio(10000);
		lista.imprimir();
		System.out.println("-----");
		lista.removerDoMeio();
		lista.imprimir();
	}
}
