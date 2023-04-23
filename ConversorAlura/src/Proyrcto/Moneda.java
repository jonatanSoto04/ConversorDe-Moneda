package Proyrcto;

public class Moneda{

	private double DolarUSD;
	private double Euro;
	private double pesoColombiano;
	private double resultado;
	
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
		//Math.round(this.resultado);
	}
	public double getDolarUSD() {
		return DolarUSD;
	}
	public void setDolarUSD(double dolarUSD) {
		this.DolarUSD = dolarUSD;
	}
	public double getEuro() {
		return Euro;
	}
	public void setEuro(double euro) {
		Euro = euro;
	}
	public double getPesoColombiano() {
		return pesoColombiano;
	}
	public void setPesoColombiano(double pesoColombiano) {;
		this.pesoColombiano = pesoColombiano;
	}
	
	
}
