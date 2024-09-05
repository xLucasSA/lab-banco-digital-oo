
public class Main {

	public static void main(String[] args) {
		Banco meuBanco = new Banco("Sou Banco");

		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton, meuBanco);
		Conta poupanca = new ContaPoupanca(venilton, meuBanco);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		meuBanco.listarContas();
		cc.sacar(15);
	}

}
