package view;

import manejador.ManejadorWeb;
import model.Dia;

public class Prueba {

	public static void main(String[] args) {
		ManejadorWeb manejador = new ManejadorWeb("https://api.openweathermap.org/data/2.5/forecast?q=Toledo,es&mode=xml&APPID=601c9db344b44f9774ef76a4c07979b1&lang=sp");
		for (Dia dia : manejador.parsear()) {
			System.out.println(dia);
		}
	}

}
