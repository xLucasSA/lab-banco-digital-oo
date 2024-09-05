
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;

	protected int agencia;
	protected String cod;
	protected double saldo;
	protected Cliente cliente;
	protected int codBanco;

	public Conta(Cliente cliente, Banco banco) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.cliente = cliente;
		this.saldo = 0;
		this.codBanco = banco.getCodBanco();
		banco.addConta(this);
	}

	@Override
	public String toString() {
		return String.format("{Titular: %s, Numero: %s}", this.cliente.getNome(), this.cod);
	}

	@Override
	public boolean sacar(double valor) {
		if (aprovarSaque(valor)){
			saldo -= valor;
			return true;
		}

		System.out.println("Saldo insuficiente!");
		return false;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		boolean saque = this.sacar(valor);

		if(saque) {
			contaDestino.depositar(valor);
		}
	}

	private boolean aprovarSaque(double valor) {
		double saldoAtual = this.getSaldo();

		if (saldoAtual >= valor){
			return true;
		}

		return false;
	}

	public int getAgencia() {
		return agencia;
	}

	public String getCod() {
		return cod;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %s", this.cod));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
