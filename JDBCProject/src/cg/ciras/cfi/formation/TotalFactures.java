package cg.ciras.cfi.formation;

import java.sql.*;

import javax.swing.JOptionPane;

public class TotalFactures {

	public static void main (String[] args) {
		Connection connexion = null;
		Statement statement = null;
		ResultSet resultSet = null;


		try {
			//Chargement de la classe du driver JDBC de MySQL.
			Class.forName("com.mysql.jdbc.Driver");
			//Ouverture de la connexion avec MySQL tournant sur la même 
			//machine
			connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/facturation", "root", "");

			statement = connexion.createStatement();
			//Création de la table FACTURE avec ses champs CLIENT, ARTICLE et MONTANT

			statement.executeUpdate("CREATE TABLE FACTURE(CLIENT VARCHAR(50), ARTICLE VARCHAR(255), MONTANT DECIMAL(9,2))");
			//Ajout d’enregistrements dans la table FACTURE.
			
			statement.executeUpdate("INSERT INTO FACTURE(CLIENT, ARTICLE, MONTANT) VALUES('SHINNY22','CDRx10',5000)");
			statement.executeUpdate("INSERT INTO FACTURE(CLIENT, ARTICLE, MONTANT) VALUES('JerômeIWANDZA','PC','200000')");
			statement.executeUpdate("INSERT INTO FACTURE(CLIENT, ARTICLE, MONTANT) VALUES('AlainEKONDZI','Imprimante','75000')");
			//Recherche dans la table FACTURE des articles commandés par Sophie Martin.
			

			resultSet = statement.executeQuery("SELECT article, montant FROM `facture` WHERE client='SHINNY22'");
			String articles = "";
		
			double montantTotal = 0;
			//Tant qu’il y a des factures...

			while (resultSet.next()) {
				//Récupération de l’article et du montant de la facture.

				articles+=resultSet.getString("ARTICLE")+" ";
				montantTotal+=resultSet.getDouble("MONTANT");
				

			}

			JOptionPane.showMessageDialog(null, " Articles : "+articles+" Montant total : "+montantTotal);
			/*Suppression de la table FACTURE (simplement pour pouvoir 
			exécuter 
			 * plusieurs fois l’application
			 * sans provoquer d’exception).*/

			statement.execute("DROP TABLE FACTURE");
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, " Classe introuvable "+e.getMessage());
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, " Erreur JDBC : "+e.getMessage());
		}
		finally {
			try {

				//Fermeture des objets utilisés pendant la connexion JDBC.
				if(resultSet!=null)
					resultSet.close();
				if(statement!=null)
					statement.close();
				if(connexion!=null)
					connexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} }
		System.exit(0);
	} 
}

