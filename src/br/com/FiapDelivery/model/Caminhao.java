package br.com.FiapDelivery.model;

// Caminhão herda de Veiculo, pegando apenas o que é exclusivo de caminhão que é eixos, no caso
	public class Caminhao extends Veiculo {
	private int eixos;

// Pega Placa e Capacidade de Veiculo.
	public Caminhao(String placa, double capacidade, int eixos) {
		super(placa, capacidade);
		this.setEixos(eixos);
	}

// Valida a quantidade de eixos, se for maior que 0
	public void setEixos(int novosEixos) {
		if (novosEixos > 0) {
			this.eixos = novosEixos;
			System.out.println("Sucesso: O Caminhao possui " + this.eixos + " eixos");
		} else {
			System.out.println("Erro, quantidade de eixos inválida");
		}
	}
	
	// Retorna a quantidade de eixos
	public int getEixos() {
		return this.eixos;
	}

	}
