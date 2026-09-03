
public class Produto {
	public String nome;
	public double preco;
	
	public Produto (String Nome, double Preco) {
		this.nome = Nome;
		this.preco = Preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
