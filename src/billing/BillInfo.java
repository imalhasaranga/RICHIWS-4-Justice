/*
 * BillInfo.java
 *
 * Created on April 11, 2010, 1:11 AM
 */

package billing;

import Imal.playSond;
import Imal.validate1;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.UIManager;

/**
 *
 * @author  Chatura
 */
public class BillInfo extends javax.swing.JFrame {
String getAmountofAdvance;
String getBillAmount;
String setVAT;
String setNBT;
String setWHT;
String setVAT2;

    String mProjectID;
    String mContractorID;
    String mAdvanceValue;
    String mRetensionValue;
    String mVAT;
    String mNBT;
    String mWHT;
 //    String setRemainingAdvance;

    String getID(String y){

        String billDetail = y;
         System.out.println(y);

        try {

         Connection con = DB.getMyConnection();
         Statement st = con.createStatement();
         ResultSet rs =  st.executeQuery("SELECT * FROM bill_detail WHERE BillNo = '"+billDetail+"' ");



           if((rs.next())) {

            tFBillNo.setText(rs.getString("BillNo"));
            tFProjectID.setText(rs.getString("ProjectID"));
            tFContractor.setText(rs.getString("ContractorID"));
            tFReductionofAdvance.setText(rs.getString("AdvanceDeduction"));
            tFRetensionReduction.setText(rs.getString("RetensionDeduction"));
            tFReductionofWHT.setText(rs.getString("WHTAmount"));
            tFBillTitle.setText(rs.getString("BillTitle"));
//            tFBillTitle2.setText(rs.getString("BillTitle"));
            tFDate.setText(rs.getString("BillDate"));
            tFBillAmount.setText(rs.getString("BillAmount"));
            tFFinalBill2.setText(rs.getString("FinalAmount"));
            tFAdditionofNBT.setText(rs.getString("NBTAmount"));
            tFAdditionofVAT.setText(rs.getString("VATAmount"));
            tFVATReservation.setText(rs.getString("VATReservation"));

            }

        } catch (Exception e) {

            System.out.println(e);
        }

//        jButton1.setEnabled(false);

    return y;
    }

String getProjectInfo(String ProjectID, String ContractorID, String AdvanceValue, String RetensionValue, String WHT, String VAT, String NBT ){

 mProjectID = ProjectID;
 mContractorID = ContractorID;
 mAdvanceValue = AdvanceValue;
 mRetensionValue = RetensionValue;
 mVAT = VAT;
 mWHT = WHT;
 mNBT = NBT;
    
    
    
    
    
    /* tFProjectID.setText(ProjectID);
   tFContractor.setText(ContractorID);
   tFAmountofAdvance.setText(AdvanceValue);
   
   String getProID = tFProjectID.getText();

    try {

         Connection con = DB.getMyConnection();
         Statement st = con.createStatement();
         ResultSet rs =  st.executeQuery("SELECT * FROM advance_bond WHERE ProjectID = '"+getProID+"' ");



           if ((rs.next())) {
                    System.out.println("okkkk");
               tFRecoveryofAdvance.setText(rs.getString("RecoveredAmount"));

            }

        } catch (Exception e) {

            System.out.println(e);
        }

    double remainingAdvance = Double.parseDouble(tFAmountofAdvance.getText()) - Double.parseDouble(tFRecoveryofAdvance.getText());
    String setRemainingAdvance = String.valueOf(remainingAdvance);
    tFRemainingofAdvance.setText(setRemainingAdvance);

  
  //declairing & initializing double variables to get values from textfields
        String getreductionAdvance = tFReductionofAdvance.getText();
        double reductionAdvance = Double.parseDouble(getreductionAdvance);

        double billAmount = Double.parseDouble(getBillAmount);

        double retensionValue2 = Double.parseDouble(RetensionValue);

        double VAT2 = Double.parseDouble(VAT);
        double NBT2 = Double.parseDouble(NBT);
        double WHT2 = Double.parseDouble(WHT);







        double calVAT = billAmount*(VAT2*(2/3)/100);
        setVAT = String.valueOf(calVAT);*/









   
    



return ProjectID;
}

   
    /** Creates new form BillInfo */
    public BillInfo() {
        initComponents();

        
       
        String getProID = tFProjectID.getText();
        System.out.println(getProID);

       



        try{
        Connection con = DB.getMyConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT MAX(BillNo) as a FROM bill_detail ");

             if((rs.next())){
                tFBillNo.setText(String.valueOf(rs.getInt("a")+1));

             }



        }catch(Exception e){

        System.out.println(e);
        }
        Date now = new Date();

        String fdate = (DateFormat.getInstance().format(now));
        String date = fdate.split(" ")[0];
        tFDate.setText(date);


        setResizable(false);

        String w = tFBillNo.getText();
        System.out.println("done"+w);
        
       
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
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tFBillNo = new javax.swing.JTextField();
        tFDate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tFProjectID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tFContractor = new javax.swing.JTextField();
        tFBillTitle = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        tFReductionofAdvance = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tFRetensionReduction = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        tFAdditionofVAT = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tFReductionofWHT = new javax.swing.JTextField();
        tFAdditionofNBT = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tFVATReservation = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        tFBillAmount = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tFFinalBill2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Andalus", 0, 36));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/clipboard_32.png"))); // NOI18N
        jLabel1.setText("Bill Information");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(415, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel7.setText("Date");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setText("Bill No");

        tFBillNo.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("Project ID");

        tFProjectID.setEditable(false);
        tFProjectID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tFProjectIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tFProjectIDFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setText("Contractor ID");

        tFContractor.setEditable(false);

        tFBillTitle.setFont(new java.awt.Font("Andalus", 1, 24));
        tFBillTitle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tFBillTitleFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tFBillTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tFProjectID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(tFContractor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(tFBillNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(tFDate, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tFBillNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFProjectID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFContractor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tFBillTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/left_16.png"))); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/delete_16.png"))); // NOI18N
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tFReductionofAdvance.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tFReductionofAdvanceFocusLost(evt);
            }
        });
        tFReductionofAdvance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tFReductionofAdvanceKeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel12.setText("Advance");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel14.setText("Retension");

        tFRetensionReduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFRetensionReductionActionPerformed(evt);
            }
        });
        tFRetensionReduction.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tFRetensionReductionFocusLost(evt);
            }
        });
        tFRetensionReduction.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tFRetensionReductionKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel6.setText("Reductions for");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel16.setText("VAT Addition");

        tFAdditionofVAT.setEditable(false);
        tFAdditionofVAT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tFAdditionofVATFocusGained(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel17.setText("NBT Addition");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel15.setText("WHT Reduction");

        tFReductionofWHT.setEditable(false);

        tFAdditionofNBT.setEditable(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel18.setText("VAT Reservation");

        tFVATReservation.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel11.setText("Rs");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel19.setText("Rs");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel20.setText("Rs");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel21.setText("Rs");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tFVATReservation)
                    .addComponent(tFAdditionofNBT)
                    .addComponent(tFAdditionofVAT, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(tFReductionofWHT))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tFAdditionofNBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tFAdditionofVAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tFReductionofWHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                            .addComponent(tFVATReservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel10.setText("Rs");

        jLabel99.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel99.setText("Rs");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel99))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tFRetensionReduction)
                            .addComponent(tFReductionofAdvance, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tFReductionofAdvance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tFRetensionReduction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel99))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        tFBillAmount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tFBillAmountFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel8.setText("Bill Amount");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel13.setText("Final Bill Amount");

        tFFinalBill2.setFont(new java.awt.Font("Tahoma", 0, 48));
        tFFinalBill2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tFFinalBill2FocusGained(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel9.setText("Rs");

        jLabel100.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel100.setText("Rs");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel100)
                                        .addGap(24, 24, 24)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(357, 357, 357)
                                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(tFBillAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel9)
                                .addGap(29, 29, 29)
                                .addComponent(tFFinalBill2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tFBillAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel100))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tFFinalBill2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton3))
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void tFRetensionReductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFRetensionReductionActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_tFRetensionReductionActionPerformed

private void tFBillAmountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFBillAmountFocusLost

try {
        
getBillAmount = tFBillAmount.getText();
double billAmount = Double.parseDouble(getBillAmount);
double VAT2 = Double.parseDouble(mVAT);
double NBT2 = Double.parseDouble(mNBT);
double WHT2 = Double.parseDouble(mWHT);

double calVAT = (billAmount * (VAT2*2/3)/100);
setVAT = String.valueOf(calVAT);
tFAdditionofVAT.setText(setVAT);


double calNBT = (billAmount * NBT2/100);
setNBT = String.valueOf(calNBT);
tFAdditionofNBT.setText(setNBT);

double calWHT = (billAmount * WHT2/100);
setWHT = String.valueOf(calWHT);
tFReductionofWHT.setText(setWHT);

double calVATR = (billAmount * (VAT2*1/3)/100);
setVAT2 = String.valueOf(calVATR);
tFVATReservation.setText(setVAT2);



    } catch (Exception e) {
        
        System.out.println(e);
    }


}//GEN-LAST:event_tFBillAmountFocusLost

private void tFAdditionofVATFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFAdditionofVATFocusGained
tFAdditionofVAT.setText(setVAT);

}//GEN-LAST:event_tFAdditionofVATFocusGained

private void tFProjectIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFProjectIDFocusLost

}//GEN-LAST:event_tFProjectIDFocusLost

private void tFProjectIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFProjectIDFocusGained
tFProjectID.setText(mProjectID);
tFContractor.setText(mContractorID);
//tFAmountofAdvance.setText(mAdvanceValue);
//tFRetensionAmount.setText(mRetensionValue);

try {

         Connection con = DB.getMyConnection();
         Statement st = con.createStatement();
         ResultSet rs =  st.executeQuery("SELECT * FROM advance_bond WHERE ProjectID = '"+mProjectID+"' ");



           if ((rs.next())) {
                    System.out.println("okkkk");
//                     tFRecoveryofAdvance.setText(rs.getString("RecoveredAmount"));

            }

        } catch (Exception e) {

            System.out.println(e);
        }

//try {
//        double remainingAdvance = Double.parseDouble(tFAmountofAdvance.getText()) - Double.parseDouble(tFRecoveryofAdvance.getText());
//        String setRemainingAdvance = String.valueOf(remainingAdvance);
////        tFRemainingofAdvance.setText(setRemainingAdvance);

//     catch (Exception e) {
//
//        System.out.println(e);
//    }

try {

         Connection con = DB.getMyConnection();
         Statement st = con.createStatement();
         ResultSet rs =  st.executeQuery("SELECT * FROM retention_bond WHERE ProjectID = '"+mProjectID+"' ");



           if ((rs.next())) {
                    System.out.println("okkkk");
//                     tFRetensionRecovered.setText(rs.getString("RecoveredAmount"));

            }

        } catch (Exception e) {

            System.out.println(e);
        }

//try {
//        double remainingRetension = Double.parseDouble(tFRetensionAmount.getText()) - Double.parseDouble(tFRetensionRecovered.getText());
//        String setRemainingAdvance = String.valueOf(remainingRetension);
//        tFRetensionRemaining.setText(setRemainingAdvance);
//
//    } catch (Exception e) {
//
//        System.out.println(e);
//    }


}//GEN-LAST:event_tFProjectIDFocusGained

private void tFReductionofAdvanceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFReductionofAdvanceFocusLost
//String getAdvanceReduction = tFReductionofAdvance.getText();
//String getRecoveredAdvance2 = tFRecoveryofAdvance.getText();

//double x = Double.valueOf(getAdvanceReduction);
//double y = Double.valueOf(getRecoveredAdvance2);
//
//double z = x + y ;
//String d = String.valueOf(z);
//
//    try {
//
//         Connection con = DB.getMyConnection();
//         Statement st = con.createStatement();
//         st.executeUpdate("UPDATE advance_bond SET RecoveredAmount = '"+d+"' WHERE ProjectID = '"+mProjectID+"'  ");
//
//    } catch (Exception e) {
//
//        System.out.println(e);
//    }
//

}//GEN-LAST:event_tFReductionofAdvanceFocusLost

private void tFBillTitleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFBillTitleFocusLost
//tFBillTitle2.setText(tFBillTitle.getText());
}//GEN-LAST:event_tFBillTitleFocusLost

private void tFRetensionReductionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFRetensionReductionFocusLost
String getRetensionReduction = tFRetensionReduction.getText();
//String getRecoveredRetension2 = tFRetensionRecovered.getText();

//double x = Double.valueOf(getRetensionReduction);
//double y = Double.valueOf(getRecoveredRetension2);
//
//double z = x + y ;
//String d = String.valueOf(z);
//
//    try {
//
//         Connection con = DB.getMyConnection();
//         Statement st = con.createStatement();
//         st.executeUpdate("UPDATE retention_bond SET RecoveredAmount = '"+d+"' WHERE ProjectID = '"+mProjectID+"'  ");
//
//    } catch (Exception e) {
//
//        System.out.println(e);
//    }
}//GEN-LAST:event_tFRetensionReductionFocusLost

private void tFFinalBill2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFFinalBill2FocusGained
    String billAmount = tFBillAmount.getText();
    String addVAT = tFAdditionofVAT.getText();
    String addNBT = tFAdditionofNBT.getText();
    String reductWHT = tFReductionofWHT.getText();
    String reductAdvance = tFReductionofAdvance.getText();
    String reductRetension = tFRetensionReduction.getText();

    double a = Double.parseDouble(billAmount);
    double b = Double.parseDouble(addVAT);
    double c = Double.parseDouble(addNBT);
    double d = Double.parseDouble(reductWHT);
    double e = Double.parseDouble(reductAdvance);
    double f = Double.parseDouble(reductRetension);

    int g = (int)(((a + b + c) - (d + e + f))*100) ;

    String setFinalBill = String.valueOf((double)g/100);
    tFFinalBill2.setText(setFinalBill);

    


}//GEN-LAST:event_tFFinalBill2FocusGained

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
playSond.ButtonClick();
    ViewBillDetails nb = new ViewBillDetails();
nb.setVisible(true);
dispose();
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
playSond.ButtonClick();
    dispose();    // TODO add your handling code here:
}//GEN-LAST:event_jButton4ActionPerformed

private void tFReductionofAdvanceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tFReductionofAdvanceKeyReleased
    tFReductionofAdvance.setText((new validate1().mytext(tFReductionofAdvance,evt)));
}//GEN-LAST:event_tFReductionofAdvanceKeyReleased

private void tFRetensionReductionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tFRetensionReductionKeyReleased
    tFRetensionReduction.setText((new validate1().mytext(tFRetensionReduction,evt)));
}//GEN-LAST:event_tFRetensionReductionKeyReleased

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {

        try {

    

  

    } catch (Exception e) {

        System.out.println(e);
    }
         
        
        try {
            
            UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
            
        } catch (Exception e) {
            
            System.out.println(e);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField tFAdditionofNBT;
    private javax.swing.JTextField tFAdditionofVAT;
    private javax.swing.JTextField tFBillAmount;
    private javax.swing.JTextField tFBillNo;
    private javax.swing.JTextField tFBillTitle;
    private javax.swing.JTextField tFContractor;
    private javax.swing.JTextField tFDate;
    private javax.swing.JTextField tFFinalBill2;
    private javax.swing.JTextField tFProjectID;
    private javax.swing.JTextField tFReductionofAdvance;
    private javax.swing.JTextField tFReductionofWHT;
    private javax.swing.JTextField tFRetensionReduction;
    private javax.swing.JTextField tFVATReservation;
    // End of variables declaration//GEN-END:variables

}
