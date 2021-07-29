package br.com.bytebank.modelo;


/**
 * 
 * @author Migs
 * 
 * Classe que representa a modelagem de uma conta.
 *
 */
public abstract class Conta implements Comparable<Conta> {
		
		protected double saldo;
		private int agencia;
		private int  conta;
		private Cliente titular;
		private static int total;
		
		/**
		 * 
		 * Método construtor que recebe como parametros numero da agencia e conta
		 * 
		 * @param agencia
		 * @param conta
		 */
		public Conta(int agencia, int conta) {
			this.agencia = agencia;
			this.conta = conta;
			total++;
		}
		
		
		public void deposita(double valor) {
			this.saldo += valor;
		}
		
		
		/**
		 * Saldo precisa ser maior que o valor de saque.
		 * 
		 * 
		 * @param valor
		 * @throws SaldoInsuficienteException
		 */
		public void saca(double valor) throws SaldoInsuficienteException{
			if(this.saldo < valor) {
				throw new SaldoInsuficienteException("Saldo: " + this.saldo + " Valor a sacar: " + valor + "\nSaldo Insuficiente.");
			}
			
			this.saldo -= valor;
		}

		public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
			this.saca(valor);
			destino.deposita(valor);
		}
		

		public double getSaldo() {
			return saldo;
		}

		public int getAgencia() {
			return agencia;
		}

		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}

		public int getConta() {
			return conta;
		}

		public void setConta(int conta) {
			this.conta = conta;
		}

		public Cliente getTitular() {
			return titular;
		}

		public void setTitular(Cliente titular) {
			this.titular = titular;
		}


		public static int getTotal() {
			return total;
		}
		
		public void testi(Conta conta) {
			System.out.println("Deu certo");
		}
		
		@Override
		public String toString() {
		return "Número da conta: " + conta + " Agência: " + agencia + " Saldo: " + saldo;
		}
		
		@Override
		public int compareTo(Conta outra) {
			
		return Double.compare(this.saldo, outra.getSaldo());
		}
		
		
		@Override
		public boolean equals(Object obj) {
			
			Conta conta = (Conta) obj;
			
			if(this.agencia != conta.agencia) {
				return false;
			}
			
			if(this.conta != conta.conta) {
				return false;
			}
			
			return true;
		}
}
