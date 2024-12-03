package model;

public class Categoria {
	private String imagen;
	private String nombre;
	private int id;
	public Categoria(String imagen, String nombre, int id) {
		super();
		this.imagen = imagen;
		this.nombre = nombre;
		this.id = id;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Categoria [imagen=" + imagen + ", nombre=" + nombre + ", id=" + id + "]";
	}
	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
