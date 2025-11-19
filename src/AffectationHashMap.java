import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {

    private HashMap<Employe, Departement> affectations = new HashMap<>();

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e)) {
            System.out.println("Erreur! Cet employé est déjà affecté à un département.");
        } else {
            affectations.put(e, d);
            System.out.println("L'employé " + e.getNom() + " a été ajouté dans le departement " + d.getNomDepartement() + " avec succées");
        }
    }

    public void afficherEmployesEtDepartements() {
        if (affectations.isEmpty()) {
            System.out.println("La liste des affectations est vide.");
            return;
        }
        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println(entry.getKey() + "est affecté dans le département " + entry.getValue());
        }
    }

    public void supprimerEmploye(Employe e) {
        if (affectations.remove(e) != null) {
            System.out.println("L'employé a été supprimé");
        } else {
            System.out.println("Cet employé est introuvable.");
        }
    }

    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
            System.out.println("cet affectation a été supprimé.");
        } else {
            System.out.println("Cette affectation n'existe pas.");
        }
    }

    public void afficherEmployes() {
        for (Employe e : affectations.keySet()) {
            System.out.println(e);
        }
    }

    public void afficherDepartements() {
        for (Departement d : affectations.values()) {
            System.out.println(d);
        }
    }

    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    public TreeMap<Employe, Departement> trierMap() {
        return new TreeMap<>(affectations);
    }


}