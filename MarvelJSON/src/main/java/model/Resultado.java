package model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Resultado {
	@SerializedName("result")
	private List<Personaje> resultado;

	public Resultado(List<Personaje> resultado) {
		super();
		this.resultado = resultado;
	}

	public List<Personaje> getResultado() {
		return resultado;
	}

	public void setResultado(List<Personaje> resultado) {
		this.resultado = resultado;
	}

	@Override
	public String toString() {
		return "Resultado [resultado=" + resultado + "]";
	}
	
	

}
