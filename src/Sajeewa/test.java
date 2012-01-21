/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Sajeewa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author saj
 */
public class test {

    static ResultSet rest() throws Exception{
          Connection con_req2009 = DB.getCon();
          Statement state_req2009 = con_req2009.createStatement();
          ResultSet rset_req2009 = state_req2009.executeQuery("select * from request where ProjectType = Large Scale Construction");
          return rset_req2009;
    }
}
