/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projects;

import java.sql.Connection;

/**
 *
 * @author HP-Dv 7
 */
public class DB {
    private static Connection con;
    static Connection getCon() throws Exception{
       
        con = Chathura.DB.getMyConnection();

    return con;
        }
}
