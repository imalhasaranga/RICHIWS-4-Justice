/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Chaturabilling;

import java.sql.Connection;

/**
 *
 * @author Chatura
 */
public class DB {

    private static Connection con1;

    public static Connection getMyConnection() throws Exception {

    con1 =Chathura.DB.getMyConnection();

    return con1;
    }

}
