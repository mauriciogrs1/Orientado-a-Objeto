package Exercício1;

public class Cachorro extends Animal {
	
	public Cachorro ()
	{
		super("Nina", 4);
	}
	
	public void movimentacao() {
		super.movimentacao();
		System.out.println("Correr");
	}
	public void emitirSom() {
		super.emitirSom();
		System.out.println("Au Au Au Au ....");
	}
	
	
	
}
