package projet.beans;

public class Commande {
	private Client client;
	private String date;
	private Double montant;
	private String modePaiment;
	private String statutPaiment;
	private String modeLivraion;
	private String statutLivraison;
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client=client;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date=date;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant=montant;
	}
	public String getModePaiment() {
		return modePaiment;
	}
	public void setModePaiment(String modePaiment) {
		this.modePaiment=modePaiment;
	}
	public String getStatutPaiment() {
		return statutPaiment;
	}
	public void setStatutPaiment(String statutPaiment) {
		this.statutPaiment=statutPaiment;
	}
	public String getModeLivraison() {
		return modeLivraion;
	}
	public void setModeLivraison(String modeLivraion) {
		this.modeLivraion=modeLivraion;
	}
	public String getStatutLivraison() {
		return statutLivraison;
	}
	public void setStatutLivraison(String statutLivraison) {
		this.statutLivraison=statutLivraison;
	}

}
