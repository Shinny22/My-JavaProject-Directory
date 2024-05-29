package cfi.ciras.devoir;

public class Produit {

	
	protected int identifiant;
	protected  String désignation;
	protected  double prixHorsTaxe;
	
	
	public double fraisTransport() {
		
		return prixHorsTaxe*5/100;
	}
	Produit(int identifiant,String désignation,double prixHorsTaxe){
		
		this.identifiant=identifiant;
		this.désignation=désignation;
		this. prixHorsTaxe= prixHorsTaxe;
		
	}
	@Override
	public String toString() {
		
		return "Voici le produit :"+this.désignation+this.identifiant+this.prixHorsTaxe;
		
	}
	
	
}
