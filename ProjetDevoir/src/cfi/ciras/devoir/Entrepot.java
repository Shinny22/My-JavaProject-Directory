package cfi.ciras.devoir;
import java.util.*;

public class Entrepot extends Produit {

	
	Entrepot(int identifiant, String désignation, double prixHorsTaxe) {
		super(identifiant, désignation, prixHorsTaxe);
		// TODO Auto-generated constructor stub
	}
	

	List <Produit> produit =new ArrayList<>();
		
		public void ajouter() {
			
			produit.add(new Produit(50,"Montre",1400));
			produit.add(new Produit(5,"BALAIN",1509));
			produit.add(new Produit(10,"SUCRE",1400));
			produit.add(new Produit(70,"BANANE",1400));
			
		}
		public boolean rechercher() {
			
			for(Produit element:produit) {
				
				if (element==produit){
						System.out.println("Lelement existe bele et bien dans la liste");	
				}		
			}
			return false;
		}
		
		@Override
		public String toString() {
			
			return désignation;
			
		}	
		
}
