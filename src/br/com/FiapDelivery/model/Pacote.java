package br.com.FiapDelivery.model;

public class Pacote {
	
		private String codigo;
		private double peso;
		private String status;

		// Recebe codigo, peso e status e valida os três pelos setters
		public Pacote(String codigo, double peso, String status) {
			this.setCodigo(codigo);
			this.setPeso(peso);
			this.setStatus(status);

}
		// Valida se o codigo é válido e não é nulo
		public void setCodigo(String novoCodigo) {
			if (novoCodigo != null && !novoCodigo.trim().isEmpty()) {
				this.codigo = novoCodigo;
				System.out.println("Sucesso: o codigo agora é " + this.codigo);
			} else {
				System.out.println("Erro de Validação: O codigo informado é inválido!");
			}
		}
		// Retorna o codigo ja validada
		public String getCodigo() {
			return this.codigo;
}

		// Faz a verificação em Peso
	public void setPeso(double novoPeso) {
		if (novoPeso > 0) {
			this.peso = novoPeso;
			System.out.println("Sucesso: o peso agora é " + this.peso);
		} else {
			System.out.println("Erro de Validação: O peso informado é inválido!");
		}
	}
	
	// Retorna a Peso
	public double getPeso() {
		return this.peso;
	}
	
	// Valida se o Status é válido 
	public void setStatus(String novoStatus) {
		if (novoStatus != null && !novoStatus.trim().isEmpty()) {
			this.status = novoStatus;
			System.out.println("Sucesso: o Status agora é " + this.status);
		} else {
			System.out.println("Erro de Validação: O Status informado é inválido!");
		}
	}
	// Retorna o Status ja validado
	public String getStatus() {
		return this.status;
	}
}
