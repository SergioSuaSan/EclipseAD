package view;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.List;

import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;

import dao.Caravan;

import model.Lieux;


public class Prueba {

	public static void main(String[] args) {

		List<Lieux> lugares = Caravan.getLugares();
			for (Lieux lieux : lugares) {
				System.out.println(lieux);
			}
	}
	
}
