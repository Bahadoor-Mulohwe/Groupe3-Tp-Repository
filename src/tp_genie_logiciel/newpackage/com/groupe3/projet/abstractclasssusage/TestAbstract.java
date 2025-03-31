package tp_genie_logiciel.newpackage.com.groupe3.projet.abstractclasssusage;

import java.sql.Connection;
import java.sql.SQLException;
import tp_genie_logiciel.newpackage.com.groupe3.projets.connectionsample.ConnectionFactory;

public class TestAbstract {

    public static void main(String[] args) {
        try {
            //Insertion des employés
            // Insertion de l'employé 1 dans la base de données
            Person e1 = new Employee();
            e1.setId(1);
            e1.setFirstName("BAHADOOR");
            e1.setLastName("MULOHWE");
            ((Employee) e1).setCnss("23LIAGELJ1070655");
            int result1 = e1.add(e1);
            if (result1 > 0) {
                System.out.println("Employée enregistré avec succès !");
            } else {
                System.out.println("L'insertion de l'employé 1 a echoué.");
            }
            // Insertion de l'employé 2 dans la base de données
            Person e2 = new Employee();
            e2.setId(2);
            e2.setFirstName("BAGALANE");
            e2.setLastName("RAMAZANI");
            ((Employee) e2).setCnss("23LIAGELJ1070938");

            int result2 = e2.add(e2);
            if (result2 > 0) {
                System.out.println("Employée enregistré avec succès !");
            } else {
                System.out.println("L'insertion de l'employé 2 a echoué.");
            }
            
            // Insertion des étudiants
            // Insertion de l'étudiant 1 dans la base de données
            Person et1 = new Student(
                    1, "BARAKA",
                    "BAHANE",
                    "23LIAGELJ1070754"
            );
            int result3 = et1.add(et1);
            if (result3 > 0) {
                System.out.println("L'etudiant 1 inserer avec succes!");
            } else {
                System.out.println(" ️L'insertion de l'etudiant 1 a echoué.");
            }

            // Insertion de l'étudiant 2 dans la base de données
            Person et2 = new Student(
                    2, "BARAKA",
                    "NDIBWAMI",
                    "20IGGJ008640"
            );
            int result4 = et2.add(et2);
            if (result4 > 0) {
                System.out.println("L'etudiant 2 inserer avec succes!");
            } else {
                System.out.println("L'insertion de l'etudiant 2 a echoué.");
            }
            // Insertion de l'étudiant 3 dans la base de données
            Person et3 = new Student(
                    3, "BARAKA",
                    "MANEGABE", 
                    "22LSILJ619987"
            );
            int result5 = et3.add(et3);
            if (result5 > 0) {
                System.out.println("L'etudiant 3 inserer avec succes!");
            } else {
                System.out.println("L'insertion de l'etudiant 3 a echoué.");
            }
            // Insertion de l'étudiant 4 dans la base de données
            Person et4 = new Student(
                    4,
                    "BAHATI", 
                    "KUBA",
                    "23LIAGELJ1070388"
            );
            int result6 = et4.add(et4);
            if (result6 > 0) {
                System.out.println("L'etudiant 4 inserer avec succes!");
            } else {
                System.out.println("L'insertion de l'etudiant 4 a echoué.");
            }
            // Insertion de l'étudiant 5 dans la base de données
            Person et5 = new Student(
                    5,
                    "BAMWISHO",
                    "KYALWAHI", 
                    "23LIAGELJ1070405"
            );
            int result7 = et5.add(et5);
            if (result7 > 0) {
                System.out.println("L'etudiant 5 inserer avec succes!");
            } else {
                System.out.println("L'insertion de l'etudiant 5 a echoué.");
            }
            // Insertion de l'étudiant 6 dans la base de données
            Person et6 = new Student(
                    6, 
                    "BANZA", 
                    "NAWEJ", 
                    "22LSILJ800246"
            );
            int result8 = et6.add(et6);
            if (result8 > 0) {
                System.out.println("L'etudiant 6 inserer avec succes!");
            } else {
                System.out.println("L'insertion de l'etudiant 6 a echoué.");
            }
            // Insertion de l'étudiant 7 dans la base de données
            Person et7 = new Student(
                    7, 
                    "BAHATI", 
                    "ABHUKO", 
                    "22LSILJ760258"
            );
            int result9 = et7.add(et7);
            if (result9 > 0) {
                System.out.println("L'etudiant 7 inserer avec succes!");
            } else {
                System.out.println("L'insertion de l'etudiant 7 a echoué.");
            }
            // Insertion de l'étudiant 8 dans la base de données
            Person et8 = new Student(
                    8, 
                    "BAHATI", 
                    "NTABOBA", 
                    "21IGGJ019333"
            );
            int result10 = et8.add(et8);
            if (result10 > 0) {
                System.out.println("L'etudiant 8 inserer avec succes!");
            } else {
                System.out.println("L'insertion de l'etudiant 8 a echoué.");
            }

            // Affichage employés et étudiants
            System.out.println("\n  Les employees inserer:");
            e1.showDynamicIdentity(e1.getId());
            System.out.println("-----------------------------------------");
            e2.showDynamicIdentity(e2.getId());
            System.out.println("-----------------------------------------");

            System.out.println("\n Les etudiants inserer : ");
            et1.showDynamicIdentity(et1.getId());
            System.out.println("------------------------------------------");
            et2.showDynamicIdentity(et2.getId());
            System.out.println("-----------------------------------------");
            et3.showDynamicIdentity(et3.getId());
            System.out.println("------------------------------------------");
            et4.showDynamicIdentity(et4.getId());
            System.out.println("-----------------------------------------");
            et5.showDynamicIdentity(et5.getId());
            System.out.println("------------------------------------------");
            et6.showDynamicIdentity(et6.getId());
            System.out.println("-----------------------------------------");
            et7.showDynamicIdentity(et7.getId());
            System.out.println("------------------------------------------");
            et8.showDynamicIdentity(et8.getId());
            System.out.println("-----------------------------------------");

        } catch (SQLException e) {
            System.out.println("Erreur lors de l'insertion des données dans la base de données !");
            e.printStackTrace();
        } finally {
            // Fermeture propre de la connexion
            try (Connection connection = ConnectionFactory.getConnection(ConnectionFactory.MYSQL_CONNECTION)) {
                if (connection != null) {
                    System.out.println("Connection fermée avec succès.");
                }
            } catch (Exception e2) {
                System.out.println("Problème lors de la fermeture de la connexion.");
                e2.printStackTrace();
            }
        }
    }
}
