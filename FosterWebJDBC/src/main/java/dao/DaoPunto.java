package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Punto;

public class DaoPunto {

	public  void insertarPuntos(Punto punto, Connection con) {
			String ordenSQL;
			ordenSQL = "insert into PUNTO values(?,?,?)";
			try {
				PreparedStatement st = con.prepareStatement(ordenSQL);
				st.setInt(1, punto.getId());
				st.setInt(2, punto.getIdproducto());
				st.setInt(3, punto.getPuntos());
				System.out.println(punto.toString());
				System.out.println(ordenSQL);
				st.executeUpdate();
				st.close();
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		

		
	}

}
