/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Homeframe.java
 *
 * Created on Apr 16, 2010, 12:27:24 PM
 */

package mainhome;

import Chathura.Expences;
import Imal.login;
import Imal.playSond;
import Rina.Project1;
import Sajeewa.Contractor2;
import Sajeewa.Request1;
import billing.ViewBillDetails;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import java.awt.Color;
import java.awt.Rectangle;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Chatura
 */
public class Homeframe extends javax.swing.JFrame {
    String fdate;
    Project1 projectFrame = new Project1();
    Request1 req1Frame = new Request1();
    ViewBillDetails v1 = new ViewBillDetails();
    Expences budFrame = new Expences();
    Contractor2 cn1 = new Contractor2();

    /** Creates new form Homeframe */
    public Homeframe() {
        initComponents();

        setResizable(false);
        jPanel2.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanel7.setVisible(false);
        jPanel8.setVisible(false);
        

        
       // setBounds(300, 150, 900, 700);
        

        Rectangle u = jButton10.getBounds();
        System.out.println("button 13"+ u);
       
        
      /*  String s = jLabel1.getText();
       int q = s.length();
        System.out.println(q);*/

      
new Thread(new Runnable() {

            public void run() {

            for( ; ; ){

                for(int x = 0; x <= 17; ++x ){

                   if(x == 0){

                       jLabel2.setText(" ");

                   }
                   if(x == 1){

                       jLabel2.setText("O");


                   }
                   if(x == 2){

                       jLabel2.setText("r");

                   }
                   if(x == 3){

                       jLabel2.setText("i");

                   }
                   if(x == 4){

                       jLabel2.setText("o");

                   }
                   if(x == 5){

                       jLabel2.setText("n");

                   }
                   if(x == 6){

                       jLabel2.setText("t");

                   }
                   if(x == 7){

                       jLabel2.setText("e");

                   }
                   if(x == 8){

                       jLabel2.setText("c");

                   }
                    

                  try{

                        Thread.sleep(700);

                    }catch(Exception e){
                       System.out.println(e);

                   }
                    if(x == 9){
                   for(x =9 ; x <=17 ; ++x){
                   if(x == 9){

                       jLabel2.setText(" ");

                   }
                   if(x == 10){

                       jLabel2.setText("O");


                   }
                   if(x == 11){

                       jLabel2.setText("Or");

                   }
                   if(x == 12){

                       jLabel2.setText("Ori");

                   }
                   if(x == 13){

                       jLabel2.setText("Orio");

                   }
                   if(x == 14){

                       jLabel2.setText("Orion");

                   }
                   if(x == 15){

                       jLabel2.setText("Oriont");

                   }
                   if(x == 16){

                       jLabel2.setText("Orionte");

                   }
                   if(x == 17){

                       jLabel2.setText("Oriontec");

                   }
                    try{

                        Thread.sleep(200);

                    }catch(Exception e){
                       System.out.println(e);

                   }
                }
                }
                }
              }
            }
        }).start();


        new Thread(new Runnable() {

            public void run() {

            for( ; ; ){
                Date now = new Date();

                String fdate = (DateFormat.getInstance().format(now));
              


                for(int x = 0; x <= 109; ++x ){
                                                                //Building Section, Ministry of Justice
                                                                  //+fdate

                   if(x == 0){

                       jLabel3.setText(fdate);

                   }
                   if(x == 1){

                       jLabel3.setText("e "+fdate);


                   }
                   if(x == 2){

                       jLabel3.setText("ce "+fdate);

                   }
                   if(x == 3){

                       jLabel3.setText("ice "+fdate);

                   }
                   if(x == 4){

                       jLabel3.setText("tice "+fdate);

                   }
                   if(x == 5){

                       jLabel3.setText("stice "+fdate);

                   }
                   if(x == 6){

                       jLabel3.setText("ustice "+fdate);

                   }
                   if(x == 7){

                       jLabel3.setText("Justice "+fdate);

                   }
                   if(x == 8){

                       jLabel3.setText(" Justice "+fdate);

                   }
                   if(x == 9){

                       jLabel3.setText("f Justice "+fdate);

                   }
                   if(x == 10){

                       jLabel3.setText("of Justice "+fdate);

                   }
                   if(x == 11){

                       jLabel3.setText(" of Justice "+fdate);

                   }
                   if(x == 12){

                       jLabel3.setText("y of Justice "+fdate);

                   }
                   if(x == 13){

                       jLabel3.setText("ry of Justice "+fdate);

                   }
                   if(x == 14){

                       jLabel3.setText("try of Justice "+fdate);

                   }
                   if(x == 15){

                       jLabel3.setText("stry of Justice "+fdate);

                   }
                   if(x == 16){

                       jLabel3.setText("istry of Justice "+fdate);

                   }
                   if(x == 17){

                       jLabel3.setText("nistry of Justice "+fdate);

                   }
                   if(x == 18){

                       jLabel3.setText("inistry of Justice "+fdate);

                   }if(x == 19){

                       jLabel3.setText("Ministry of Justice "+fdate);

                   }
                   if(x == 20){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText(" Ministry of Justice "+fdate);

                   }
                   if(x == 21){

                       jLabel3.setText(", Ministry of Justice "+fdate);

                   }
                   if(x == 22){

                       jLabel3.setText("n, Ministry of Justice "+fdate);

                   }
                    if(x == 23){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("on, Ministry of Justice "+fdate);

                   }
                    if(x == 24){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("ion, Ministry of Justice "+fdate);

                   } if(x == 25){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("tion, Ministry of Justice "+fdate);

                   } if(x == 26){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("ction, Ministry of Justice "+fdate);

                   } if(x == 27){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("ection, Ministry of Justice "+fdate);

                   } if(x == 28){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("Section, Ministry of Justice "+fdate);

                   } if(x == 29){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText(" Section, Ministry of Justice "+fdate);

                   } if(x == 30){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("g Section, Ministry of Justice "+fdate);

                   } if(x == 31){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("ng Section, Ministry of Justice "+fdate);

                   } if(x == 32){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("ing Section, Ministry of Justice "+fdate);

                   } if(x == 33){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("ding Section, Ministry of Justice "+fdate);

                   }if(x == 34){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("lding Section, Ministry of Justice "+fdate);

                   }if(x == 35){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("ilding Section, Ministry of Justice "+fdate);

                   }if(x == 36){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("uilding Section, Ministry of Justice "+fdate);

                   }if(x == 37){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("Building Section, Ministry of Justice "+fdate);

                   }if(x == 38){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("  Building Section, Ministry of Justice "+fdate);

                   }if(x == 39){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("    Building Section, Ministry of Justice "+fdate);

                   }if(x == 40){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("      Building Section, Ministry of Justice "+fdate);

                   }if(x == 41){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("        Building Section, Ministry of Justice "+fdate);

                   }if(x == 42){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("          Building Section, Ministry of Justice "+fdate);

                   }if(x == 43){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("            Building Section, Ministry of Justice "+fdate);

                   }if(x == 44){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("              Building Section, Ministry of Justice "+fdate);

                   }if(x == 45){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                Building Section, Ministry of Justice "+fdate);

                   }if(x == 46){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                  Building Section, Ministry of Justice "+fdate);//9-8

                   }if(x == 47){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                    Building Section, Ministry of Justice "+fdate);//9-8

                   }if(x == 48){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                      Building Section, Ministry of Justice "+fdate);//9-8

                   }if(x == 49){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                        Building Section, Ministry of Justice "+fdate);//9-8

                   }if(x == 50){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                          Building Section, Ministry of Justice "+fdate);//9-8

                   }if(x == 51){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                            Building Section, Ministry of Justice "+fdate);//9-8

                   }if(x == 52){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                              Building Section, Ministry of Justice "+fdate);//9-8

                   }if(x == 53){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                Building Section, Ministry of Justice "+fdate);//9-8

                   }if(x == 54){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                  Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 55){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                    Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 56){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                      Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 57){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                        Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 58){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                          Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 59){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                            Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 60){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                              Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 61){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 62){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                  Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 63){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                    Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 64){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                      Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 65){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                        Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 66){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                          Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 67){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                            Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 68){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                              Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 69){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 70){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                  Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 71){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                    Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 72){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                      Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 73){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                        Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 74){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                          Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 75){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                            Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 76){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                              Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 77){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 78){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                  Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 79){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                    Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 80){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                      Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 81){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                        Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 82){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                          Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 83){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                            Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 84){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                              Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 85){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                                Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 86){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                                  Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 87){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                                    Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 88){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                                      Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 89){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                                        Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 90){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                                          Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 91){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                                            Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 92){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                                              Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 93){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                                                Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 94){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                                                  Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 95){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                                                    Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 96){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                                                      Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 97){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                                                        Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 98){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                                                          Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 99){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                                                            Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 101){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                                                              Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 102){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                                                                Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 103){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                                                                  Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 104){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                                                                    Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 105){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                                                                      Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 106){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                                                                        Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 107){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                                                                          Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 108){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                                                                            Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 109){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                                                                              Building Section, Ministry of Justice "+fdate);//9-8-8

                   }/*if(x == 110){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                                                                                Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 111){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                                                                                  Building Section, Ministry of Justice "+fdate);//9-8-8

                   }if(x == 112){                                 //Building Section, Ministry of Justice
                                                                  //+fdate

                       jLabel3.setText("                                                                                                                                                    Building Section, Ministry of Justice "+fdate);//9-8-8

                   }*/


                   

                  try{

                        Thread.sleep(500);

                    }catch(Exception e){
                       System.out.println(e);

                   }
               

               
                }
              }
            }
        }).start();



                   

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel3.setText("Date");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhome/Bitmap editor.png"))); // NOI18N
        jButton1.setToolTipText("View Request Infomation");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Oriontec");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhome/Check boxes.png"))); // NOI18N
        jButton2.setToolTipText("View Project Details");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhome/Clipboard.png"))); // NOI18N
        jButton3.setToolTipText("View Bill Details");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhome/Preview.png"))); // NOI18N
        jButton4.setToolTipText("View Bond Details");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhome/3d graph.png"))); // NOI18N
        jButton5.setToolTipText("Econimical Analysis");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhome/Work area.png"))); // NOI18N
        jButton6.setToolTipText("View Contractor Details");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        jLabel1.setFont(new java.awt.Font("Andalus", 0, 28));
        jLabel1.setText("Home Page");

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel4.setOpaque(false);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhome/projrcts done.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBounds(140, 380, 180, 120);
        jDesktopPane1.add(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel2.setOpaque(false);

        jLabel5.setIconTextGap(0);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhome/request search done.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(90, 90, 90))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBounds(10, 280, 180, 120);
        jDesktopPane1.add(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel5.setOpaque(false);
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhome/billinfo done.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBounds(400, 280, 180, 120);
        jDesktopPane1.add(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel6.setOpaque(false);
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhome/bondetails done.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBounds(610, 280, 180, 120);
        jDesktopPane1.add(jPanel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel7.setOpaque(false);
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhome/budget done.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBounds(400, 410, 180, 120);
        jDesktopPane1.add(jPanel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel8.setOpaque(false);
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhome/contr done.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBounds(600, 410, 180, 120);
        jDesktopPane1.add(jPanel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhome/Bitmap editor1.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jButton8.setBounds(70, 180, 90, 70);
        jDesktopPane1.add(jButton8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhome/Check boxes1.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jButton9.setBounds(190, 180, 90, 70);
        jDesktopPane1.add(jButton9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhome/Clipboard1.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jButton10.setBounds(330, 180, 90, 70);
        jDesktopPane1.add(jButton10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhome/Preview1.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jButton11.setBounds(460, 180, 90, 70);
        jDesktopPane1.add(jButton11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhome/3d graph1.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jButton12.setBounds(590, 180, 90, 70);
        jDesktopPane1.add(jButton12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhome/Work area1.png"))); // NOI18N
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jButton13.setBounds(720, 180, 90, 70);
        jDesktopPane1.add(jButton13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("View Contractor Details");
        jLabel10.setBounds(710, 260, 120, 20);
        jDesktopPane1.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("View Request Infomation");
        jLabel11.setBounds(50, 260, 130, 20);
        jDesktopPane1.add(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("View Project Details");
        jLabel12.setBounds(200, 260, 100, 20);
        jDesktopPane1.add(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("View Bill Details");
        jLabel13.setBounds(340, 260, 80, 20);
        jDesktopPane1.add(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("View Bond Details");
        jLabel14.setBounds(460, 260, 100, 20);
        jDesktopPane1.add(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Economical Analysis");
        jLabel15.setBounds(590, 260, 100, 20);
        jDesktopPane1.add(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sajeewa/Information_16x16.png"))); // NOI18N
        jLabel17.setText("Logout");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 382, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-908)/2, (screenSize.height-703)/2, 908, 703);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
//java.awt.Rectangle[x=6,y=483,width=176,height=106]
        jPanel2.setBounds(12, 390, 176, 106);
        jPanel2.setVisible(true);



    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
      jPanel2.setVisible(false);
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jPanel4.setBounds(135, 390, 176, 106);
        jPanel4.setVisible(true);



    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
    jPanel4.setVisible(false);

    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jPanel5.setBounds(255, 390, 176, 106);
        jPanel5.setVisible(true);


    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
       jPanel5.setVisible(false);
    }//GEN-LAST:event_jButton3MouseExited

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
    
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
    jPanel6.setBounds(375, 390, 176, 106);
    jPanel6.setVisible(true);
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
    jPanel6.setVisible(false);
    }//GEN-LAST:event_jButton4MouseExited

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
    jPanel7.setBounds(485, 390, 176, 106);
    jPanel7.setVisible(true);
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
     jPanel7.setVisible(false);
    }//GEN-LAST:event_jButton5MouseExited

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
     jPanel8.setBounds(595, 390, 176, 106);
     jPanel8.setVisible(true);
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
     jPanel8.setVisible(false);
    }//GEN-LAST:event_jButton6MouseExited

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
playSond.ButtonClick();





      jButton13.setVisible(false);
     jButton9.setVisible(false);
     jButton10.setVisible(false);
     jButton11.setVisible(false);
     jButton12.setVisible(false);
     jLabel10.setVisible(false);
     jLabel11.setVisible(false);
     jLabel12.setVisible(false);
     jLabel13.setVisible(false);
     jLabel14.setVisible(false);
     jLabel15.setVisible(false);


        System.out.println("done2");
        new Thread(new Runnable() {
    
            public void run() {

                for(int x = 70; x <= 390; ++x){


                jButton8.setBounds(x, 180, 100, 80);
                    System.out.println("done3");
                  try{

                        Thread.sleep(5);

                    }catch(Exception e){
                       System.out.println(e);

                    }

                   if(x == 390){
                       
                       

                       for(x = 390; x <= 390; ++x){
                          

                           try{

                        Thread.sleep(1000);

                    }catch(Exception e){
                       System.out.println(e);

                    }
                       
                  jButton8.setVisible(false);
                  
                     req1Frame.setVisible(true);
                      System.out.println("Test saj");
                       }

                   }

                }

            }
        }).start();/*new Thread(new Runnable() {

            public void run() {

                for(int y = 560; y > 460 ; --y){


                jPanel2.setBounds(10, y, 165, 100);

                  try{

                        Thread.sleep(1);

                    }catch(Exception e){
                       System.out.println(e);

                   }

                }

            }
        }).start();*/
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
playSond.ButtonClick();
        jButton13.setVisible(false);
     jButton8.setVisible(false);
     jButton10.setVisible(false);
     jButton11.setVisible(false);
     jButton12.setVisible(false);
     jLabel10.setVisible(false);
     jLabel11.setVisible(false);
     jLabel12.setVisible(false);
     jLabel13.setVisible(false);
     jLabel14.setVisible(false);
     jLabel15.setVisible(false);


        System.out.println("done2");
        new Thread(new Runnable() {

            public void run() {

                for(int x = 200; x <= 390; ++x){


                jButton9.setBounds(x, 180, 100, 80);
                    System.out.println("done3");
                  try{

                        Thread.sleep(5);

                    }catch(Exception e){
                       System.out.println(e);

                    }

                   if(x == 390){



                       for(x = 390; x <= 390; ++x){


                           try{

                        Thread.sleep(1000);

                    }catch(Exception e){
                       System.out.println(e);

                    }

                  jButton9.setVisible(false);

                    projectFrame.setVisible(true);
                       }

                   }

                }

            }
        }).start();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
   playSond.ButtonClick();
        jButton13.setVisible(false);
     jButton8.setVisible(false);
     jButton9.setVisible(false);
     jButton11.setVisible(false);
     jButton12.setVisible(false);
     jLabel10.setVisible(false);
     jLabel11.setVisible(false);
     jLabel12.setVisible(false);
     jLabel13.setVisible(false);
     jLabel14.setVisible(false);
     jLabel15.setVisible(false);


        System.out.println("done2");
        new Thread(new Runnable() {

            public void run() {

                for(int x = 330; x <= 390; ++x){


                jButton10.setBounds(x, 180, 100, 80);
                    System.out.println("done3");
                  try{

                        Thread.sleep(5);

                    }catch(Exception e){
                       System.out.println(e);

                    }

                   if(x == 390){



                       for(x = 390; x <= 390; ++x){


                           try{

                        Thread.sleep(1000);

                    }catch(Exception e){
                       System.out.println(e);

                    }

                  jButton10.setVisible(false);
          
                 v1.setVisible(true);
                       }

                   }

                }

            }
        }).start();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
   playSond.ButtonClick();
        jButton8.setVisible(false);
     jButton9.setVisible(false);
     jButton10.setVisible(false);
     jButton12.setVisible(false);
     jButton13.setVisible(false);
     jLabel10.setVisible(false);
     jLabel11.setVisible(false);
     jLabel12.setVisible(false);
     jLabel13.setVisible(false);
     jLabel14.setVisible(false);
     jLabel15.setVisible(false);


        System.out.println("done2");
        new Thread(new Runnable() {

            public void run() {

                for(int x = 460; x >= 390; --x){


                jButton11.setBounds(x, 180, 100, 80);
                    System.out.println("done3");
                  try{

                        Thread.sleep(5);

                    }catch(Exception e){
                       System.out.println(e);

                    }

                   if(x == 390){



                       for(x = 390; x >= 390; --x){


                           try{

                        Thread.sleep(1000);

                    }catch(Exception e){
                       System.out.println(e);

                    }

                  jButton11.setVisible(false);
                   
     
                       }

                   }

                }

            }
        }).start();
    
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
playSond.ButtonClick();
        jButton8.setVisible(false);
     jButton9.setVisible(false);
     jButton10.setVisible(false);
     jButton11.setVisible(false);
     jButton13.setVisible(false);
     jLabel10.setVisible(false);
     jLabel11.setVisible(false);
     jLabel12.setVisible(false);
     jLabel13.setVisible(false);
     jLabel14.setVisible(false);
     jLabel15.setVisible(false);

        System.out.println("done2");
        new Thread(new Runnable() {

            public void run() {

                for(int x = 590; x >= 390; --x){


                jButton12.setBounds(x, 180, 100, 80);
                    System.out.println("done3");
                  try{

                        Thread.sleep(5);

                    }catch(Exception e){
                       System.out.println(e);

                    }

                   if(x == 390){



                       for(x = 390; x >= 390; --x){


                           try{

                        Thread.sleep(1000);

                    }catch(Exception e){
                       System.out.println(e);

                    }

                  jButton12.setVisible(false);

                 
                    budFrame.setVisible(true);
                       }

                   }

                }

            }
        }).start();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
playSond.ButtonClick();
        jButton8.setVisible(false);
     jButton9.setVisible(false);
     jButton10.setVisible(false);
     jButton11.setVisible(false);
     jButton12.setVisible(false);
     jLabel10.setVisible(false);
     jLabel11.setVisible(false);
     jLabel12.setVisible(false);
     jLabel13.setVisible(false);
     jLabel14.setVisible(false);
     jLabel15.setVisible(false);


        System.out.println("done2");
        new Thread(new Runnable() {
    
            public void run() {

                for(int x = 720; x >= 390; --x){


                jButton13.setBounds(x, 180, 100, 80);
                    System.out.println("done3");
                  try{

                        Thread.sleep(5);

                    }catch(Exception e){
                       System.out.println(e);

                    }

                   if(x == 390){
                       
                       

                       for(x = 390; x >= 390; --x){
                          

                           try{

                        Thread.sleep(1000);

                    }catch(Exception e){
                       System.out.println(e);

                    }
                       
                  jButton13.setVisible(false);
                  
                  cn1.setvalues();
                  cn1.setVisible(true);
                       }

                   }

                }

            }
        }).start();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
playSond.ButtonClick();
        projectFrame.setVisible(false);
    req1Frame.setVisible(false);
     v1.setVisible(false);
    budFrame.setVisible(false);
    cn1.setVisible(false);

    req1Frame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
playSond.ButtonClick();
        projectFrame.setVisible(false);
    req1Frame.setVisible(false);
     v1.setVisible(false);
    budFrame.setVisible(false);
    cn1.setVisible(false);

    projectFrame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  playSond.ButtonClick();
        projectFrame.setVisible(false);
    req1Frame.setVisible(false);
     v1.setVisible(false);
    budFrame.setVisible(false);
    cn1.setVisible(false);

    v1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
playSond.ButtonClick();
        projectFrame.setVisible(false);
    req1Frame.setVisible(false);
     v1.setVisible(false);
    budFrame.setVisible(false);
    cn1.setVisible(false);

    budFrame.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
playSond.ButtonClick();
        projectFrame.setVisible(false);
    req1Frame.setVisible(false);
    v1.setVisible(false);
    budFrame.setVisible(false);
    cn1.setVisible(false);

        cn1.setvalues();
    cn1.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
       this.dispose();
       new login().setVisible(true);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
  jLabel17.setForeground(Color.red);
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
       jLabel17.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel17MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    playSond.ButtonClick();    // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        try {
            try {
                UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
            } catch (ParseException ex) {
                Logger.getLogger(Homeframe.class.getName()).log(Level.SEVERE, null, ex);
            }
            java.awt.EventQueue.invokeLater(new Runnable() {

                public void run() {
                    new Homeframe().setVisible(true);
                }
            });
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Homeframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables

}
