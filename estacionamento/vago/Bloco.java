package estacionamento.vago;

public class Bloco {
	
	private int posicao;
	
	private Bloco prox;
	
	private boolean ocupado = false;
	
	public Bloco(int posicao, boolean ocupado, Bloco prox) 
	{
		this.posicao = posicao;
		this.ocupado = ocupado;
		this.prox = prox;
	}
	
	public void setProx(Bloco bloco) 
	{
		prox = bloco;
	}
	
	public Bloco prox()
	{
		return prox;
	}
	
	public void setPosicao(int posicao)
	{
		this.posicao = posicao;
	}
	
	public int posicao()
	{
		return posicao;
	}
	
	public void setOcupado(boolean ocupado)
	{
		this.ocupado = ocupado;
	}
	
	public boolean ocupado()
	{
		return ocupado;
	}
	
	public String toString()
	{
		String estado = "desocupado";
		if(ocupado) {
			estado = "OCUPADO";
		}
		
		String mensagem = posicao + " " + estado;
		
		return mensagem;
	}
}
