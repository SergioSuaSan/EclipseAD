package model;

public class Bici {
	private int fav;
	private double precio;
	private String descripcion;
	private int marca;
	private String nombreMarca;
	private String foto;
	private int id;
	

	
	public Bici(int fav, double precio, String descripcion, int marca, String nombreMarca, String foto, int id) {
		super();
		this.fav = fav;
		this.precio = precio;
		this.descripcion = descripcion;
		this.marca = marca;
		this.nombreMarca = nombreMarca;
		this.foto = foto;
		this.id = id;
	}
	public Bici() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getNombreMarca() {
		return nombreMarca;
	}
	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}
	public int getFav() {
		return fav;
	}
	public void setFav(int fav) {
		this.fav = fav;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getMarca() {
		return marca;
	}
	public void setMarca(int marca) {
		this.marca = marca;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Bici [fav=" + fav + ", precio=" + precio + ", descripcion=" + descripcion + ", marca=" + marca
				+ ", nombreMarca=" + nombreMarca + ", foto=" + foto + ", id=" + id + "]";
	}

	
	

}
