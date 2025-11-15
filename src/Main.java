public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(92, "Martin", "Claire", "Finance", 3);
        Employe e2 = new Employe(90, "Bernard", "Sophie", "Marketing", 2);
        Employe e3 = new Employe(93, "Dupont", "Julien", "Finance", 2);
        Employe e4 = new Employe(91, "Leroy", "Thomas", "IT", 1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);

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

        Departement d1 = new Departement(2, "RH", 8);
        Departement d2 = new Departement(1, "IT", 15);
        Departement d3 = new Departement(3, "Marketing", 10);

        gestionDepartements.ajouterDepartement(d1);
        gestionDepartements.ajouterDepartement(d2);
        gestionDepartements.ajouterDepartement(d3);

        System.out.println("-Liste des départements :");
        gestionDepartements.afficherDepartements();

        System.out.println("-Recherche du département RH : " + gestionDepartements.rechercherDepartement("RH"));

        System.out.println("-Tri par ID :");
        gestionDepartements.trierDepartementsParId();

        System.out.println("-Tri par Nom et Nombre d'Employés :");
        gestionDepartements.trierDepartementsParNomEtNombreEmployes();

    }
}
