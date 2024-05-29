package cfi.ciras;

public class Voiture extends Vehicule {
	
	private int NbRoue;

	public Voiture(String marque, String couleur, String modele, int NbRoue) {
		super(marque, couleur, modele);
		// TODO Auto-generated constructor stub
		this.NbRoue=NbRoue;
	}
	
	@Override
	public void AfficheVehicule() {
		super.AfficheVehicule();
		System.out.println("Nombre De Roues:"+NbRoue);
			
		
	}
	

	public int getNbRoue() {
		return NbRoue;
	}

	public void setNbRoue(int nbRoue) {
		NbRoue = nbRoue;
	}


	

}

