package ClassesMetiers;

import java.util.Date;

public class Fonctionnaire {
	
	
	
	  private int id  ;
	    private long CIN;
	    private String nom;
	    private String prenom;
	    private String poste;
	    private String statut;
	    private String sexe;
	    private Date dateEmb;
	    private Date dateNais;
	    
		public Fonctionnaire() {
			super();
			this.id = id;
			this.nom = nom;
			this.prenom = prenom;
			this.poste = poste;
			this.statut = statut;
			this.sexe=sexe;
			this.dateEmb=dateEmb;
			this.dateNais=dateNais;
	        this.CIN=CIN;
			
		}

	    public long getCIN() {
	        return CIN;
	    }

	    public void setCIN(long CIN) {
	        this.CIN = CIN;
	    }


		public Date getDateNais() {
			return dateNais;
		}


		public void setDateNais(Date dateNais) {
			this.dateNais = dateNais;
		}


		public String getSexe() {
			return sexe;
		}


		public void setSexe(String sexe) {
			this.sexe = sexe;
		}


		public Date getDateEmb() {
			return dateEmb;
		}


		public void setDateEmb(Date dateEmb) {
			this.dateEmb = dateEmb;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getNom() {
			return nom;
		}


		public void setNom(String nom) {
			this.nom = nom;
		}


		public String getPrenom() {
			return prenom;
		}


		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}


		public String getPoste() {
			return poste;
		}


		public void setPoste(String poste) {
			this.poste = poste;
		}


		public String getStatut() {
			return statut;
		}


		public void setStatut(String statut) {
			this.statut = statut;
		}
		
}
