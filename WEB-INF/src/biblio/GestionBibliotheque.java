package biblio;
/****************************************************************/
/* GestionBibliotheque.java                                                  */
/*                                                              */
/* Marc Frappier                                                */
/* Université de Sherbrooke                                     */
/****************************************************************/

import java.sql.*;

/**
 *<pre>
 *
 *Permet d'exécuter les transactions du système de gestion de bibliothèque
 *
 *Paramètres:0- site du serveur SQL ("local" ou "sti")
 *           1- user id pour établir une connexion avec le serveur SQL
 *           2- mot de passe pour le user id
 *</pre>
 */
public class GestionBibliotheque
{
public Connexion cx;
public Livre livre;
public Membre membre;
public Reservation reservation;
public GestionLivre gestionLivre;
public GestionMembre gestionMembre;
public GestionPret gestionPret;
public GestionReservation gestionReservation;
public GestionInterrogation gestionInterrogation;

public GestionBibliotheque(String serveur, String adresseIP, String bd, String user, String password)
  throws BiblioException, SQLException
{
// allocation des objets pour le traitement des transactions
cx = new Connexion(serveur, adresseIP, bd, user, password);
livre = new Livre(cx);
membre = new Membre(cx);
reservation = new Reservation(cx);
gestionLivre = new GestionLivre(livre);
gestionMembre = new GestionMembre(membre);
gestionPret = new GestionPret(livre, membre, reservation);
gestionReservation = new GestionReservation(livre, membre, reservation);
gestionInterrogation = new GestionInterrogation(cx);
}

public void fermer()
  throws SQLException
{
// fermeture de la connexion
cx.fermer();
}
}
