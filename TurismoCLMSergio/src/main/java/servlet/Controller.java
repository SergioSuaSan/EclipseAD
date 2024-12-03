package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Categoria;

import model.Lugar;
import model.Provincia;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import conexion.Conexion;
import dao.DaoCategoria;
import dao.DaoLugar;
import dao.DaoProvincia;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		Connection con = null;

		ArrayList<Categoria> categorias = null;
		ArrayList<Lugar> lugares = null;
		ArrayList<Provincia> provincias = null;
		String fav = "%";
		String idcategoria = "%";
		String idprovincia = "%";
		String idlugar = "%";
		String idfav = "%";

		con = (Connection) session.getAttribute("con");
		if (con == null) {
			con = Conexion.conecta();
			session.setAttribute("con", con);
		}

		String op = request.getParameter("op");
		System.out.println(op);
		switch (op) {
		case "inicio":
			fav = "%";
			idcategoria = "%";
			idprovincia = "%";
			idlugar = "%";
			idfav = "%";

			categorias = new DaoCategoria().getCategorias(con);
			provincias = new DaoProvincia().getProvincias(con);
			lugares = new DaoLugar().getLugares(con);

			session.setAttribute("categorias", categorias);
			session.setAttribute("provincias", provincias);
			session.setAttribute("lugares", lugares);
			session.setAttribute("fav", fav);
			session.setAttribute("idfav", idfav);
			session.setAttribute("idcategoria", idcategoria);
			session.setAttribute("idprovincia", idprovincia);
			session.setAttribute("idlugar", idlugar);

			request.getRequestDispatcher("home.jsp").forward(request, response);
			break;
		case "dameprovincia":

			idprovincia = request.getParameter("idprovincia");
			idcategoria = request.getParameter("idcategoria");
			if (idprovincia == null)
				idprovincia = "%";
			if (idcategoria == null)
				idcategoria = "%";

			idlugar = request.getParameter("idlugar");
			idfav = request.getParameter("idfav");
			if (idfav == null) {
				idfav = "%";
			}
			categorias = new DaoCategoria().getCategorias(con);
			provincias = new DaoProvincia().getProvincias(con);
			lugares = new DaoLugar().getLugaresFiltrado(con, idprovincia, idcategoria, fav);

			session.setAttribute("categorias", categorias);
			session.setAttribute("provincias", provincias);
			session.setAttribute("lugares", lugares);
			session.setAttribute("fav", fav);
			session.setAttribute("idfav", idfav);
			session.setAttribute("idcategoria", idcategoria);
			session.setAttribute("idprovincia", idprovincia);
			session.setAttribute("idlugar", idlugar);

			request.getRequestDispatcher("home.jsp").forward(request, response);

			break;
		case "damecategoria":
			idprovincia = request.getParameter("idprovincia");
			idcategoria = request.getParameter("idcategoria");
			idlugar = request.getParameter("idlugar");
			idfav = request.getParameter("idfav");
			if (idprovincia == null)
				idprovincia = "%";
			if (idcategoria == null)
				idcategoria = "%";
			if (idfav == null)
				idfav = "%";
			categorias = new DaoCategoria().getCategorias(con);
			provincias = new DaoProvincia().getProvincias(con);
			lugares = new DaoLugar().getLugaresFiltrado(con, idprovincia, idcategoria, fav);

			session.setAttribute("categorias", categorias);
			session.setAttribute("provincias", provincias);
			session.setAttribute("lugares", lugares);
			session.setAttribute("fav", fav);
			session.setAttribute("idfav", idfav);
			session.setAttribute("idcategoria", idcategoria);
			session.setAttribute("idprovincia", idprovincia);
			session.setAttribute("idlugar", idlugar);
			request.getRequestDispatcher("home.jsp").forward(request, response);

			break;
		case "damefav":
			fav = request.getParameter("favid");
			
			System.out.println(idprovincia + " Es lo que tiene fav");

			idprovincia = request.getParameter("idprovincia");
			System.out.println(idprovincia + " Es lo que tiene fav");
			idcategoria = request.getParameter("idcategoria");
			idlugar = request.getParameter("idlugar");
			idfav = request.getParameter("idfav");
			if (idprovincia == null )
				idprovincia = "%";
			if (idcategoria == null)
				idcategoria = "%";
			if (idfav == null)
				idfav = "%";

			categorias = new DaoCategoria().getCategorias(con);
			provincias = new DaoProvincia().getProvincias(con);
			lugares = new DaoLugar().getLugaresFiltrado(con, idprovincia, idcategoria, fav);

			session.setAttribute("categorias", categorias);
			session.setAttribute("provincias", provincias);
			session.setAttribute("lugares", lugares);
			session.setAttribute("fav", fav);
			session.setAttribute("idfav", idfav);
			session.setAttribute("idcategoria", idcategoria);
			session.setAttribute("idprovincia", idprovincia);
			session.setAttribute("idlugar", idlugar);
			request.getRequestDispatcher("home.jsp").forward(request, response);

			break;
		case "cambiofav":

			idprovincia = request.getParameter("idprovincia");
			idcategoria = request.getParameter("idcategoria");
			idlugar = request.getParameter("idlugar");
			idfav = request.getParameter("idfav");
			//Por alguna razón me da el id nulo, cuando en la barra de búsqueda sí me la encuentra. Ejemplo:
			//http://localhost:8080/TurismoCLMSergio/Controller?op=cambiofav&idfav=1&idlugar=97idprovincia=%&idcategoria=%
			System.out.println(idlugar + "es lo que saco de lugar");
			System.out.println(idfav + "es lo que saco de fav");

			
			if (idfav.equals("0")) {
				idfav = "1";
				request.setAttribute("msg", "Añadido a Favoritos");
			} else {
				idfav = "0";
				request.setAttribute("msg", "Eliminado de Favoritos");
			}
			System.out.println(idfav + " Es lo que tiene ahora fav");

			if (idprovincia == null)
				idprovincia = "%";
			if (idcategoria == null)
				idcategoria = "%";
			//Esto no puede actualizar nada porque idlugar sale como nulo
			new DaoLugar().esFav(idlugar, idfav, con);

			categorias = new DaoCategoria().getCategorias(con);
			provincias = new DaoProvincia().getProvincias(con);
			lugares = new DaoLugar().getLugaresFiltrado(con, idprovincia, idcategoria, fav);

			session.setAttribute("categorias", categorias);
			session.setAttribute("provincias", provincias);
			session.setAttribute("lugares", lugares);
			session.setAttribute("fav", fav);
			session.setAttribute("idfav", idfav);
			session.setAttribute("idcategoria", idcategoria);
			session.setAttribute("idprovincia", idprovincia);
			session.setAttribute("idlugar", idlugar);
			request.getRequestDispatcher("home.jsp").forward(request, response);

			break;

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
