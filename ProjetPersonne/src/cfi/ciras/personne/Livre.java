package cfi.ciras.personne;

public class Livre extends Auteur implements All {

	private int ISBN;
	private String titre;

	Livre(String Nom, String Prenom, int age, int numAuteur, int ISBN, String titre) {
		super(Nom, Prenom, age, numAuteur);
		this.ISBN=ISBN;
		this.titre=titre;
	}
@Override
public
	
	void AffichePersonne(){
		 super.AffichePersonne();
		System.out.println(" Votre ISBN est: "+ this.ISBN+" "+"ET de titre"+" "+this.titre);
	 }
	

}
