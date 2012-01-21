/*
 * startload.java
 *
 * Created on April 10, 2010, 1:52 PM
 */

package Imal;

import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.UIManager;



/**
 *
 * @author  PC
 */
public class startload extends javax.swing.JFrame {

    int progress = 0;
    Date dbDate;
    String proID;
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");




    /** Creates new form startload */
    public startload() {


        try {
            String fin = "Finish";
            Connection con = Db.getMyConnection();
            Statement st = con.createStatement();
            ResultSet rst = st.executeQuery("select EndDate,ProjectID from retention_bond");
            while(rst.next()){
            long  time1 = dateFormat.parse(rst.getString("EndDate")).getTime();
            long time2day = new Date().getTime();
            String proid1 = rst.getString("ProjectID");
                System.out.println(proid1);
           if(time1<=time2day){

               st.executeUpdate("update request set Status='"+fin+"' where RequestID =(select RequestID from request where RequestID = '"+proid1+"')");

           }



            }
        } catch (Exception e) {
        }



       
        initComponents();
         new Thread(new Runnable() {

            public void run() {
                jstartpro.setMinimum(0);
                jstartpro.setMaximum(100);
                
                for (int i = 1; i <= 100; i++) {
                    jstartpro.setValue(i);
                    
                
 

                    try{
                   
                        Thread.sleep(70);
                   
                    }catch(Exception e){
                       System.out.println(e);

                   }

                
                }
            }
        }).start();
        
        
         new Thread(new Runnable() {

            public void run() {
               
                
                while(true) {
                   timelabel.setText(Time.getDateTime());


                
 

                    try{
                   
                        Thread.sleep(1000);
                   
                    }catch(Exception e){
                       System.out.println(e);

                   }

                
                }
            }
        }).start();

        
        //java.awt.Rectangle[x=700,y=150,width=572,height=437]


        //massage dialog for performance bond

         try {
             
            
            Connection con = Db.getMyConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select pb_EndDate,ProjectID from performance_bond ");


            
            Date today = dateFormat.parse(Time.getDateTime());

            int datytodaty = Integer.parseInt(dateFormat.format(dateFormat.parse(Time.getDateTime())).split("/")[2]);
            int yeartoday =  Integer.parseInt(dateFormat.format(dateFormat.parse(Time.getDateTime())).split("/")[0]);
            int monthtoday = Integer.parseInt(dateFormat.format(dateFormat.parse(Time.getDateTime())).split("/")[1]);

            

            while(rs.next()){

                dbDate = dateFormat.parse(rs.getString("pb_EndDate"));
                proID = rs.getString("ProjectID");
                int dbday =     Integer.parseInt(rs.getString("pb_EndDate").split("/")[2]);
                int dbyear =    Integer.parseInt(rs.getString("pb_EndDate").split("/")[0]);
                int dbmonth =   Integer.parseInt(rs.getString("pb_EndDate").split("/")[1]);
                
                long diffarance =  (dbDate.getTime()-today.getTime())/(60*60*24*1000);
                if(diffarance>0){


                if(diffarance==7 ){

                    

                    massage m0 = new massage();
                    m0.Bond(proID,"Performance Bond", diffarance-1);
                    m0.setBounds(80,240,572,437);
                    m0.setVisible(true);

                    
                }
                if(diffarance<=5 ){

                    
                    massage m1 = new massage();
                    m1.Bond(proID,"Performance Bond", diffarance-1);
                    m1.setBounds(80,100,572,437);
                    m1.setVisible(true);
                }

                if(yeartoday==dbyear & (monthtoday+1==dbmonth) & datytodaty==dbday   ){

                    

                    massage m2 = new massage();
                    m2.Bond(proID,"Performance Bond",diffarance-1);
                    m2.setVisible(true);
                    m2.setBounds(730,150,572,437);
                       
                }

                
                if(yeartoday+1==dbyear & monthtoday==12 & dbmonth==1 & datytodaty==dbday){

                    
                    massage m3 = new massage();
                    m3.Bond(proID,"Performance Bond", diffarance-1);
                    m3.setBounds(730,100,572,437);
                    m3.setVisible(true);
                    

                }

            }
            }
        
        } catch (Exception e) {
            System.out.println(e);

        }

        //Massage Daialog for Advance Bond



         try {


            Connection con = Db.getMyConnection();
            Statement st1 = con.createStatement();
            ResultSet rs = st1.executeQuery("select ab_EndDate,ProjectID from advance_bond ");



            Date today = dateFormat.parse(Time.getDateTime());

            int datytodaty = Integer.parseInt(dateFormat.format(dateFormat.parse(Time.getDateTime())).split("/")[2]);
            int yeartoday =  Integer.parseInt(dateFormat.format(dateFormat.parse(Time.getDateTime())).split("/")[0]);
            int monthtoday = Integer.parseInt(dateFormat.format(dateFormat.parse(Time.getDateTime())).split("/")[1]);



            while(rs.next()){

                dbDate = dateFormat.parse(rs.getString("ab_EndDate"));
                proID = rs.getString("ProjectID");
                int dbday =     Integer.parseInt(rs.getString("ab_EndDate").split("/")[2]);
                int dbyear =    Integer.parseInt(rs.getString("ab_EndDate").split("/")[0]);
                int dbmonth =   Integer.parseInt(rs.getString("ab_EndDate").split("/")[1]);

                long diffarance =  (dbDate.getTime()-today.getTime())/(60*60*24*1000);

                if(diffarance>0){

                if(diffarance==7 ){



                    massage m00 = new massage();
                    m00.Bond(proID,"AdvanceBond", diffarance-1);
                    m00.setBounds(80,255,572,437);
                    m00.setVisible(true);

                }
                if(diffarance<=5 ){
                    

                    massage m11 = new massage();
                    m11.Bond(proID,"AdvanceBond", diffarance-1);
                    m11.setBounds(80,115,572,437);
                    m11.setVisible(true);
                }

                if(yeartoday==dbyear & (monthtoday+1==dbmonth) & datytodaty==dbday   ){



                    massage m22 = new massage();
                    m22.Bond(proID,"AdvanceBond",diffarance-1);
                    m22.setVisible(true);
                    m22.setBounds(730,165,572,437);

                }


                if(yeartoday+1==dbyear & monthtoday==12 & dbmonth==1 & datytodaty==dbday){


                    massage m33 = new massage();
                    m33.Bond(proID,"AdvanceBond", diffarance-1);
                    m33.setBounds(730,115,572,437);
                    m33.setVisible(true);


                }

                }
            }

        } catch (Exception e) {
            System.out.println(e);

        }


        //Massage Dialog for Bid Bond


          try {


            Connection con = Db.getMyConnection();
            Statement st1 = con.createStatement();
            ResultSet rs = st1.executeQuery("select bb_EndDate,ProjectID from bid_bond ");



            Date today = dateFormat.parse(Time.getDateTime());

            int datytodaty = Integer.parseInt(dateFormat.format(dateFormat.parse(Time.getDateTime())).split("/")[2]);
            int yeartoday =  Integer.parseInt(dateFormat.format(dateFormat.parse(Time.getDateTime())).split("/")[0]);
            int monthtoday = Integer.parseInt(dateFormat.format(dateFormat.parse(Time.getDateTime())).split("/")[1]);



            while(rs.next()){

                dbDate = dateFormat.parse(rs.getString("bb_EndDate"));
                proID = rs.getString("ProjectID");
                int dbday =     Integer.parseInt(rs.getString("bb_EndDate").split("/")[2]);
                int dbyear =    Integer.parseInt(rs.getString("bb_EndDate").split("/")[0]);
                int dbmonth =   Integer.parseInt(rs.getString("bb_EndDate").split("/")[1]);

                long diffarance =  (dbDate.getTime()-today.getTime())/(60*60*24*1000);

                if(diffarance>0){

                if(diffarance==7 ){



                    massage m000 = new massage();
                    m000.Bond(proID,"BidBond", diffarance-1);
                    m000.setBounds(80,245,572,437);
                    m000.setVisible(true);

                }
                if(diffarance<=5 ){


                    massage m111 = new massage();
                    m111.Bond(proID,"BidBond", diffarance-1);
                    m111.setBounds(80,105,572,437);
                    m111.setVisible(true);
                }

                if(yeartoday==dbyear & (monthtoday+1==dbmonth) & datytodaty==dbday   ){



                    massage m222 = new massage();
                    m222.Bond(proID,"BidBond",diffarance-1);
                    m222.setVisible(true);
                    m222.setBounds(730,155,572,437);

                }


                if(yeartoday+1==dbyear & monthtoday==12 & dbmonth==1 & datytodaty==dbday){


                    massage m333 = new massage();
                    m333.Bond(proID,"BidBond", diffarance-1);
                    m333.setBounds(730,105,572,437);
                    m333.setVisible(true);


                }

            }
            }

        } catch (Exception e) {
            System.out.println(e);

        }





    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollBar2 = new javax.swing.JScrollBar();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollBar3 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jstartpro = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        timelabel = new javax.swing.JLabel();
        copyright = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setEnabled(false);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jstartpro.setForeground(new java.awt.Color(0, 51, 255));
        jstartpro.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jstartproStateChanged(evt);
            }
        });
        jPanel1.add(jstartpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 430, 632, 6));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Loding....");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 90, 20));

        timelabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(timelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 120, 20));

        copyright.setFont(new java.awt.Font("Tahoma", 0, 10));
        copyright.setForeground(new java.awt.Color(255, 255, 255));
        copyright.setText("OrionTech creation");
        jPanel1.add(copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imal/law.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-648)/2, (screenSize.height-514)/2, 648, 514);
    }// </editor-fold>//GEN-END:initComponents

private void jstartproStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jstartproStateChanged

    ++progress;

    if(progress == 98){

        this.setVisible(false);

        new login().setVisible(true);

}
    if (progress>80 & progress<98) {
        copyright.setVisible(true);

    }else {

        copyright.setVisible(false);
    
    }
}//GEN-LAST:event_jstartproStateChanged

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
        } catch (Exception e) {
            //System.out.println(e);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new startload().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel copyright;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollBar jScrollBar2;
    private javax.swing.JScrollBar jScrollBar3;
    private javax.swing.JProgressBar jstartpro;
    private javax.swing.JLabel timelabel;
    // End of variables declaration//GEN-END:variables

}
