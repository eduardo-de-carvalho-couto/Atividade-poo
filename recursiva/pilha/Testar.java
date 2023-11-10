package recursiva.pilha;

public class Testar {
	public static void main(String[] args) {
		ListBlock lista = new ListBlock();
		FunctionMemory conteudo = new FunctionMemory(1);
		FunctionMemory conteudo2 = new FunctionMemory(4);
		FunctionMemory conteudo3 = new FunctionMemory(5);
		FunctionMemory conteudo4 = new FunctionMemory(7);
		lista.inserir(conteudo);
		lista.inserir(conteudo2);
		lista.inserir(conteudo3);
		lista.inserir(conteudo4);
		lista.desempilhar();
		lista.consultar();
	}
}
