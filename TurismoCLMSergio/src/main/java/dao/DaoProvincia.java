package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Provincia;



public class DaoProvincia {
	
	
	public ArrayList<Provincia> getProvincias(Connection con){
		ResultSet rs;
		ArrayList<Provincia> Provincias = new ArrayList<Provincia>();
		Statement st;
		
		try {
			st = con.createStatement();
			String ordenSql = "SELECT * from Provincia";
			rs = st.executeQuery(ordenSql);
			System.out.println(ordenSql);
			while (rs.next()) {
				Provincia objeto = new Provincia();
			
				objeto.setId(rs.getInt("ID"));
				objeto.setNombre(rs.getString("NOMBRE"));
				objeto.setImagen(rs.getString("IMAGEN"));
				objeto.setFolleto(rs.getString("FOLLETO"));
				Provincias.add(objeto);
				System.out.println(objeto.toString());
			}
			rs.close();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error en el DAO");
		}

		return Provincias;
	}
	
	

}
