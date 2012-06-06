package br.ifpb.edu;

import br.ifpb.outros.caracteristicasAgencia;
import br.ifpb.tarifas.Tarifa;

public class BancodeDados {

	public abstract class Conta {
		
		private Tarifa tarifa;
		
		private caracteristicasAgencia agencia;
		
		private int numConta;
		
		private float saldo;
		
		private String senha = new String( );
		
		private String extrato = new String( );
		
		/**
		 * Retorna o saldo do cliente
		 * @return Saldo do cliente
		 */
		public float getSaldo( ) {
			return saldo;
		}

		public Tarifa getTarifa() {
			return tarifa;
		}

		public void setTarifa(Tarifa tarifa) {
			this.tarifa = tarifa;
		}

		public caracteristicasAgencia getAgencia() {
			return agencia;
		}

		public void setAgencia(caracteristicasAgencia agencia) {
			this.agencia = agencia;
		}

		public int getNumConta() {
			return numConta;
		}

		public void setNumConta(int numConta) {
			this.numConta = numConta;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public String getExtrato() {
			return extrato;
		}

		public void setExtrato(String extrato) {
			this.extrato = extrato;
		}
		
	}	
}
