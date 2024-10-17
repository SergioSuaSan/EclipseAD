package model;

public class Punto {
	private int puntos;
	private int idproducto;
	private int id;
	public Punto(int puntos, int idproducto, int id) {
		super();
		this.puntos = puntos;
		this.idproducto = idproducto;
		this.id = id;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Punto [puntos=" + puntos + ", idproducto=" + idproducto + ", id=" + id + "]";
	}
	
	

}
