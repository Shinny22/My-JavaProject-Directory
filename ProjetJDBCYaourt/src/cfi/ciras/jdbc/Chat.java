package cfi.ciras.jdbc;


public class Chat {
	
	private String NomC;
	private String SonC;
	private String CouleurC;
	public void setNomC(String NomC) {
		// TODO Auto-generated method stub
		this.NomC = NomC;
	}
	public void setSonC(String SonC ) {
		// TODO Auto-generated method stub
		this.SonC = SonC;
		
	}
	public void setCouleurC(String CouleurC) {
		// TODO Auto-generated method stub
		this.CouleurC= CouleurC;
	}
	
	public String getNomC() {
		// TODO Auto-generated method stub
		return NomC ;
	}
	public String getSonC() {
		// TODO Auto-generated method stub
		return SonC;
	}
	public String getCouleurC() {
		// TODO Auto-generated method stub
		return CouleurC;
	}
	
	public String toString() {
		return "Nom : "+NomC+", Son : "+SonC+", Couleur : "+CouleurC;
	}

}
