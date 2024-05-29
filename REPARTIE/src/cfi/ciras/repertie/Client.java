package cfi.ciras.repertie;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class Client {
    public static void main(String[] args) {
        try {
            // Obtention du registre RMI
        	
            Registry registry = LocateRegistry.getRegistry(null);

            // Recherche de l'objet distant dans le Registre
            
            Hello stub = (Hello) registry.lookup("Hello");

            // Appel de la méthode distante
            
            stub.printMsg();
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}