import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nomeLivro, nomeCD, autor;
		double precoLivro, precoCD ;
		int faixas;
		
		System.out.println("\n--- Cadastrado do Livro ---");
		System.out.print("Digite o nome do Livro: ");
		nomeLivro = teclado.nextLine();
		System.out.print("Digite o preço do Livro: ");
		precoLivro = teclado.nextDouble();
		System.out.print("Digite o nome do Autor: ");
		autor = teclado.nextLine();
		teclado.nextLine();
		
		System.out.println("\n--- Cadastrado do CD ---");
		System.out.print("Digite o nome do CD: ");
		nomeCD = teclado.nextLine();
		System.out.print("Digite o preço do CD: ");
		precoCD = teclado.nextDouble();
		System.out.print("Digite o número de faixas: ");
		faixas = teclado.nextInt();
		teclado.nextLine(); 

		CD meuCD = new CD(nomeCD, precoCD, faixas);
		Livro meuLivro = new Livro(nomeLivro, precoLivro, autor);
		System.out.println("\n--- Dados dos Cadastrados ---");
		meuCD.exibeInformacoes();
		System.out.print("\n");
		meuLivro.exibeInformacoes();
		
		
	}

}