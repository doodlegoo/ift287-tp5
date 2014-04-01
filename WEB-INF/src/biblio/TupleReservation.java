package biblio;
import java.sql.*;

/**
 * <pre>
 * TupleReservation.java
 *
 * Marc Frappier
 * Universit� de Sherbrooke
 *
 * Permet de repr�senter un tuple de la table des reservations.
 *</pre>
*/

public class TupleReservation {

  public int    idReservation;
  public int    idLivre;
  public int    idMembre;
  public Date   dateReservation;
}
