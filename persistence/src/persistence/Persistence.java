/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persistence;

import javax.swing.JOptionPane;

/**
 *
 * @author Yuneider
 */
public class Persistence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String op = "", name = "data.bin";

        op = JOptionPane.showInputDialog(null, "1 to writte, 2 to read");
        if (op.equals("1")) {
            ScoreController sc = new ScoreController();
            Persistencia p = new Persistencia(name);
            String size = JOptionPane.showInputDialog(null, "¿How many?");
            for (int i = 0; i < Integer.parseInt(size); i++) {
                String score = JOptionPane.showInputDialog(null, "Score");
                sc.insertScore(Integer.parseInt(score));
            }
            p.setObject(sc);
            p.writteObject();
        }

        if (op.equals("2")) {
            Persistencia p = new Persistencia(name);
            ScoreController sc = (ScoreController) p.getObject();
            sc.showSocore();
        }

    }

}
