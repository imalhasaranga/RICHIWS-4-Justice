/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Request2.java
 *
 * Created on 13-Apr-2010, 16:46:29
 */

package Sajeewa;

import Imal.playSond;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saj
 */
public class Request2 extends javax.swing.JFrame {

 static String getReqYear;
 static String getReqJZone;
 static String getReqScale;

  DefaultTableModel dft1;

     String getYear(String req_year ){
        getReqYear =    req_year;
         System.out.println(getReqYear);
        return req_year;
    }

     String getJZone(String req_jZone ){
        getReqJZone =    req_jZone;

        return req_jZone;
    }

     String getScale(String req_scale ){
        getReqScale =    req_scale;

        return req_scale;
    }

public void setResult(){
    String x;
        x = getReqYear;
        System.out.println(x+"HI");
yearComboBox.setSelectedItem(getReqYear);
jZoneComboBox.setSelectedItem(getReqJZone);
scaleComboBox.setSelectedItem(getReqScale);

    try {
          Connection con_req = DB.getCon();
          Statement state_req = con_req.createStatement();
          ResultSet rset_req = state_req.executeQuery("select *  from request where Year ='"+x+"' and JudicalZone = '"+getReqJZone+"' and Scale = '"+getReqScale+"'");
        
          dft1 = (DefaultTableModel) requestTable.getModel();
          dft1.setRowCount(0);
             while(rset_req.next()){
                    Vector v1 = new Vector();
                    v1.add(rset_req.getString("RequestId"));
                    v1.add(rset_req.getString("CourtName"));
                    v1.add(rset_req.getInt("Year"));
                    v1.add(rset_req.getString("JudicalZone"));
                    v1.add(rset_req.getString("Scale"));
                    v1.add(rset_req.getString("Status"));
                    v1.add(rset_req.getString("RequestedDate"));
               
                  
                    dft1.addRow(v1);
                }

          
            } catch (Exception e) {
                System.out.println(e);
            }
}
public void setResult1(){
yearComboBox.setSelectedItem(getReqYear);
yearComboBox.setEnabled(false);
jLabel2.setEnabled(false);
jLabel3.setVisible(false);
jLabel4.setVisible(false);
scaleComboBox.setVisible(false);
jZoneComboBox.setVisible(false);
updateButton.setVisible(false);
jButton1.setVisible(false);

    try {
          Connection con_req = DB.getCon();
          Statement state_req = con_req.createStatement();
          ResultSet rset_req = state_req.executeQuery("select *  from request where Year ='"+getReqYear+"'");

          dft1 = (DefaultTableModel) requestTable.getModel();
          dft1.setRowCount(0);
             while(rset_req.next()){
                    Vector v1 = new Vector();
                    v1.add(rset_req.getString("RequestId"));
                    v1.add(rset_req.getString("CourtName"));
                    v1.add(rset_req.getInt("Year"));
                    v1.add(rset_req.getString("JudicalZone"));
                    v1.add(rset_req.getString("Scale"));
                    v1.add(rset_req.getString("Status"));
                    v1.add(rset_req.getString("RequestedDate"));

                
                    dft1.addRow(v1);
                }


            } catch (Exception e) {
                System.out.println(e);
            }
}




public void setAllResults(){
yearComboBox.setSelectedItem(getReqYear);
jZoneComboBox.setSelectedItem(getReqJZone);
scaleComboBox.setSelectedItem(getReqScale);

     try {
          Connection con_req = DB.getCon();
          Statement state_req = con_req.createStatement();
          ResultSet rset_req = state_req.executeQuery("select *  from request ");

          dft1 = (DefaultTableModel) requestTable.getModel();
          dft1.setRowCount(0);
             while(rset_req.next()){
                    Vector v1 = new Vector();
                    v1.add(rset_req.getString("RequestId"));
                    v1.add(rset_req.getString("CourtName"));
                    v1.add(rset_req.getInt("Year"));
                    v1.add(rset_req.getString("JudicalZone"));
                    v1.add(rset_req.getString("Scale"));
                    v1.add(rset_req.getString("Status"));
                    v1.add(rset_req.getString("RequestedDate"));
                   
                  
                    dft1.addRow(v1);
                }

            } catch (Exception e) {
                System.out.println(e);
            }




}



    /** Creates new form Request2 */
    public Request2() {


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
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        proBrief = new javax.swing.JTextPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        yearComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jZoneComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        scaleComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Andalus", 1, 28));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sajeewa/Forward_32x32.png"))); // NOI18N
        jLabel1.setText("Requests Received To The Ministry");

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel7.setText("Project Brief");

        jScrollPane4.setViewportView(proBrief);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(35, 35, 35))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("Year");

        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "2009", "2010", "2011", "2012", "2013", "All" }));
        yearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setText("Judicial Zone");

        jZoneComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Ampare", "Anuradhapura", "Badulla", "Batticoloa", "Colombo", "Galle", "Gampaha", "Hambantota", "Jaffna", "Kalutara", "Kandy", "Kegalle", "Killinochchi", "Kurunegala", "Mannar", "Matale", "Matara", "Moneragala", "Mullativu", "Nuwara Eliya", "Pollonnaruwa", "Puttlam", "Ratnapura", "Trincomalee", "Vavuniya", "All" }));
        jZoneComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jZoneComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setText("Scale");

        scaleComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Large Scale Construction", "Small Scale Construction", "Repairs", "All" }));

        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Court Name", "Year", "Judicial zone", "Scale", "Status", "Requested Date"
            }
        ));
        requestTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requestTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(requestTable);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jZoneComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(33, 33, 33)
                        .addComponent(scaleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(130, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jZoneComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scaleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sajeewa/delete_16.png"))); // NOI18N
        jButton1.setText("Cancel");
        jButton1.setFocusable(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sajeewa/left_16.png"))); // NOI18N
        backButton.setText("Back");
        backButton.setFocusable(false);
        backButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        backButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sajeewa/Search_16x16.png"))); // NOI18N
        updateButton.setText("Search Again");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 509, Short.MAX_VALUE)
                .addComponent(updateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-868)/2, (screenSize.height-592)/2, 868, 592);
    }// </editor-fold>//GEN-END:initComponents

    private void yearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearComboBoxActionPerformed



    }//GEN-LAST:event_yearComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
playSond.ButtonClick();
        this.dispose();


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
playSond.ButtonClick();

        String searchYear, searchjZone, searchScale;
searchYear= yearComboBox.getSelectedItem().toString();
searchjZone = jZoneComboBox.getSelectedItem().toString();
searchScale = scaleComboBox.getSelectedItem().toString();
if(searchYear.equals("All")&& searchjZone.equals("All Judicial Zones")&& searchScale.equals("All")){
    
 try {
          Connection con_search1 = DB.getCon();
          Statement state_search1 = con_search1.createStatement();
          ResultSet rset_search1 = state_search1.executeQuery("select *  from request ");

          dft1 = (DefaultTableModel) requestTable.getModel();
          dft1.setRowCount(0);
             while(rset_search1.next()){
                    Vector v1 = new Vector();
                    v1.add(rset_search1.getString("RequestId"));
                    v1.add(rset_search1.getString("CourtName"));
                    v1.add(rset_search1.getInt("Year"));
                    v1.add(rset_search1.getString("JudicalZone"));
                    v1.add(rset_search1.getString("Scale"));
                    v1.add(rset_search1.getString("Status"));
                    v1.add(rset_search1.getString("RequestedDate"));
                   
                 
                    dft1.addRow(v1);
                }

            } catch (Exception e) {
                System.out.println(e);
            }

     }
else if(searchYear.equals("Select")||searchjZone.equals("Select")||searchScale.equals("Select")){
       if(searchYear.equals("Select")){
            JOptionPane.showMessageDialog(null, "Please select the year you want to search for");

       }
       else if(searchScale.equals("Select")){
        JOptionPane.showMessageDialog(null, "Please select the scale you want to search for");
       }
       else if(searchjZone.equals("Select")){
           
        JOptionPane.showMessageDialog(null, "Please select the Judicial Zone you want to search for");
       }

  }          
else if(searchYear.equals("All")&& searchScale.equals("All")){
     try {
          Connection con_search1 = DB.getCon();
          Statement state_search1 = con_search1.createStatement();
          ResultSet rset_search1 = state_search1.executeQuery("select *  from request where JudicalZone = '"+searchjZone+"'");

          dft1 = (DefaultTableModel)requestTable.getModel();
          dft1.setRowCount(0);
             while(rset_search1.next()){
                    Vector v1 = new Vector();
                    v1.add(rset_search1.getString("RequestId"));
                    v1.add(rset_search1.getString("CourtName"));
                    v1.add(rset_search1.getInt("Year"));
                    v1.add(rset_search1.getString("JudicalZone"));
                    v1.add(rset_search1.getString("Scale"));
                    v1.add(rset_search1.getString("Status"));
                    v1.add(rset_search1.getString("RequestedDate"));

                  //  v1.add(rset1.getInt("ContracterID"));
                    dft1.addRow(v1);
                }

            } catch (Exception e) {
                System.out.println(e);
            }

        }
    
    
 
 else if(searchjZone.equals("All Judicial Zones")&& searchScale.equals("All")){

  try {
          Connection con_search1 = DB.getCon();
          Statement state_search1 = con_search1.createStatement();
          ResultSet rset_search1 = state_search1.executeQuery("select *  from request where Year = '"+searchYear+"'");

          dft1 = (DefaultTableModel) requestTable.getModel();
          dft1.setRowCount(0);
             while(rset_search1.next()){
                   Vector v1 = new Vector();
                    v1.add(rset_search1.getString("RequestId"));
                    v1.add(rset_search1.getString("CourtName"));
                    v1.add(rset_search1.getInt("Year"));
                    v1.add(rset_search1.getString("JudicalZone"));
                    v1.add(rset_search1.getString("Scale"));
                    v1.add(rset_search1.getString("Status"));
                    v1.add(rset_search1.getString("RequestedDate"));
                    
                 
                    dft1.addRow(v1);
                }

            } catch (Exception e) {
                System.out.println(e);
            }

            }
 else if(searchjZone.equals("All Judicial Zones")&& searchYear.equals("All")){

  try {
          Connection con_search1 = DB.getCon();
          Statement state_search1 = con_search1.createStatement();
          ResultSet rset_search1 = state_search1.executeQuery("select *  from request where Scale = '"+searchScale+"'");

          dft1 = (DefaultTableModel) requestTable.getModel();
          dft1.setRowCount(0);
             while(rset_search1.next()){
                    Vector v1 = new Vector();
                    v1.add(rset_search1.getString("RequestId"));
                    v1.add(rset_search1.getString("CourtName"));
                    v1.add(rset_search1.getInt("Year"));
                    v1.add(rset_search1.getString("JudicalZone"));
                    v1.add(rset_search1.getString("Scale"));
                    v1.add(rset_search1.getString("Status"));
                    v1.add(rset_search1.getString("RequestedDate"));
                    
                  
                    dft1.addRow(v1);
                }

            } catch (Exception e) {
                System.out.println(e);
            }

            }
else if(searchjZone.equals("All Judicial Zones")){

  try {
          Connection con_search1 = DB.getCon();
          Statement state_search1 = con_search1.createStatement();
          ResultSet rset_search1 = state_search1.executeQuery("select *  from request where Scale = '"+searchScale+"' and Year = '"+searchYear+"'" );

          dft1 = (DefaultTableModel) requestTable.getModel();
          dft1.setRowCount(0);
             while(rset_search1.next()){
                    Vector v1 = new Vector();
                    v1.add(rset_search1.getString("RequestId"));
                    v1.add(rset_search1.getString("CourtName"));
                    v1.add(rset_search1.getInt("Year"));
                    v1.add(rset_search1.getString("JudicalZone"));
                    v1.add(rset_search1.getString("Scale"));
                    v1.add(rset_search1.getString("Status"));
                    v1.add(rset_search1.getString("RequestedDate"));
                  
                 
                    dft1.addRow(v1);
                }

            } catch (Exception e) {
                System.out.println(e);
            }

            }
else if(searchYear.equals("All")){

  try {
          Connection con_search1 = DB.getCon();
          Statement state_search1 = con_search1.createStatement();
          ResultSet rset_search1 = state_search1.executeQuery("select *  from request where Scale = '"+searchScale+"' and JudicalZone = '"+searchjZone+"'");

          dft1 = (DefaultTableModel) requestTable.getModel();
          dft1.setRowCount(0);
             while(rset_search1.next()){
                    Vector v1 = new Vector();
                    v1.add(rset_search1.getString("RequestId"));
                    v1.add(rset_search1.getString("CourtName"));
                    v1.add(rset_search1.getInt("Year"));
                    v1.add(rset_search1.getString("JudicalZone"));
                    v1.add(rset_search1.getString("Scale"));
                    v1.add(rset_search1.getString("Status"));
                    v1.add(rset_search1.getString("RequestedDate"));
              
                
                    dft1.addRow(v1);
                }

            } catch (Exception e) {
                System.out.println(e);
            }

            }
else if(searchScale.equals("All")){

  try {
          Connection con_search1 = DB.getCon();
          Statement state_search1 = con_search1.createStatement();
          ResultSet rset_search1 = state_search1.executeQuery("select *  from request where Year = '"+searchYear+"' and JudicalZone = '"+searchjZone+"'");

          dft1 = (DefaultTableModel) requestTable.getModel();
          dft1.setRowCount(0);
             while(rset_search1.next()){
                    Vector v1 = new Vector();
                    v1.add(rset_search1.getString("RequestId"));
                    v1.add(rset_search1.getString("CourtName"));
                    v1.add(rset_search1.getInt("Year"));
                    v1.add(rset_search1.getString("JudicalZone"));
                    v1.add(rset_search1.getString("Scale"));
                    v1.add(rset_search1.getString("Status"));
                    v1.add(rset_search1.getString("RequestedDate"));

                
                    dft1.addRow(v1);
                }

            } catch (Exception e) {
                System.out.println(e);
            }

            }
else{
     try {
          Connection con_search1 = DB.getCon();
          Statement state_search1 = con_search1.createStatement();
          ResultSet rset_search1 = state_search1.executeQuery("select *  from request where Year = '"+searchYear+"' and JudicalZone = '"+searchjZone+"' and Scale = '"+searchScale+"'");

          dft1 = (DefaultTableModel) requestTable.getModel();
          dft1.setRowCount(0);
             while(rset_search1.next()){
                    Vector v1 = new Vector();
                    v1.add(rset_search1.getString("RequestId"));
                    v1.add(rset_search1.getString("CourtName"));
                    v1.add(rset_search1.getInt("Year"));
                    v1.add(rset_search1.getString("JudicalZone"));
                    v1.add(rset_search1.getString("Scale"));
                    v1.add(rset_search1.getString("Status"));
                    v1.add(rset_search1.getString("RequestedDate"));

                
                    dft1.addRow(v1);
                }

            } catch (Exception e) {
                System.out.println(e);
            }


}
        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
 playSond.ButtonClick();
        Request1 frame = new Request1();
 this.dispose();
 frame.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void jZoneComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jZoneComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jZoneComboBoxActionPerformed

    private void requestTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestTableMouseClicked
  String requestID =requestTable.getValueAt(requestTable.getSelectedRow(), 0).toString();
        System.out.println(requestID);
 try{
   Connection con_search2 = DB.getCon();
   Statement state_1= con_search2.createStatement();
   ResultSet rset1= state_1.executeQuery("select * from request where RequestID = '"+requestID+"' ");
   
               while (rset1.next()) {
               Vector v1 = new Vector();
               v1.add(rset1.getString("Description"));
               proBrief.setText(v1.firstElement().toString());
               }
 }
   catch(Exception e){
       System.out.println(e);
   }
    }//GEN-LAST:event_requestTableMouseClicked
  
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
//        Request2 rq = new Request2();
//        rq.setResult();
              try {
        UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());


        }
        catch (Exception e) {


        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Request2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox jZoneComboBox;
    private javax.swing.JTextPane proBrief;
    public javax.swing.JTable requestTable;
    private javax.swing.JComboBox scaleComboBox;
    private javax.swing.JButton updateButton;
    private javax.swing.JComboBox yearComboBox;
    // End of variables declaration//GEN-END:variables

}
