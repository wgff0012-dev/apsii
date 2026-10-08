import java.util.ArrayList;
import java.util.List;


public class GerenteDeFiguras  {
	
	private List<FiguraGeometrica> figuras;
	
	public GerenteDeFiguras(){
		figuras = new ArrayList<FiguraGeometrica>();
	}

	public void adicionaFigura(FiguraGeometrica t1) {
		figuras.add(t1);
	}
	
	public double calcularAreaTotalDeFigura() {
		double areaTotal = 0.0;
		for (FiguraGeometrica fig : figuras) {
			areaTotal += fig.calculaArea();
		}
		return areaTotal;
	}

	public List<FiguraGeometrica> getFiguras() {
		return figuras;
	}
	
	public void imprimirFiguras() {
		for (FiguraGeometrica fig : figuras) {
			System.out.print("\n"+fig.getNomeFigura());
		}
	}
	
	public double getMaiorAreaDeFigura() {
		double maiorArea = 0.0;
		for (FiguraGeometrica fig : figuras) {
			double areaAtual = fig.calculaArea();
			if (areaAtual > maiorArea) {
				maiorArea = areaAtual;
			}
		}
		return maiorArea;
	}
}
