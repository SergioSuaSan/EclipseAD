package model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Resultado {
	@SerializedName("results")
	private List<Personaje> personajes;

	public Resultado(List<Personaje> resultado) {
		super();
		this.personajes = resultado;
	}

	public List<Personaje> getResultado() {
		return personajes;
	}

	public void setResultado(List<Personaje> resultado) {
		this.personajes = resultado;
	}

	@Override
	public String toString() {
		return "Resultado [resultado=" + personajes + "]";
	}
	
	

}
