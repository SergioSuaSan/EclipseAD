package parser;

import java.util.ArrayList;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import model.Dia;

public class OpenWeather {
	
	private ArrayList<Dia> dias;
	
	public OpenWeather() {
		DOMParserWeb domParser = new DOMParserWeb("https://api.openweathermap.org/data/2.5/forecast?q=Toledo,es&mode=xml&APPID=601c9db344b44f9774ef76a4c07979b1&lang=sp&units=metric");
		Document doc = domParser.getDocumento();
		Dia dia;
		

		NodeList nodosTime = doc.getElementsByTagName("time");
		
		dias = new ArrayList<Dia>();
		for (int i=0;i<nodosTime.getLength();i++) {
			Element nodotime = (Element)nodosTime.item(i);
			dia = new Dia();
			
			dia.setTo(nodotime.getAttribute("to"));
			dia.setFrom(nodotime.getAttribute("from"));
			
			Element elepreci = (Element) nodotime.getElementsByTagName("precipitation").item(0);
			dia.setPreci(elepreci.getAttribute("probability"));
			
			Element symbol = (Element) nodotime.getElementsByTagName("symbol").item(0);
			dia.setIcono(symbol.getAttribute("var"));
			
			Element temp = (Element) nodotime.getElementsByTagName("temperature").item(0);
			dia.setMin(temp.getAttribute("min"));
			dia.setMax(temp.getAttribute("max"));
			
			Element prono = (Element) nodotime.getElementsByTagName("clouds").item(0);
			dia.setProno(prono.getAttribute("value"));
			
			dias.add(dia);
		}
		
	}

	public ArrayList<Dia> getDias() {
		return dias;
	}
	

}
