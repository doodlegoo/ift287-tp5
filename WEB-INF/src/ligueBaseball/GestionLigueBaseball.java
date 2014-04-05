package ligueBaseball;
import java.sql.*;

/**
 *  * @author Mathieu Lavoie, Alex Provencher et Vincent Gagnon
 * classe intermedaire entre l'usager et les object qui parle a la base de donnee.
 */
public class GestionLigueBaseball
{
public Connexion cx;
public Equipe equipe;
public Terrain terrain;
public Arbitre arbitre;
public Joueur joueur;
public Match match;
static public GestionEquipe gestionEquipe;
static public GestionJoueur gestionJoueur;
static public GestionArbitre gestionArbitre;
static public GestionMatch gestionMatch;

/**
  * Ouvre une connexion avec la BD relationnelle et
  * alloue les gestionnaires de transactions et de tables.
  * <pre>
  * 
  * @param serveur SQL
  * @param bd nom de la bade de donnees
  * @param user user id pour etablir une connexion avec le serveur SQL
  * @param password mot de passe pour le user id
  *</pre>
  */
public GestionLigueBaseball(String serveur,String adresseIP, String bd, String user, String password)
  throws LigueBaseballException, SQLException
{
// allocation des objets pour le traitement des transactions
cx = new Connexion("postgres", "postgres", "postgres", "qwerty");
//cx = new Connexion(serveur, bd, user, password);

equipe = new Equipe(cx);
terrain = new Terrain(cx);
arbitre = new Arbitre(cx);
joueur = new Joueur(cx);
match = new Match(cx);

gestionEquipe = new GestionEquipe(equipe, terrain);
gestionArbitre = new GestionArbitre(arbitre, match);
gestionJoueur = new GestionJoueur(joueur, equipe);
gestionMatch = new GestionMatch(match, equipe);

}

public void fermer()
  throws SQLException
{
// fermeture de la connexion
cx.fermer();
}
}
