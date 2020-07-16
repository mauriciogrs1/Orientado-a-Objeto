package Exercício1;

public class Preguica extends Animal {
	
	public Preguica ()
	{
		super("Jully", 13);
	}
	
	public void movimentacao() {
		super.movimentacao();
		System.out.println("Subir em Arvores");
	}
	public void emitirSom() {
		super.emitirSom();
		System.out.println("... ... ...");
	}
	
	
	
}
