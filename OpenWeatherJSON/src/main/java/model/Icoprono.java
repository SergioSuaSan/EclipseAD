package model;

import com.google.gson.annotations.SerializedName;

public class Icoprono {
	
	@SerializedName("description")
	private String prono;
	private String icon;
	public Icoprono(String prono, String icon) {
		super();
		this.prono = prono;
		this.icon = icon;
	}
	public String getProno() {
		return prono;
	}
	public void setProno(String prono) {
		this.prono = prono;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	@Override
	public String toString() {
		return "Icoprono [prono=" + prono + ", icon=" + icon + "]";
	}
	
	
	

}
