package cfi.ciras.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;





public class Connexion {

	public static void main(String Arg[])
	{
		
		
		Connection connexion =null;
		PreparedStatement prepare = null;
		ResultSet resultat = null;
		
		try {
			// Chargement de la classe du driver
			Class.forName("com.mysql.jdbc.Driver");
			
			connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Zoo", "root", "");
			
			//ajouterChat(connexion, prepare);
			//afficheChat(connexion,prepare,resultat);
			
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}catch(SQLException e1) {
			
			e1.printStackTrace();
		}
	
	}
	public static void ajouterChat(Connection c, PreparedStatement ps) throws SQLException {
		Scanner console = new Scanner(System.in);
		Chat c1 = new Chat();
		System.out.print("Nom : ");
		c1.setNomC(console.nextLine());
		System.out.print("Son : ");
		c1.setSonC(console.nextLine());
		System.out.print("Couleur : ");
		c1.setCouleurC(console.nextLine());
		console.nextLine();
		ps = c.prepareStatement("insert into Chat(Nom, Son, Couleur) values (?,?,?)");
		ps.setString(1, c1.getNomC());
		ps.setString(2, c1.getSonC());
		ps.setString(3, c1.getCouleurC());
		ps.executeUpdate();
		console.close();
	}
	
	public static void afficheChat(Connection c, PreparedStatement ps, ResultSet rs) throws SQLException  {
		Chat C1 = new Chat();
		ps = c.prepareStatement("select * from Chat");
		rs = ps.executeQuery();
		
			while(rs.next()) {
				C1.setNomC(rs.getString("Nom"));
				C1.setSonC(rs.getString("Son"));
				C1.setCouleurC(rs.getString("Couleur"));
				System.out.println(C1.toString());
			}
			
			System.out.println(C1.toString());
		
	}
	
	
	
	
	
}
