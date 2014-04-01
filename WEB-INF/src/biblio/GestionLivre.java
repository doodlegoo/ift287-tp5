package biblio;
import java.sql.*;

/**
 *<pre>
 *GestionLivre.java
 *
 * Marc Frappier
 * Universit� de Sherbrooke
 *
 * Permet d'effectuer les transactions sur un livre.
 *</pre>
 */

public class GestionLivre {

  private Livre livre;
  private Connexion cx;

  /**
   * Creation d'une instance
   */
  public GestionLivre(Livre livre) {

    this.cx = livre.getConnexion();
    this.livre = livre;
  }

  /**
   * Ajout d'un nouveau livre dans la base de donn�es.
   * S'il existe deja, une exception est lev�e.
   */
  public void acquerir(int idLivre, String titre, String auteur, String dateAcquisition)
    throws SQLException, BiblioException, Exception
  {
    try {
        /* V�rifie si le livre existe d�ja */
        if (livre.existe(idLivre))
            throw new BiblioException("Livre existe deja: " + idLivre);

        /* Ajout du livre dans la table des livres */
        livre.acquerir(idLivre, titre, auteur, dateAcquisition);
        cx.commit();
        }
    catch (Exception e)
        {
//        System.out.println(e);
        cx.rollback();
        throw e;
        }
  }

  /**
   * Vente d'un livre.
   */
  public void vendre(int idLivre)
    throws SQLException, BiblioException, Exception
  {
    try {
        TupleLivre tupleLivre = livre.getLivre(idLivre);
        if (tupleLivre == null)
            throw new BiblioException("Livre inexistant: " + idLivre);
        if (tupleLivre.idMembre != 0)
            throw new BiblioException
                ("Livre " + idLivre + " prete a " + tupleLivre.idMembre);

        /* Suppression du livre. */
        int nb = livre.vendre(idLivre);
        if (nb == 0)
            throw new BiblioException
            ("Livre " + idLivre + " inexistant");
        cx.commit();
        }
    catch (Exception e)
        {
        cx.rollback();
        throw e;
        }
  }
}
