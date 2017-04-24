package service;

import metier.Automobile;
import metier.AutomobileElectricite;
import metier.Scooter;
import metier.ScooterElectricite;

public class FabriqueVehiculeElectrique implements FabriqueVehicule {

	@Override
	public Automobile creeAutomobile(String modele, String couleur, int puissance, double espace) {
		return new AutomobileElectricite(modele, couleur, puissance, espace);
	}

	@Override
	public Scooter creeScooter(String modele, String couleur, int puissance) {
		return new ScooterElectricite(modele, couleur, puissance);
	}

}
