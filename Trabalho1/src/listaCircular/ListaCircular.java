package listaCircular;

import nodo.Nodo;

public class ListaCircular {
	private Nodo inicio;
	private Nodo fim; /* Utilizamos a referencia de memoria do nodo final*/
	
	public ListaCircular() 
	{
		this.inicio = null;
	}
	
	public void inserir(int valor)
	{
		Nodo novo = new Nodo();
		novo.setValor(valor);
		
		if(this.inicio == null)
		{
			this.inicio = novo;
			novo.setProx(this.inicio);
			this.fim = novo;
		}else
		{
			novo.setProx(this.inicio); // o novo nodo ja esta apontando para o inicio da lista
			
			// precisamos encontrar o nodo final para que ele aponte para o novo nodo
			Nodo aux = this.inicio;
			while(aux != fim)
			{
				aux = aux.getProx();
			}
			
			// definimos o 'novo' como sendo o nodo final
			aux.setProx(novo);
			this.fim = novo;
		}
	}
	
	public void remover()
	{
		if(this.inicio != null)
		{
			if(this.inicio == fim)
			{
				this.inicio = null;
				this.fim = null;
			}else
			{
				Nodo aux = this.inicio;
				while(aux.getProx() != fim)
				{
					aux = aux.getProx();
				}
				
				// definimos o 'novo' como sendo o nodo final
				aux.setProx(this.inicio);
				this.fim = aux;
			}
		}
	}
	
	public void imprimir()
	{
		Nodo aux = this.inicio;
		if(aux != null)
		{
			if(aux == fim)
			{
				System.out.println(aux.getValor());
			}else
			{
				System.out.println("-----------");
				while(aux != fim)
				{
					System.out.println(aux.getValor());
					aux = aux.getProx();
				}
				System.out.println(fim.getValor());
				System.out.println("-----------");
			}
		}
	}
	
	public void printNodoFinal()
	{
		if(fim != null)
		{
			System.out.println("Nodo final eh o: " + fim.getValor());
			System.out.println("Nodo inicio eh o: " + fim.getProx().getValor());
			System.out.println("Nodo inicio na memoria: " + fim.getProx());
			System.out.println("Nodo final na memoria: " + fim);
		}
	}
	
	
}
