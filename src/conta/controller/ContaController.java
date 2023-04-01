package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {

	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {

	}

	@Override
	public void listarTodas() {
		for (var conta : listaContas) {
			conta.visualizar();
		}

	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.printf("\nConta %d foi criada com sucesso!\n", conta.getNumero());

	}

	@Override
	public void atualizar(Conta conta) {

		var buscarConta = buscarNaCollection(conta.getNumero());

		if (buscarConta != null) {
			listaContas.set(listaContas.indexOf(buscarConta), conta);
			System.out.println("\nA conta numero: " + conta.getNumero() + "foi atualizada com sucesso");

		} else {
			System.out.println("\nA conta numero: " + conta.getNumero() + "não foi encontrada!");
		}

	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletar(int numero) {
		var conta = buscarNaCollection(numero);
		if (conta != null) {
			if (listaContas.remove(conta) == true)
				System.out.println("\nA Conta numero: " + numero + " foi deletada com sucesso!");
		} 
		else
			System.out.println("\nA Conta numero: " + numero + " não foi encontrada!");
	}
	
	
	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		   var origem = buscarNaCollection(numeroOrigem);
			var destino = buscarNaCollection(numeroDestino);

			if (origem != null && destino != null) {
								
					if (origem.saque(valor) == true) {
						destino.deposito(valor);
						System.out.println("\nTransferência efetuada com sucesso!");
					}
			}
			else
				System.out.println("\nConta não encontrada");
	    }

	public int gerarNumero() {
		int numero = 0;
		return ++numero;
	}

	public Conta buscarNaCollection(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero) {
				return conta;
			}
		}
		return null;
	}

	public int retornaTipo(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero) {
				return conta.getTipo();
			}
		}
		return 0;
	}
}
