package model;

import java.util.List;

public class Resultado {
	private List<Dia> list;

	public Resultado(List<Dia> list) {
		super();
		this.list = list;
	}

	public List<Dia> getList() {
		return list;
	}

	public void setList(List<Dia> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Resultado [list=" + list + "]";
	}

	
}
