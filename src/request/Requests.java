package request;


import Imal.playSond;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Requests.java
 *
 * Created on Apr 10, 2010, 11:34:41 PM
 */

/**
 
 * @author HP
 */
public class Requests extends javax.swing.JFrame {
     String id ;

    /** Creates new form Requests */
    public Requests() {
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        com1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb12 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        com2 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/request/right_16.png"))); // NOI18N
        jButton2.setText("Start Project");
        jButton2.setIconTextGap(-80);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/request/Stop_16x16.png"))); // NOI18N
        jButton3.setText("Ignore Project");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        com1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Year", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        com1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setText("Prioritize :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("Description :");

        tb12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RequestID", "Judicial Zone", "Court Name", "Scale", "Requested Date", "Priority", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb12MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb12);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setText("Year :");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/request/save_16.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setText("Search By :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setText("Judicial Zone   :");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Ampare", "Anuradhapura", "Badulla", "Batticoloa", "Colombo", "Galle", "Gampaha", "Hambantota", "Jaffna", "Kalutara", "Kandy", "Kegalle", "Killinochchi", "Kurunegala", "Mannar", "Matale", "Matara", "Moneragala", "Mullativu", "Nuwara Eliya", "Pollonnaruwa", "Puttlam", "Ratnapura", "Trincomalee", "Vavuniya" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        com2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Search by year", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        com2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addGap(48, 48, 48)
                        .addComponent(com2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(614, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)
                        .addComponent(com1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addContainerGap(28, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(com2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(com1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(26, 26, 26))
        );

        jLabel9.setFont(new java.awt.Font("Andalus", 0, 28));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/request/List.png"))); // NOI18N
        jLabel9.setText("Requests");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(525, 525, 525)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-735)/2, (screenSize.height-587)/2, 735, 587);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
if(!tb12.getValueAt(tb12.getSelectedRow(), 6).toString().equals("")){
   playSond.ButtonClick();
        if(!tb12.getValueAt(tb12.getSelectedRow(), 0).equals(null) ){

    Object[] options = { "YES", "CANCEL" };
            int respon = JOptionPane.showOptionDialog(null, "Are You Sure You want to Proceed", "Warning",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, options, options[0]);

          if(respon == 0){




        String id2 = tb12.getValueAt(tb12.getSelectedRow(), 0).toString();

       try{

        Statement s=Db.getcon().createStatement();
        s.executeUpdate("update request set Status ='On Going' where RequestID = '"+id2+"' ");

        
        }catch(Exception a){
            System.out.println(a);
        }


        this.dispose();

        BidBond a = new BidBond();
        a.setVisible(true);
        a.id(id2);
        
        
        id2 = null;
          }
        }
}else{
        JOptionPane.showMessageDialog(null,"Please Prioratice");

        }



    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
         DefaultTableModel tm=(DefaultTableModel) tb12.getModel();
         tm.setRowCount(0);

        try {

            String select=(String) jComboBox3.getSelectedItem();
            Statement s = Db.getcon().createStatement();
            ResultSet rs = s.executeQuery("Select * From request Where JudicalZone = '"+select+"'");

            while(rs.next()){
                Vector v=new Vector();
                 v.add(rs.getString("RequestID"));
                v.add(rs.getString("JudicalZone"));
                v.add(rs.getString("CourtName"));
                v.add(rs.getString("Scale"));
                v.add(rs.getString("RequestedDate"));
                v.add(rs.getString("Priority"));
                v.add(rs.getString("Status"));
                tm.addRow(v);
            }
        }
                catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void tb12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb12MouseClicked
       id= tb12.getValueAt(tb12.getSelectedRow(), 0).toString();
        System.out.println(id);
        
        try {
            Statement s=Db.getcon().createStatement();
            ResultSet des=s.executeQuery("Select Description From request Where RequestID = '"+id+"'");
           if(des.next()){
                jTextArea1.setText(des.getString("Description"));
            }else{
                jTextArea1.setText(null);

            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_tb12MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
playSond.ButtonClick();
        String year1 = com1.getSelectedItem().toString();

        if(!year1.equals("Select Year")){
             try{

        Statement s=Db.getcon().createStatement();
        s.executeUpdate("update request set Priority ='"+year1+"' where RequestID = '"+id+"' ");
        tb12.setValueAt(year1, tb12.getSelectedRow(), 6);
        id = null;
        }catch(Exception a){
            System.out.println(a);
        }
        }else{

        JOptionPane.showMessageDialog(null, "Please prioratice");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
playSond.ButtonClick();

        String id22 = tb12.getValueAt(tb12.getSelectedRow(), 0).toString();

        
       try{

        Statement s=Db.getcon().createStatement();
        s.executeUpdate("update request set Status ='"+"Rejected"+"' where RequestID = '"+id22+"' ");

        id22 = null;
        }catch(Exception a){
            System.out.println(a);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void com2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com2ActionPerformed

        String year11 = com2.getSelectedItem().toString();
        
        DefaultTableModel tm=(DefaultTableModel) tb12.getModel();
        tm.setRowCount(0);

        try {
            Statement s=Db.getcon().createStatement();
            ResultSet rs=s.executeQuery("Select * From request Where Year = '"+year11+"'");

            while(rs.next()){
                Vector v=new Vector();
                v.add(rs.getString("RequestID"));
                v.add(rs.getString("JudicalZone"));
                v.add(rs.getString("CourtName"));
                v.add(rs.getString("Scale"));
                v.add(rs.getString("RequestedDate"));
                v.add(rs.getString("Priority"));
                v.add(rs.getString("Status"));
                tm.addRow(v);

            }


        }
                catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_com2ActionPerformed

    private void com1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_com1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, "Not Found");
       }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Requests().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox com1;
    private javax.swing.JComboBox com2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tb12;
    // End of variables declaration//GEN-END:variables

}
