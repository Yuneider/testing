/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persistence;

/**
 *
 * @author Yuneider
 */
public class Persistence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "data.bin";
        
//        ScoreController sc = new ScoreController();
//        Persistencia p = new Persistencia(name);
//        
//        for(int i=1;i<=10;i++){
//            sc.insertScore(i);
//        }
//        
//        p.setObject(sc);
//        p.writteObject();
        

        Persistencia p = new Persistencia(name);
        ScoreController sc = (ScoreController) p.getObject();
        sc.showSocore();
        System.out.println("test");
    }

}
