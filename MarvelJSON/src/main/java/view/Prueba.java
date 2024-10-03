package view;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;

import model.Personaje;
import model.Resultado;

public class Prueba {

	public static void main(String[] args) {
		String urtTXT = "https://api.openweathermap.org/data/2.5/forecast?q=Toledo,es&APPID=601c9db344b44f9774ef76a4c07979b1&lang=sp&units=metric";
		
		try {
			String jsonTxT = IOUtils.toString(new URI(urtTXT), Charset.forName("UTF-8"));
			Resultado resultado = new Gson().fromJson(jsonTxT, Resultado.class);
	
			System.out.println();
			for (Personaje personaje: resultado.getResultado()) {
				System.out.println(personaje);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
