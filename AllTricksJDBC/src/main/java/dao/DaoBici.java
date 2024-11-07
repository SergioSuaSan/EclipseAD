package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Bici;



public class DaoBici {
	
	public ArrayList<Bici> getBicicletas(Connection con, String marca, String fav, String order ){
		ResultSet rs;
		ArrayList<Bici> bicis = new ArrayList<Bici>();
		Statement st;
		
		try {
			st = con.createStatement();
			String ordenSql = "SELECT B.ID, FOTO, MARCA, DESCRIPCION, PRECIO, FAV, NOMBRE from BICI B, MARCA M "
					+ "where marca = M.ID and marca like '" + marca + "' and fav like '" + fav +"' order by "+order ;
			rs = st.executeQuery(ordenSql);
			System.out.println(ordenSql);
			while (rs.next()) {
				Bici objeto = new Bici();
				objeto.setFav(rs.getInt("FAV"));
				objeto.setPrecio(rs.getInt("PRECIO"));
				objeto.setDescripcion(rs.getString("DESCRIPCION"));
				objeto.setMarca(rs.getInt("MARCA"));
				objeto.setNombreMarca(rs.getString("NOMBRE"));
				objeto.setFoto(rs.getString("FOTO"));
				objeto.setId(rs.getInt("ID"));
				
				bicis.add(objeto);
			}
			//System.out.println(bici);
			rs.close();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error en el DAO");
		}

		return bicis;
	}


}
