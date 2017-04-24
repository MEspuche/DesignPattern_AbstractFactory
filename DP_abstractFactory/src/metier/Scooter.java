package metier;

public abstract class Scooter {

	protected String modele;
	protected String couleur;
	protected int puissance;
	
	public abstract void afficheCaracteristiques();

	public Scooter(String modele, String couleur, int puissance) {
		super();
		this.modele = modele;
		this.couleur = couleur;
		this.puissance = puissance;
	}
	
	
	
}
