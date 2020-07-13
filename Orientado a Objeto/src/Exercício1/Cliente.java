package Exercício1;

public class Cliente {
	private String nomeUser;
	private String nomeEmpresa;
	private int identificacao;
	
	public Cliente (String nome, String empresa, int id)
	{
		nomeUser = nome;
		nomeEmpresa = empresa;
		identificacao = id;
	}
	
	public void mostarInformacoes()
	{
		System.out.println("Cliente " +nomeUser+" da empresa "+nomeEmpresa+" cod id "+ identificacao);
		
	}



}