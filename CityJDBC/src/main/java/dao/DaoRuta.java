package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Ruta;

public class DaoRuta {
	
	/*
	public ArrayList<Ruta> getRutasbyCiudad(Connection con, int idciudad){
		ResultSet rs;
		ResultSet rs1;
		ArrayList<Ruta> lista = new ArrayList<Ruta>();

		System.out.println(idciudad);
		Statement st;
		try {
			st = con.createStatement();
		
		String ordenSql = "SELECT * from Ruta where CIUDAD = "+idciudad+" order by ID";
		rs = st.executeQuery(ordenSql);

		while (rs.next()) {
			Ruta objeto = new Ruta();
			objeto.setId(rs.getInt("ID"));
			objeto.setImagen(rs.getString("IMAGEN"));
			objeto.setCiudad(rs.getInt("CIUDAD"));
			objeto.setDescripcion(rs.getString("DESCRIPCION"));
			objeto.setLink(rs.getString("LINK"));
			objeto.setNombre(rs.getString("NOMBRE"));
			
			ordenSql = "SELECT round(avg(puntos)) estrellitas from PUNTO where id = "+ rs.getInt("ID");
			rs1 = st.executeQuery(ordenSql);

			while (rs1.next()) {
				
				
				objeto.setPuntos(rs.getInt("ESTRELLITAS")) ;
				
			}
			
			
			
			lista.add(objeto);
		}
		rs.close();
		st.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lista;
	}
	 */
	public ArrayList<Ruta> getRutasbyCiudad(Connection con, int idciudad){
		ResultSet rs;
		ArrayList<Ruta> lista = new ArrayList<Ruta>();

		System.out.println(idciudad);
		Statement st;
		try {
			st = con.createStatement();
		
		String ordenSql = "select ruta.*, star from ruta, (select ruta, round(avg(puntos)) star from punto "
				+ "group by ruta having ruta in (select id from ruta where ciudad=" + idciudad + ")) x\r\n"
				+ "where ruta.id = x.ruta\r\n";
			
		rs = st.executeQuery(ordenSql);

		while (rs.next()) {
			Ruta objeto = new Ruta();
			objeto.setId(rs.getInt("ID"));
			objeto.setImagen(rs.getString("IMAGEN"));
			objeto.setCiudad(rs.getInt("CIUDAD"));
			objeto.setDescripcion(rs.getString("DESCRIPCION"));
			objeto.setLink(rs.getString("LINK"));
			objeto.setNombre(rs.getString("NOMBRE"));
			objeto.setPuntos(rs.getInt("star"));
			
			
			
			
			lista.add(objeto);
		}
		rs.close();
		st.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lista;
	}
	

}
