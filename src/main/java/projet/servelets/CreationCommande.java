package projet.servelets;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import org.joda.time.DateTime;
//import org.joda.time.format.DateTimeFormat;
//import org.joda.time.format.DateTimeFormatter;
import projet.beans.Client;
import projet.beans.Commande;

/**
 * Servlet implementation class CreationCommande
 */
@WebServlet("/CreationCommande")
public class CreationCommande extends HttpServlet {
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   
        // TODO Auto-generated constructor stub
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom= request.getParameter("nomClient");
		String prenom=request.getParameter("prenomClient");
		String adresse=request.getParameter("addresseClient");
		String telephone=request.getParameter("telephoneClient");
		String email=request.getParameter("emailClient");
		//DateTime dt = new DateTime();
		//DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss");
		//String date = dt.toString(formatter);
		double montant =-1;
		try {
			montant=Double.parseDouble(request.getParameter("montantCommande"));
		} catch (NumberFormatException e) {
			montant=-1;
		}
		String modePaiment=request.getParameter("modePaimentCommande");
		String statutPaiment=request.getParameter("statutPaimentCommande");
		String modeLivraison = request.getParameter("modeLivraisonCommande" );
		String statutLivraison = request.getParameter("statutLivraisonCommande" );
		String message;
		
		 if ( nom.trim().isEmpty() || adresse.trim().isEmpty() || telephone.trim().isEmpty() || montant ==-1 
				 || modePaiment.isEmpty() || modeLivraison.isEmpty() ) {
			 message ="Error"; //"Erreur - Vous n'avez pas rempli tous les champs obligatoires. <br> <a href=\"creerCommande.jsp\">Cliquez ici</a> pour accéder au formulaire de création d'une commande.";
		 } else {
			 message = "Commande créée avec succès !";
		 }
		 
		    Client client = new Client();
	        client.setNom( nom );
	        client.setPrenom( prenom );
	        client.setAdresse( adresse );
	        client.setTelephone( telephone );
	        client.setEmail( email );
	        Commande commande = new Commande();
	        commande.setClient( client );
	        
	        LocalDateTime now = LocalDateTime.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	        String date = now.format(formatter);
	        commande.setDate( date );
	        commande.setMontant( montant );
	        commande.setModePaiment( modePaiment );
	        commande.setStatutPaiment( statutPaiment );
	        commande.setModeLivraison( modeLivraison );
	        commande.setStatutLivraison( statutLivraison );
	        /* Ajout du bean et du message à l'objet requête */
	        request.setAttribute( "commande", commande );
	        request.setAttribute( "message", message );
	        /* Transmission à la page JSP en charge de l'affichage des
	 données */
	        this.getServletContext().getRequestDispatcher(
	 "/afficherCommande.jsp" ).forward( request, response );
	    }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
