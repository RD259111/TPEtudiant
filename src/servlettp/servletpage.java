package servlettp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tpEtudiant.Etudiant;

/**
 * Servlet implementation class servletpage
 */
@WebServlet("/servletpage")
public class servletpage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public servletpage() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String code = request.getParameter("code");
		String nom = request.getParameter("nom");
		String moyenne = request.getParameter("moyenne");

		float m = Integer.parseInt(moyenne);
		int c = Integer.parseInt(code);

		Etudiant etudiant = new Etudiant();

		response.setContentType("text/plain");

		PrintWriter out = response.getWriter();

		etudiant.setCode(c);
		etudiant.setMoyenne(m);
		etudiant.setNom(nom);

		out.print(etudiant.getCode() + "  :  ");
		out.print(etudiant.getNom() + "  :  ");

		if (m < 10)
			out.println("Vous n'avez pas la moyenne");
		else {
			out.println("Félicitation, vous avez la moyenne");

		}

	}

}
