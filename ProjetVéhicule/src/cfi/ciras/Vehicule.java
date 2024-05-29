package cfi.ciras;


public class Vehicule {
	
	protected String Marque;
	protected String Couleur;
	protected String Modele;
 
	
	public Vehicule(String marque, String couleur, String modele) {
		//super();fonction de la classe object
		Marque = marque;
		Couleur = couleur;
		Modele = modele;
	}


	
	public void AfficheVehicule() {
		System.out.println("Le vehicule Entrer est:");
		System.out.println("Marque:" + Marque);
		System.out.println("Marque:" + Couleur);
		System.out.println("Marque:" +Modele);
		
		
	}
	
	
}
