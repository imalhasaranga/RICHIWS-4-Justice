/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * adv_retensionBond.java
 *
 * Created on Apr 13, 2010, 4:56:50 PM
 */ //

package Rina;

import Chathura.DB;
import Imal.playSond;
import com.mysql.jdbc.Connection;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.UIManager;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JRViewer;

/**
 *
 * @author User
 */
public class adv_retensionBond extends javax.swing.JFrame {

    String projectid2;
    String proid(String a){
    projectid2 = a;

  return a;}
    
    
    void advbond1(){
     
        tf_bond_id.setText(projectid2);



        try {
                Connection con = (Connection) Db.getMyConnection();
                Statement stmt = (Statement) con.createStatement();

                ResultSet rset4 = stmt.executeQuery("select ProjectName,ContractorPrice from project where ProjectID = '"+tf_bond_id.getText()+"'");
                while(rset4.next()){
                     tf_bond_name.setText(rset4.getString("ProjectName"));
                     tf_bond_total.setText(rset4.getString("ContractorPrice"));
                }

               ResultSet rset5 = stmt.executeQuery("select * from advance_bond where ProjectID = '"+tf_bond_id.getText()+"'");
                    while(rset5.next()){
                     tf_bond_startdate.setText(rset5.getString("ab_StartDate"));
                     tf_bond_enddate.setText(rset5.getString("ab_EndDate"));
                     tf_bond_percentage.setText(rset5.getString("ab_Percentage"));
                     tf_bond_value.setText(rset5.getString("Value"));

                   Date today = new Date();
                   DateFormat format1 = new SimpleDateFormat("yyyy/MM/dd");
                   Date ab_start = format1.parse(rset5.getString("ab_StartDate"));
                   Date ab_End = format1.parse(rset5.getString("ab_EndDate"));

                   long rangefullpb =ab_End.getTime()-ab_start.getTime();
                   long rangepb = today.getTime()-ab_start.getTime();
                   double r11 = rangefullpb;
                   double r22 = rangepb;
                   

                   int pre11 = (int)((r22/r11)*1000);
                   double presantage1 = ((double)pre11)/10;
                   String FinalPresantage = String.valueOf(presantage1);
                   prog1.setText(FinalPresantage+"%");

                   pro1.setMinimum(0);
                   pro1.setMaximum(100);
                   pro1.setValue((int) presantage1);

                }


             ResultSet rset7 =  stmt.executeQuery("select * from bill_detail where ProjectID = '"+tf_bond_id.getText()+"' ");

             while(rset7.next()){

            Vector v7 = new Vector();
            String projectID = rset7.getString("ProjectID");
            String BilNo = rset7.getString("BillNo");
            String BillTitle = rset7.getString("BillTitle");
            String Billdate = rset7.getString("BillDate");
            String billAmount = rset7.getString("BillAmount");
            String advanceDeduction = rset7.getString("AdvanceDeduction");
            String RetentionDeduction = rset7.getString("RetensionDeduction");
            String finalamount = rset7.getString("FinalAmount");
            

            
            if(!advanceDeduction.isEmpty()){

               // stmt.executeUpdate("Insert into advance_deduction values('"+projectID+"','"+BilNo+"','"+BillTitle+"','"+Billdate+"','"+billAmount+"','"+finalamount+"','"+RetentionDeduction+"','"+advanceDeduction+"')");

                System.out.println("lop");


            }
             
             
             }




            Date d1 = new Date();
            DateFormat f1 = new SimpleDateFormat("yyyy/mm/dd");
            String date1 = f1.format(d1);

            String reportSource = playSond.path_reso+"/JasperReports/AdvanceBo.jrxml";
            Map<String, Object>params = new HashMap<String, Object>();

            params.put("ReportDate",date1);
            params.put("ProID",tf_bond_id.getText());
            params.put("ProName",tf_bond_name.getText());
            params.put("BondVal",tf_bond_value.getText());
            params.put("Bondpri1",tf_bond_startdate.getText());
            params.put("Bondpri2",tf_bond_enddate.getText());
            params.put("paraProId",tf_bond_id.getText());




            JasperReport jasperReport = JasperCompileManager.compileReport(reportSource);
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params,con);

            con.close();
            JRViewer h = new JRViewer(jasperPrint);
            bonds_tabbedpane.add("Complete Report on Retension Deduction", h);
            h.setZoomRatio((float) 0.7);
            con.close();




              
   
 
           
           
           
}catch(Exception e){
       System.out.println(e);


}

      try {

            String reportSource1 = playSond.path_reso+"/JasperReports/GraphRetention.jrxml";
            Map<String, Object>params = new HashMap<String, Object>();
            params.put("Proid",tf_bond_id.getText());

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


    /** Creates new form adv_retensionBond */
    public adv_retensionBond() {
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tf_bond_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_bond_name = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_bond_total = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_bond_value = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_bond_percentage = new javax.swing.JTextField();
        tf_bond_startdate = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tf_bond_enddate = new javax.swing.JTextField();
        pro1 = new javax.swing.JProgressBar();
        bonds_tabbedpane = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        prog1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Andalus", 2, 28));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rina/Play_32x32.png"))); // NOI18N
        jLabel1.setText("Advance Bond ");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("Project ID");

        tf_bond_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_bond_idActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setText("Project Name");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel11.setText("Date of Agreement");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel6.setText("Total Value");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel8.setText("Bond Value");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel10.setText("Percentage from whole");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel14.setText("End Date");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tf_bond_startdate, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(tf_bond_total, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_bond_percentage)
                            .addComponent(tf_bond_enddate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_bond_value, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tf_bond_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                    .addComponent(tf_bond_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addGap(2, 2, 2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tf_bond_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_bond_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_bond_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_bond_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(tf_bond_percentage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_bond_enddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_bond_startdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addGap(19, 19, 19))
        );

        prog1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jToolBar1.setBackground(new java.awt.Color(255, 102, 102));
        jToolBar1.setRollover(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bonds_tabbedpane, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(216, 216, 216)
                                .addComponent(prog1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jTabbedPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prog1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bonds_tabbedpane, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
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
        setBounds((screenSize.width-863)/2, (screenSize.height-669)/2, 863, 669);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_bond_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_bond_idActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tf_bond_idActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
playSond.ButtonClick();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
         try {

            UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());


        } catch (Exception e) {
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adv_retensionBond().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane bonds_tabbedpane;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JProgressBar pro1;
    private javax.swing.JLabel prog1;
    private javax.swing.JTextField tf_bond_enddate;
    private javax.swing.JTextField tf_bond_id;
    private javax.swing.JTextField tf_bond_name;
    private javax.swing.JTextField tf_bond_percentage;
    private javax.swing.JTextField tf_bond_startdate;
    private javax.swing.JTextField tf_bond_total;
    private javax.swing.JTextField tf_bond_value;
    // End of variables declaration//GEN-END:variables

}
