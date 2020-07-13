package Exercício4;

public class Paciente {
	
	private String nomePaciente;
	private String cpfPaciente;
	private int idadePaciente;
	private double pesoPaciente;
	private double alturaPaciente;

	public Paciente (String nome, String cpf, int idade, double peso, double altura)
	{
		nomePaciente = nome;
		cpfPaciente = cpf;
		idadePaciente = idade;
		alturaPaciente = altura;
		pesoPaciente = peso;
	}
	public void mostrarInformacoes()
	{
		System.out.println("O Paciente "+nomePaciente+
				"\n portador(a) do CPF: "+cpfPaciente+
				"\n peso: "+pesoPaciente+
				"\n idade: "+idadePaciente+
				"\n altura: "+alturaPaciente);
		
	}
	public void calculoImc()
	{
		double calculoImc= Math.round(pesoPaciente/(alturaPaciente*alturaPaciente));
		System.out.println("O IMC do paciente "+nomePaciente+" é: "+calculoImc);
		
	}
}
