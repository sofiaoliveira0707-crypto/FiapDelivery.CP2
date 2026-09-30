package br.com.FiapDelivery.main;

import br.com.FiapDelivery.model.Caminhao;
import br.com.FiapDelivery.model.Pacote;
import br.com.FiapDelivery.model.Rota;

public class SistemaPrincipal {

		public static void main(String[] args) {
		Caminhao c = new Caminhao("ABC1234", -500.0, 6);
		Pacote pac = new Pacote("BR999", 10.5, "Pendente");
		Rota r = new Rota(pac, c);
		r.vai();


		}	

}
