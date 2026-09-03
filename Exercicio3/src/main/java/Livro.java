
public class Livro extends Produto implements InfoGerais{
	public String autor;
	
	public Livro (String Nome, double Preco, String Autor) {
		super (Nome, Preco);
		this.autor = Autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public void exibeInformacoes() {
        System.out.println("Nome do Livro: " + getNome());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Nome do Autor: " + autor);
    }

}
