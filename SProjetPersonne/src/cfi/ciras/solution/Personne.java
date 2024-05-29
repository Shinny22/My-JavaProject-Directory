package cfi.ciras.solution;

public class Personne {
	protected String Nom ;
	protected String Prenom;
	protected int age;
	  
	 public Personne(String Nom, String Prenom, int age)
	  {
		  this.Nom=Nom;
		  this.Prenom=Prenom;
		  this.age=age;
	  }
	  
	  public void AffichePersonne() {
		  
		  System.out.println("Vous Vous appelez: "+this.Nom+ " "+ this.Prenom+ " " +"et vous avez: "+  this.age+"ans");
	  }
	}
