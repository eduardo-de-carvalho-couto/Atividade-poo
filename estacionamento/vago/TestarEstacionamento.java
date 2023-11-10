package estacionamento.vago;

public class TestarEstacionamento {
	public static void main(String[] args) {
		Estacionamento estacionamento = new Estacionamento();
		estacionamento.inicializar();
		estacionamento.ocuparVaga(7);
		estacionamento.ocuparVaga(9);
		estacionamento.consultar();
	}
}
