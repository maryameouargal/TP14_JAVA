package ma.project;

import ma.project.entities.Machine;
import ma.project.entities.Salle;
import ma.project.service.MachineService;
import ma.project.service.SalleService;
import java.util.Date;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		System.out.println("INITIALISATION DU SYSTEME");

		SalleService salleService = new SalleService();
		MachineService machineService = new MachineService();

		// 1. Création des salles (Noms personnalisés)
		Salle salleDev = new Salle(1, "DEV-000001", "Salle des Développeurs IT");
		Salle salleReseau = new Salle(2, "RES-000002", "Salle Infrastructure Réseau");
		salleService.ajouter(salleDev);
		salleService.ajouter(salleReseau);

		// 2. Création des machines
		Machine pc1 = new Machine(1, "MAC-M1-2023", new Date(), salleDev);
		Machine pc2 = new Machine(2, "LENOVO-THINK", new Date(), salleDev);
		Machine serveur = new Machine(3, "CISCO-SWITCH", new Date(), salleReseau);

		machineService.ajouter(pc1);
		machineService.ajouter(pc2);
		machineService.ajouter(serveur);

		// 3. Affichage filtré (Étape 12)
		System.out.println("\n Machines dans la salle " + salleDev.getCode());
		List<Machine> machinesDev = machineService.getMachinesBySalle(1);
		for (int i = 0; i < machinesDev.size(); i++) {
			System.out.println(machinesDev.get(i));
		}

		// 4. Test de modification (Étape 13)
		System.out.println("\n Modification de la machine 1 ");
		pc1.setRef("MAC-M1-ULTIMATE");
		machineService.modifier(pc1);
		System.out.println("Nouvelle version : " + machineService.getById(1));

		// 5. Test de suppression
		System.out.println("\nSuppression du CISCO-SWITCH ");
		machineService.supprimer(serveur);

		System.out.println("Liste globale des machines restantes :");
		List<Machine> toutes = machineService.getAll();
		for (int i = 0; i < toutes.size(); i++) {
			System.out.println(toutes.get(i));
		}
	}
}