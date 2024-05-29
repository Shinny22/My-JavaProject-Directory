package cfi.ciras.repertie;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String args[]) {
        try {
            // Instantiation de la classe d'implémentation
            Hello obj = new ImplExample();

            // Création et liage de l'objet distant au Registre
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("Hello", obj);

            System.out.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
} 
