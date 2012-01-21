/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Imal;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author PC
 */
public class validate1 {

    public  String mytext(JTextField t1,KeyEvent e1){

        String s = t1.getText();    
        char c = e1.getKeyChar();
        int l = s.length();

        if(!Character.isDigit(c)){

            if(!String.valueOf(c).equals(".")){

                
                s = s.substring(0, l-1);
            }

             try {
            double d = Double.parseDouble(s);


         } catch (Exception e) {

             s = s.substring(0, l-1);
         }
        }

        return  s;
    

 

}
}
