package Exercício3;

public class Funcionario {
	
	private String nomeFuncionario;
	private double salarioFuncionario;
	private String cpfFuncionario;
	
	public Funcionario (String nome, double salario, String cpf)
	{
		nomeFuncionario = nome;
		salarioFuncionario = salario;
		cpfFuncionario = cpf;
	}

	public void mostrarInformaçoes()
	{
		System.out.println("O(a) funcionário(a) "+nomeFuncionario+", com salário de: "+salarioFuncionario+
				" portador(a) do CPF: "+cpfFuncionario);
	}
	

}
