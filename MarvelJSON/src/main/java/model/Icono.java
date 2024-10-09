package model;

import com.google.gson.annotations.SerializedName;

public class Icono {
	@SerializedName("path")
	private String ruta;
	private String extension;
	public Icono(String ruta, String extension) {
		super();
		this.ruta = ruta;
		this.extension = extension;
	}
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	@Override
	public String toString() {
		return "Icono [ruta=" + ruta + ", extension=" + extension + "]";
	}

	
	
}
