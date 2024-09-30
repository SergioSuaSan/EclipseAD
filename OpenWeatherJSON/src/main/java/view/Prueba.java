package view;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;

import model.Dia;
import model.Resultado;

public class Prueba {

	public static void main(String[] args) {
		String urtTXT = "https://api.openweathermap.org/data/2.5/forecast?q=Toledo,es&APPID=601c9db344b44f9774ef76a4c07979b1&lang=sp&units=metric";
		
		try {
			String jsonTxT = IOUtils.toString(new URI(urtTXT), Charset.forName("UTF-8"));
			Resultado resultado = new Gson().fromJson(jsonTxT, Resultado.class);
			
			System.out.println(resultado.getList().getFirst().getIcoprono().getFirst().getIcon());
			System.out.println();
			for (Dia dia: resultado.getList()) {
				System.out.println(dia);
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
