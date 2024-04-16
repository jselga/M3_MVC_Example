package Model;

public class Curs {

    private int idCurs;

    private String nom;

    public Curs(int idCurs, String nom) {
        this.idCurs = idCurs;
        this.nom = nom;
    }

    public int getIdCurs() {
        return idCurs;
    }

    public void setIdCurs(int idCurs) {
        this.idCurs = idCurs;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Curs{" + "idCurs=" + idCurs + ", nom=" + nom + '}';
    }

}
