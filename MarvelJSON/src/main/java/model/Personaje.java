package model;

import com.google.gson.annotations.SerializedName;

public class Personaje {
	private String name;
	private String description;
	@SerializedName("thumbnail")
	private Icono icono;
	public Personaje(String name, String description, Icono icono) {
		super();
		this.name = name;
		this.description = description;
		this.icono = icono;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Icono getIcono() {
		return icono;
	}
	public void setIcono(Icono icono) {
		this.icono = icono;
	}
	@Override
	public String toString() {
		return "Personaje [name=" + name + ", description=" + description + ", icono=" + icono + "]";
	}
	
	
	

}
	