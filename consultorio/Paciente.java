package consultorio;


public class Paciente {
	
	private NoQueue inicio;
	
	private NoQueue fim;
	
	public void push(int ficha, String nome)
	{
		NoQueue novo = new NoQueue(ficha, null, nome);
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
		System.out.println("Chamando paciente de ficha " + this.inicio.content + ". Tirando da fila...");
		this.inicio = this.inicio.prox;
	}
	
	public void consultar()
	{
		if(this.inicio == null) {
			System.out.println("Lista vazia!!");
		} else {
			NoQueue aux = this.inicio;
			while(aux != null) {
				System.out.println("Ficha do paciente a ser chamado " + aux.content + " Nome: "+ aux.nome);
				aux = aux.prox;
			}
		}
	}
}
