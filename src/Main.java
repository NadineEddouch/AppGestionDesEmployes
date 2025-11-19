import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(92, "Martin", "Claire", "Finance", 3);
        Employe e2 = new Employe(90, "Bernard", "Sophie", "Marketing", 2);
        Employe e3 = new Employe(93, "Dupont", "Julien", "Finance", 2);
        Employe e4 = new Employe(91, "Leroy", "Thomas", "IT", 1);
        Employe e5 = new Employe(94, "Ducray", "lauren", "RH", 1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);
        societe.ajouterEmploye(e5);

        System.out.println("-Liste des employés :");
        societe.displayEmploye();

        System.out.println("-Tri par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("-Tri par Département, Grade, Nom :");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();

        System.out.println("-Recherche par département Finance :");
        societe.rechercherParDepartement("Finance").forEach(System.out::println);

        //Prosit 9: Gestion des Départements
        DepartementHashSet gestionDepartements = new DepartementHashSet();

        Departement d1 = new Departement(2, "RH", 6);
        Departement d2 = new Departement(1, "IT", 15);
        Departement d3 = new Departement(3, "Marketing", 10);
        Departement d4 = new Departement(4, "Finance", 8);

        gestionDepartements.ajouterDepartement(d1);
        gestionDepartements.ajouterDepartement(d2);
        gestionDepartements.ajouterDepartement(d3);
        gestionDepartements.ajouterDepartement(d4);

        System.out.println("\n-Liste des départements :");
        gestionDepartements.afficherDepartements();

        System.out.println("-Recherche du département RH : " + gestionDepartements.rechercherDepartement("RH"));

        System.out.println("-Tri par ID :");
        gestionDepartements.trierDepartementsParId();

        System.out.println("-Tri par Nom et Nombre d'Employés :");
        gestionDepartements.trierDepartementsParNomEtNombreEmployes();

        //Prosit 10 : Gestion des Affectations Employés–Départements
        AffectationHashMap affectation = new AffectationHashMap();

        affectation.ajouterEmployeDepartement(e1, d4);
        affectation.ajouterEmployeDepartement(e2, d3);
        affectation.ajouterEmployeDepartement(e3, d4);
        affectation.ajouterEmployeDepartement(e4, d2);
        affectation.ajouterEmployeDepartement(e5, d1);

        System.out.println("\n-Affichage des employes et leurs departements :");
        affectation.afficherEmployesEtDepartements();

        System.out.println("-Test a propos l'ajout d'un même employé dans deux départements :");
        affectation.ajouterEmployeDepartement(e1, d1);

        System.out.println("-Suppression de l'employé Bernard Sophie :");
        affectation.supprimerEmploye(e2);
        affectation.afficherEmployesEtDepartements();

        System.out.println("-Suppression d'une affectation :");
        affectation.supprimerEmployeEtDepartement(e3, d4);
        affectation.afficherEmployesEtDepartements();

        System.out.println("-Liste des employés affectés :");
        affectation.afficherEmployes();

        System.out.println("-Liste des départements affectés :");
        affectation.afficherDepartements();

        System.out.println("-Recherche de l'employé Martin Claire : " + affectation.rechercherEmploye(e1));
        System.out.println("-Recherche de l'employé Julien Dupont : " + affectation.rechercherEmploye(e3));
        System.out.println("-Recherche du département IT : " + affectation.rechercherDepartement(d2));

        System.out.println("-Tri des employés par ID :");
        TreeMap<Employe, Departement> sorted = affectation.trierMap();
        for (Map.Entry<Employe, Departement> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
