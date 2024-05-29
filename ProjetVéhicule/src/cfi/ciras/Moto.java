package cfi.ciras;

public class Moto extends Vehicule {

	
	private String Pedale;
	public Moto(String marque, String couleur, String modele, String Pedale) {
		super(marque, couleur, modele);
		// TODO Auto-generated constructor stub
		this.Pedale=Pedale;
		
	}
	
	@Override
	
	public void AfficheVehicule() {
		super.AfficheVehicule();
		System.out.println("Nombre De Pedale:"+Pedale);
			
		
	}

}
