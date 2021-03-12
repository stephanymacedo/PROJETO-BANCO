package CLASSES;

public class ContaEstudantil extends Conta {//Diego
	private double limiteEstudantil= 5000.00;
	
	public ContaEstudantil ( int numero, String cpf,boolean ativa,	 double limiteEstudantil) {
		super(numero,cpf);
		this.limiteEstudantil = limiteEstudantil;
	}

	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}

	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
}	


	public double usarEstudantil(double valor) {
		
		if (super.getSaldo() < valor && valor <= super.getSaldo() + limiteEstudantil) {
			double dif = 0;
			dif = valor - super.getSaldo();
			limiteEstudantil = limiteEstudantil - dif;
			super.credito(dif);
			System.out.printf("Saque de R$ %.2f. Retire seu dinheiro abaixo! \n", valor);
			System.out.printf("Saldo Disponível R$ %.2f \n", super.getSaldo());
			System.out.printf("Limite Disponível R$ %.2f \n", this.limiteEstudantil);
		}
	
		return limiteEstudantil;
		
	}
}
