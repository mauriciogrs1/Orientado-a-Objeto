package Exercício4;

public class CadastroPaciente {
	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente ( "Ana Clara", "485.254.365-78", 18 , 65.21 , 1.57);
		paciente1.mostrarInformacoes();
		paciente1.calculoImc();
		
		
	}
}
