package ma.project.entities;

import java.util.Date;

public class Machine implements Identifiable {
	private int id;
	private String ref;
	private Date dateAchat;
	private Salle salle;

//  Constructeur utilisant source 

	public Machine(int id, String ref, Date dateAchat, Salle salle) {
		this.id = id;
		this.ref = ref;
		this.dateAchat = dateAchat;
		this.salle = salle;
	}
//	Getters utilisant source 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

//	la methode toString utilsant source 
	@Override
	public String toString() {
		String nomSalle = (salle != null) ? salle.getCode() : "Non assignée";
		return "Machine n°" + id + " | Réf: " + ref + " | Salle: " + nomSalle;
	}
}