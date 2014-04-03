
<%@ include file="/WEB-INF/jspf/header.jspf" %> 

  <script src="//code.jquery.com/jquery-1.9.1.js"></script>
  <script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script>
  $(function() {
    $( "#accordion" ).accordion();
  });
  </script>

<div id="accordion">
  <h3>Creer equipe</h3>
  <div>
    <p>
    	Need : nom equipe, nom-terrain*, adresse-terrain*
    </p>
  </div>
  <h3>Afficher equipe</h3>
  <div>
    <p>
  	  Liste equipe, rien a rentrer
    </p>
  </div>
	<h3>Supprimer equipe</h3>
		<div>
			<p>
				Need: nom equipe
			</p>
		</div>
  	<h3>Creer joueur</h3>
  		<div>
    		<p>
    		Need:  Nom joueur, (nom equipe et numero)*, date de debut*
    		</p>
   		</div>
	  <h3>Afficher joueur/equipe</h3>
	  <div>
	    <p>
		   Option1 : rien
		   Option2 : equipe
	    </p>
	  </div>
	</div>		
<BR>
<%-- Appel du servlet Logout pour revenir au menu login--%>
<a href="Logout">Sortir</a>
<BR>

<%@ include file="/WEB-INF/jspf/footer.jspf" %> 