package cfi.ciras.solution;

public class Auteur extends Personne {

	private int numAuteur;

	public Auteur(String Nom, String Prenom, int age, int numAuteur)throws AgeExecption {
		super(Nom, Prenom, age);
		
		if (this.numAuteur<=0) throw new AgeExecption();
		else
		{
			
			this.numAuteur=numAuteur; 
		}
	}

@Override

	
	public void AffichePersonne(){
	 super.AffichePersonne();
		System.out.println(" Votre numero est: "+ this.numAuteur);
	 }
	

}
