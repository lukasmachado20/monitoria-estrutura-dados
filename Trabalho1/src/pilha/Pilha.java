package pilha;

import nodo.Nodo;

public class Pilha {
		private Nodo inicio;
		
		public Pilha() 
		{
			this.inicio = null;
		}
		
		public void push(int valor)
		{
			if(this.inicio == null)
			{
				Nodo novo = new Nodo(null, valor);
				this.inicio = novo;
			}else
			{
				// pilha eh do tipo LIFO
				// LAST IN FIRST OUT
				Nodo aux = this.inicio;
				Nodo novo = new Nodo();
				novo.setProx(aux);
				novo.setValor(valor);
				this.inicio = novo;
			}
		}
		
		public void pop()
		{
			if(this.inicio != null)
			{
				this.inicio = this.inicio.getProx();
			}
		}
		
		public void imprimir()
		{
			Nodo aux = this.inicio;
			System.out.println("--------------");
			while(aux != null)
			{
				System.out.println(aux.getValor());
				aux = aux.getProx();
			}
			System.out.println("--------------");
		}
}
