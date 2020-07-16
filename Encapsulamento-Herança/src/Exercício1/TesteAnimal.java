package Exercício1;

public class TesteAnimal {
	
	public static void main (String args[])
	{
		Cavalo cavalo1 = new Cavalo ( );
		
		System.out.println(cavalo1.getNome());
		System.out.println(cavalo1.getIdade());
		cavalo1.movimentacao();
		cavalo1.emitirSom();
		
		System.out.println("_________________________________________________________________");
		
		Cachorro cachorro1 = new Cachorro ();
		System.out.println(cachorro1.getNome());
		System.out.println(cachorro1.getIdade());
		cachorro1.movimentacao();
		cachorro1.emitirSom();
		
		System.out.println("_________________________________________________________________");
		
		Preguica preguica1 = new Preguica();
		System.out.println(preguica1.getNome());
		System.out.println(preguica1.getIdade());
		preguica1.movimentacao();
		preguica1.emitirSom();
		
		
		
		

}
}
