/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Imal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PC
 */
public class Time {
    private static String a;
    public static  String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        a = dateFormat.format(date);
        return a;
    }

}
