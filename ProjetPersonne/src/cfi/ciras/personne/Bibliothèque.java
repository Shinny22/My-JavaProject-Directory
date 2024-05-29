package cfi.ciras.personne;
import java.io.IOException;
import java.lang.String;
import java.util.Scanner;

public class Bibliothèque {
	
  public static void main(String[] args)
   {
	
	  Scanner Console=new Scanner(System.in);
	  Adherent AD1=new Adherent("OYERE","Shinny",20,0001);  
	 Livre LIV1=new Livre("OYERE","Shinny",20,0001,02,"My LIFE");
	 Auteur AUT1=new Auteur("OYERE","Shinny",20,0001);
	 AD1.AffichePersonne();
	 LIV1.AffichePersonne();
	
	 
   }
	
}
