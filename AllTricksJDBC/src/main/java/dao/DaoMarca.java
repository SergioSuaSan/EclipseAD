package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Marca;

public class DaoMarca {

	public ArrayList<Marca> getMarcas(Connection con){
		ResultSet rs;
		ArrayList<Marca> marcas = new ArrayList<Marca>();
		Statement st;
		
		try {
			st = con.createStatement();
			String ordenSql = "SELECT * from MARCA";
			rs = st.executeQuery(ordenSql);
			System.out.println(ordenSql);
			while (rs.next()) {
				/*
				 * this.fav = fav;
		this.precio = precio;
		this.descripcion = descripcion;
		this.marca = marca;
		this.foto = foto;
		this.id = id;
				 */
				Marca objeto = new Marca();
				objeto.setId(rs.getInt("ID"));
				objeto.setNombre(rs.getNString("NOMBRE"));
				
				marcas.add(objeto);
			}
			//System.out.println(bici);
			rs.close();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error en el DAOMARCA");
		}

		return marcas;
	}

}
