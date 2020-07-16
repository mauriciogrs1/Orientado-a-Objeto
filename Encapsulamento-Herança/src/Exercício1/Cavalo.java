package Exercício1;

public class Cavalo extends Animal {
	
	public Cavalo ()
	{
		super("Alazão", 7);
	}
	
	public void movimentacao() {
		super.movimentacao();
		System.out.println("Correr");
	}
	public void emitirSom() {
		super.emitirSom();
		System.out.println("Potoc potoc potoc...");
	}
	
	
	
}
