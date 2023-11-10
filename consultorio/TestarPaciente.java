package consultorio;


public class TestarPaciente {
	public static void main(String[] args) {
		System.out.println();
		Paciente paciente = new Paciente();
		
		paciente.push(7, "Luscas");
		paciente.push(9, "Ailton");
		paciente.push(2, "Neto");
		paciente.push(1, "Barbosa");
		paciente.push(4, "Geovana");
		
		paciente.pop();
		
		paciente.consultar();
	}
}
