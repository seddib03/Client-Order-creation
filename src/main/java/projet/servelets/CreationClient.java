package projet.servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import projet.beans.Client;
import projet.beans.Commande;

/**
 * Servlet implementation class CreationClient
 */
@WebServlet("/CreationClient")
public class CreationClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
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
		String message;
		
		if(nom.trim().isEmpty() || adresse.trim().isEmpty() || telephone.trim().isEmpty()) {
			message="Error"; //"Erreur - Vous n'avez pas rempli tous" //les\r\n"
					//+ " champs obligatoires. <br> <a href=\\\"creerClient.jsp\\\">Cliquez\r\n"
					//+ " ici</a> pour accéder au formulaire de création d'un client.\";
		} else {
			message="Client cree avec succes!";
		}
		Client client = new Client();
		client.setNom(nom);
		client.setPrenom(prenom);
		client.setAdresse(adresse);
		client.setTelephone(telephone);
		client.setEmail(email);
		
		request.setAttribute("client", client);
		request.setAttribute("message", message);
		
		this.getServletContext().getRequestDispatcher("/afficherClient.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
