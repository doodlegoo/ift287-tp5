<%@ page import="java.util.*,java.text.*" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jspf/header.jspf" %> 

		<FORM ACTION="Login" METHOD="POST" role="form">
			<BR> User Id Oracle : <INPUT TYPE="TEXT" NAME="userIdBD" VALUE="postgres" >
		    Mot de passe Oracle : <INPUT TYPE="TEXT" NAME="motDePasseBD" VALUE="qwerty"><BR>
		    Serveur : <SELECT NAME="serveur">
		                <OPTION VALUE="postgres">postgres
		              </SELECT>
		    adresseIP : <INPUT TYPE="TEXT" NAME="adresseIP"  VALUE="localhost"><BR>
		     BD : <INPUT TYPE="TEXT" NAME="bd"  VALUE="postgres">
			<BR>
			<BR>
			<INPUT TYPE="SUBMIT" VALUE="Soumettre" class="btn btn-default" >
		</FORM>
		<BR>
		<%-- inclusion d'une autre page pour l'affichage des messages d'erreur--%>
		<jsp:include page="/WEB-INF/messageErreur.jsp" />
		<BR>
		<%-- affichage de la date et heure; --%>
		<%-- utile pour debogger et verifier si la page a �t� --%>
		<%-- par le fureteur --%>
		Date et heure normale de l'est: <%= DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.CANADA_FRENCH).format(new java.util.Date()) %>
		
<%@ include file="/WEB-INF/jspf/footerLogin.jspf" %> 