package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.util.Cores;
import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) {
		
		ContaController contas = new ContaController();
		
		Scanner leia = new Scanner(System.in);
		int opcao, numero, agencia, tipo, aniversario; 
		String nome; 
		float saldo, limite; 
		
		while(true) {
		
		System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND +
				" ------------------------------------ ");
		System.out.println("|                                     |");
		System.out.println("|              GenBank                |");
		System.out.println("|                                     |");
		System.out.println(" ------------------------------------- ");
		System.out.println("|                                     |");
		System.out.println("|  1. Criar conta                     |");
		System.out.println("|  2. Listar todas as contas          |");
		System.out.println("|  3. Buscar conta por numero         |");
		System.out.println("|  4. Atualizar dados da conta        |");
		System.out.println("|  5. Apagar conta                    |");
		System.out.println("|  6. Sacar                           |");
		System.out.println("|  7. Depositar                       |");
		System.out.println("|  8. Transferir valores entre contas |");
		System.out.println("|  9. Sair                            |");
		System.out.println("|                                     |");
		System.out.println(" ------------------------------------- ");
		System.out.println("|                                     |");
		System.out.println("|         Escolha uma opção:          |");
		System.out.println("|                                     |");
		System.out.println(" ------------------------------------- " + Cores.TEXT_RESET);
	
		
		try{opcao = leia.nextInt(); }
		catch (InputMismatchException e) {
			System.out.println("\n Digite valores inteiros.");
			leia.nextLine();
			opcao = 0;
			
		}
		
		if (opcao == 9) {
			System.out.println(Cores.TEXT_WHITE_BOLD + "Agradecemos a preferência, volte sempre!");
			leia.close();
			System.exit(0);}
		switch(opcao) {
		
		case 1: 
			System.out.println(Cores.TEXT_WHITE_BOLD + "Criar conta: \n");
			
			System.out.println("Digite o numero da agencia: ");
			agencia = leia.nextInt();
			System.out.println("Digite o nome do titular: ");
			leia.skip("\\R?");
			nome = leia.nextLine();
			
			do {
				System.out.println("Digite o tipo da conta: ");
				System.out.println("[1] Conta corrente \n[2] Conta poupança ");
				tipo = leia.nextInt();
			} while (tipo < 1 && tipo > 2); 
				System.out.println("Digite o saldo da conta: ");
				saldo = leia.nextFloat();
				
				switch(tipo) {
				case 1 -> { 
					System.out.println("Digite o limite de crédito R$: ");
					limite = leia.nextFloat();
					contas.cadastrar(new ContaCorrente(nome, contas.gerarNumero(), tipo, agencia, saldo, limite));
				}
				case 2 -> {
					System.out.println("Digite o aniversário da conta: ");
					aniversario = leia.nextInt();
					contas.cadastrar(new ContaCorrente(nome, contas.gerarNumero(), tipo, agencia, saldo, aniversario));
					
				}
				}
				
			
			break;
			
		case 2: 
			System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as contas: \n");
			contas.listarTodas();
			//keyPress();
			
			break;
			
		case 3: 
			System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da conta por numero: \n");
			break;
			
		case 4: 
			System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados: \n");
			break;
			
		case 5: 
			System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar conta: \n");
			break;
			
		case 6: 
			System.out.println(Cores.TEXT_WHITE_BOLD + "Saque: \n");
			break;
			
		case 7: 
			System.out.println(Cores.TEXT_WHITE_BOLD + "Deposito: \n");
			break;
			
		case 8: 
			System.out.println(Cores.TEXT_WHITE_BOLD + "Trnaferencia entre contas: \n");
			break;
			
		default: 
			System.out.println(Cores.TEXT_RED_BOLD + "\nOpção inválida!");
			break;
			
		}
		
		}}
		
		public static void keyPress() {

			try {

				System.out.println(Cores.TEXT_RESET + "\nPressione enter para continuar.");
				System.in.read();

			} catch (IOException e) {

				System.out.println("Você pressionou uma tecla diferente de enter!");

			}

	}
	
	
}

