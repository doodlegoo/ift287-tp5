package ligueBaseballServlet;
import javax.servlet.http.*;

import biblio.GestionBibliotheque;

import java.sql.*;

/** Classe pour gestion des sessions
 *  <P>
 * Système de gestion de bibliothèque
 *  &copy; 2004 Marc Frappier, Université de Sherbrooke
 */

public class BaseballSessionListener implements HttpSessionListener
{
public void sessionCreated(HttpSessionEvent se)
{
}

public void sessionDestroyed(HttpSessionEvent se)
{
System.out.println("BaseballSessionListener " + se.getSession().getId());
GestionBibliotheque ligueBaseball = (GestionBibliotheque) se.getSession().getAttribute("biblio");
if (ligueBaseball != null)
  {
  System.out.println("connexion =" + ligueBaseball.cx);
  try {ligueBaseball.fermer();}
  catch (SQLException e)
    {
    System.out.println("Impossible de fermer la connexion");
    e.printStackTrace();
    }
  }
else
  System.out.println("biblio inaccessible.");
}
}
