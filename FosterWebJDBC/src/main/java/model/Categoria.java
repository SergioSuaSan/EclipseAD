package model;

public class Categoria {
	private String guarnicion;
	private String descripcion;
	private String nombre;
	private int id;
	
	

	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getGuarnicion() {
		return guarnicion;
	}

	public void setGuarnicion(String guarnicion) {
		this.guarnicion = guarnicion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

	public Categoria(String guarnicion, String descripcion, String nombre, int id) {
		super();
		this.guarnicion = guarnicion;
		this.descripcion = descripcion;
		this.nombre = nombre;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Categoria [guarnicion=" + guarnicion + ", descripcion=" + descripcion + ", nombre=" + nombre + ", id="
				+ id + "]";
	}

}
