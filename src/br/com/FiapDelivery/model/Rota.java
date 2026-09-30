package br.com.FiapDelivery.model;

// Associa um pacote a um veiculo.
public class Rota {

	private Pacote p1;
	private Veiculo c1;

	// Uso do getters para mostrar o pacote que está sendo levado e o veiculo usado.
	public void vai() {
		System.out.println("Levando pacote " + p1.getCodigo() + " no veiculo " + c1.getPlaca());
	}
	
	// Guarda o pacote da rota
	public void setP1(Pacote p1) {
		this.p1 = p1;
	}
	
	// Guarda o veículo da rota
	public void setC1(Veiculo c1) {
		this.c1 = c1;
	}
	
	// Recebe  um Vepiculo
	public Rota(Pacote p1, Veiculo c1) {
		this.setP1(p1);
		this.setC1(c1);
	}
	
	// Retorna o pacote da rota
	public Pacote getP1() {
		return this.p1;
	}
	
	// Retorna o veiculo da rota
	public Veiculo getC1() {
		return this.c1;
	}
}