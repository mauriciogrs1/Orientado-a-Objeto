package Atividade1;

import java.util.ArrayList;
import java.util.Collection;

public class Lista1 {
	public static void main(String args[]) {
		
		Collection<String> nome = new ArrayList();
		nome.add("Luis");
		nome.add("Maria");
		nome.add("Claudio");
		
		System.out.println("Segue lista de nomes: "+nome);
		nome.remove("Maria");
		System.out.println("Segue lista de nomes atualizada: "+nome);
		
		
				
		
		
	}

}
