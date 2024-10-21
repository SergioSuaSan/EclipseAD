package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Producto;

public class DaoProducto {
	
	// select
		public ArrayList<Producto> getProductos(Connection con) throws SQLException{
			ResultSet rs;
			ArrayList<Producto> lista = new ArrayList<Producto>();

			Statement st;
			st = con.createStatement();
			String ordenSql = "SELECT …";
			rs = st.executeQuery(ordenSql);

			while (rs.next()) {
				Producto objeto = new Producto();
				objeto.setId(rs.getInt("ID"));
				objeto.setSumario(rs.getString("SUMARIO"));
				
				lista.add(objeto);
			}
			rs.close();
			st.close();

			return lista;
		}


}
