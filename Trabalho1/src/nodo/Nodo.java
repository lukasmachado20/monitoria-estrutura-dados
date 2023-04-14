package nodo;

public class Nodo {
	private Nodo prox;
	private int valor;
	
	
	// Construtor do classe que inicializa nodo vazio
	public Nodo()
	{
		this.valor = 0;
		this.prox = null;
		
	}

	// Construtor que inicializa o nodo com valores
	public Nodo(Nodo nodo, int val)
	{
		this.valor = val;
		this.prox = nodo;
	}
	
	// Getters e Setters do Nodo
	public Nodo getProx() {
		return prox;
	}


	public void setProx(Nodo prox) {
		this.prox = prox;
	}


	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}
	
}
