import java.util.ArrayList;
import java.util.List;

public class Banco {
	private static final int COD_BANCO = 201;

	private String nome;
	private int codBanco;
	private List<Conta> contas;

	public Banco(String nome) {
		this.nome = nome;
		this.codBanco = COD_BANCO;
		this.contas = new ArrayList<>();
	}

	public void addConta(Conta conta) {
		this.contas.add(conta);
	}

	public void listarContas() {
		System.out.println(contas);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodBanco() {
		return codBanco;
	}

	public void setCodBacno(int codBanco) {
		this.codBanco = codBanco;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
