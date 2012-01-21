/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Rina;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PC
 */
public class Time {
    public static String a;
    public static  String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        a = dateFormat.format(date);
        return a;
    }

}
