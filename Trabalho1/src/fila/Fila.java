package fila;

import nodo.Nodo;

public class Fila {
	
	private Nodo inicio;
	
	public Fila()
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
	
	// Em uma fila sempre removemos do inicio, ou seja, o primeiro valor adicionado
	// Estilo FIFO - first in first out
	public void remover()
	{
		if(this.inicio != null)
		{
			this.inicio = this.inicio.getProx();
		}
	}
	
	public void imprimir()
	{
		Nodo aux = this.inicio;
		while(aux != null)
		{
			System.out.print(aux.getValor() + " ");
			aux = aux.getProx();
		}
		System.out.println("");
	}
}
