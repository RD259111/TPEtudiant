package servlettp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tpEtudiant.EtudiantJavaBean;

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
		// String nom = request.getParameter("nom");
		// String moyenne = request.getParameter("moyenne");

		// float m = Integer.parseInt(moyenne);
		int c = Integer.parseInt(code);

		EtudiantJavaBean etudiant = new EtudiantJavaBean();

		response.setContentType("text/plain");

		PrintWriter out = response.getWriter();

		etudiant.setCode(c);

		// etudiant.setMoyenne(m);
		// etudiant.setNom(nom);

		out.print(etudiant.getCode() + "  :  ");
		out.print(etudiant.getNom() + "  :  ");

		if (etudiant.isAdmis())
			out.println("Vous êtes admis");
		else {
			out.println("Vous n'êtes pas admis");

		}

	}

}
