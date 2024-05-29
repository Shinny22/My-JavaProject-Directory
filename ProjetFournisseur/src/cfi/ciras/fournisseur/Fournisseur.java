package cfi.ciras.fournisseur;

public class Fournisseur {

	int id;
	String Nom;
	String Adresse;
	String Email;
	
	public int setID(int id) {
		 return this.id= id;
	}
	
	public void setNom(String Nom) {
		// TODO Auto-generated method stub
		this.Nom = Nom;
	}
	public void setAdresse(String Adresse ) {
		// TODO Auto-generated method stub
		this.Adresse  = Adresse ;
		
	}
	
	public void setEmail(String Email) {
		// TODO Auto-generated method stub
		this.Email= Email;
	}
	
	public int getID() {
		// TODO Auto-generated method stub
		return id;
	}
	
	public String getNom() {
		// TODO Auto-generated method stub
		return Nom;
	}
	public String getAdresse() {
		// TODO Auto-generated method stub
		return Adresse;
	}
	public String getEmail() {
		// TODO Auto-generated method stub
		return Email;
	}
	
	public String toString() {
		return "ID : " +id+",Nom : "+Nom+", Adresse : "+Adresse+", Email : "+Email;
	}
	
	
}
