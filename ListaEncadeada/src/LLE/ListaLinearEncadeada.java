package LLE;

public class ListaLinearEncadeada {
	private Nodo inicio;
	
	// Inicializa a lista
	public ListaLinearEncadeada()
	{
		this.inicio = null;
	}
	
	public void inserir(int valor)
	{
		// Vamo verificar se a lista esta vazia
		if(inicio == null)
		{
			// Utilizando construtor que popula o nodo
			Nodo novo = new Nodo(null, valor);
			
			// Inserimos no inicio da lista
			this.inicio = novo;
		}else {
			// A lista ja tem valores
			// percorremos ela para inserir um valor no final
			
			Nodo novo = new Nodo(null, valor);
			Nodo aux = this.inicio;
			
			// Percorremos ate encontrarmos um nodo 
			// que esteja apontando para nenhum outro nodo
			while(aux.getProx() != null)
			{
				aux = aux.getProx();
			}
			
			// Saindo do while estamos com o ultimo nodo
			aux.setProx(novo);
		}
	}
	
	// Impressao recursiva de trás para frente
	public void imprimir(Nodo nodo)
	{
		if(nodo.getProx() != null)
		{
			imprimir(nodo.getProx());
			System.out.println(nodo.getValor());
		}else
		{
			System.out.println(nodo.getValor());
		}
	}
	
	// Impressao simples na ordem da insercao da lista
	public void imprimir()
	{
		Nodo aux = this.inicio;
		while(aux != null)
		{
			System.out.println(aux.getValor());
			aux = aux.getProx();
		}
	}
	
	// Pesquisar um nodo na lista por seu valor retornando a posicao do nodo
	/**
	 * Retorna a posicao do nodo a partir do valor informado como parametro.
	 * 
	 * Este metodo retorna -1 caso o valor passado como parametro nao for encontrado.
	 * @param	valor	O valor buscado na lista
	 * @return 			A posicao do nodo
	 */
	public int pesquisarNodo(int valor)
	{
		int contador = 0;
		int posicao = -1;
		Nodo aux = this.inicio;
		
		// Percorre lista
		while(aux != null)
		{
			contador++; // incrementa contador
			// verifica se valor eh igual
			if(aux.getValor() == valor)
			{
				posicao = contador;
				break; // para sair do loop
			}
			// proximo nodo
			aux = aux.getProx();
		}
		
		return posicao;
	}
	
	// Inserir nodo nodo inicio da lista linear encadeada
	public void inserirNoInicio(int valor)
	{
		// Verificar se a lista esta vazia
		if(this.inicio != null)
		{
			Nodo aux = this.inicio;
			Nodo novo = new Nodo();
			
			// Novo nodo recebe um valor
			novo.setValor(valor);
			// Novo nodo aponta para o nodo que antes era o inicio da lista
			novo.setProx(aux);
			
			// Tornamos o novo nodo sendo o inicio da lista
			this.inicio = novo;
		}else
		{
			Nodo novo = new Nodo(null, valor);
			this.inicio = novo;
		}
	}
	// Remover nodo do final de uma lista linear encadeada
	public void removeDoFinal()
	{
		// Verifica se a lista ja nao esta vazia
		if(this.inicio != null)
		{
			Nodo aux = this.inicio;
			// Verifica se a lista tem mais de 1 valor
			if(aux.getProx() == null)
			{
				// Tem apenas 1 valor na lista, entao remove
				this.inicio = null;
			}else {
				// Nao tem apena 1 valor na lista
				while(aux.getProx().getProx() != null)
				{
					aux = aux.getProx();
				}
				// Ao final do while chegamos no penultimo valor
				// Removemos a referencia do penultimo valor para o ultimo valor
				aux.setProx(null);
			}
		}
		
	}
	// Remover nodo do inicio de uma lista linear encadeada
	
	// Inserir um nodo no meio da lista linear encadeada
	
	// Remover um nodo do meio da lista linear encadeada
	
	public Nodo getNodo()
	{
		return this.inicio;
	}
}
