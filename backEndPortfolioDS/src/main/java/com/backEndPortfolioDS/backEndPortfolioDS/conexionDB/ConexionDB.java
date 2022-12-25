
package com.backEndPortfolioDS.backEndPortfolioDS.conexionDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDB {
    Connection con;
    
    public ConexionDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("b36hjmkgkxj8vn5p20g7-mysql.services.clever-cloud.com", "uoiafoeyd7ehks1j", "rcSVq5eo2sz6ltUt4Im8");
        } catch (Exception e) {
            System.out.println("Error en conexion a DB: "+ e);
        }
    }
    public static void main(String[] args) {
        ConexionDB cn = new ConexionDB();
    }
    
}
