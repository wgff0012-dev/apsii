
public class CD extends Produto implements InfoGerais{
	public int numFaixas;
	
	public CD (String Nome, double Preco, int NumFaixas) {
		super (Nome, Preco);
		this.numFaixas = NumFaixas;
	}

	public int getNumFaixas() {
		return numFaixas;
	}

	public void setNumFaixas(int numFaixas) {
		this.numFaixas = numFaixas;
	}
	
	@Override
	public void exibeInformacoes() {
        System.out.println("Nome do CD: " + getNome());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Número de Faixas: " + numFaixas);
    }
	
	
}
