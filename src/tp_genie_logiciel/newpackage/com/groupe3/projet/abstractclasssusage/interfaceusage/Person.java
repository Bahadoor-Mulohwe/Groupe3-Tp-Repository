
package tp_genie_logiciel.newpackage.com.groupe3.projet.abstractclasssusage.interfaceusage;

import java.sql.SQLException;

public interface Person {
	void showIdentity();
	void showDynamicIdentity(int id) throws SQLException;
	int add() throws SQLException;
}
