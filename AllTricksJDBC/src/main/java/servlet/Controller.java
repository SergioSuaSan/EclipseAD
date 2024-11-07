package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Bici;
import model.Marca;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import dao.DaoBici;
import dao.DaoMarca;



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
		
		ArrayList<Bici> bicis = null;
		ArrayList<Marca> marcas = null;
		String marca = "";
		String order = "";
		String fav = "";
		
		
		con = (Connection)session.getAttribute("con");
		if (con== null) {
			con = Conexion.conecta();
			session.setAttribute("con", con);
		}
		
		String op = request.getParameter("op");
		System.out.println(op);
		switch (op) {
			case "inicio": 
				marca = "%";
				order = null;
				fav = "%";
				bicis = new DaoBici().getBicicletas(con, marca, fav, order);
				marcas = new DaoMarca().getMarcas(con);
				
				session.setAttribute("bicis", bicis);
				session.setAttribute("marcas", marcas);
				session.setAttribute("order", order);
				session.setAttribute("fav", fav);
				
				request.getRequestDispatcher("bicis.jsp").forward(request, response);
				break;	
				
			case "vamarca":
				
				marca = request.getParameter("marca");
				
				session.setAttribute("marca", marca);
			    order = (String) session.getAttribute("order");
				fav = (String) session.getAttribute("fav");
				System.out.println(fav);

				
				bicis = new DaoBici().getBicicletas(con, marca, fav, order);
				session.setAttribute("bicis", bicis);
			
				request.getRequestDispatcher("bicis.jsp").forward(request, response);
				break;
			case "vaorder":
				order = request.getParameter("order");
				marca = (String) session.getAttribute("marca");
				fav = (String) session.getAttribute("fav");

				
				bicis = new DaoBici().getBicicletas(con, marca, fav, order);
				session.setAttribute("bicis", bicis);

				request.getRequestDispatcher("bicis.jsp").forward(request, response);
				break;
			case "vafav":
				fav = request.getParameter("marca");
				if (fav.equals("%"))
					fav = "1";
				else
					fav = "%";
				session.setAttribute("fav", fav);
				order = (String) session.getAttribute("order");
				marca = (String) session.getAttribute("marca");
				

				
				bicis = new DaoBici().getBicicletas(con, marca, fav, order);
				session.setAttribute("bicis", bicis);
			
				request.getRequestDispatcher("bicis.jsp").forward(request, response);
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
