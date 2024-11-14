package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Jugador;

public class DaoJugador {
	
	// select
		public ArrayList<Jugador> getJugadoresbyEquipo(Connection con, int idequipo){
			ResultSet rs;
			ArrayList<Jugador> lista = new ArrayList<Jugador>();

			Statement st;
			try {
				st = con.createStatement();
			
			String ordenSql = "SELECT * from Jugador where EQUIPO = "+idequipo+" order by ID";
			rs = st.executeQuery(ordenSql);

			while (rs.next()) {
				Jugador objeto = new Jugador();
				objeto.setEquipo(rs.getInt("EQUIPO"));
				objeto.setNombre(rs.getString("NOMBRE"));
				objeto.setImagen(rs.getString("IMAGEN"));
				objeto.setLink(rs.getString("LINK"));
				objeto.setPais(rs.getString("PAIS"));
				objeto.setEstatura(rs.getInt("ESTATURA"));
				objeto.setEdad(rs.getInt("EDAD"));
				objeto.setId(rs.getInt("ID"));
				objeto.setLikes(rs.getInt("LIKES"));
				
				
				
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
