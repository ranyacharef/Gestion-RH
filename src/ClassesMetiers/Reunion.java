package ClassesMetiers;

import java.util.Date;

public class Reunion {
	
	
	private int idR;
    private String nomR;
    private Date dateR;
    private int heureDeb;
    private int heureFin;

    public Reunion(int idR, String nomR, Date dateR, int heureDeb, int heureFin) {
        this.idR = idR;
        this.nomR = nomR;
        this.dateR = dateR;
        this.heureDeb = heureDeb;
        this.heureFin = heureFin;
    }

    public int getIdR() {
        return idR;
    }

    public void setIdR(int idR) {
        this.idR = idR;
    }

    public String getNomR() {
        return nomR;
    }

    public void setNomR(String nomR) {
        this.nomR = nomR;
    }

    public Date getDateR() {
        return dateR;
    }

    public void setDateR(Date dateR) {
        this.dateR = dateR;
    }

    public int getHeureDeb() {
        return heureDeb;
    }

    public void setHeureDeb(int heureDeb) {
        this.heureDeb = heureDeb;
    }

    public int getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(int heureFin) {
        this.heureFin = heureFin;
    }
}
