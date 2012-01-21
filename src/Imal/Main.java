/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Imal;

import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import javax.swing.UIManager;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
        } catch (Exception e) {
        }

        new startload().setVisible(true);

        // TODO code application logic here
    }

}
