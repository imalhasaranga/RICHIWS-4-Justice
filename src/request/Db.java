package request;


import Chathura.DB;
import java.sql.Connection;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Db {
                static Connection getcon() throws Exception{
            
            Connection c=DB.getMyConnection();

            return c;
        }
}
