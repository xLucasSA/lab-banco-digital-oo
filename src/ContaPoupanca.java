
public class ContaPoupanca extends Conta {
	private static int SEQUENCIAL = 1;
	private static final String TIPO = "P";

	public ContaPoupanca(Cliente cliente, Banco banco) {
		super(cliente, banco);
		this.cod = TIPO + " - " + SEQUENCIAL;
		SEQUENCIAL++;
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}
