package recursiva.pilha;

public class ListBlock {
	
	private Block inicio;
	
	private Block fim;
	
	public void inserir(FunctionMemory valor)
	{
		Block novo = new Block();
		novo.content = valor;
		if(inicio == null) {
			inicio = novo;
			fim = novo;
			fim.prox = null;
		} else {
			fim.prox = novo;
			fim = novo;
			fim.prox = null;
		}
	}
	
	public void consultar()
	{
		Block aux = inicio;
		if(inicio == null) {
			System.out.println("Lista vazia!!");
		} else {
			while(aux != null) {
				aux = aux.prox;
			}
		}
	}
	
	public void desempilhar()
	{
		int valorSomado = 0;
		Block aux = inicio;
		while(aux != null) {
			System.out.println(aux.content.valor());
			valorSomado = valorSomado + aux.content.valor();
			inicio = inicio.prox;
			aux = aux.prox;
		}
		
		System.out.println("Valor somado = " + valorSomado);
	}
	
}
