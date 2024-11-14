package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Ciudad;



public class DaoCiudad {
	
	
	public ArrayList<Ciudad> getCiudades(Connection con){
		ResultSet rs;
		ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();
		Statement st;
		
		try {
			st = con.createStatement();
			String ordenSql = "SELECT * from CIUDAD";
			rs = st.executeQuery(ordenSql);
			System.out.println(ordenSql);
			while (rs.next()) {
				Ciudad objeto = new Ciudad();
			
				objeto.setId(rs.getInt("ID"));
				objeto.setNombre(rs.getString("NOMBRE"));
				objeto.setImagen(rs.getString("IMAGEN"));
				objeto.setDescripcion(rs.getString("DESCRIPCION"));
				objeto.setLink(rs.getString("LINK"));
				objeto.setMapa(rs.getString("MAPA"));
			
				System.out.println(rs.getString("IMAGEN"));
				ciudades.add(objeto);
			}
			//System.out.println(bici);
			rs.close();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error en el DAO");
		}

		return ciudades;
	}
	public ArrayList<Ciudad> getCiudadesporRuta(Connection con){
		ResultSet rs;
		ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();
		Statement st;
		
		try {
			st = con.createStatement();
			String ordenSql = "SELECT * from CIUDAD where id in (select distinct ciudad from ruta)";
			rs = st.executeQuery(ordenSql);
			System.out.println(ordenSql);
			while (rs.next()) {
				Ciudad objeto = new Ciudad();
				
				objeto.setId(rs.getInt("ID"));
				objeto.setNombre(rs.getString("NOMBRE"));
				objeto.setImagen(rs.getString("IMAGEN"));
				objeto.setDescripcion(rs.getString("DESCRIPCION"));
				objeto.setLink(rs.getString("LINK"));
				objeto.setMapa(rs.getString("MAPA"));
				
				System.out.println(rs.getString("IMAGEN"));
				ciudades.add(objeto);
			}
			//System.out.println(bici);
			rs.close();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error en el DAO");
		}
		
		return ciudades;
	}

}
