package br.com.FiapDelivery.model;

//Moto herda de Veiculo, pegando apenas o que é exclusivo de moto que é baú,, no caso
		public class Moto extends Veiculo {
		private boolean bau;

//Pega Placa e Capacidade de Veiculo.
	public Moto(String placa, double capacidade, boolean bau) {
		super(placa, capacidade);
		this.setBau(bau);
	}
	
//Guarda se a moto tem baú ou não
	public void setBau(boolean novoBau) {
		this.bau = novoBau;
	}
	// Retorna se a moto tem baú ou não
	public boolean getBau() {
		return this.bau;
	}

}
