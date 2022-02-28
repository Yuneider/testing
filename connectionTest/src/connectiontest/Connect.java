/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectiontest;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author yunei
 */
public class Connect {
    
    private static final String url = "jdbc:mysql://localhost:3306/wtfdb";
    private static final String username = "Yuneider";
    private static final String password = "yuneider22";
    
    public Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url,username,password);
            System.out.println("DONE");
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
    
}
