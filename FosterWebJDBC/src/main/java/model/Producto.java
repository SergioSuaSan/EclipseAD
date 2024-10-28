package model;

public class Producto {
	private String sumario;
	private String fondo;
	private String imagen;
	private int categoriaid;
	private String body;
	private String titulo;
	private int id;
	private int star;
	
	public Producto(String sumario, String fondo, String imagen, int categoriaid, String body, String titulo, int id,
			int star) {
		super();
		this.sumario = sumario;
		this.fondo = fondo;
		this.imagen = imagen;
		this.categoriaid = categoriaid;
		this.body = body;
		this.titulo = titulo;
		this.id = id;
		this.star = star;
	}

	
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getSumario() {
		return sumario;
	}

	public void setSumario(String sumario) {
		this.sumario = sumario;
	}

	public String getFondo() {
		return fondo;
	}

	public void setFondo(String fondo) {
		this.fondo = fondo;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public int getCategoriaid() {
		return categoriaid;
	}

	public void setCategoriaid(int categoriaid) {
		this.categoriaid = categoriaid;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	@Override
	public String toString() {
		return "Producto [sumario=" + sumario + ", fondo=" + fondo + ", imagen=" + imagen + ", categoriaid="
				+ categoriaid + ", body=" + body + ", titulo=" + titulo + ", id=" + id + ", star=" + star + "]";
	}

	
	
	
	

}
