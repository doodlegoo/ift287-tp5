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
    <form action="im_mad" METHOD="POST" role="form">
			<BR> Nom equipe : <INPUT TYPE="TEXT" name="nomEquipeCreer" > <BR>
		    Nom terrain* : <INPUT TYPE="TEXT" name="terrainCreer" > <BR>
		    Adresse terrain* : <INPUT TYPE="TEXT" name="adresseCreer" > <BR>
			<INPUT TYPE="SUBMIT" VALUE="Afficher equipe" class="btn btn-default" >
		</FORM>
    	Need : nom equipe, nom-terrain*, adresse-terrain*
    	
  
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
				Nom d'equipe : <INPUT TYPE="TEXT" name="nomEquipeDelete" >  
			</p>
		</div>
  	<h3>Creer joueur</h3>
  		<div>
    		<p>
    		Nom joueur : <input type="text" name="nomJoueurCreer" > <br>
    		Nom d'equipe* : <input type="text" name="nomEquipeJoueurCreer" > <br>
    		Numero* : <input type="text" name="numeroJoueurCreer" > <br>
    		Date de debut : <input type="text" name="dateDebutJoueurCreer" > <br> 
    		Need: Nom joueur, (nom equipe et numero)*, date de debut*
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

	* signifie non nécessaire
<%@ include file="/WEB-INF/jspf/footer.jspf" %> 