package cfi.ciras;

public class Camion extends Vehicule{
	 
	private int Autonnage; 

	public Camion(String marque, String couleur, String modele, int Autonnage) {
		super(marque, couleur, modele);
		// TODO Auto-generated constructor stub
		this.Autonnage=Autonnage;
		
	}
	@Override
	public void AfficheVehicule() {
		super.AfficheVehicule();
		System.out.println("Nombre De Tonnage:"+Autonnage);
			
		
	}
	

}
