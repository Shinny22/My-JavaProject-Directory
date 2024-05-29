package cfi.ciras.personne;

public class Auteur extends Personne implements All {
	

	private int numAuteur;

	Auteur(String Nom, String Prenom, int age, int numAuteur) {
		super(Nom, Prenom, age);
		this.numAuteur=numAuteur; 
	}

@Override

	
	public void AffichePersonne(){
	 super.AffichePersonne();
		System.out.println(" Votre numero est: "+ this.numAuteur);
	 }
	

}
