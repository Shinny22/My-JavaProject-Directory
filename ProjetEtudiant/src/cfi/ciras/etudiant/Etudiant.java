package cfi.ciras.etudiant;

import java.sql.*;




public class Etudiant {

	public static void main (String[] args) {
		Connection connecteur = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			connecteur = DriverManager.getConnection("jdbc:mysql://localhost:3306/CFI",
					"root", ""); 
			//statement = connecteur.getConnexion()
			
			statement =connecteur.getConnexion().prepareStatement("INSERT INTO ETUDIANT (NUMERO, NOM,PRENOM, ADRESSE)" +
									"VALUES (?,?,?,?)");
			statement.setString(1, "001");
			statement.setString(2, "OYERE");
			statement.setString(3, "SHINNY"); 
			statement.setString(4, "32 RUE BRAZZAVILLE");
			statement.executeUpdate(); 
			statement.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}









	}
}
