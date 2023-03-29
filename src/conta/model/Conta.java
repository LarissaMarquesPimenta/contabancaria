package conta.model;

public abstract class Conta {
	
	private String nome; 
	private int numero;
	private int tipo;
	private int agencia; 
	private float saldo;
	
	public Conta(String nome, int numero, int tipo, int agencia, float saldo) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.tipo = tipo;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	} 
	
	public boolean saque(float valor) {
		
		if (this.getSaldo() < valor ) {
			System.out.println("\n Saldo Insuficiente");
		}
		this.setSaldo(this.getSaldo() - valor);
		return true;
		
	}
	
	public void deposito(float valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
	public void visualizar() {

		String tipo = "";
		
		switch(this.tipo) {
		case 1:
			tipo = "Conta Corrente";
		break;
		case 2:
			tipo = "Conta Poupança";
		break;
		}
		
		System.out.println("\n-------------------------------------------------");
		System.out.println("Dados da Conta:");
		System.out.println("---------------------------------------------------");
		System.out.println("Numero da Conta: " + this.numero);
		System.out.println("Agência: " + this.agencia);
		System.out.println("Tipo da Conta: " + tipo);
		System.out.println("Titular: " + this.nome);
		System.out.println("Saldo: " + this.saldo);

	

}
		
	}
