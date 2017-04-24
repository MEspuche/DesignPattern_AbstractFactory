package metier;

public class ScooterElectricite extends Scooter {

	public ScooterElectricite(String modele, String couleur, int puissance) {
		super(modele, couleur, puissance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afficheCaracteristiques() {
		System.out.println("Scooter electrique de modele "+modele+" de couleur "+couleur+" de puissance "+puissance);
		
	}

}
