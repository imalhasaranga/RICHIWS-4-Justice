/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * retension_bond.java
 *
 * Created on Apr 18, 2010, 11:12:45 PM
 */

package Rina;

import Chathura.DB;
import Imal.playSond;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JRViewer;

/**
 *
 * @author User
 */
public class retension_bond extends javax.swing.JFrame {
  static String projectid2;
   static String proid(String a){
    projectid2 = a;
    return a;
   }
   void retbond1(){

       tf_rbond_id.setText(projectid2);

try {
                Connection con = (Connection) Db.getMyConnection();
                Statement stmt = (Statement) con.createStatement();

                ResultSet rset4 = stmt.executeQuery("select ProjectName,ContractorPrice from project where ProjectID = '"+tf_rbond_id.getText()+"'");
                while(rset4.next()){
                     tf_rbond_name.setText(rset4.getString("ProjectName"));
                     tf_rbond_total.setText(rset4.getString("ContractorPrice"));
                }

               ResultSet rset5 = stmt.executeQuery("select * from retention_bond where ProjectID = '"+tf_rbond_id.getText()+"'");
                    while(rset5.next()){
                     tf_rbond_startdate.setText(rset5.getString("StartDate"));
                     tf_rbond_enddate.setText(rset5.getString("EndDate"));
                     tf_rbond_percentage.setText(rset5.getString("Percentage"));
                     tf_rbond_value.setText(rset5.getString("Value"));


                   Date today = new Date();
                   DateFormat format1 = new SimpleDateFormat("yyyy/MM/dd");
                   Date re_start = format1.parse(rset5.getString("StartDate"));
                   Date re_End = format1.parse(rset5.getString("EndDate"));

                   long rangefullpb =re_End.getTime()-re_start.getTime();
                   long rangepb = today.getTime()-re_start.getTime();
                   double r11 = rangefullpb;
                   double r22 = rangepb;

                   int pre11 = (int)((r22/r11)*1000);
                   double presantage1 = ((double)pre11)/10;
                   String FinalPresantage = String.valueOf(presantage1);
                   Propre.setText(FinalPresantage+"%");

                   jProgressBar1.setMinimum(0);
                   jProgressBar1.setMaximum(100);
                   jProgressBar1.setValue((int) presantage1);

                }


             ResultSet rset7 =  stmt.executeQuery("select * from bill_detail where ProjectID = '"+tf_rbond_id.getText()+"' ");
             while (rset7.next()){
            Vector v7 = new Vector();
            v7.add(rset7.getString("ProjectID"));
            v7.add(rset7.getString("BillNo"));
            v7.add(rset7.getString("BillTitle"));
            v7.add(rset7.getString("BillDate"));
            v7.add(rset7.getString("BillAmount"));
            v7.add(rset7.getString("AdvanceDeduction"));
            v7.add(rset7.getString("RetensionDeduction"));
            v7.add(rset7.getString("FinalAmount"));
            String retensionDeduction = rset7.getString("RetensionDeduction");
             
            if(!retensionDeduction .isEmpty()){

           //stmt.executeUpdate("Insert into advance_deduction values('"+rset7.getString("ProjectID")+"','"+rset7.getString("BillNo")+"','"+rset7.getString("BillTitle")+"','"+rset7.getString("BillDate")+"','"+rset7.getString("BillAmount")+"','"+rset7.getString("FinalAmount")+"','"+rset7.getString("RetensionDeduction")+"','"+rset7.getString("AdvanceDeduction")+"')");
            }

          

            Date d1 = new Date();
            DateFormat f1 = new SimpleDateFormat("yyyy/mm/dd");
            String date1 = f1.format(d1);

            String reportSource = playSond.path_reso+"/JasperReports/Retentt.jrxml";
            Map<String, Object>params = new HashMap<String, Object>();

            params.put("ReportDate",date1);
            params.put("ProID",tf_rbond_id.getText());
            params.put("ProName",tf_rbond_name.getText());
            params.put("BondVal",tf_rbond_value.getText());
            params.put("Bondpri1",tf_rbond_startdate.getText());
            params.put("Bondpri2",tf_rbond_enddate.getText());
            params.put("paraProId",tf_rbond_id.getText());




            JasperReport jasperReport = JasperCompileManager.compileReport(reportSource);
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params,con);

            con.close();
            JRViewer h = new JRViewer(jasperPrint);
            rbonds_tabbedpane.add("Complete Report on Retension Deduction", h);
            h.setZoomRatio((float) 0.7);
            con.close();


          
    
       }
 }catch(Exception e){
       System.out.println(e);
}
       try {
            String reportSource1 = playSond.path_reso+"/JasperReports/GraphRetention.jrxml";
            Map<String, Object>params = new HashMap<String, Object>();
            params.put("Proid",tf_rbond_id.getText());

            JasperReport jasperReport1 = JasperCompileManager.compileReport(reportSource1);
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = (Connection) DB.getMyConnectionForJasper();
            JasperPrint jasperPrint1 = JasperFillManager.fillReport(jasperReport1, params,con);

            con.close();
            JRViewer h1 = new JRViewer(jasperPrint1);
            jTabbedPane2.add("Bill Patern", h1);
            h1.setZoomRatio((float) 0.5);
            con.close();
       } catch (Exception e) {
           System.out.println(e);
       }

}
    /** Creates new form retension_bond */
    public retension_bond() {
        initComponents();
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
        jProgressBar1 = new javax.swing.JProgressBar();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        Propre = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tf_rbond_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_rbond_name = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_rbond_total = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_rbond_value = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_rbond_percentage = new javax.swing.JTextField();
        tf_rbond_startdate = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tf_rbond_enddate = new javax.swing.JTextField();
        rbonds_tabbedpane = new javax.swing.JTabbedPane();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        Propre.setFont(new java.awt.Font("Tahoma", 1, 10));
        Propre.setText("1");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.white, null, null));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("Project ID        :");

        tf_rbond_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_rbond_idActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setText("Project Name   :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel11.setText("Date of Agreement :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel6.setText("Total Value      :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel8.setText("Bond Value :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel10.setText("Percentage from whole                      :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel14.setText("End Date  :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_rbond_id)
                            .addComponent(tf_rbond_name)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_rbond_total, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(tf_rbond_startdate, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tf_rbond_value, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_rbond_enddate, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                            .addComponent(tf_rbond_percentage, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)))))))
                    .addComponent(jLabel10))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_rbond_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_rbond_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_rbond_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tf_rbond_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_rbond_percentage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_rbond_startdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_rbond_enddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rina/left_16.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Andalus", 2, 28));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rina/Add_32x32.png"))); // NOI18N
        jLabel5.setText(" Retension Bond");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbonds_tabbedpane, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(247, 247, 247)
                                    .addComponent(Propre, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTabbedPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Propre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(rbonds_tabbedpane, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-870)/2, (screenSize.height-664)/2, 870, 664);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_rbond_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_rbond_idActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tf_rbond_idActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
playSond.ButtonClick();
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new retension_bond().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Propre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane rbonds_tabbedpane;
    private javax.swing.JTextField tf_rbond_enddate;
    private javax.swing.JTextField tf_rbond_id;
    private javax.swing.JTextField tf_rbond_name;
    private javax.swing.JTextField tf_rbond_percentage;
    private javax.swing.JTextField tf_rbond_startdate;
    private javax.swing.JTextField tf_rbond_total;
    private javax.swing.JTextField tf_rbond_value;
    // End of variables declaration//GEN-END:variables

}
