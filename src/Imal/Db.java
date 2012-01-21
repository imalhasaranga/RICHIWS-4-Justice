/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Imal;

import Chathura.DB;
import java.sql.Connection;

/**
 *
 * @author PC
 */
public class Db {
    private static Connection con;
    public static Connection getMyConnection()throws Exception {
       
      con =  DB.getMyConnection();

       return con;

    }

}
