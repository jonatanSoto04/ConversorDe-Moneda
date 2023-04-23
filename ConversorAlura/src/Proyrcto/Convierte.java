package Proyrcto;

public class Convierte extends Moneda{

	
	public void Convertir(String divs, String divs2, double text) {
		if(divs == "Euro") {
			if(divs2 == "Dolar USA") {
				setDolarUSD(1.10);
				setResultado(getDolarUSD()*text);
			}else if(divs2 == "Peso Colombiano") {
				super.setPesoColombiano(4.843);
				setResultado(text*getPesoColombiano());
			}else if(divs2=="Euro") {
				super.setEuro(1);
				setResultado(getEuro()*text);
			}else {
				
			}
		}else if(divs=="Dolar USA") {
			if(divs2== "Dolar USA") {
				super.setDolarUSD(1);
				setResultado(getDolarUSD()*text);
			}else if(divs2=="Peso Colombiano") {
				super.setPesoColombiano(4.409);
				setResultado(getPesoColombiano()*text);
			}else if(divs2=="Euro") {
				super.setEuro(0.91);
				setResultado(getEuro()*text);
			}
		}else if(divs=="Peso Colombiano") {
			if(divs2=="Dolar USA") {
				super.setDolarUSD(0.00023);
				setResultado(getDolarUSD()*text);
			}else if(divs2=="Peso Colombiano") {
				super.setPesoColombiano(1);
				setResultado(getPesoColombiano()/text);
			}else if(divs2=="Euro") {
				super.setEuro(0.00020);
				setResultado(getEuro()*text);
			}
		}
	}
}

