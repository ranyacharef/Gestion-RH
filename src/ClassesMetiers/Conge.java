package ClassesMetiers;

import java.util.Date;


public class Conge {
	
	
	private int idC;
    private Date dateDeb;
    private Date dateFin;
    private Enum type;

    public Conge(int idC, Date dateDeb, Date dateFin, Enum type) {
        this.idC = idC;
        this.dateDeb = dateDeb;
        this.dateFin = dateFin;
        this.type = type;
    }

    public Conge(String s) {
		// TODO Auto-generated constructor stub
	}

	public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public Date getDateDeb() {
        return dateDeb;
    }

    public void setDateDeb(Date dateDeb) {
        this.dateDeb = dateDeb;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Enum getType() {
        return type;
    }

    public void setType(Enum type) {
        this.type = type;
    }

	
    
}
