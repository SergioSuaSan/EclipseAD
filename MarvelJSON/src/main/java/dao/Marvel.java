package dao;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.List;

import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;


import model.Personaje;
import model.Root;

public class Marvel {
	
	
	
	public Marvel() {
		super();
	}

	public List<Personaje> getPersonajes() {
		String urtTXT = "https://gateway.marvel.com/v1/public/characters?limit=10&offset=1&apikey=e894ad1f6af082d2b6b7a63ff20f35e0&hash=6faa0674ad5f8d6d7563ae9d0ad65dc9&ts=9";
		Root root = null;
		try {
			String jsonTxT = IOUtils.toString(new URI(urtTXT), Charset.forName("UTF-8"));
			 root = new Gson().fromJson(jsonTxT, Root.class);
		
		
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		
		return root.getResultado().getResultado();
		
		
		
		
	}

}
