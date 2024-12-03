package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Lugar;



public class DaoLugar {
	
	
	public ArrayList<Lugar> getLugares(Connection con){
		ResultSet rs;
		ArrayList<Lugar> Lugares = new ArrayList<Lugar>();
		Statement st;
		
		try {
			st = con.createStatement();
			String ordenSql = "SELECT * from Lugar";
			rs = st.executeQuery(ordenSql);
			System.out.println(ordenSql);
			while (rs.next()) {
				Lugar objeto = new Lugar();
			
				objeto.setId(rs.getInt("ID"));
				objeto.setProvincia(rs.getInt("PROVINCIA"));
				objeto.setCategoria(rs.getInt("CATEGORIA"));
				objeto.setNombre(rs.getString("NOMBRE"));
				objeto.setImagen(rs.getString("IMAGEN"));
				objeto.setFav(rs.getInt("FAV"));
				
			
			
				//System.out.println(rs.getString("IMAGEN"));
				Lugares.add(objeto);
			}
			//System.out.println(bici);
			rs.close();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error en el DAO");
		}

		return Lugares;
	}
	
	public ArrayList<Lugar> getLugaresFiltrado(Connection con, String idprovincia, String idcategoria,  String idfav){
		ResultSet rs;
		ArrayList<Lugar> Lugares = new ArrayList<Lugar>();
		Statement st;
		
		try {
			st = con.createStatement();
			String ordenSql = "SELECT * from Lugar where provincia like '"+ idprovincia +"' and categoria like '" + idcategoria + "' and fav like '" + idfav +"'";
			rs = st.executeQuery(ordenSql);
			System.out.println(ordenSql);
			while (rs.next()) {
				Lugar objeto = new Lugar();
			
				objeto.setId(rs.getInt("ID"));
				objeto.setProvincia(rs.getInt("PROVINCIA"));
				objeto.setCategoria(rs.getInt("CATEGORIA"));
				objeto.setNombre(rs.getString("NOMBRE"));
				objeto.setImagen(rs.getString("IMAGEN"));
				objeto.setFav(rs.getInt("FAV"));
				
			
			
				//System.out.println(rs.getString("IMAGEN"));
				Lugares.add(objeto);
			}
			//System.out.println(bici);
			rs.close();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error en el DAO");
		}

		return Lugares;
	}
	
	public ArrayList<Lugar> getLugaresporProvincia(Connection con, int idprovincia){
		ResultSet rs;
		ArrayList<Lugar> Lugares = new ArrayList<Lugar>();
		Statement st;
		
		try {
			st = con.createStatement();
			String ordenSql = "SELECT * from Lugar where provincia = " + idprovincia;
			rs = st.executeQuery(ordenSql);
			System.out.println(ordenSql);
			while (rs.next()) {
				Lugar objeto = new Lugar();
				
				objeto.setId(rs.getInt("ID"));
				objeto.setNombre(rs.getString("NOMBRE"));
				objeto.setImagen(rs.getString("IMAGEN"));
			
		
				Lugares.add(objeto);
			}
			//System.out.println(bici);
			rs.close();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error en el DAO");
		}
		
		return Lugares;
	}
	public ArrayList<Lugar> getLugaresporCategoria(Connection con, int idcategoria){
		ResultSet rs;
		ArrayList<Lugar> Lugares = new ArrayList<Lugar>();
		Statement st;
		
		try {
			st = con.createStatement();
			String ordenSql = "SELECT * from Lugar where categoria = " + idcategoria;
			rs = st.executeQuery(ordenSql);
			System.out.println(ordenSql);
			while (rs.next()) {
				Lugar objeto = new Lugar();
				
				objeto.setId(rs.getInt("ID"));
				objeto.setNombre(rs.getString("NOMBRE"));
				objeto.setImagen(rs.getString("IMAGEN"));
			
				System.out.println(idcategoria);
		
				Lugares.add(objeto);
			}
			//System.out.println(bici);
			rs.close();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error en el DAO");
		}
		
		return Lugares;
	}
	public ArrayList<Lugar> getLugaresporFav(Connection con, String idfav){
		ResultSet rs;
		ArrayList<Lugar> Lugares = new ArrayList<Lugar>();
		Statement st;
		
		try {
			st = con.createStatement();
			String ordenSql = "SELECT * from Lugar where fav like '" + idfav + "'";
			rs = st.executeQuery(ordenSql);
			System.out.println(ordenSql);
			while (rs.next()) {
				Lugar objeto = new Lugar();
				
				objeto.setId(rs.getInt("ID"));
				objeto.setNombre(rs.getString("NOMBRE"));
				objeto.setImagen(rs.getString("IMAGEN"));
			
		
				Lugares.add(objeto);
			}
			//System.out.println(bici);
			rs.close();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error en el DAO");
		}
		
		return Lugares;
	}
	public void esFav( String idlugar, String fav, Connection con) {
		String ordenSQL = "update lugar set fav = '"+ fav + "' where id = " + idlugar;
		PreparedStatement st;
		try {
			st = con.prepareStatement(ordenSQL);
			
			st.executeUpdate();
			st.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ordenSQL);
	
	}




}
