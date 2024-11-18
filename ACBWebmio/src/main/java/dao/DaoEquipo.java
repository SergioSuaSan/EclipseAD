package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Equipo;

public class DaoEquipo {
	// select
		public ArrayList<Equipo> getEquipos(Connection con){
			ResultSet rs;
			ArrayList<Equipo> equipos = new ArrayList<Equipo>();
			Statement st;
			
			try {
				st = con.createStatement();
				String ordenSql = "SELECT * from Equipo order by NOMBRE";
				rs = st.executeQuery(ordenSql);
				System.out.println(ordenSql);
				while (rs.next()) {
					Equipo objeto = new Equipo();
					objeto.setId(rs.getInt("ID"));
					objeto.setNombre(rs.getString("NOMBRE"));
					objeto.setImgestadio(rs.getString("IMGESTADIO"));
					objeto.setImgescudo(rs.getString("IMGESCUDO"));
					
					equipos.add(objeto);
				}
				System.out.println(equipos);
				rs.close();
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Error en el DAO");
			}

			return equipos;
		}


}
