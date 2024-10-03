package model;

import com.google.gson.annotations.SerializedName;

public class Personaje {
	private String name;
	private String description;
	@SerializedName("thumbnail")
	private Icono icono;
	

}
	