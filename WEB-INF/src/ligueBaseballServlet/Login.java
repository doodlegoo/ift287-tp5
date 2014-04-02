package ligueBaseballServlet;

import java.sql.*;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import ligueBaseball.GestionLigueBaseball;
import ligueBaseball.LigueBaseballException;


/**
 * Classe pour login système de gestion de bibliothèque
 * <P>
 * Système de gestion de bibliothèque &copy; 2004 Marc Frappier, Université de
 * Sherbrooke
 */

public class Login extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			HttpSession session = request.getSession();
			// fermer la session si elle a déjà été ouverte lors d'un appel
			// précédent
			// survient lorsque l'usager recharge la page login.jsp
			if (session.getAttribute("etat") != null) {
				// pour déboggage seulement : afficher no session et information
				System.out
						.println("GestionLigueBaseball: session déja crée; id="
								+ session.getId());
				// la méthode invalidate appelle le listener
				// BiblioSessionListener; cette classe est chargée lors du
				// démarrage de
				// l'application par le serveur (voir le fichier web.xml)
				session.invalidate();
				session = request.getSession();
				System.out.println("GestionLigueBaseball: session invalidée");
			}

			// lecture des paramètres du formulaire login.jsp
			String userIdOracle = request.getParameter("userIdBD");
			String motDePasseOracle = request.getParameter("motDePasseBD");
			String serveur = request.getParameter("serveur");
			String adresseIP = request.getParameter("adresseIP");
			String bd = request.getParameter("bd");

			// ouvrir une connexion avec la BD et créer les gestionnaires
			System.out.println("Login: session id="
					+ session.getId());
			GestionLigueBaseball baseball = new GestionLigueBaseball(serveur,adresseIP,bd,
					userIdOracle, motDePasseOracle);

			// stocker l'instance de GestionBibliotheque au sein de la session
			// de l'utilisateur
			session.setAttribute("baseball", baseball);

			// afficher le menu membre en appelant la page selectionMembre.jsp
			// tous les JSP sont dans /WEB-INF/
			// ils ne peuvent pas être appelés directement par l'utilisateur
			// seulement par un autre JSP ou un servlet
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("/WEB-INF/selectionMembre.jsp");
			dispatcher.forward(request, response);
			session.setAttribute("etat", new Integer(BaseballConstantes.CONNECTE));
		} catch (SQLException e) {
			List listeMessageErreur = new LinkedList();
			listeMessageErreur.add("Erreur de connexion au serveur");
			listeMessageErreur.add(e.toString());
			request.setAttribute("listeMessageErreur", listeMessageErreur);
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("/login.jsp");
			dispatcher.forward(request, response);
			// pour déboggage seulement : afficher tout le contenu de
			// l'exception
			e.printStackTrace();
		} catch (LigueBaseballException e) {
			e.printStackTrace();
			response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, e
					.toString());
		}
	}

	// Dans les formulaire, on utilise la méthode POST
	// donc, si le servlet est appelé avec la méthode GET
	// on retourne un page d'erreur, afin de ne pas permettre
	// à l'utilisateur d'appeler un servler directement
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.sendError(response.SC_INTERNAL_SERVER_ERROR, "Accès
		// invalide");
		doPost(request, response);
	}

} // class
