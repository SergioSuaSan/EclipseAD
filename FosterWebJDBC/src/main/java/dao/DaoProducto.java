package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Producto;

public class DaoProducto {
	
	// select
		public ArrayList<Producto> getProductosbyCategoria(Connection con, int idcategoria){
			ResultSet rs;
			ArrayList<Producto> lista = new ArrayList<Producto>();

			Statement st;
			try {
				st = con.createStatement();
			
			String ordenSql = "SELECT * from PRODUCTO where CATEGORIAID = "+idcategoria+" order by ID";
			rs = st.executeQuery(ordenSql);

			while (rs.next()) {
				Producto objeto = new Producto();
				objeto.setId(rs.getInt("ID"));
				objeto.setSumario(rs.getString("SUMARIO"));
				objeto.setImagen(rs.getString("IMAGEN"));
				objeto.setBody(rs.getString("BODY"));
				objeto.setCategoriaid(rs.getInt("CATEGORIAID"));
				objeto.setFondo(rs.getString("FONDO"));
				objeto.setTitulo(rs.getString("TITULO"));
				
				
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
		
		public Producto getProductobyId(Connection con, int idproducto){
			ResultSet rs;
			Producto producto = null;
			Statement st;
			try {
				st = con.createStatement();
			
				String ordenSql = "SELECT * from PRODUCTO where ID = "+idproducto;
				rs = st.executeQuery(ordenSql);
	
				if (rs.next()) {
					producto = new Producto();
					producto.setId(rs.getInt("ID"));
					producto.setSumario(rs.getString("SUMARIO"));
					producto.setImagen(rs.getString("IMAGEN"));
					producto.setBody(rs.getString("BODY"));
					producto.setCategoriaid(rs.getInt("CATEGORIAID"));
					producto.setFondo(rs.getString("FONDO"));
					producto.setTitulo(rs.getString("TITULO"));
					
				}
				rs.close();
				st.close();
				
				ordenSql = "SELECT round(avg(puntos)) estrellitas from PUNTO where idproducto = "+idproducto;
				rs = st.executeQuery(ordenSql);
	
				if (rs.next()) {
					
					
					producto.setStar(rs.getInt("ESTRELLITAS")) ;
					
				}
				rs.close();
				st.close();
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return producto;
		}



}
