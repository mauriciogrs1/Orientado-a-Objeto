package Exerc�cio3;

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

	public void mostrarInforma�oes()
	{
		System.out.println("O(a) funcion�rio(a) "+nomeFuncionario+", com sal�rio de: "+salarioFuncionario+
				" portador(a) do CPF: "+cpfFuncionario);
	}
	

}
