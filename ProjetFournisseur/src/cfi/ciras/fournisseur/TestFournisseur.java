package cfi.ciras.fournisseur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.*;




public class TestFournisseur {

	public static void main(String Arg[])
	{
		
		
		Connection connexion =null;
		PreparedStatement prepare = null;
		ResultSet resultat = null;
		
		try {
			// Chargement de la classe du driver
			Class.forName("com.mysql.jdbc.Driver");
			
			connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Entreprise", "root", "");
			
			 while (true) {
				 
				 
				   System.out.println("*********************************************");
	                          
				               System.out.println("          MENU PRINCIPAL             ");
	                           System.out.println("        1. CRUD FOURNISSEUR          ");
	                           System.out.println("        2. AUTRES TRAITEMENTS        ");
	                           System.out.println("        3. FIN DU PROGRAMME          ");
	                
	                System.out.println("*********************************************");
	                System.out.println(" ->  ");
	                Scanner scanner = new Scanner(System.in);
	                int choix = scanner.nextInt();
	                
	                if (choix == 1) {
	                	
	                	//ajouterFournisseur(connexion,prepare);
	        			//afficheFournisseur(connexion,prepare,resultat);
	        			//supprimerFournisseur(connexion,prepare);
	        			//modifierFournisseur(connexion,prepare);
	        			//AFFICHER LA LISTE DES 10 FOURNISSEUR
	                 List<Fournisseur> fournisseurs = new ArrayList<>();
	                 fournisseurs=getTop10Fournisseurs(connexion);
	                 System.out.println(fournisseurs);
	                 
	                } else if (choix == 2) {
	                	
	                   System.out.println(" 1. AUTRE TRAITEMENT 1");
	                   System.out.println(" 2. AUTRE TRAITEMENT 2");
	                   System.out.println(" 3. AUTRE TRAITEMENT 3");
	                   System.out.println(" 4. AUTRE TRAITEMENT 4");
	                   System.out.println(" 5.RETOUR");
	                } else if (choix == 3) {
	                    System.out.println("Fin du programme.");
	                    break;
	                } else {
	                    System.out.println("Choix invalide.");
	                }
	            }
			 
			//AFFICHER LA LISTE DES 10 FOURNISSEUR
			 
			 //getTop10Fournisseurs(connexion );
			
			
			
		} catch (ClassNotFoundException f1) {
			// TODO Auto-generated catch block
			f1.printStackTrace();
			
		}catch(SQLException f1) {
			
			f1.printStackTrace();
		}
	
	}
	
	public static void ajouterFournisseur(Connection c, PreparedStatement ps) throws SQLException {
		Scanner console = new Scanner(System.in);
		Fournisseur F1 = new Fournisseur();
		
		System.out.print("Nom : ");
		F1.setNom(console.nextLine());
		
		System.out.println("Aresse : ");
		F1.setAdresse(console.nextLine());

		System.out.println("Email : ");
		F1.setEmail(console.nextLine());
		
		System.out.print("ID : ");
		F1.setID(console.nextInt());
		
		
		
		console.nextLine();
		
		ps = c.prepareStatement("insert into Fournisseur(id,Nom, Adresse, Email) values (?,?,?,?)");
		ps.setInt(1, F1.getID());
		ps.setString(2, F1.getNom());
		ps.setString(3, F1.getAdresse());
		ps.setString(4, F1.getEmail());
		ps.executeUpdate();
		console.close();
	}
	
	public static void afficheFournisseur(Connection c, PreparedStatement ps, ResultSet rs) throws SQLException  {
		Fournisseur F1 = new Fournisseur();
		ps = c.prepareStatement("select * from Fournisseur;");
		rs = ps.executeQuery();
		
			while(rs.next()) {
				F1.setID(rs.getInt("id"));
				F1.setNom(rs.getString("Nom"));
				F1.setAdresse(rs.getString("Adresse"));
				F1.setEmail(rs.getString("Email"));
				System.out.println(F1.toString());
			}
			
			System.out.println(F1.toString());
		
	}
	
	public static void supprimerFournisseur(Connection c, PreparedStatement ps) throws SQLException {
		Scanner console = new Scanner(System.in);
		System.out.print("Donner le numero du fournisseur   supprimer : ");
		Fournisseur F1 = new Fournisseur();
		F1.setID(console.nextInt());
		ps = c.prepareStatement("delete from Fournisseur where id=?");
		ps.setInt(1, F1.getID());
		ps.executeUpdate();
		console.close();
	}
	

	public static void modifierFournisseur(Connection c, PreparedStatement ps) throws SQLException {
		
		Scanner console = new Scanner(System.in);
		System.out.print("Donner le numero du fournisseur à modifier : ");
		Fournisseur F1 = new Fournisseur();
		F1.setID(console.nextInt());
		console.nextLine();
		
		System.out.print("Donner la nouvelle adresse du fournisseur à modifier : ");
		F1.setAdresse(console.nextLine());
		
		//System.out.print("Donner le nouveau nom du fournisseur à modifier : ");
		//F1.setNom(console.nextLine());
		
		//System.out.print("Donner la nouvelle adresse mail du fournisseur à modifier : ");
		//F1.setEmail(console.nextLine());
		
		ps = c.prepareStatement("update etudiant set Adresse=? where id=?");
		ps.setString(1, F1.getAdresse());
		ps.setInt(2, F1.getID());
		ps.executeUpdate();
		console.close();
	}
	

	public static List<Fournisseur> getTop10Fournisseurs(Connection c) {
        List<Fournisseur> fournisseurs = new ArrayList<>();
        
        try {
            PreparedStatement preparedStatement = c.prepareStatement("SELECT * FROM Fournisseur LIMIT 10;");
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                Fournisseur F1 = new Fournisseur();
                F1.setID(resultSet.getInt("id"));
                F1.setNom(resultSet.getString("Nom"));
                F1.setAdresse(resultSet.getString("Adresse"));
                F1.setEmail(resultSet.getString("Email"));
                fournisseurs.add(F1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return fournisseurs;
    }

   
}

