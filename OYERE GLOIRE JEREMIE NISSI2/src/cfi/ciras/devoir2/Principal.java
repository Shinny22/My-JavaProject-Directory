package cfi.ciras.devoir2;
import java.util.*;

public class Principal {


    public static void main(String[] args) {
    	
    	System.out.print("Entrez une chaine de caracteres : ");
    	Scanner scanner = new Scanner(System.in);
        String entrer = scanner.next();

        String inverse = reverseString(entrer);
        System.out.println("Inverse de la chaine : " + inverse );
    }
}
