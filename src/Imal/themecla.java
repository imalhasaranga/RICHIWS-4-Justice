/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Imal;

import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueSteelLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaMauveMetallicLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaSkyMetallicLookAndFeel;
import javax.swing.UIManager;

/**
 *
 * @author PC
 */
public class themecla {
    void skymetalic(){
        try {
            
            UIManager.setLookAndFeel(new SyntheticaSkyMetallicLookAndFeel());
            new login().setVisible(true);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    void blackEye(){
    
     try {
            
            UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel() );
            new login().setVisible(true);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    void white(){
    
        try {
            
            UIManager.setLookAndFeel(new SyntheticaMauveMetallicLookAndFeel());
            new login().setVisible(true);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
     void bluesteel(){

        try {

            UIManager.setLookAndFeel(new SyntheticaBlueSteelLookAndFeel());
            new login().setVisible(true);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
