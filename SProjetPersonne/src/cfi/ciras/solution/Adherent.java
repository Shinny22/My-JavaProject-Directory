package cfi.ciras.solution;

public class Adherent extends Personne {
	private int numAdherent;

	public Adherent(String Nom, String Prenom, int age,int numAdherent) {
		super(Nom, Prenom, age);
		 
		  this.numAdherent=numAdherent;
	}
	@Override
	
	public void AffichePersonne(){
		 super.AffichePersonne();
		System.out.println(" Votre numero est: "+ this.numAdherent);
	 }
	
	}

