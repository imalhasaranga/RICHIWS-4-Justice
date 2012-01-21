/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Chathura;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Chatura
 */
public class DB {


    private static Connection con;

    public static Connection getMyConnection() throws Exception {

    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/justice", "root", "123");

    return con;
    }

    private static Connection conjasper;
    public static Connection getMyConnectionForJasper() throws Exception {

    Class.forName("com.mysql.jdbc.Driver");
    conjasper = (Connection)DriverManager.getConnection("jdbc:mysql:///justice","root","123");

    return conjasper;
    }

}
