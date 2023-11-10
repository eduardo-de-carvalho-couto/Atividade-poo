package pizzaria;

public class Pedido {
	
	private NoQueue inicio;
	
	private NoQueue fim;
	
	public void push(int valor)
	{
		NoQueue novo = new NoQueue(valor, null);
		if(this.inicio == null) {
			this.inicio = novo;
			this.fim = novo;
		} else {
			this.fim.prox = novo;
			this.fim = novo;
		}
	}
	
	public void pop()
	{
		System.out.println("Pedido atendido: " + inicio.content + ", saindo da fila...");
		this.inicio = this.inicio.prox;
	}
	
	public void consultar()
	{
		if(this.inicio == null) {
			System.out.println("Lista vazia!!");
		} else {
			NoQueue aux = this.inicio;
			while(aux != null) {
				System.out.println(aux.content);
				aux = aux.prox;
			}
		}
	}
	
}
