package br.com.FiapDelivery.model;

// Classe mae Veiculo, englobando moto, caminhao, carro etc.
public class Veiculo {
	private String placa;
	private double capacidade;

// Recebe placa e capacidade e passa pela validação
	public Veiculo(String placa, double capacidade) {
		this.setPlaca(placa);
		this.setCapacidade(capacidade); 
		//System.out.println(
		//		"Registro inicial: Um veiculo de placa " + this.placa + " de capacidade " + this.getCapacidade());
	}

// Verifica se a placa não é nula ou vazia
	public void setPlaca(String novaPlaca) {
		if (novaPlaca != null && !novaPlaca.trim().isEmpty()) {
			this.placa = novaPlaca;
			System.out.println("Sucesso: A placa agora é " + this.placa);
		} else {
			System.out.println("Erro de Validação: A placa informada é inválida!");
		}
	}

	// Retorna a placa ja validada
	public String getPlaca() {
		return this.placa;
	}

	// Faz a verificação em Capacidade, se ela é maior que 0
	public void setCapacidade(double novaCapacidade) {
		if (novaCapacidade > 0) {
			this.capacidade = novaCapacidade;
			System.out.println("Sucesso: A capacidade agora é " + this.capacidade);
		} else {
			System.out.println("Erro de Validação: A capacidade informada é inválida!");
		}
	}

	// Retorna a Capacidade
	public double getCapacidade() {
		return this.capacidade;
	}
}
