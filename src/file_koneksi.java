
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ILHAM
 */
public class file_koneksi {
    private static Connection coneksi;
     public static Connection GetConnection() throws SQLException {         
         if (coneksi == null) {             
             Driver driver = new Driver(){};            
             coneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_utspbo?zeroDateTimeBehavior=convertToNull", "root", "");         
         }         
     return coneksi;     }
}
