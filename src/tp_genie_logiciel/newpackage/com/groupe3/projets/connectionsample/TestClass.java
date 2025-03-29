
package tp_genie_logiciel.newpackage.com.groupe3.projets.connectionsample;

import java.sql.Connection;
import java.sql.SQLException;

public class TestClass {

	public static void main(String[] args) {
		try {
			// Create connection through the ConnectionFactory class that use the Singleton
			// Pattern to hold the connection object
			Connection con = ConnectionFactory.getConnection(ConnectionFactory.MYSQL_CONNECTION);
			System.out.println(String.format("%s %s Avec la connexion string: %s", "Connecté avec succès à la base de données",
							con.getMetaData().getDatabaseProductName(), con.toString()));
			// Print connection string value
			System.out.println(ConnectionFactory.getConnection(ConnectionFactory.MYSQL_CONNECTION).toString());
		} catch (SQLException e) {
			System.out.println("Permettre de se connecter à la base de données");
			e.printStackTrace();
		}
	}

}
