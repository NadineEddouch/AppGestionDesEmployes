public class Departement {
    private int id;
    private String nomDepartement;
    private int nombreEmployes;

    public Departement() {}

    public Departement(int id, String nomDepartement, int nombreEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nombreEmployes = nombreEmployes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (obj.getClass() == Departement.class) {
            Departement d = (Departement) obj;
           return id == d.id && nomDepartement.equals(d.nomDepartement);
        }
        return false;
    }
    @Override
    public int hashCode() {
        return id * 31 + nomDepartement.toLowerCase().hashCode();
    }

    @Override
    public String toString() {
        return "Département {ID=" + id + ", Nom=" + nomDepartement + ", Nombre d'employés=" + nombreEmployes + "}";
    }
}
