<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Affichage des Clients</title>
<link type="text/css" rel="stylesheet" href="style.css">
</head>
<body>
<%--Affichage de la chaine "message" transmise par la servlet --%>
<p class="info">${message }</p>
<%-- Puis affichage des données enregistrées dans le bean
 "client" transmis par la servlet --%>
 <p>Nom : ${client.nom }</p>
 <p>Prenom : ${client.prenom }</p>
  <p>Adresse : ${client.adresse }</p>
   <p>Telephone : ${client.telephone }</p>
    <p>Email : ${client.email }</p>
</body>
</html>