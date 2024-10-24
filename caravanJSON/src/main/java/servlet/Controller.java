package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Lieux;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dao.Caravan;

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
		
		String op = request.getParameter("op");
		List<Lieux> lugares = null;
		Lieux lugar = null;
		switch (op) {
			case "inicio":
				lugares = Caravan.getLugares();
				// Entregamos a la vista home estos datos en forma de objeto bajo el nombre key
				// Cuidado con la key!!. En la home habra que utilizarla y llamarla IGUAL IGUAL...
				session.setAttribute("lugares", lugares);
				request.getRequestDispatcher("home.jsp").forward(request, response);
				break;			
			case "detail":
				String lugarid = request.getParameter("lugarid");
				lugares = (List<Lieux>) session.getAttribute("lugares");
				for (Lieux lieux : lugares) {
					if (lieux.getId().equals(lugarid)) {
						lugar = lieux;
					}
				}
				
				// Entregamos a la vista home estos datos en forma de objeto bajo el nombre key
				// Cuidado con la key!!. En la home habra que utilizarla y llamarla IGUAL IGUAL...
				session.setAttribute("lugar", lugar);
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
