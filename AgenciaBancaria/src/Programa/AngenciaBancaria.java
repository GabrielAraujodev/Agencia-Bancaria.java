package Programa;

import java.util.ArrayList;
import java.util.Scanner;
public class AngenciaBancaria {

	 static Scanner teclado = new Scanner(System.in);
		static ArrayList<Conta> ContasBancaria;
		
		public static void main(String[] args) {
			
			ContasBancaria = new ArrayList<Conta>();
			operacoes();
			
	}
		public static void operacoes() {
			
			
			
			 System.out.println("------------------------------------------------------");
		        System.out.println("-------------Bem vindos a nossa Ag�ncia---------------");
		        System.out.println("------------------------------------------------------");
		        System.out.println("***** Selecione uma opera��o que deseja realizar *****");
		        System.out.println("------------------------------------------------------");
		        System.out.println("|   Op��o 1 - Criar conta   |");
		        System.out.println("|   Op��o 2 - Depositar     |");
		        System.out.println("|   Op��o 3 - Sacar         |");
		        System.out.println("|   Op��o 4 - Transferir    |");
		        System.out.println("|   Op��o 5 - Listar        |");
		        System.out.println("|   Op��o 6 - Sair          |");
			
		        int operacao = teclado.nextInt();;
			
			switch(operacao){
			
				case 1 :
					criarConta();
					break;
					
				case 2 :
					dopositar();
					break;	
				case 3 :
					sacar();
					break;	
				case 4 :
					transferir();
					break;
				case 5:
					listarContas();
					break;	
				case 6 :
					System.out.println("flw � n�is, obrigado por usar nossa ag�ncia");
					System.exit(0);
					
					default:
						System.out.println("Op��o invalida!");
						operacoes();
						break;
				
		}
			
				
			}
		
		public static void criarConta() {
			
			System.out.println("\nNome: ");
			String nome = teclado.next();
			
			
			System.out.println("\nCPF: ");
			String cpf = teclado.next();
			
			System.out.println("\nEmail: ");
			String email = teclado.next();
			
			Pessoa pessoa = new Pessoa(nome, cpf, email);      
			
			Conta conta = new Conta(pessoa);
			
			ContasBancaria.add(conta);
			
			System.out.println("Conta criada com sucesso!");
			
			operacoes();
			
			}
		
		
		private static Conta encontrarConta( int numeroConta) {
			Conta conta = null;
			
			if(ContasBancaria.size() > 0){
				for(Conta c: ContasBancaria) {
					if(c.getNumeroConta() == numeroConta);
					conta = c;
				}
			}
				return conta ;
				 
		}

		public static void dopositar() {
			System.out.println(" N�mero da conta: ");
			int numeroConta = teclado.nextInt();
			
			Conta conta = encontrarConta(numeroConta);
			
			if( conta != null ) {
				System.out.println(" Qual valor deseja deposita? ");
				double valorDeposito = teclado.nextDouble();
				conta.depositar(valorDeposito);
				System.out.println(" Valor depositado com sucesseso!  ");
			}else {
				System.out.println(" Conta n�o encontrada! ");
			}
			
			operacoes();
		}
		
		
		public static void sacar() {
			System.out.println(" Qual valor deseja sacar? ");
			int numeroConta = teclado.nextInt();
			
			Conta conta = encontrarConta(numeroConta);
			if( conta != null ) {
				System.out.println(" Qual valor deseja deposita? ");
				double valorSaque = teclado.nextDouble();
				conta.sacar(valorSaque);
				System.out.println(" Saque  feito com sucesso!  ");
			}else {
				System.out.println(" Conta n�o encontrada! ");
			}
			
			operacoes();
		
			
		}
		
		public static void transferir() {
			
			System.out.println(" numero da conta do remetente: ");
			int numeroContaRemetente = teclado.nextInt();
			
			Conta contaRemetente =  encontrarConta(numeroContaRemetente); 
			
			if ( contaRemetente != null  ) {
				System.out.println("Numero da conta do destinatario:");
				int numeroContaDestinatario = teclado.nextInt();
				
				Conta contaDestinatario = encontrarConta(numeroContaDestinatario);
						
				if(contaDestinatario != null) {
					System.out.println("Valor da transfer�ncia:");
					double valor = teclado.nextDouble();
					
					contaRemetente.transferir(contaDestinatario, valor);
					
				  }else {
		                System.out.println("--- A conta para dep�sito n�o foi encontrada ---");
		            }
				 operacoes();
				}}
			
			
			public static void listarContas() {
				if (ContasBancaria.size() > 0) {
					for (Conta conta : ContasBancaria) {
						System.out.println(conta);
					}
				} else {
					System.out.println("--- N�o h� contas cadastradas ---");
				}

				operacoes();

			}

		}
	
		

