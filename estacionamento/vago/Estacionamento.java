package estacionamento.vago;

public class Estacionamento {
	
	private Bloco inicio;
	
	private Bloco fim;
	
	public void inicializar()
	{
		for(int i = 1; i <= 100; i++) {
			if(this.inicio == null) {
				Bloco novo = new Bloco(i, false, null);
				inicio = novo;
				fim = novo;
			} else {
				Bloco novo = new Bloco(i, false, null);
				fim.setProx(novo);
				fim = novo;
				fim.setProx(null);
			}
			
		}
	}
	
	public void ocuparVaga(int posicao)
	{
		Bloco aux = inicio;
		if(inicio == null) {
			System.out.println("Lista vazia!!");
		} else {
			while(aux != null) {
				if(aux.posicao() == posicao) {
					aux.setOcupado(true);
				}
				aux = aux.prox();
			}
		}
	}
	
	public void consultar()
	{
		Bloco aux = inicio;
		if(inicio == null) {
			System.out.println("Lista vazia!!");
		} else {
			while(aux != null) {
				System.out.println(aux);
				aux = aux.prox();
			}
		}
	}
}
