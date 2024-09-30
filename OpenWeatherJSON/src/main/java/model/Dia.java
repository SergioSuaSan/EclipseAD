package model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Dia {
	@SerializedName("main")
	private Temps temps;
	@SerializedName("weather")
	private List<Icoprono> icoprono;
	private float pop;
	@SerializedName("dt_txt")
	private String fecha;
	public Dia(Temps temps, List<Icoprono> icoprono, int pop, String fecha) {
		super();
		this.temps = temps;
		this.icoprono = icoprono;
		this.pop = pop;
		this.fecha = fecha;
	}
	public Temps getTemps() {
		return temps;
	}
	public void setTemps(Temps temps) {
		this.temps = temps;
	}
	public List<Icoprono> getIcoprono() {
		return icoprono;
	}
	public void setIcoprono(List<Icoprono> icoprono) {
		this.icoprono = icoprono;
	}
	public float getPop() {
		return pop;
	}
	public void setPop(float pop) {
		this.pop = pop;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Dia [temps=" + temps + ", icoprono=" + icoprono + ", pop=" + pop + ", fecha=" + fecha + "]";
	}

	
	
	
}
