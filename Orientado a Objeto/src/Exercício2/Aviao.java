package Exercício2;

public class Aviao {
	
	private String nomePiloto;
	private String empresaAerea;
	private int capacidadePessoas;
	
	public Aviao (String piloto, String empresa, int capacidade)
	{
		nomePiloto = piloto;
		empresaAerea = empresa;
		capacidadePessoas = capacidade;
	}
	
	public void mostrarInformacoes()
	{
		System.out.println(" O piloto "+nomePiloto+" da empresa aérea "+
	empresaAerea+"\n tem a capacidade de "+capacidadePessoas+" passageiros");
		
	}

}
