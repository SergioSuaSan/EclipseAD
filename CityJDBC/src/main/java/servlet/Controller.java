package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Ciudad;
import model.Ruta;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import conexion.Conexion;
import dao.DaoCiudad;
import dao.DaoRuta;




/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Connection con = null;
		
		ArrayList<Ciudad> ciudades = null;
		ArrayList<Ciudad> ciudadesruta = null;
		ArrayList<Ruta> rutas = null;
		
		con = (Connection)session.getAttribute("con");
		if (con== null) {
			con = Conexion.conecta();
			session.setAttribute("con", con);
		}
		
		String op = request.getParameter("op");
		System.out.println(op);
		switch (op) {
			case "inicio": 
				
				ciudades = new DaoCiudad().getCiudades(con);
				ciudadesruta = new DaoCiudad().getCiudadesporRuta(con);
				
				session.setAttribute("ciudades", ciudades);
				session.setAttribute("ciudadesruta", ciudadesruta);
				
				
				request.getRequestDispatcher("home.jsp").forward(request, response);
				break;	
			case "dameciudad":
				String idciudad = request.getParameter("idciudad");
				String nombreciu = request.getParameter("nombreciu");
				
				rutas = new  DaoRuta().getRutasbyCiudad(con, Integer.parseInt(idciudad));
				session.setAttribute("nombreciu", nombreciu);
				session.setAttribute("rutas", rutas);
				request.getRequestDispatcher("rutas.jsp").forward(request, response);
				break;
				
				
			
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}