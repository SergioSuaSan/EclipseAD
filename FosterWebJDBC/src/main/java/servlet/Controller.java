package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Categoria;
import model.Producto;
import model.Punto;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import dao.DaoCategoria;
import dao.DaoProducto;
import dao.DaoPunto;


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
		ArrayList<Categoria> categorias = null;
		ArrayList<Producto> productos = null;
		
		con = (Connection)session.getAttribute("con");
		if (con== null) {
			con = Conexion.conecta();
			session.setAttribute("con", con);
		}
		
		String op = request.getParameter("op");
		System.out.println(op);
		switch (op) {
			case "inicio": 
			categorias = new DaoCategoria().getCategorias(con);
				
				session.setAttribute("categorias", categorias);
				request.getRequestDispatcher("categorias.jsp").forward(request, response);
				break;	
				
			case "dameplatos":
				String idcategoria = request.getParameter("idcategoria");
				String nombrecat = request.getParameter("nombrecat");
				productos = new  DaoProducto().getProductosbyCategoria(con, Integer.parseInt(idcategoria));
				
				session.setAttribute("nombrecat", nombrecat);
				session.setAttribute("productos", productos);
				request.getRequestDispatcher("platos.jsp").forward(request, response);
				break;
			case "detail":
				String idproducto = request.getParameter("idproducto");
				String nombreproducto = request.getParameter("nombreproducto");
				
				Producto producto = new  DaoProducto().getProductobyId(con, Integer.parseInt(idproducto));
			
				session.setAttribute("producto", producto);
				session.setAttribute("nombreproducto", nombreproducto);
				request.getRequestDispatcher("detail.jsp").forward(request, response);
				break;
			case "rating":
				String rating = request.getParameter("rating");
				producto = (Producto) session.getAttribute("producto");
				new DaoPunto().insertarPuntos(new Punto(0,producto.getId(),Integer.parseInt(rating)), con);
				
				 producto = new  DaoProducto().getProductobyId(con, producto.getId());
			
				session.setAttribute("producto", producto);
				request.getRequestDispatcher("detail.jsp").forward(request, response);
				
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
