package Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Institut {

    private int idInstitut;

    private String nom;

    private Set<Alumne> alumnes;

    private ArrayList<Curs> cursos;

    public Institut(int idInstitut, String nom) {
        this.idInstitut = idInstitut;
        this.nom = nom;
        this.alumnes = new HashSet<>();
        this.cursos = new ArrayList<>();
    }

    public int getIdInstitut() {
        return idInstitut;
    }

    public void setIdInstitut(int idInstitut) {
        this.idInstitut = idInstitut;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<Alumne> getAlumnes() {
        return alumnes;
    }

    public void setAlumnes(Set<Alumne> alumnes) {
        this.alumnes = alumnes;
    }

    public ArrayList<Curs> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curs> cursos) {
        this.cursos = cursos;
    }

    public boolean addAlumne(Alumne al) {
        return alumnes.add(al);
    }

    public boolean removeAlumne(int codi) {
        return alumnes.remove(searchAlumne(codi));

    }

    public Alumne searchAlumne(int codi) {
        for (Alumne alumne : alumnes) {
            if (alumne.getCodi() == codi) {
                return alumne;
            }
        }
        return null;
    }

    public void showAlumnes() {
        for (Alumne alumne : alumnes) {
            System.out.println(alumne);
        }
    }
//Per revisar

    public boolean updateAlumne(int codi, Alumne upAl) {
        Alumne al = searchAlumne(codi);
        if (al != null) {
            removeAlumne(codi);
            return addAlumne(upAl);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Institut{" + "idInstitut=" + idInstitut + ", nom=" + nom + ", alumnes=" + alumnes + ", cursos=" + cursos + '}';
    }

}
