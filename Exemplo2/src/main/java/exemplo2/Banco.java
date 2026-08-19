package exemplo2;

public class Banco {
	
	public String nome;
	public String cpf;
	public double saldo;
	
	public Banco (String novoNome, String novoCpf, double novoSaldo) {
		this.nome =novoNome;
		this.cpf =novoCpf;
		this.setSaldo(novoSaldo);
	}
	
	public Banco () {
		this.nome = "Sem nome";
		this.cpf = "Sem cpf";
		this.setSaldo(0);
	}
	
	public double getSaldo() {
		return saldo;
	}
	public String getNome() {
		return nome;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
