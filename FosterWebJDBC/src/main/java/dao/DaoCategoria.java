package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Categoria;

public class DaoCategoria {
	// select
		public ArrayList<Categoria> getCategorias(Connection con){
			ResultSet rs;
			ArrayList<Categoria> categorias = new ArrayList<Categoria>();
			Statement st;
			
			try {
				st = con.createStatement();
				String ordenSql = "SELECT * from CATEGORIA order by NOMBRE";
				rs = st.executeQuery(ordenSql);
				System.out.println(ordenSql);
				while (rs.next()) {
					Categoria objeto = new Categoria();
					objeto.setNombre(rs.getString("NOMBRE"));
					objeto.setId(rs.getInt("ID"));
					objeto.setDescripcion(rs.getString("DESCRIPCION"));
					objeto.setGuarnicion(rs.getString("GUARNICION"));
					
					categorias.add(objeto);
				}
				System.out.println(categorias);
				rs.close();
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Error en el DAO");
			}

			return categorias;
		}


}
