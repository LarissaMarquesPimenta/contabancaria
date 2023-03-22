package conta;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		while(true) {
		
		System.out.println(" ------------------------------------ ");
		System.out.println("|                                     |");
		System.out.println("|              GenBank                |");
		System.out.println("|                                     |");
		System.out.println(" ------------------------------------- ");
		System.out.println("|                                     |");
		System.out.println("|  1. Criar conta                     |");
		System.out.println("|  2. Listar todas as contas          |");
		System.out.println("|  3.Buscar conta por numero          |");
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
		System.out.println(" ------------------------------------- ");
	
		opcao = leia.nextInt();
		
		switch(opcao) {
		case 1: 
			System.out.println("Criar conta: \n");
			break;
			
		case 2: 
			System.out.println("Listar todas as contas: \n");
			break;
			
		case 3: 
			System.out.println("Consultar dados da conta por numero: \n");
			break;
			
		case 4: 
			System.out.println("Atualizar dados: \n");
			break;
			
		case 5: 
			System.out.println("Apagar conta: \n");
			break;
			
		case 6: 
			System.out.println("Saque: \n");
			break;
			
		case 7: 
			System.out.println("Deposito: \n");
			break;
			
		case 8: 
			System.out.println("Trnaferencia entre contas: \n");
			break;
			
		}
		if (opcao == 9) {
			System.out.println("Agradecemos a preferência, volte sempre!");
			leia.close();
			System.exit(0);
		}
		
		
	}

}

}