package Exercício1;

import java.util.Scanner;

public class MainFornecedor {
	public static void main (String args[]) {
	
		String nomePessoa, telefone, endereco;
		double divida, credito;
	Fornecedor fornecedor1 = new Fornecedor();
	
	Scanner leia = new Scanner (System.in);
	
	System.out.println("-------------Usando Seters");
	
	System.out.println("Entre com o seu nome:");
	nomePessoa = leia.nextLine();
	fornecedor1.setNome(nomePessoa);
	
	System.out.println("Entre com seu endereço: ");
	endereco = leia.nextLine();
	fornecedor1.setEndereco(endereco);
	
	System.out.println("Entre com seu telefone: ");
	telefone = leia.nextLine();
	fornecedor1.setTelefone(telefone);
	
	System.out.println("Entre com seu Credito atual: ");
	credito = leia.nextDouble();
	fornecedor1.setValorCredito(credito);
	
	System.out.println("Entre com o valor da sua Divida atual: ");
	divida = leia.nextDouble();
	fornecedor1.setValorDivida(divida);	
	
	System.out.println("O valor da sua divida é: "+fornecedor1.obterSaldo());	
	
	
	
	
	
	
	}
}
