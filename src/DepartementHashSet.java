import java.util.*;

public class DepartementHashSet implements IDepartement<Departement> {

    private HashSet<Departement> departements;

    public DepartementHashSet() {
        this.departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement t) {
        departements.add(t);
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        for (Departement d : departements) {
            if (d.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement t) {
        return departements.contains(t);
    }

    @Override
    public void supprimerDepartement(Departement t) {
        departements.remove(t);
    }

    @Override
    public void afficherDepartements() {
        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    @Override
    public void trierDepartementsParId() {
        List<Departement> list = new ArrayList<>(departements);
        Collections.sort(list, new Comparator<Departement>() {
            @Override
            public int compare(Departement d1, Departement d2) {
                return Integer.compare(d1.getId(), d2.getId());
            }
        });

        for (Departement d : list) {
            System.out.println(d);
        }
    }

    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        List<Departement> list = new ArrayList<>(departements);
        Collections.sort(list, new Comparator<Departement>() {
            @Override
            public int compare(Departement d1, Departement d2) {
                int cmp = d1.getNomDepartement().compareTo(d2.getNomDepartement());
                if (cmp != 0) return cmp;
                return Integer.compare(d1.getNombreEmployes(), d2.getNombreEmployes());
            }
        });

        for (Departement d : list) {
            System.out.println(d);
        }
    }

}







