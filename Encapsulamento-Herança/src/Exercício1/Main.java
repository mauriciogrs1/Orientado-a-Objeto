package Exercício1;

import java.util.Scanner;

public class Main {
	public static void main	(String args[])
	{
		String nomePessoa, endereco, telefone;
		Pessoa pessoa1= new Pessoa();
		Scanner leia = new Scanner (System.in);
		Pessoa pessoa2 = new Pessoa ("Mauricio", "Longe" , "tel");
		
		System.out.println("-------------Usando Seters");
		
		System.out.println("Entre com o seu nome:");
		nomePessoa = leia.nextLine();
		pessoa1.setNome(nomePessoa);
		
		System.out.println("Entre com seu endereço: ");
		endereco = leia.nextLine();
		pessoa1.setEndereco(endereco);
		
		System.out.println("Entre com seu telefone: ");
		telefone = leia.nextLine();
		pessoa1.setTelefone(telefone);
		
		System.out.println("-------------Usando Geters");
		
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.getTelefone());
		
		
	}

}
