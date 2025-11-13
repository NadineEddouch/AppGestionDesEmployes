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

        System.out.println("Liste des employés :");
        societe.displayEmploye();

        System.out.println("Tri par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("Tri par Département, Grade, Nom :");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();

        System.out.println("Recherche par département Finance :");
        societe.rechercherParDepartement("Finance").forEach(System.out::println);
    }
}
