
public class ProgramaDasFiguras {
	public static void main(String[] args) {
		
		GerenteDeFiguras gerente = new GerenteDeFiguras();
		
		Triangulo t1 = new Triangulo(2.0,3.0);
		Losango t2 = new Losango (2.0,5.0);
		Losango t3 = new Losango (2.0,4.0);
		
		gerente.adicionaFigura(t1);
		gerente.adicionaFigura(t2);
		gerente.adicionaFigura(t3);
		
		gerente.imprimirFiguras();
		
		double numero = gerente.getMaiorAreaDeFigura();
		System.out.print("\n"+numero);
	}
}
