<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Creation d'un client</title>
<link type="text/css" rel="stylesheet" href="style.css">
</head>
<body>
<div>
<form methode="get" action="CreationClient">
<fieldset>
<legend>Information client</legend>
<label for="nomClient">Nom <span class="requis">*</span></label>
<input type="text" id="nomClient" name="nomClient" value="" size="20" maxlength="20" />
<br />
<label for="prenomClient">Prenom</label>
<input type="text" id="prenomClient" name="prenomClient" value="" size="20" maxlength="20" />
<br />
<label for="addresseClient">Addresse</label>
<input type="text" id="addresseClient" name="addresseClient" value="" size="20" maxlength="20" />
<br />
<label for="telephoneClient">Telephone</label>
<input type="text" id="telephoneClient" name="telephoneClient" value="" size="20" maxlength="20" />
<br />
<label for="emailClient">Email</label>
<input type="text" id="emaailClient" name="emailClient" value="" size="20" maxlength="20" />
<br />
</fieldset>
<input type="submit" value="Valider" />
<input type="reset" value="Remettre a zero" />
<br />
</form>
</div>
</body>
</html>