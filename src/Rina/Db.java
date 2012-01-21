/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Rina;


import Chathura.DB;
import java.sql.Connection;

/**
 *
 * @author User
 */
public class Db {
       public static Connection conover;
         public static Connection getMyConnection() throws Exception{

             conover = DB.getMyConnection();

        return conover;
    }
}
