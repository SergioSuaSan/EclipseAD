package view;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;

import dao.Marvel;
import model.Personaje;
import model.Resultado;
import model.Root;

public class Prueba {

	public static void main(String[] args) {

		Marvel marvel = new Marvel();
			for (Personaje personaje: marvel.getPersonajes()) {
				System.out.println(personaje);
			}
	}
	
}
