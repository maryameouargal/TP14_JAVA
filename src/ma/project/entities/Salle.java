package ma.project.entities;

import java.util.ArrayList;
import java.util.List;

public class Salle implements Identifiable {
	private int id;
	private String code;
	private String libelle;
	private List<Machine> machines;

//    Constructeur utilisant source 

	public Salle(int id, String code, String libelle) {
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.machines = new ArrayList<>();
	}
//	Getters utilisant source 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<Machine> getMachines() {
		return machines;
	}

	public void setMachines(List<Machine> machines) {
		this.machines = machines;
	}

//	la methode toString utilsant source 

	@Override
	public String toString() {
		return "Salle n°" + id + " [" + code + "] : " + libelle;
	}
}