package cfi.ciras.devoir;

public class Sensible extends Produit{

	private String emballage;
	
	public Sensible(int identifiant, String désignation, double prixHorsTaxe) {
		super(identifiant, désignation, prixHorsTaxe);
		// TODO Auto-generated constructor stub
		
	}
	public Sensible(int identifiant, String désignation, double prixHorsTaxe, String emballage) {
		 super(identifiant, désignation, prixHorsTaxe);
		this.emballage=emballage;
	}

	@Override
     public double fraisTransport() {
		
	  super.fraisTransport();
		
		return 2*((prixHorsTaxe*5)/100);
	}
	
	@Override
	public String toString() {
		
		return "Voici ma classe"+ this.emballage ;
		
	}
}
