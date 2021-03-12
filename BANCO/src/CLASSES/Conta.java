package CLASSES;

public class Conta {
	//atributos da classe Conta, dentro do pacote CLASSES: 
	private int numero;											
	private String cpf;											
	private double saldo;												
	private boolean ativa;								
	 	 		
	
	//CONSTRUTORES
	public Conta(int numero, String cpf) { 		
		this.numero = numero;
		this.cpf = cpf;
	}
	
	public Conta(int numero) {  	
		this.numero = numero; 
	}
	
	public Conta(int numero, String cpf, boolean ativa) {  
		this.numero = numero;
		this.cpf = cpf;
		this.ativa = ativa;
	}
	//ENCAPSULAMENTO
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	//SET SALDO REMOVIDO. MÁXIMA DO PROJETO
	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	//METODOS
	public void credito(double valor) {
		
		for (int i = 0; i <15; i++) {
			System.out.println();
		}
		this.saldo = this.saldo + valor;
		System.out.printf("Depósito realizado no valor de: R$ %.2f ", valor);
		System.out.printf("Saldo Disponível: R$ %.2f \n", this.saldo);
		System.out.println();
		
	}
	
	public void debito (double valor) { 
		for (int i = 0; i <15; i++) {
			System.out.println();
		}
		if (this.getSaldo() >= valor) {
		this.saldo = this.saldo - valor;
		System.out.printf("Saque de R$ %.2f. Retire seu dinheiro abaixo! \n", valor);
		System.out.println();
		System.out.printf("Saldo Disponível: R$ %.2f \n", this.saldo);
		}
		else if (valor > saldo) {
			for (int i = 0; i <15; i++) {
				System.out.println();
			}System.out.println("Saldo insuficiente. Operação inválida");
		}
	}
}
	