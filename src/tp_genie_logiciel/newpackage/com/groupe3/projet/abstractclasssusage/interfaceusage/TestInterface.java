
package tp_genie_logiciel.newpackage.com.groupe3.projet.abstractclasssusage.interfaceusage;

import java.sql.Connection;
import java.sql.SQLException;
import tp_genie_logiciel.newpackage.com.groupe3.projets.connectionsample.ConnectionFactory;
public class TestInterface {

	public static void main(String[] args) {
		try {
                        // Insertion des employés
			Person e3 = new Employee();
			((Employee) e3).setId(3);
			((Employee) e3).setFirstName("BAHADOOR");
			((Employee) e3).setLastName("MULOHWE");
			((Employee) e3).setCnss("23LIAGELJ1070655");
			e3.add();
			System.out.println("Insertion de l'employé 3 dans la base de données");

                        
			Person e4 = new Employee();
			((Employee) e4).setId(4);
			((Employee) e4).setFirstName("BAGALANE");
			((Employee) e4).setLastName("RAMAZANI");
			((Employee) e4).setCnss("23LIAGELJ1070938"); 
			e4.add();
			System.out.println("Insertion de l'employé 4 dans la base de données");

                        
			//Insertion des etudiants
			Person et9 = new Student(
                                9, 
                                "BARAKA", 
                                "BAHANE", 
                                "23LIAGELJ1070754"
                        );
			et9.add();
			System.out.println("Insertion de l'étudiant 9 dans la base de données");

                        
			Person et10 = new Student(
                                10, 
                                "BARAKA", 
                                "NDIBWAMI", 
                                "20IGGJ008640"
                        );
			et10.add();
                        System.out.println("Insertion de l'étudiant 10 dans la base de données");
                        
                        
                        Person et11 = new Student(
                                11, "BARAKA",
                                "MANEGABE",
                                "22LSILJ619987"
                        );
                        et11.add();
                        System.out.println("Insertion de l'étudiant 11 dans la base de données");
                        
                        Person et12 = new Student(
                                12, "BAHATI",
                                "KUBA", 
                                "23LIAGELJ1070388"
                        ); 
                        et12.add();
                        System.out.println("Insertion de l'étudiant 12 dans la base de données");
                        
                        
                        Person et13 = new Student(
                                13,
                                "BAMWISHO", 
                                "KYALWAHI",
                                "23LIAGELJ1070405"
                        );
                        et13.add();
                        System.out.println("Insertion de l'étudiant 13 dans la base de données");
                        
                        Person et14 = new Student(
                                14,
                                "BANZA",
                                "NAWEJ", 
                                "22LSILJ800246"
                        );
                        et14.add();
                        System.out.println("Insertion de l'étudiant 14 dans la base de données");
                        
                         Person et15 = new Student(
                                15, 
                                "BAHATI", 
                                "ABHUKO", 
                                "22LSILJ760258"
                        );
                        et15.add();
                        System.out.println("L'etudiant 15 inserer avec succes!");
                        
                         Person et16= new Student(
                                16, 
                                "BAHATI", 
                                "NTABOBA", 
                                "21IGGJ019333"
                        );
                        et16.add();
                        System.out.println("Insertion de l'étudiant 16 dans la base de données");
                        
    
                        e3.showDynamicIdentity(((Employee) e3).getId());
			System.out.println("-----------------------------------------");
			e4.showDynamicIdentity(((Employee) e4).getId());
			System.out.println("-----------------------------------------");
       
			// Show ETUDIANT
			et9.showDynamicIdentity(((Student) et9).getId());
			System.out.println("------------------------------------------");
			et10.showDynamicIdentity(((Student) et10).getId());
			System.out.println("-----------------------------------------");
                        et11.showDynamicIdentity(((Student) et11).getId());
			System.out.println("------------------------------------------");
			et12.showDynamicIdentity(((Student) et12).getId());
			System.out.println("-----------------------------------------");
                        et13.showDynamicIdentity(((Student) et13).getId());
			System.out.println("------------------------------------------");
			et14.showDynamicIdentity(((Student) et14).getId());
			System.out.println("-----------------------------------------");
                        et15.showDynamicIdentity(((Student) et15).getId());
			System.out.println("------------------------------------------");
			et16.showDynamicIdentity(((Student) et16).getId());
			System.out.println("-----------------------------------------");
          
		} catch (SQLException e) {
			System.out.println("Echec d'insertion dans la base de données");
			e.printStackTrace();
		} finally {
			try {
				// Properly close connection to the DataBase even if error occurs, by using
				// try-with-resources
				try (Connection connection = ConnectionFactory.getConnection(ConnectionFactory.MYSQL_CONNECTION)) {
				}
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
				e2.printStackTrace();
			}
		}

	}

}
