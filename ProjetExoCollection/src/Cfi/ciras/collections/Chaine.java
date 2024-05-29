package Cfi.ciras.collections;
//import java.util.*;
import java.lang.String;


public class Chaine {

	private String mot;
	
	public Chaine(String unString ) {
	  this.mot=unString;
	}
	
	public void Affiche() {
		
		System.out.print("les mot est  "+ this.mot+" ");
	}
	public int longueur() {
		return   this.mot.length();
		
	}
	
	public String ajoutChaine(String ch){
		
		System.out.println("la chaine concaténnée devient :"+this.mot.concat(ch));
		return this.mot.concat(ch);
		
	}
	
	public char[] inverse()
	{
		
		char[]tab= this.mot.toCharArray();
		
		return tab ; 
				
	}
	
	public void funInverse(char[] tab )
	{
		for(int i = tab.length; i == 0 ; i--)
		{
			System.out.println(tab[i]);
		}
	}
	
	
	
}
