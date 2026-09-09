public class Losango implements FiguraGeometrica{
	
	private double diagonal1;
	private double diagonal2;
		
	public Losango(double Diagonal1, double Diagonal2){
		this .diagonal1 = Diagonal1;
		this .diagonal2 = Diagonal2;
	}
	
	@Override
	public double calculaArea(){
		return (this .diagonal1 * this .diagonal2)/2;
	}
	
	@Override
	public String getNomeFigura(){
		return "Losango";
	}
	
	@Override
	public String toString() {
		return "Losango [diagonal1=" +diagonal1+ ", diagonal2=" +diagonal1+"]";
	}
}
