<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Creation d'une commande</title>
<link type="text/css" rel="stylesheet" href="style.css">
</head>
<body>
<div>
<form methode="get" action="CreationCommande">
<fieldset>
<legend>Information client
</legend>
<label for="nomClient">Nom <span class="requis">*</span></label>
<input type="text" id="nomClient" name="nomClient" value="" size="20" maxlength="20" />
<br />
<label for="prenomClient">Prenom <span class="requis">*</span></label>
<input type="text" id="prenomClient" name="prenomClient" value="" size="20" maxlength="20" />
<br />
<label for="addresseClient">Addresse de livraison <span class="requis">*</span></label>
<input type="text" id="addresseClient" name="addresseClient" value="" size="20" maxlength="20" />
<br />
<label for="telephoneClient">Telephone <span class="requis">*</span></label>
<input type="text" id="telephoneClient" name="telephoneClient" value="" size="20" maxlength="20" />
<br />
<label for="emailClient">Email <span class="requis">*</span></label>
<input type="text" id="emailClient" name="emailClient" value="" size="20" maxlength="60" />
<br />
</fieldset>
<fieldset>
<legend>Information Commande</legend>
<label for="dateCommande">Dtae <span class="requis">*</span></label>
<input type="text" id="dateCommande" name="dateCommande" value="" size="20" maxlength="20" disabled/>
<br />
<label for="montantCommande">Montant <span class="requis">*</span></label>
<input type="text" id="montantCommande" name="montantCommande" value="" size="20" maxlength="20" />
<br />
<label for="modePaimentCommande">Mode de Paiment <span class="requis">*</span></label>
<input type="text" id="modePaimentCommande" name="modePaimentCommande" value="" size="20" maxlength="20" />
<br />
<label for="statutPaimentCommande">Statut du Paiment <span class="requis">*</span></label>
<input type="text" id="statutPaimentCommande" name="statutPaaimentCommande" value="" size="20" maxlength="20" />
<br />
<label for="modeLivraiseonCommande">Mode de Livraison <span class="requis">*</span></label>
<input type="text" id="modeLivraisonCommande" name="modeLivraisonCommande" value="" size="20" maxlength="20" />
<br />
<label for="statutLivraisonCommande">Statut de Livraison <span class="requis">*</span></label>
<input type="text" id="statutLivraisonCommande" name="statutLivraisonCommande" value="" size="20" maxlength="20" />
<br />
</fieldset>
<input type="submit" value="Valider" />
<input type="reset" value="Remettre a zero" /> <br />
</form>
</div>
</body>
</html>