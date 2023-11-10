package pizzaria;

public class NoQueue {
	
	public int content;
	
	public NoQueue prox;
	
	public NoQueue(int content, NoQueue prox) {
		this.content = content;
		this.prox = prox;
	}
}