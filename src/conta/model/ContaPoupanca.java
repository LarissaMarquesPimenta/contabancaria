package conta.model;

public class ContaPoupanca extends Conta {
	
	private int aniversario;

	
	public ContaPoupanca(String nome, int numero, int tipo, int agencia, float saldo, int aniversario) {
		super(nome, numero, tipo, agencia, saldo);
		this.aniversario = aniversario;
	}


	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	} 
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Aniversário da conta: " + this.aniversario);


}
	}
