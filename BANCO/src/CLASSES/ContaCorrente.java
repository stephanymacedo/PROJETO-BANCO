package CLASSES;

public class ContaCorrente extends Conta {
	//ATRIBUTOS
	private int contadorTalao;
	private double valorTalao;
	//CONSTRUTOR
	public ContaCorrente(int numero, String cpf, boolean ativa, int contadorTalao,double valorTalao){
		super(numero,cpf, ativa);
        this.contadorTalao= contadorTalao;
        this.valorTalao = valorTalao;
	}
	
	//ENCAPSULAMENTO
	public double getValorTalao() {
		return valorTalao;
	}


	public void setValorTalao(double valorTalao) {
		this.valorTalao = 1000.00;
	}


	public int getContadorTalao() {
		return contadorTalao;
	}


	public void setContadorTalao(int contadorTalao) {
		this.contadorTalao = 3;
	}

	@Override
	 // SITUAÇÃO NORMAL EM QUE O SALDO É MAIOR QUE O VALOR DEBITADO!
	//SITUAÇÃO ESPECIAL, CASO SEJA UTILIZADO O LIMIT
	public void debito (double valor) { 
		double saldo = super.getSaldo();
		if (super.getSaldo() >= valor) {
			saldo -= valor;
			super.debito(saldo);
			System.out.printf("Saque de R$ %.2f. Retire seu dinheiro abaixo! \n", valor);
			System.out.println();
			System.out.printf("Saldo R$ %.2f \n", super.getSaldo());
			
		}else if (valor > super.getSaldo() && contadorTalao > 0 && contadorTalao <= 3) {
			System.out.println("Seu saldo acabou, a partir de agora você tem direito a utilizar 1 de 3 dos talões disponiveis.");
			//this.saldo = valorTalao;
			//this.contadorTalao--;
			
			this.pediTalao();
			
			saldo -= valor;
			saldo += valorTalao;
			super.debito(saldo);
			System.out.println("Voce acabaou de solicitar um talao de R$ "+ valorTalao /*+" do Talão de cheques. "+ valor*/);
			System.out.println("Saque R$ "+ valor);
			System.out.printf("Valor restante do talao R$ %.2f \n", super.getSaldo());
			
		}else if (valor > super.getSaldo() && contadorTalao == 0) {
			System.out.println("Você não pode realizar essa operação. seus taloes de cheque acabaram!");
			System.out.printf("Saldo R$ %.2f \n", super.getSaldo());	
			
		}		
	}
	
	/*SOLICITA TALAO*/
	public void pediTalao() {
		if(this.contadorTalao != 0) {
			this.contadorTalao = this.contadorTalao - 1;
			//this.setContadorTalao(this.getContadorTalao() - 1);
		
		}else {
			System.out.println("Voce ja utilizou todos seus taloes do mes!");
		}
	}
}
