/*
 * BillInfo.java
 *
 * Created on April 11, 2010, 1:11 AM
 */

package Chaturabilling;

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
            tFBillTitle2.setText(rs.getString("BillTitle"));
            tFDate.setText(rs.getString("BillDate"));
            tFBillAmount.setText(rs.getString("BillAmount"));
            tFFinalBill2.setText(rs.getString("FinalAmount"));
            tFAdditionofNBT.setText(rs.getString("NBTAmount"));
            tFAdditionofVAT.setText(rs.getString("VATAmount"));
            tFVATReservation.setText(rs.getString("VATReservation"));

               System.out.println(rs.getString("ProjectID"));

            }

        } catch (Exception e) {

            System.out.println(e);
        }

        jButton1.setEnabled(false);

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
                tFBillNo.setText(String.valueOf(Integer.parseInt(rs.getString("a"))+1));

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
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tFBillNo = new javax.swing.JTextField();
        tFBillTitle2 = new javax.swing.JTextField();
        tFDate = new javax.swing.JTextField();
        tFBillAmount = new javax.swing.JTextField();
        tFFinalBill2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        tFAdditionofVAT = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tFReductionofWHT = new javax.swing.JTextField();
        tFAdditionofNBT = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tFVATReservation = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        tFContractor = new javax.swing.JTextField();
        tFBillTitle = new javax.swing.JTextField();
        tFProjectID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        tFAmountofAdvance = new javax.swing.JTextField();
        tFRecoveryofAdvance = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tFRemainingofAdvance = new javax.swing.JTextField();
        tFReductionofAdvance = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        tFRetensionAmount = new javax.swing.JTextField();
        tFRetensionRecovered = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tFRetensionReduction = new javax.swing.JTextField();
        tFRetensionRemaining = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Andalus", 0, 36));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Chaturabilling/Information_48x48.png"))); // NOI18N
        jLabel1.setText("Bill Information");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(426, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Chaturabilling/Favorites_16x16.png"))); // NOI18N
        jLabel13.setText("Final Bill Amount");
        jLabel13.setIconTextGap(8);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel8.setText("Bill Amount");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel7.setText("Date");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel6.setText("Bill Title");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setText("Bill No");

        tFBillNo.setEditable(false);

        tFBillTitle2.setEditable(false);

        tFBillAmount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tFBillAmountFocusLost(evt);
            }
        });
        tFBillAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tFBillAmountKeyReleased(evt);
            }
        });

        tFFinalBill2.setEditable(false);
        tFFinalBill2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tFFinalBill2FocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tFFinalBill2)
                    .addComponent(tFBillAmount)
                    .addComponent(tFDate)
                    .addComponent(tFBillTitle2)
                    .addComponent(tFBillNo, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tFBillNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tFBillTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFBillAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFFinalBill2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Chaturabilling/plus_16.png"))); // NOI18N
        jButton1.setText("Add Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Chaturabilling/delete_16.png"))); // NOI18N
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 39, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tFVATReservation)
                    .addComponent(tFReductionofWHT)
                    .addComponent(tFAdditionofNBT)
                    .addComponent(tFAdditionofVAT, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFAdditionofVAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFAdditionofNBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFReductionofWHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                    .addComponent(tFVATReservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tFContractor.setEditable(false);

        tFBillTitle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tFBillTitleFocusLost(evt);
            }
        });

        tFProjectID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tFProjectIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tFProjectIDFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("Project ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setText("Bill Title");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setText("Contractor ID");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel9.setText("Advance Amount");

        tFAmountofAdvance.setEditable(false);

        tFRecoveryofAdvance.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel10.setText("Recovered Advance");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel11.setText("Remaining Advance");

        tFRemainingofAdvance.setEditable(false);

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
        jLabel12.setText("Reduction for Advance");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel19.setText("Retension Amount");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel20.setText("Recovered Retension");

        tFRetensionAmount.setEditable(false);

        tFRetensionRecovered.setEditable(false);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel21.setText("Remaining Retension");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel14.setText("Reduction for Retension");

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

        tFRetensionRemaining.setEditable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tFBillTitle)
                            .addComponent(tFProjectID, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(tFContractor, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(47, 47, 47)))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tFReductionofAdvance)
                            .addComponent(tFRemainingofAdvance, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(tFRecoveryofAdvance, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(tFAmountofAdvance, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tFRetensionRecovered)
                                .addComponent(tFRetensionRemaining)
                                .addComponent(tFRetensionReduction, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(tFRetensionAmount, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFProjectID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFBillTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(tFContractor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tFAmountofAdvance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFRecoveryofAdvance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFRemainingofAdvance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFReductionofAdvance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFRetensionAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFRetensionRecovered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFRetensionRemaining, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFRetensionReduction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(505, 505, 505)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton1))))
                .addGap(51, 51, 51)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-784)/2, (screenSize.height-593)/2, 784, 593);
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
tFAmountofAdvance.setText(mAdvanceValue);
tFRetensionAmount.setText(mRetensionValue);



try {

         Connection con = DB.getMyConnection();
         Statement st = con.createStatement();
         ResultSet rs =  st.executeQuery("SELECT * FROM advance_bond WHERE ProjectID = '"+mProjectID+"' ");



           if ((rs.next())) {
                    System.out.println("okkkk");
                    String d = (rs.getString("RecoveredAmount"));

                    if(d.isEmpty()){
                    tFRecoveryofAdvance.setText("0");

                    }else{

                    tFRecoveryofAdvance.setText(d);

                    }

            }



        } catch (Exception e) {

            System.out.println(e);
        }



try {
        double remainingAdvance = Double.parseDouble(tFAmountofAdvance.getText()) - Double.parseDouble(tFRecoveryofAdvance.getText());
        String setRemainingAdvance = String.valueOf(remainingAdvance);
        tFRemainingofAdvance.setText(setRemainingAdvance);

    } catch (Exception e) {

        System.out.println(e);
    }

try {

         Connection con = DB.getMyConnection();
         Statement st = con.createStatement();
         ResultSet rs =  st.executeQuery("SELECT * FROM retention_bond WHERE ProjectID = '"+mProjectID+"' ");



           if ((rs.next())) {
                    System.out.println("okkkk");
                     String f = (rs.getString("RecoveredAmount"));

                     if(f.isEmpty()){
                    tFRetensionRecovered.setText("0");

                    }else{

                    tFRetensionRecovered.setText(f);

                    }

            }

        } catch (Exception e) {

            System.out.println(e);
        }

try {
        double remainingRetension = Double.parseDouble(tFRetensionAmount.getText()) - Double.parseDouble(tFRetensionRecovered.getText());
        String setRemainingAdvance = String.valueOf(remainingRetension);
        tFRetensionRemaining.setText(setRemainingAdvance);

    } catch (Exception e) {

        System.out.println(e);
    }


}//GEN-LAST:event_tFProjectIDFocusGained

private void tFReductionofAdvanceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFReductionofAdvanceFocusLost
String getAdvanceReduction = tFReductionofAdvance.getText();
String getRecoveredAdvance2 = tFRecoveryofAdvance.getText();

double x = Double.valueOf(getAdvanceReduction);
double y = Double.valueOf(getRecoveredAdvance2);

double z = x + y ;
String d = String.valueOf(z);

    try {

         Connection con = DB.getMyConnection();
         Statement st = con.createStatement();
         st.executeUpdate("UPDATE advance_bond SET RecoveredAmount = '"+d+"' WHERE ProjectID = '"+mProjectID+"'  ");

    } catch (Exception e) {

        System.out.println(e);
    }


}//GEN-LAST:event_tFReductionofAdvanceFocusLost

private void tFBillTitleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFBillTitleFocusLost
tFBillTitle2.setText(tFBillTitle.getText());
}//GEN-LAST:event_tFBillTitleFocusLost

private void tFRetensionReductionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFRetensionReductionFocusLost
String getRetensionReduction = tFRetensionReduction.getText();
String getRecoveredRetension2 = tFRetensionRecovered.getText();

double x = Double.valueOf(getRetensionReduction);
double y = Double.valueOf(getRecoveredRetension2);

double z = x + y ;
String d = String.valueOf(z);

    try {

         Connection con = DB.getMyConnection();
         Statement st = con.createStatement();
         st.executeUpdate("UPDATE retention_bond SET RecoveredAmount = '"+d+"' WHERE ProjectID = '"+mProjectID+"'  ");

    } catch (Exception e) {

        System.out.println(e);
    }
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

    double g = (a + b + c) - (d + e + f) ;

    String setFinalBill = String.valueOf(g);
    tFFinalBill2.setText(setFinalBill);

    


}//GEN-LAST:event_tFFinalBill2FocusGained

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    playSond.ButtonClick();

    String billTitle = tFBillTitle.getText();
    String advanceReduction = tFReductionofAdvance.getText();
    String retensionReduction = tFRetensionReduction.getText();
    String billNo = tFBillNo.getText();
    String date = tFDate.getText();
    String billAmount = tFBillAmount.getText();
    String finalBill = tFFinalBill2.getText();
    String VATAdd = tFAdditionofVAT.getText();
    String NBTAdd = tFAdditionofNBT.getText();
    String ReductWHT = tFReductionofWHT.getText();
    String VATReserve = tFVATReservation.getText();
    String Contractor = tFContractor.getText();

    try {
        System.out.println("k1");
         Connection con = DB.getMyConnection();
         Statement st = con.createStatement();
        
         st.executeUpdate("INSERT INTO bill_detail (BillTitle, AdvanceDeduction, RetensionDeduction, BillNo, BillDate, BillAmount, FinalAmount, VATAmount, NBTAmount, WHTAmount, VATReservation, ContractorID,ProjectID ) VALUES ('"+billTitle+"', '"+advanceReduction+"', '"+retensionReduction+"', '"+billNo+"', '"+date+"', '"+billAmount+"', '"+finalBill+"', '"+VATAdd+"', '"+NBTAdd+"', '"+ReductWHT+"', '"+VATReserve+"', '"+Contractor+"', '"+tFProjectID.getText()+"') ");

        } catch (Exception e) {

            System.out.println(e);
        }

    try {

        String tableValue1 = "";
        String tableValue = "";
        double t1 ;
        double t2 ;
        double t3 ;
        String t4 ;

         Connection con = DB.getMyConnection();
         Statement st = con.createStatement();
         ResultSet rs =  st.executeQuery("SELECT * FROM project WHERE ProjectID = '"+mProjectID+"' ");
         System.out.println("k2");


           if((rs.next())) {


                tableValue1 = rs.getString("TotalVatReservation");
                if(tableValue1.isEmpty()){
                    tableValue = "0";

                          t1 = Double.parseDouble(tableValue);
          t2 = Double.parseDouble(VATReserve);

          t3 = t1 + t2;

          t4 = String.valueOf(t3);

        System.out.println("k3");

           try {


         st.executeUpdate("UPDATE project SET TotalVatReservation = '"+t4+"' WHERE ProjectID = '"+mProjectID+"'  ");
               System.out.println("k4");
        } catch (Exception e) {

            System.out.println(e);
        }

                }
            }


    

        } catch (Exception e) {

            System.out.println(e);
        }


  /*  try {
        System.out.println("k1");
         Connection con = DB.getMyConnection();
         Statement st = con.createStatement();
         st.executeUpdate("INSERT INTO bill_detail VALUES ('"+mProjectID+"', '"+billNo+"', '"+mContractorID+"', '"+billTitle+"', '"+date+"', '"+billAmount+"', '"+advanceReduction+"', '"+retensionReduction+"', '"+VATAdd+"', '"+ReductWHT+"', '"+NBTAdd+"', '"+VATReserve+"', '"+finalBill+"') ");

        } catch (Exception e) {

            System.out.println(e);
        }*/

    try {

        String tableValue1 = "";
        String tableValue = "";
        double t1 ;
        double t2 ;
        double t3 ;
        String t4 ;

         Connection con = DB.getMyConnection();
         Statement st = con.createStatement();
         ResultSet rs =  st.executeQuery("SELECT * FROM project WHERE ProjectID = '"+mProjectID+"' ");
         System.out.println("k2");


           if((rs.next())) {

                tableValue1 = rs.getString("AmountPaid");
                if(tableValue1.isEmpty()){
                    tableValue = "0";
                    
                    
                       t1 = Double.parseDouble(tableValue);
          t2 = Double.parseDouble(finalBill);

          t3 = t1 + t2;

          t4 = String.valueOf(t3);

        System.out.println("k3");

           try {


         st.executeUpdate("UPDATE project SET AmountPaid = '"+t4+"' WHERE ProjectID = '"+mProjectID+"'  ");
               System.out.println("k4");
        } catch (Exception e) {

            System.out.println(e);
        }
                
                
                }

            }


       

        } catch (Exception e) {

            System.out.println(e);
        }



}//GEN-LAST:event_jButton1ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
   playSond.ButtonClick();
   this.dispose();
}//GEN-LAST:event_jButton4ActionPerformed

private void tFBillAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tFBillAmountKeyReleased
    tFBillAmount.setText((new validate1().mytext(tFBillAmount,evt)));
}//GEN-LAST:event_tFBillAmountKeyReleased

private void tFRetensionReductionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tFRetensionReductionKeyReleased
   tFRetensionReduction.setText((new validate1().mytext(tFRetensionReduction,evt)));
}//GEN-LAST:event_tFRetensionReductionKeyReleased

private void tFReductionofAdvanceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tFReductionofAdvanceKeyReleased
   tFReductionofAdvance.setText((new validate1().mytext(tFReductionofAdvance,evt)));
}//GEN-LAST:event_tFReductionofAdvanceKeyReleased

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField tFAdditionofNBT;
    private javax.swing.JTextField tFAdditionofVAT;
    private javax.swing.JTextField tFAmountofAdvance;
    private javax.swing.JTextField tFBillAmount;
    private javax.swing.JTextField tFBillNo;
    private javax.swing.JTextField tFBillTitle;
    private javax.swing.JTextField tFBillTitle2;
    private javax.swing.JTextField tFContractor;
    private javax.swing.JTextField tFDate;
    private javax.swing.JTextField tFFinalBill2;
    private javax.swing.JTextField tFProjectID;
    private javax.swing.JTextField tFRecoveryofAdvance;
    private javax.swing.JTextField tFReductionofAdvance;
    private javax.swing.JTextField tFReductionofWHT;
    private javax.swing.JTextField tFRemainingofAdvance;
    private javax.swing.JTextField tFRetensionAmount;
    private javax.swing.JTextField tFRetensionRecovered;
    private javax.swing.JTextField tFRetensionReduction;
    private javax.swing.JTextField tFRetensionRemaining;
    private javax.swing.JTextField tFVATReservation;
    // End of variables declaration//GEN-END:variables

}
