package biblio;
import java.sql.*;

/**
 * <pre>
 * TupleLivre.java
 *
 * Marc Frappier
 * Universit� de Sherbrooke
 *
 * Permet de repr�senter un tuple de la table des livres.
 *</pre>
*/

public class TupleLivre {

  public int    idLivre;
  public String titre;
  public String auteur;
  public Date   dateAcquisition;
  public int    idMembre;
  public Date   datePret;

public TupleLivre()
{
}

public TupleLivre(int idLivre, String titre, String auteur,
                  Date dateAcquisition, int idMembre, Date datePret)
{
this.idLivre = idLivre;
this.titre = titre;
this.auteur = auteur;
this.dateAcquisition = dateAcquisition;
this.idMembre = idMembre;
this.datePret = datePret;
}
}
