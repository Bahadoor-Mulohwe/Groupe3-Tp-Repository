
package tp_genie_logiciel.newpackage.com.groupe3.projets.connectionsample;


import java.sql.Connection;
import java.sql.SQLException;

public interface IConnection {
	Connection getConnection() throws SQLException;
}

