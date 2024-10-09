package model;

import com.google.gson.annotations.SerializedName;

public class Root {
	
	@SerializedName ("data")
	private Resultado resultado;

	public Root(Resultado resultado) {
		super();
		this.resultado = resultado;
	}

	public Resultado getResultado() {
		return resultado;
	}

	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}

	@Override
	public String toString() {
		return "Root [resultado=" + resultado + "]";
	}
	
	

}
