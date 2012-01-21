/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Homeframe.java
 *
 * Created on Apr 16, 2010, 12:27:24 PM
 */

package mainhomeDataEntry;

import Chaturabilling.ProjectInfo;
import Chaturabilling.ViewBillDetails;
import Imal.login;
import Imal.playSond;
import Ishanka.Contractorstart;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import java.awt.Color;
import java.awt.Rectangle;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.UIManager;

/**
 *
 * @author Chatura
 */
public class Homeframe extends javax.swing.JFrame {


  
  





    budjetAndTaxes b1 = new budjetAndTaxes();
    request.EnteringRequest ent = new request.EnteringRequest();
    request.Requests entt = new request.Requests();
    ProjectInfo proin = new ProjectInfo();
    Contractorstart co1 = new Contractorstart();
    ViewBillDetails view = new ViewBillDetails();
    

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
        jPanel9.setVisible(false);
        

        
       // setBounds(300, 150, 900, 700);
        

        Rectangle u = jButton10.getBounds();
        System.out.println("Center"+ u);

        Rectangle f = jButton13.getBounds();
        System.out.println("corner"+ f);
       
        
      /*  String s = jLabel1.getText();
       int q = s.length();
        System.out.println(q);*/

/*Date now = new Date();

String s = (DateFormat.getInstance().format(now));
String fdate = s.split(" ")[0];
      String bar = "                                                                                                                                              Building Section, Ministry of Justice "+fdate  ;
        int z = bar.length();
        System.out.println(z);

        {

        String g = " ";
       



        }



new Thread (new Runnable() {

            public void run() {

            Date now = new Date();
            String s = (DateFormat.getInstance().format(now));
            String fdate = s.split(" ")[0];
            String bar = "                                                                                                                                              Building Section, Ministry of Justice "+fdate  ;
                
            String[] movingtxt = new String[187];
            movingtxt = bar.split("");

                for(int i = 187; i >= 0; --i ){

                    System.out.print(movingtxt[i]);

                    try {

                        Thread.sleep(500);
                    } catch (Exception e) {
                        e.printStackTrace();
                      }

                }

            }
        }).start();*/






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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
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
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel3.setText("Date");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhomeDataEntry/Export.png"))); // NOI18N
        jButton1.setToolTipText("Add Request");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setOpaque(false);
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

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhomeDataEntry/Forward_32x32.png"))); // NOI18N
        jButton2.setToolTipText("Start New Project");
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

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhomeDataEntry/Edit page.png"))); // NOI18N
        jButton3.setToolTipText("Create Bill");
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

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhomeDataEntry/Preview.png"))); // NOI18N
        jButton4.setToolTipText("View Bill");
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

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhomeDataEntry/User_32x32.png"))); // NOI18N
        jButton5.setToolTipText("Add Contractor Details");
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

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhomeDataEntry/List.png"))); // NOI18N
        jButton6.setToolTipText("Add Budget Details");
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

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Oriontec");

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhomeDataEntry/Information_32x32.png"))); // NOI18N
        jButton15.setToolTipText("Help");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton15MouseExited(evt);
            }
        });
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, 0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel4.setOpaque(false);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhomeDataEntry/request done.jpg"))); // NOI18N

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBounds(0, 10, 180, 120);
        jDesktopPane1.add(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel2.setOpaque(false);

        jLabel5.setIconTextGap(0);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhomeDataEntry/request entering done.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBounds(10, 460, 180, 120);
        jDesktopPane1.add(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel5.setOpaque(false);
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhomeDataEntry/billing proview done.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBounds(0, 300, 180, 120);
        jDesktopPane1.add(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel6.setOpaque(false);
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhomeDataEntry/bill info done.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBounds(200, 460, 180, 120);
        jDesktopPane1.add(jPanel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel7.setOpaque(false);
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhomeDataEntry/conractor add done.jpg"))); // NOI18N

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

        jPanel7.setBounds(410, 470, 180, 120);
        jDesktopPane1.add(jPanel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel8.setOpaque(false);
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhomeDataEntry/budget done.jpg"))); // NOI18N

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBounds(700, 210, 180, 120);
        jDesktopPane1.add(jPanel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhomeDataEntry/User_48x48.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jButton8.setBounds(210, 270, 90, 70);
        jDesktopPane1.add(jButton8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhomeDataEntry/List1.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jButton9.setBounds(210, 90, 90, 70);
        jDesktopPane1.add(jButton9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhomeDataEntry/Information_48x48.png"))); // NOI18N
        jButton10.setToolTipText("Help");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jButton10.setBounds(400, 180, 90, 70);
        jDesktopPane1.add(jButton10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhomeDataEntry/Forward_48x48.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jButton11.setBounds(590, 90, 90, 70);
        jDesktopPane1.add(jButton11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhomeDataEntry/Edit page1.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jButton12.setBounds(590, 270, 90, 70);
        jDesktopPane1.add(jButton12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhomeDataEntry/Preview1.png"))); // NOI18N
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
        jButton13.setBounds(400, 340, 90, 70);
        jDesktopPane1.add(jButton13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Add Contractor Details");
        jLabel11.setBounds(200, 350, 120, 20);
        jDesktopPane1.add(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Add Budget Details");
        jLabel12.setBounds(210, 170, 100, 20);
        jDesktopPane1.add(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Add Request");
        jLabel13.setBounds(410, 100, 80, 20);
        jDesktopPane1.add(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("View Bill");
        jLabel14.setBounds(410, 420, 100, 20);
        jDesktopPane1.add(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Start New Project");
        jLabel15.setBounds(590, 170, 100, 20);
        jDesktopPane1.add(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel9.setOpaque(false);
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel9MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.setBounds(660, 410, 180, 120);
        jDesktopPane1.add(jPanel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhomeDataEntry/Export1.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jButton14.setBounds(400, 20, 90, 70);
        jDesktopPane1.add(jButton14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Create Bill");
        jLabel17.setBounds(610, 350, 50, 20);
        jDesktopPane1.add(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("   Information");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel18.setBounds(410, 260, 80, 20);
        jDesktopPane1.add(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Andalus", 0, 28));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhomeDataEntry/home_48.png"))); // NOI18N
        jLabel1.setText("Home Page");
        jLabel1.setIconTextGap(8);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sajeewa/Information_16x16.png"))); // NOI18N
        jLabel19.setText("Logout");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel19MouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 391, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-908)/2, (screenSize.height-695)/2, 908, 695);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
//java.awt.Rectangle[x=6,y=483,width=176,height=106]
        jPanel2.setBounds(5, 390, 176, 106);
        jPanel2.setVisible(true);



    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
      jPanel2.setVisible(false);
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jPanel4.setBounds(110, 390, 176, 106);
        jPanel4.setVisible(true);



    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
    jPanel4.setVisible(false);

    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jPanel5.setBounds(220, 390, 176, 106);
        jPanel5.setVisible(true);


    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
       jPanel5.setVisible(false);
    }//GEN-LAST:event_jButton3MouseExited

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
    
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
    jPanel6.setBounds(330, 390, 176, 106);
    jPanel6.setVisible(true);
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
    jPanel6.setVisible(false);
    }//GEN-LAST:event_jButton4MouseExited

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
    jPanel7.setBounds(440, 390, 176, 106);
    jPanel7.setVisible(true);
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
     jPanel7.setVisible(false);
    }//GEN-LAST:event_jButton5MouseExited

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
     jPanel8.setBounds(555, 390, 176, 106);
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
        jButton11.setVisible(false);
     jButton9.setVisible(false);
     jButton10.setVisible(false);
     jButton12.setVisible(false);
     jButton13.setVisible(false);
     jButton14.setVisible(false);


     jLabel11.setVisible(false);
     jLabel12.setVisible(false);
     jLabel13.setVisible(false);
     jLabel14.setVisible(false);
     jLabel15.setVisible(false);
     jLabel17.setVisible(false);
     jLabel18.setVisible(false);



        new Thread(new Runnable() {

            public void run() {

                for(int y = 270; y >= 180; --y){

                     jButton8.setBounds(210, y, 90, 70);

                    try{

                        Thread.sleep(10);

                    }catch(Exception e){
                       System.out.println(e);

                    }


                if(y == 180){

                    for(int x = 210; x <= 400; ++x ){

                     jButton8.setBounds(x, 180, 90, 70);

                    try{

                        Thread.sleep(10);

                    }catch(Exception e){
                       System.out.println(e);

                    }


                     if(x == 400){

                       
                            
                        jButton8.setVisible(false);
                        
                        co1.setVisible(true);


                        }

                     
                    }

                }
                }

            }
        }).start();     /*new Thread(new Runnable() {

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
        jButton11.setVisible(false);
     jButton8.setVisible(false);
     jButton10.setVisible(false);
     jButton12.setVisible(false);
     jButton13.setVisible(false);
     jButton14.setVisible(false);


     jLabel11.setVisible(false);
     jLabel12.setVisible(false);
     jLabel13.setVisible(false);
     jLabel14.setVisible(false);
     jLabel15.setVisible(false);
     jLabel17.setVisible(false);
     jLabel18.setVisible(false);



        new Thread(new Runnable() {

            public void run() {

                for(int y = 90; y <= 180; ++y){

                     jButton9.setBounds(210, y, 90, 70);

                    try{

                        Thread.sleep(7);

                    }catch(Exception e){
                       System.out.println(e);

                    }


                if(y == 180){

                    for(int x = 210; x <= 400; ++x ){

                     jButton9.setBounds(x, 180, 90, 70);

                    try{

                        Thread.sleep(7);

                    }catch(Exception e){
                       System.out.println(e);

                    }


                     if(x == 400){

                      

                          

                        jButton9.setVisible(false);

                       
                       b1.setVisible(true);
                         jButton11.setVisible(true);
                         jButton8.setVisible(true);
                         jButton10.setVisible(true);
                         jButton12.setVisible(true);
                         jButton13.setVisible(true);
                         jButton14.setVisible(true);
                         jButton9.setVisible(true);
                         jButton9.setBounds(210, 90, 90, 70);

                     }
                    }

                }
                }

            }
        }).start();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
playSond.ButtonClick();
        jButton11.setVisible(false);
     jButton8.setVisible(false);
     jButton10.setVisible(false);
     jButton12.setVisible(false);
     jButton13.setVisible(false);
     jButton9.setVisible(false);


     jLabel11.setVisible(false);
     jLabel12.setVisible(false);
     jLabel13.setVisible(false);
     jLabel14.setVisible(false);
     jLabel15.setVisible(false);
     jLabel17.setVisible(false);
     jLabel18.setVisible(false);



        new Thread(new Runnable() {

            public void run() {

                for(int y = 178; y <= 180; ++y){

                     jButton14.setBounds(395, 175, 100, 90);

                    try{

                        Thread.sleep(100);

                    }catch(Exception e){
                       System.out.println(e);

                    }

                    jButton14.setBounds(400, 180, 90, 70);
                if(y == 180){

                    for(int x = 180; x <= 180; ++x ){



                    try{

                        Thread.sleep(1000);

                    }catch(Exception e){
                       System.out.println(e);

                    }

                    jButton14.setVisible(false);

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
     jButton14.setVisible(false);


     jLabel11.setVisible(false);
     jLabel12.setVisible(false);
     jLabel13.setVisible(false);
     jLabel14.setVisible(false);
     jLabel15.setVisible(false);
     jLabel17.setVisible(false);
     jLabel18.setVisible(false);


        
        new Thread(new Runnable() {

            public void run() {

                for(int y = 90; y <= 180; ++y){

                     jButton11.setBounds(590, y, 90, 70);
                     
                    try{

                        Thread.sleep(10);

                    }catch(Exception e){
                       System.out.println(e);

                    }


                if(y == 180){

                    for(int x = 590; x >= 400; --x ){

                     jButton11.setBounds(x, 180, 90, 70);

                    try{

                        Thread.sleep(10);

                    }catch(Exception e){
                       System.out.println(e);

                    }


                     if(x == 400){

                       

                        jButton11.setVisible(false);
                        
                        entt.setVisible(true);

                     }
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
     jButton14.setVisible(false);

     
     jLabel11.setVisible(false);
     jLabel12.setVisible(false);
     jLabel13.setVisible(false);
     jLabel14.setVisible(false);
     jLabel15.setVisible(false);
     jLabel17.setVisible(false);
     jLabel18.setVisible(false);


        System.out.println("done2");
        new Thread(new Runnable() {

            public void run() {

                for(int y = 270; y >= 180; --y){

                     jButton12.setBounds(590, y, 90, 70);

                    try{

                        Thread.sleep(10);

                    }catch(Exception e){
                       System.out.println(e);

                    }


                if(y == 180){

                    for(int x = 590; x >= 400; --x ){

                     jButton12.setBounds(x, 180, 90, 70);

                    try{

                        Thread.sleep(10);

                    }catch(Exception e){
                       System.out.println(e);

                    }


                     if(x == 400){

                        for(x = 400; x >= 400; --x ){

                            try{

                            Thread.sleep(1000);

                             }catch(Exception e){
                             System.out.println(e);

                             }
                          
                        jButton12.setVisible(false);
                        
                         proin.setVisible(true);
                        }

                     }
                    }

                }
                }
                       
            }
        }).start();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
playSond.ButtonClick();
        jButton11.setVisible(false);
     jButton8.setVisible(false);
     jButton10.setVisible(false);
     jButton12.setVisible(false);
     jButton14.setVisible(false);
     jButton9.setVisible(false);


     jLabel11.setVisible(false);
     jLabel12.setVisible(false);
     jLabel13.setVisible(false);
     jLabel14.setVisible(false);
     jLabel15.setVisible(false);
     jLabel17.setVisible(false);
     jLabel18.setVisible(false);



        new Thread(new Runnable() {

            public void run() {

                for(int y = 340; y >= 180; --y){

                     jButton13.setBounds(400, y, 90, 70);

                    try{

                        Thread.sleep(10);

                    }catch(Exception e){
                       System.out.println(e);

                    }


                if(y == 180){

                    for(int x = 180; x <= 180; ++x ){



                    try{

                        Thread.sleep(1000);

                    }catch(Exception e){
                       System.out.println(e);

                    }
                   
                    jButton13.setVisible(false);
                    

                    view.setVisible(true);
                    }

                }
                }

            }
        }).start();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13MouseClicked

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel9MouseEntered

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
playSond.ButtonClick();
        jButton11.setVisible(false);
     jButton8.setVisible(false);
     jButton10.setVisible(false);
     jButton12.setVisible(false);
     jButton13.setVisible(false);
     jButton9.setVisible(false);


     jLabel11.setVisible(false);
     jLabel12.setVisible(false);
     jLabel13.setVisible(false);
     jLabel14.setVisible(false);
     jLabel15.setVisible(false);
     jLabel17.setVisible(false);
     jLabel18.setVisible(false);



        new Thread(new Runnable() {

            public void run() {

                for(int y = 20; y <= 180; ++y){

                     jButton14.setBounds(400, y, 90, 70);

                    try{

                        Thread.sleep(10);

                    }catch(Exception e){
                       System.out.println(e);

                    }


                if(y == 180){

                    for(int x = 180; x <= 180; ++x ){



                    try{

                        Thread.sleep(1000);

                    }catch(Exception e){
                       System.out.println(e);

                    }

                    jButton14.setVisible(false);
                        
                       ent.setVisible(true);
                    }

                }
                }

            }
        }).start();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
playSond.ButtonClick();
        b1.dispose();
  new request.EnteringRequest().setVisible(true);
   
    proin.dispose() ;
    co1.dispose();
    view.dispose();
    entt.dispose();
        System.out.println("dffddfd");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
playSond.ButtonClick();
        b1.dispose();
    ent.dispose();
    proin.dispose();
    co1.dispose();
    view.dispose();
    new request.Requests().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
playSond.ButtonClick();
        b1.dispose();
    ent.dispose();
    
    co1.dispose();
    view.dispose();
    entt.dispose();
    new ProjectInfo().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    playSond.ButtonClick();
        b1.dispose();
    ent.dispose();
    proin.dispose();
    co1.dispose();
  new ViewBillDetails().setVisible(true);
    entt.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
playSond.ButtonClick();
        b1.dispose();
    ent.dispose();
    proin.dispose();
   
    view.dispose();
    entt.dispose();
   new Contractorstart().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
playSond.ButtonClick();
    ent.dispose();
    proin.dispose();
    co1.dispose();
    view.dispose();
    entt.dispose();
    new budjetAndTaxes().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15MouseEntered

    private void jButton15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15MouseExited

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
playSond.ButtonClick();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        this.dispose();
        new login().setVisible(true);
}//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseEntered
        jLabel19.setForeground(Color.red);
}//GEN-LAST:event_jLabel19MouseEntered

    private void jLabel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseExited
        jLabel19.setForeground(Color.WHITE);
}//GEN-LAST:event_jLabel19MouseExited

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
        } catch (Exception e) {
            System.out.println(e);
        }

        new Homeframe().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
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
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables

}
