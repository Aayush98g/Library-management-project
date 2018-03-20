/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

/**
 *
 * @author user
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {
    public static Connection ConnectDb()
    {
    try{
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\user\\Documents\\NetBeansProjects\\Library management System\\LibraryNew.sqlite");
        return con;
                
       
        
    }catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e);
      return null;  
    }
    
   }
}
