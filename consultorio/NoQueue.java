package consultorio;


public class NoQueue {
	public int content;
	
	public String nome;
	
	public NoQueue prox;
	
	public NoQueue(int content, NoQueue prox, String nome) {
		this.content = content;
		this.prox = prox;
		this.nome = nome;
	}
}
