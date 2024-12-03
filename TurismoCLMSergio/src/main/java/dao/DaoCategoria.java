package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Categoria;



public class DaoCategoria {
	
	
	public ArrayList<Categoria> getCategorias(Connection con){
		ResultSet rs;
		ArrayList<Categoria> Categorias = new ArrayList<Categoria>();
		Statement st;
		
		try {
			st = con.createStatement();
			String ordenSql = "SELECT * from Categoria";
			rs = st.executeQuery(ordenSql);
			System.out.println(ordenSql);
			while (rs.next()) {
				Categoria objeto = new Categoria();
			
				objeto.setId(rs.getInt("ID"));
				objeto.setNombre(rs.getString("NOMBRE"));
				objeto.setImagen(rs.getString("IMAGEN"));
			
			
				//System.out.println(rs.getString("IMAGEN"));
				Categorias.add(objeto);
			}
			//System.out.println(bici);
			rs.close();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error en el DAO");
		}

		return Categorias;
	}
	

}
