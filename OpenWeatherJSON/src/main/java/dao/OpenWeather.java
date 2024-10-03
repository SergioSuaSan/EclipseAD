package dao;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.List;

import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;

import jakarta.servlet.jsp.jstl.sql.Result;
import model.Dia;
import model.Resultado;

public class OpenWeather {

	public OpenWeather() {
		super();
	}
	
	public List<Dia> getDias() {
		String urtTXT = "https://api.openweathermap.org/data/2.5/forecast?q=Toledo,es&APPID=601c9db344b44f9774ef76a4c07979b1&lang=sp&units=metric";
		Resultado resultado = null;
		try {
			String jsonTxT = IOUtils.toString(new URI(urtTXT), Charset.forName("UTF-8"));
			 resultado = new Gson().fromJson(jsonTxT, Resultado.class);
		
		
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		
		return resultado.getList();
		
		
		
		
	}

}
