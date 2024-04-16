/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Model;

/**
 *
 * @author jordi
 */
public class PrincipalTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Institut ins = initData();
        ins.showAlumnes();

    }

    public static Institut initData() {
        Institut I1 = new Institut(1, "Vallbona");
        Curs c1 = new Curs(0, "1DAM");
        Curs c2 = new Curs(1, "1DAW");
        Curs c3 = new Curs(2, "1DAMDAW");
        Alumne alumne1 = new Alumne(123456, "Anna Smith", c1, "CFGM", false, 7.5);
        Alumne alumne2 = new Alumne(234567, "John Doe", c1, "BATX", true, 6.8);
        Alumne alumne3 = new Alumne(345678, "Maria García", c1, "Prova", false, 8.2);

        Alumne alumne4 = new Alumne(456789, "David López", c2, "CFGM", true, 9.3);
        Alumne alumne5 = new Alumne(567890, "Emma Johnson", c2, "BATX", false, 7.1);
        Alumne alumne6 = new Alumne(678901, "Michael Brown", c2, "Prova", true, 8.9);

        Alumne alumne7 = new Alumne(789012, "Laura Martínez", c3, "CFGM", false, 6.5);
        Alumne alumne8 = new Alumne(890123, "Sophia Taylor", c3, "BATX", true, 8.7);
        Alumne alumne9 = new Alumne(901234, "Daniel Rodríguez", c3, "Prova", false, 7.8);

        I1.addAlumne(alumne1);
        I1.addAlumne(alumne2);
        I1.addAlumne(alumne3);
        I1.addAlumne(alumne4);
        I1.addAlumne(alumne5);
        I1.addAlumne(alumne6);
        I1.addAlumne(alumne7);
        I1.addAlumne(alumne8);
        I1.addAlumne(alumne9);
        return I1;
    }

}
