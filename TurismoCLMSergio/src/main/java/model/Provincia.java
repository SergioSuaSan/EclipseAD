package model;

public class Provincia {
	private int id;
	private String nombre;
	private String imagen;
	private String folleto;
	public Provincia(int id, String nombre, String imagen, String folleto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.imagen = imagen;
		this.folleto = folleto;
	}
	public Provincia() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getFolleto() {
		return folleto;
	}
	public void setFolleto(String folleto) {
		this.folleto = folleto;
	}
	@Override
	public String toString() {
		return "Provincia [id=" + id + ", nombre=" + nombre + ", imagen=" + imagen + ", folleto=" + folleto + "]";
	}
	

}
