/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package billing;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Chatura
 */
public class DB {

    private static Connection con;

    public static Connection getMyConnection() throws Exception {

    con = Chathura.DB.getMyConnection();

    return con;
    }

}
