<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Affichage d'une Commande</title>
<link type="text/css" rel="stylesheet" href="style.css">
</head>
<body>
 <%-- Affichage de la chaîne "message" transmise par la
 servlet --%>
 <p class="info">${message }</p>
 <%-- Puis affichage des données enregistrées dans le bean
 "commande" transmis par la servlet --%>
 <p>Client</p>
  <%-- Les 5 expressions suivantes accèdent aux propriétés du
 client, qui est lui-même une propriété du bean commande --%>
 <p>Nom: ${commande.client.nom }</p>
  <p>Prenom : ${ commande.client.prenom }</p>
  <p>Adresse : ${ commande.client.adresse }</p>
  <p>Telephone : ${ commande.client.telephone }</p>
  <p>Email : ${ commande.client.email }</p>
  <p>Commande</p>
  <p>Date  : ${ commande.date }</p> 
  <p>Montant  : ${ commande.montant }</p> 
  <p>Mode de paiment  : ${ commande.modePaiment }</p> 
  <p>Statut du paiment  : ${ commande.statutPaiment }</p> 
  <p>Mode de livraison  : ${ commande.modeLivraison }</p> 
  <p>Statut de la livraison  : ${ commande.statutLivraison }</p>       
</body>
</html>