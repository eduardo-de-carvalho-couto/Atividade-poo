package pizzaria;

public class TestarPedido {
	public static void main(String[] args) {
		Pedido queue = new Pedido();
				
				queue.push(2);
				queue.push(3);
				queue.push(1);
				queue.push(5);
				queue.push(7);
				
				queue.pop();
				
				queue.consultar();
	}
}
