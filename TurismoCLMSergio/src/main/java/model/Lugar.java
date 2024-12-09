package model;

public class Lugar {
	private int id;
	private int provincia;
	private int categoria;
	private String nombre;
	private String imagen;
	private int fav;
	public Lugar(int id, int provincia, int categoria, String nombre, String imagen, int fav) {
		super();
		this.id = id;
		this.provincia = provincia;
		this.categoria = categoria;
		this.nombre = nombre;
		this.imagen = imagen;
		this.fav = fav;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProvincia() {
		return provincia;
	}
	public void setProvincia(int provincia) {
		this.provincia = provincia;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
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
	public int getFav() {
		return fav;
	}
	public void setFav(int fav) {
		this.fav = fav;
	}
	public Lugar() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Lugar [id=" + id + ", provincia=" + provincia + ", categoria=" + categoria + ", nombre=" + nombre
				+ ", imagen=" + imagen + ", fav=" + fav + "]";
	}
	
	

}
