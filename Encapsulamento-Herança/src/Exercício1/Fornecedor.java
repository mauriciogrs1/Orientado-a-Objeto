package Exercício1;

public class Fornecedor extends Pessoa {
	
	private double valorDivida;
	private double valorCredito;
	
	public Fornecedor()
	{
		
	}
	public double obterSaldo()
	{
		double obterSaldo = valorCredito-valorDivida;
		return obterSaldo;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}


}

