package Exerc�cio1;

public class Cavalo extends Animal {
	
	public Cavalo ()
	{
		super("Alaz�o", 7);
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
