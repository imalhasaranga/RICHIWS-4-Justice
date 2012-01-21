package Sajeewa;


import java.sql.Connection;
import java.sql.DriverManager;




/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saj
 */
public class DB {

private static Connection con;
public static Connection getCon() throws Exception{

    con = Chathura.DB.getMyConnection();

    return con;
}

}
