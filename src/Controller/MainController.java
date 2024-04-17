/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controller;

import Model.Alumne;
import Model.Curs;
import Model.Institut;
import View.MainView;
import java.util.Set;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author jordi
 */
public class MainController {

    private MainView mainV;
    private Institut ins;
//Inicialitza la vista principal, les dades del model, crida el mètode per mostrar les dades
//    i fa visible la vista principal

    public MainController() {
        this.mainV = new MainView(this);
        this.ins = initData();
        showAlumnes();
        this.mainV.setVisible(true);
    }
// Obté una cadena a partir del les dades proporcionades per getAlumnes

    private String getAlumnesTxt() {
        String txt = "";
        Set<Alumne> alumnes = ins.getAlumnes();
        for (Alumne alu : alumnes) {
            txt += alu.toString() + "\n";
        }
        return txt;
    }

    private TableModel getAlumnesDataTable() {
        DefaultTableModel tm = new DefaultTableModel() {
            Class[] columnTypes = {Integer.class, String.class, String.class, String.class, Boolean.class, Double.class};

            @Override
            public boolean isCellEditable(int row, int column) {
                return true;
            }

            @Override

            public Class getColumnClass(int columnIndex) {

                return columnTypes[columnIndex];
            }

        };
        tm.addColumn("Codi");
        tm.addColumn("Nom");
        tm.addColumn("Curs");
        tm.addColumn("Accés");
        tm.addColumn("Dual");
        tm.addColumn("Nota");

        Set<Alumne> alumnes = ins.getAlumnes();
        for (Alumne alumne : alumnes) {
            Object[] row = new Object[6];
            row[0] = alumne.getCodi();
            row[1] = alumne.getNom();
            row[2] = alumne.getCurs().getNom();
            row[3] = alumne.getAccess();
            row[4] = alumne.isDual();
            row[5] = alumne.getNotaA();
            tm.addRow(row);
        }
        return tm;
    }
// Mostra les dades a la vista principal

    public void showAlumnes() {
        String txt = this.getAlumnesTxt();
        mainV.setInfoTextArea(txt);
        TableModel tm = this.getAlumnesDataTable();
        mainV.setInfoTable(tm);

    }
//Inicialitza dades de proves del model

    public Institut initData() {
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
