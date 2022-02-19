/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Yuneider
 */
public class Persistencia {
    
    private final String fileName;
    private ObjectOutputStream os;
    private ObjectInputStream is;
    private Object object;
    
    public Persistencia(String fileName){
        this.fileName = fileName;
    }
    
    public void setObject(Object object){
        this.object=object;
    }
    
    public Object getObject(){
        readObject();
        return object;
    }
    
    public void writteObject(){
        try {
            os = new ObjectOutputStream(new FileOutputStream(fileName));
            os.writeObject(this.object);
            os.close();
        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }
    
    private void readObject(){
        try {
            is = new ObjectInputStream(new FileInputStream(fileName));
            object = is.readObject();
            is.close();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
    
}
