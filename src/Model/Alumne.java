package Model;

public class Alumne implements Comparable<Alumne> {

    private int codi;

    private String nom;

    private Curs curs;

    private String access;

    private boolean dual;

    private double notaA;

    public Alumne(int codi, String nom, Curs curs, String access, boolean dual, double notaA) {
        this.codi = codi;
        this.nom = nom;
        this.curs = curs;
        this.access = access;
        this.dual = dual;
        this.notaA = notaA;
    }

    public Alumne(int codi, String nom) {
        this.codi = codi;
        this.nom = nom;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Curs getCurs() {
        return curs;
    }

    public void setCurs(Curs curs) {
        this.curs = curs;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public boolean isDual() {
        return dual;
    }

    public void setDual(boolean dual) {
        this.dual = dual;
    }

    public double getNotaA() {
        return notaA;
    }

    public void setNotaA(double notaA) {
        this.notaA = notaA;
    }

    @Override
    public String toString() {
        return "Alumne{" + "codi=" + codi + ", nom=" + nom + ", curs=" + curs + ", access=" + access + ", dual=" + dual + ", notaA=" + notaA + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.codi;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumne other = (Alumne) obj;
        return this.codi == other.codi;
    }

    @Override
    public int compareTo(Alumne al) {
        return this.codi - al.codi;
    }

}
