package APLICACAO;

import java.util.Scanner;

import CLASSES.ContaCorrente;
import CLASSES.ContaEmpresa;
import CLASSES.ContaEspecial;
import CLASSES.ContaEstudantil;
import CLASSES.ContaPoupanca;


public class Teste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String cpf= "";
		int numero = 0, diaAniversarioPoupanca = 0,hoje = 8,contadorTalao = 3;
		double valor[] = new double [10];
		final double limite = 1000; 
		final double valorTalao = 1000;//Conta especial e ContaCorrente
		final double limiteEstudantil = 5000;
		final double emprestimoEmpresa = 10000;
		char opcaoPagamento,opcaoContinuar = 'S', opcaoContaAtivaNaoAtiva, opcao;
		boolean ativa = true;
		 
		ContaPoupanca contaPoupanca = new ContaPoupanca(numero,cpf,ativa, diaAniversarioPoupanca);
		ContaCorrente contaCorrente = new ContaCorrente(numero,cpf,ativa,contadorTalao,valorTalao);
		ContaEspecial contaEspecial = new ContaEspecial(numero,cpf,ativa,limite);
		ContaEmpresa contaEmpresa = new ContaEmpresa(numero,cpf,ativa,emprestimoEmpresa);
		ContaEstudantil contaEstudantil = new ContaEstudantil(numero,cpf,ativa,limiteEstudantil);
	
		//ATT:  ASSIM QUE AS CLASSES ESTIVEREM PRONTAS UNIMOS ELAS AO PROJETO.
		//TELA 1 PARA TODAS SEGUE O MESMO PADRÃO, FAVOR ACRESCENTAR A APLICAÇÃO DE SUAS RESPECTIVAS CLASSES. MUITO OBRIGADO!

		do {
			System.out.println("|============================================|");
			System.out.println("|           [ BANCO GEN18 G-08 ]             |");
			System.out.println("|   ---> Aqui seu dinheiro têm VALOR! <---   |");
			System.out.println("|--------------------------------------------|");
			System.out.println("| [1] - CONTA POUPANÇA                       |");
			System.out.println("| [2] - CONTA CORRENTE                       |");
			System.out.println("| [3] - CONTA ESPECIAL                       |");
			System.out.println("| [4] - CONTA EMPRESA                        |");
			System.out.println("| [5] - CONTA ESTUDANTIL                     |");
			System.out.println("|============================================|");
			System.out.println("|                                            |");
			System.out.print  ("|  DIGITE O CÓDIGO DA OPÇÃO SELECIONADA:     |");
		
			int tipoConta = leia.nextInt();
			// SELEÇÃO DO TIPO DE CONTA
			switch (tipoConta) {
			case 1: {
				System.out.println("|============================================|");
				System.out.println("|           [ BANCO GEN18 G-08 ]             |");
				System.out.println("|   ---> Aqui seu dinheiro têm VALOR! <---   |");
				System.out.println("|--------------------------------------------|");
				System.out.println("|             { CONTA POUPANÇA }             |");
				System.out.println("|============================================|");
				System.out.print("Digite o numero da sua conta: ");
				numero = leia.nextInt();
				
				System.out.print("Insira o número do CPF:");  										
		    	cpf = leia.next();
				
				
				System.out.println("Digite 1 - Conta Ativa  ou  2 - Conta Inativa:");  												
				opcaoContaAtivaNaoAtiva = leia.next().charAt(0);
				if (opcaoContaAtivaNaoAtiva == '1') {
					
					ativa = true;
					System.out.println("Conta ativada.");
					} 
					else {
					ativa = false;
					System.out.println("Conta DESATIVADA!!!");
					break;
					}
					
				for (int i = 0; i < 10 ; i++) {	
				System.out.print("Digite o valor da operação: R$ ");
				valor[i] = leia.nextDouble();
				System.out.print("Débito ou crédito? [D/C]: ");
				opcaoPagamento = leia.next().toUpperCase().charAt(0);
				if (opcaoPagamento == 'D') {
					contaPoupanca.debito(valor[i]);
				}
				else if (opcaoPagamento == 'C') {
					contaPoupanca.credito(valor[i]);
				}	else {
					System.out.println("Opção inválida!");
				}
				
				if (i <= 9) { 
					System.out.println((i + 1)+ "º Movimento. Deseja continuar? [S/N]: ");
					opcaoContinuar = leia.next().toUpperCase().charAt(0);
				}
				
				if(opcaoContinuar == 'N') {
					System.out.println("|============================================|");
					System.out.println("|   Obrigado por utilizar o BANCO GEN18 G-08 |");
					System.out.println("|============================================|");
					break;
				}
				}
				System.out.print("Digite o dia de abertura da sua conta: ");
				diaAniversarioPoupanca = leia.nextInt();
				if(diaAniversarioPoupanca == hoje) {
					contaPoupanca.getDiaAniversarioPoupanca();;
					
					
				}
				System.out.println("|   Limite de transações diárias atingido.   |");
				System.out.println("|============================================|");
				System.out.printf( "            [ Saldo:  R$  %.2f ]            \n", contaEspecial.getSaldo());
				System.out.println("  Obrigado por utilizar o BANCO GEN18 G-08  ");
				System.out.println("|============================================|");
								
					
				break;	
			}
			
			
			case 2 : {
				
				System.out.println("|============================================|");
				System.out.println("|           [ BANCO GEN18 G-08 ]             |");
				System.out.println("|   ---> Aqui seu dinheiro têm VALOR! <---   |");
				System.out.println("|--------------------------------------------|");
				System.out.println("|             { CONTA CORRENTE }             |");
				System.out.println("|============================================|");
				System.out.print("Digite o numero da sua conta: ");
				numero = leia.nextInt();
				
				System.out.print("Insira o número do CPF:");  										
		    	cpf = leia.next();
				
				
				System.out.println("Digite 1 - Conta Ativa  ou  2 - Conta Inativa:");  												
				opcaoContaAtivaNaoAtiva = leia.next().charAt(0);
				if (opcaoContaAtivaNaoAtiva == '1') {
					
					ativa = true;
					System.out.println("Conta ativada.");
					} 
					else {
					ativa = false;
					System.out.println("Conta DESATIVADA!!!");
					break;
					}
				
				//TELA 2
				System.out.println("BANCO GEN-18 \nAQUI SEU DINHEIRO TEM VALOR\n!");
				System.out.println("CONTA CORRENTE");
				
				System.out.print("Saldo Atual: R$ " + contaCorrente.getSaldo());
				System.out.println();
				
				//CALCULO DO SALDO
				for (int i = 0; i < 10; i++) {	
					for (int x =0; x <= 15; x++) {
						System.out.println();
					}
					System.out.print("Digite o valor que deseja realizar o depósito: R$ ");
					valor[i] = leia.nextDouble();
					
					System.out.print("Para deposito C para saque D [D/C]: ");
					opcaoPagamento = leia.next().toUpperCase().charAt(0);
					
					System.out.print("Digite o valor da operação: R$ ");
					valor[i] = leia.nextDouble();
					
					if (opcaoPagamento == 'D') {
						contaCorrente.debito(valor[i]);
						
					}
					else if (opcaoPagamento == 'C') {
						contaCorrente.credito(valor[i]);
						
					}
					
					System.out.print("Voce deseja socilitar um talao? ");						
					System.out.println("[S] - Sim | [N] - Nao");
					opcao = leia.next().toUpperCase().charAt(0);
					
					if(opcao == 'S' && contaCorrente.getContadorTalao() > 0) {
						System.out.println("Talao de cheque solicitado!");
						contaCorrente.pediTalao();
						
					}else if(contaCorrente.getContadorTalao() == 0){
						contaCorrente.pediTalao();
						
					}else {
						System.out.println("Caso mude de ideia, volte aqui!");
						
					}
					
				}
				
				System.out.println(contaCorrente.getSaldo());
				
				//System.out.println("Valor movimentado R$: " ValorMovimentadoMetodo);
				System.out.println("Deseja continuar? [S/N]: ");
				opcaoContinuar = leia.next().toUpperCase().charAt(0);
				for (int x =0; x <= 15; x++) {
					System.out.println();
				}
				
				//System.out.println("Opção inválida!");
				
			} break;
						
			case 3: {
				
				//CASO SEJA CONTA ESPECIAL	
				for (int i = 0; i < 15; i++) {
					System.out.println();
				}
				
					System.out.println("|============================================|");
					System.out.println("|           [ BANCO GEN18 G-08 ]             |");
					System.out.println("|   ---> Aqui seu dinheiro têm VALOR! <---   |");
					System.out.println("|--------------------------------------------|");
					System.out.println("|             { CONTA ESPECIAL }             |");
					System.out.println("|============================================|");
					System.out.print("Digite o numero da sua conta: ");
					numero = leia.nextInt();
					
					System.out.print("Insira o número do CPF:");  										
			    	cpf = leia.next();
					
					
					System.out.println("Digite 1 - Conta Ativa  ou  2 - Conta Inativa:");  												
					opcaoContaAtivaNaoAtiva = leia.next().charAt(0);
					if (opcaoContaAtivaNaoAtiva == '1') {
						
						ativa = true;
						System.out.println("Conta ativada.");
						} 
						else {
						ativa = false;
						System.out.println("Conta DESATIVADA!!!");
						break;
						}
					
					//CALCULO DO SALDO
					
						for (int i = 0; i < 10 ; i++) {	
						System.out.print("Digite o valor da operação: R$ ");
						valor[i] = leia.nextDouble();
						System.out.print("Débito ou crédito? [D/C]: ");
						opcaoPagamento = leia.next().toUpperCase().charAt(0);
						if (opcaoPagamento == 'D') {
							if(valor[i] > contaEspecial.getSaldo()) {
									contaEspecial.usarLimite(valor[i]);
						}
							else if(valor[i] <= contaEspecial.getSaldo()) {
								
								contaEspecial.debito(valor[i]);
								System.out.printf("Limite Dispnível: R$ %.2f ",contaEspecial.getLimite());
								System.out.println();
							}
						}
						else if (opcaoPagamento == 'C') {
							contaEspecial.credito(valor[i]);
						}	else {
							System.out.println("Opção inválida!");
						}
						
						
						if (i <= 9) { 
							System.out.println((i + 1)+ "º Movimento. Deseja continuar? [S/N]: ");
							opcaoContinuar = leia.next().toUpperCase().charAt(0);
						}
						
						if(opcaoContinuar == 'N') {
							System.out.println("|============================================|");
							System.out.println("|   Obrigado por utilizar o BANCO GEN18 G-08 |");
							System.out.println("|============================================|");
							break;
						}
						}
						System.out.println("|   Limite de transações diárias atingido.   |");
						System.out.println("|============================================|");
						System.out.printf( "            [ Saldo:  R$  %.2f ]            \n", contaEspecial.getSaldo());
						System.out.printf( "            [ Limite:  R$  %.2f ]         \n",contaEspecial.getLimite());
						System.out.println("  Obrigado por utilizar o BANCO GEN18 G-08  ");
						System.out.println("|============================================|");
						break;	
							
					}

			case 4: {
				char opcaoEmprestimo = 'N';
				double valorEmprestimo = 0;
				System.out.println("|============================================|");
				System.out.println("|           [ BANCO GEN18 G-08 ]             |");
				System.out.println("|   ---> Aqui seu dinheiro têm VALOR! <---   |");
				System.out.println("|--------------------------------------------|");
				System.out.println("|              { CONTA EMPRESA }             |");
				System.out.println("|============================================|");
				System.out.print("Digite o numero da sua conta: ");
				numero = leia.nextInt();
				
				System.out.print("Insira o número do CPF:");  										
		    	cpf = leia.next();
				
				
				System.out.println("Digite 1 - Conta Ativa  ou  2 - Conta Inativa:");  												
				opcaoContaAtivaNaoAtiva = leia.next().charAt(0);
				if (opcaoContaAtivaNaoAtiva == '1') {
					
					ativa = true;
					System.out.println("Conta ativada.");
				} 
				else {
					ativa = false;
					System.out.println("Conta DESATIVADA!!!");
					break;
				}
							
				for (int i = 0; i < 10 ; i++) {	
					System.out.print("Digite o valor da operação: R$ ");
					valor[i] = leia.nextDouble();
					System.out.print("Débito ou crédito? [D/C]: ");
					opcaoPagamento = leia.next().toUpperCase().charAt(0);
					if (opcaoPagamento == 'D') {
						contaEmpresa.debito(valor[i]);
					}
					else if (opcaoPagamento == 'C') {
						contaEmpresa.credito(valor[i]);
					}	else {
						System.out.println("Opção inválida!");
					}
					
					if (i <= 9) { 
						System.out.println("Deseja fazer um emprésimo? [S/N]");
						opcaoEmprestimo = leia.next().toUpperCase().charAt(0);
						if (opcaoEmprestimo == 'S'){
								System.out.println("Informe o valor do empréstimo: R$ ");
								valorEmprestimo = leia.nextDouble();
							contaEmpresa.pedirEmprestimo(valor[i]);
						} 
						else if (opcaoEmprestimo != 'S' && opcaoEmprestimo == 'N') {
							System.out.println("Opção empréstimo não solicitada.");
						
						}
						
						else {
							System.out.println("Opção inválida!");
							break;
						}
						System.out.println((i + 1)+ "º Movimento. Deseja continuar? [S/N]: ");
						opcaoContinuar = leia.next().toUpperCase().charAt(0);
					}
				
				if(opcaoContinuar == 'N') {
					System.out.println("|============================================|");
					System.out.println("|   Obrigado por utilizar o BANCO GEN18 G-08 |");
					System.out.println("|============================================|");
					break;
				}
				}
				System.out.println("|   Limite de transações diárias atingido.   |");
				System.out.println("|============================================|");
				System.out.printf( "            [ Saldo:  R$  %.2f ]            \n", contaEmpresa.getSaldo());
				System.out.printf( "     [ Limite Emprestimo:  R$  %.2f ] \n", contaEmpresa.getEmprestimoEmpresa());
				System.out.println("  Obrigado por utilizar o BANCO GEN18 G-08  ");
				System.out.println("|============================================|");
				System.out.println("Deseja fazer um emprésimo? [S/N]");
				opcaoEmprestimo = leia.next().toUpperCase().charAt(0);		
				if (opcaoEmprestimo == 'S'){
					System.out.println("Informe o valor do empréstimo: R$ ");
					valorEmprestimo = leia.nextDouble();	
					contaEmpresa.pedirEmprestimo(valorEmprestimo);
				} 
				break;	
			}
			case 5: {
				
				char opcaoEmprestimo = 'N';
				double valorEmprestimo = 0;
				System.out.println("|============================================|");
				System.out.println("|           [ BANCO GEN18 G-08 ]             |");
				System.out.println("|   ---> Aqui seu dinheiro têm VALOR! <---   |");
				System.out.println("|--------------------------------------------|");
				System.out.println("|            { CONTA ESTUDANTIL }            |");
				System.out.println("|============================================|");
				System.out.print("Digite o numero da sua conta: ");
				numero = leia.nextInt();
				
				System.out.print("Insira o número do CPF:");  										
		    	cpf = leia.next();
				
				
				System.out.println("Digite 1 - Conta Ativa  ou  2 - Conta Inativa:");  												
				opcaoContaAtivaNaoAtiva = leia.next().charAt(0);
				if (opcaoContaAtivaNaoAtiva == '1') {
					
					ativa = true;
					System.out.println("Conta ativada.");
				} 
				else {
					ativa = false;
					System.out.println("Conta DESATIVADA!!!");
					break;
				}
							
				for (int i = 0; i < 10 ; i++) {	
					System.out.print("Digite o valor da operação: R$ ");
					valor[i] = leia.nextDouble();
					System.out.print("Débito ou crédito? [D/C]: ");
					opcaoPagamento = leia.next().toUpperCase().charAt(0);
					if (opcaoPagamento == 'D') {
						contaEstudantil.debito(valor[i]);
					}
					else if (opcaoPagamento == 'C') {
						contaEstudantil.credito(valor[i]);
					}	else {
						System.out.println("Opção inválida!");
					}
					
					if (i <= 9) { 
						System.out.println("Deseja fazer um emprésimo? [S/N]");
						opcaoEmprestimo = leia.next().toUpperCase().charAt(0);
						if (opcaoEmprestimo == 'S'){
								System.out.println("Informe o valor do empréstimo: R$ ");
								valorEmprestimo = leia.nextDouble();
								contaEstudantil.usarEstudantil(valor[i]);	
						} 
						else if (opcaoEmprestimo != 'S' && opcaoEmprestimo == 'N') {
							System.out.println("Opção empréstimo não solicitada.");
						
						}
						
						else {
							System.out.println("Opção inválida!");
							break;
						}
						System.out.println((i + 1)+ "º Movimento. Deseja continuar? [S/N]: ");
						opcaoContinuar = leia.next().toUpperCase().charAt(0);
					}
				
				if(opcaoContinuar == 'N') {
					System.out.println("|============================================|");
					System.out.println("|   Obrigado por utilizar o BANCO GEN18 G-08 |");
					System.out.println("|============================================|");
					break;
				}
				}
				System.out.println("|   Limite de transações diárias atingido.   |");
				System.out.println("|============================================|");
				System.out.printf( "            [ Saldo:  R$  %.2f ]            \n", contaEstudantil.getSaldo());
				System.out.printf( "     [ Limite Emprestimo:  R$  %.2f ] \n", contaEstudantil.getLimiteEstudantil());
				System.out.println("  Obrigado por utilizar o BANCO GEN18 G-08  ");
				System.out.println("|============================================|");
				System.out.println("Deseja fazer um emprésimo? [S/N]");
				opcaoEmprestimo = leia.next().toUpperCase().charAt(0);		
				if (opcaoEmprestimo == 'S'){
					 
					System.out.println("Informe o valor do empréstimo: R$ ");
					valorEmprestimo = leia.nextDouble();	
					contaEstudantil.usarEstudantil(valorEmprestimo);
				}
			}
		default: {
			
			System.out.println("Opção inválida");
			break;
		}
		}
		
			
		}while (opcaoContinuar == 'N');
		leia.close();	
	}
}