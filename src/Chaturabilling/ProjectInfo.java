/*
 * ProjectInfo.java
 *
 * Created on April 10, 2010, 10:05 AM
 */

package Chaturabilling;

import Imal.playSond;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author  Chatura
 */
public class ProjectInfo extends javax.swing.JFrame {
    String cb;
    String totalProValue;
    double y ;
    double z ;
    /** Creates new form ProjectInfo */
    public ProjectInfo() {
        initComponents();
        
        try {




             Connection con = DB.getMyConnection();
             Statement st = con.createStatement();
             ResultSet rs =  st.executeQuery("SELECT * FROM tax_detail WHERE Year = '"+2010+"' ");



           if ((rs.next())) {
               tFVATP.setText(rs.getString("VATpercentage"));
               tFNBTP.setText(rs.getString("NBTpercentage"));
               tFWHTP.setText(rs.getString("WHTpercentage"));


            }


        } catch (Exception e) {

            System.out.println(e);
        }
        
        
       
        
     /*   new Thread(new Runnable() {

            public void run() {
                
                for(int y = 25; y < 100 ; ++y){
                    
                    
                jPanel3.setBounds(441, y, 425, 145);
                
                  try{
                   
                        Thread.sleep(12);
                   
                    }catch(Exception e){
                       System.out.println(e);

                   }
                
                }
                
            }
        }).start();
        
        
        new Thread(new Runnable() {

            public void run() {
                
                
                
                for(int y = 50; y < 275 ; ++y){
                    
                    
                   
                    
                    
                jPanel4.setBounds(441, y, 425, 175);
               
                  try{
                   
                        Thread.sleep(8);
                   
                    }catch(Exception e){
                       System.out.println(e);

                   }
                
                }
                
            }
        }).start();
        
        new Thread(new Runnable() {

            public void run() {
                
                
                
                for(int y = 50; y < 475 ; ++y){
                    
                    
                   
                    
                    
                jPanel5.setBounds(441, y, 425, 150);
               
                  try{
                   
                        Thread.sleep(4);
                   
                    }catch(Exception e){
                       System.out.println(e);

                   }
                
                }
                
            }
        }).start();
        
        new Thread(new Runnable() {

            public void run() {
                
                
                
                for(int x = -150; x < 10 ; ++x){
                    
                    
                   
                    
                    
                jPanel2.setBounds(x, 93, 425, 470);
               
                  try{
                   
                        Thread.sleep(5);
                   
                    }catch(Exception e){
                       System.out.println(e);

                   }
                
                }
                
            }
        }).start();
        
        
        new Thread(new Runnable() {

            public void run() {
                
             for(  ;  ;  ){   
                
                for(int x = 0; x < 20 ; ++x){
                    
                    
                      
                    if(x == 1){
                        jLabel1.setText("P");
                    }
                     if(x == 2){
                        jLabel1.setText("Pr");
                    } 
                    if(x == 3){
                        jLabel1.setText("Pro");
                    }
                    if(x == 4){
                        jLabel1.setText("Proj");
                    }
                    if(x == 5){
                        jLabel1.setText("Proje");
                    }
                    if(x == 6){
                        jLabel1.setText("Projec");
                    }
                    if(x == 7){
                        jLabel1.setText("Project");
                    }
                    if(x == 8){
                        jLabel1.setText("Project ");
                    }
                    if(x == 9){
                        jLabel1.setText("Project I");
                    }
                    if(x == 10){
                        jLabel1.setText("Project In");
                    }
                    if(x == 11){
                        jLabel1.setText("Project Inf");
                    }
                    if(x == 12){
                        jLabel1.setText("Project Info");
                    }
                    if(x == 13){
                        jLabel1.setText("Project Infor");
                    }
                    if(x ==14){
                        jLabel1.setText("Project Inform");
                    }
                    if(x ==15){
                        jLabel1.setText("Project Informa");
                    }
                    if(x == 16){
                        jLabel1.setText("Project Informat");
                    }
                    if(x == 17){
                        jLabel1.setText("Project Informati");
                    }
                    if(x == 18){
                        jLabel1.setText("Project Informatio");
                    }
                    if(x == 19){
                        jLabel1.setText("Project Information");
                    }
                    
                    
                   
                    
                    
             
               
                  try{
                   
                        Thread.sleep(500);
                   
                    }catch(Exception e){
                       System.out.println(e);

                   }
                
                }
            }
            }
        }).start();*/
       
        
   
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
        cBProjectID = new javax.swing.JComboBox();
        lBCriteria = new javax.swing.JLabel();
        tFCriteria = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tBSearch = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tFTotalProValue = new javax.swing.JTextField();
        tFAdvanceP = new javax.swing.JTextField();
        tFAdvanceValue = new javax.swing.JTextField();
        tFRetensionP = new javax.swing.JTextField();
        tFRetensionValue = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        tFVATP = new javax.swing.JTextField();
        tFNBTP = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tFWHTP = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tFContractor = new javax.swing.JTextField();
        tFstartdate = new javax.swing.JTextField();
        tFProjectTitle = new javax.swing.JTextField();
        tFProjectID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Project Information");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 28));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Chaturabilling/Information_48x48.png"))); // NOI18N
        jLabel1.setText("Project Information");
        jLabel1.setIconTextGap(8);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("Search by ");
        jLabel2.setIconTextGap(8);

        cBProjectID.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Project ID", "Project Name", "ContractorID" }));
        cBProjectID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBProjectIDActionPerformed(evt);
            }
        });
        cBProjectID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cBProjectIDFocusGained(evt);
            }
        });

        lBCriteria.setFont(new java.awt.Font("Tahoma", 1, 12));
        lBCriteria.setText("Searching Criteria");

        tFCriteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFCriteriaActionPerformed(evt);
            }
        });
        tFCriteria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tFCriteriaKeyReleased(evt);
            }
        });

        tBSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Project ID", "Name", "ContractorID", "Start Date", "Value"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tBSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tBSearchMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tBSearchMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tBSearch);
        tBSearch.getColumnModel().getColumn(0).setResizable(false);
        tBSearch.getColumnModel().getColumn(2).setResizable(false);
        tBSearch.getColumnModel().getColumn(3).setResizable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lBCriteria, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tFCriteria)
                            .addComponent(cBProjectID, 0, 200, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBProjectID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tFCriteria, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(lBCriteria))
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Chaturabilling/right_16.png"))); // NOI18N
        jButton3.setText("Next");
        jButton3.setIconTextGap(-50);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel8.setText("Total Project Value");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel9.setText("Advance %");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel10.setText("Advance Value");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel11.setText("Retension Bond %");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel12.setText("Retension Value");

        tFTotalProValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFTotalProValueActionPerformed(evt);
            }
        });
        tFTotalProValue.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tFTotalProValueFocusLost(evt);
            }
        });

        tFAdvanceP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tFAdvancePFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tFAdvancePFocusLost(evt);
            }
        });

        tFAdvanceValue.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tFAdvanceValueFocusGained(evt);
            }
        });

        tFRetensionP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tFRetensionPFocusLost(evt);
            }
        });

        tFRetensionValue.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tFRetensionValueFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tFRetensionValueFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tFAdvanceP, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tFTotalProValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(tFAdvanceValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tFRetensionValue, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tFRetensionP, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFTotalProValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFAdvanceP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFAdvanceValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFRetensionP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFRetensionValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Year");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("VAT %");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel16.setText("NBT%");

        jYearChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jYearChooser1MouseClicked(evt);
            }
        });
        jYearChooser1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jYearChooser1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jYearChooser1FocusLost(evt);
            }
        });

        tFVATP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tFVATPFocusGained(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel15.setText("WHT%");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tFWHTP, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tFNBTP, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tFVATP, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFVATP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFNBTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFWHTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setText("Project ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setText("Project Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel6.setText("Start Date");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel7.setText("Contractor ID");

        tFContractor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFContractorActionPerformed(evt);
            }
        });
        tFContractor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tFContractorFocusLost(evt);
            }
        });

        tFstartdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFstartdateActionPerformed(evt);
            }
        });

        tFProjectTitle.setForeground(new java.awt.Color(255, 255, 255));
        tFProjectTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFProjectTitleActionPerformed(evt);
            }
        });

        tFProjectID.setFont(new java.awt.Font("Tahoma", 0, 12));
        tFProjectID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFProjectIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tFProjectID, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tFProjectTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tFContractor, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFstartdate, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tFContractor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tFProjectID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tFProjectTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tFstartdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4)))
                    .addComponent(jPanel2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-830)/2, (screenSize.height-717)/2, 830, 717);
    }// </editor-fold>//GEN-END:initComponents

private void tFProjectTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFProjectTitleActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_tFProjectTitleActionPerformed

private void tFstartdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFstartdateActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_tFstartdateActionPerformed

private void tFContractorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFContractorActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_tFContractorActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
playSond.ButtonClick();
    this.dispose();
}//GEN-LAST:event_jButton4ActionPerformed

private void cBProjectIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cBProjectIDFocusGained

}//GEN-LAST:event_cBProjectIDFocusGained

private void tFTotalProValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFTotalProValueActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_tFTotalProValueActionPerformed

private void tFContractorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFContractorFocusLost
jPanel4.setVisible(true);
}//GEN-LAST:event_tFContractorFocusLost

private void tFRetensionValueFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFRetensionValueFocusLost
jPanel5.setVisible(true);
}//GEN-LAST:event_tFRetensionValueFocusLost

private void tFProjectIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFProjectIDActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_tFProjectIDActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
playSond.ButtonClick();


String retensionValue = tFRetensionValue.getText();
String retensionP = tFRetensionP.getText();
String advanceValue = tFAdvanceValue.getText();
String advanceP = tFAdvanceP.getText();
String projectID = tFProjectID.getText();
     try {

         Connection con = DB.getMyConnection();
         Statement st = con.createStatement();
         st.executeUpdate("UPDATE advance_bond SET ab_Percentage = '"+advanceP+"', Value = '"+advanceValue+"' WHERE ProjectID = '"+projectID+"'  ");
         st.executeUpdate("UPDATE retention_bond SET Value = '"+retensionP+"', Value = '"+retensionValue+"' WHERE ProjectID = '"+projectID+"'  ");


        } catch (Exception e) {

            System.out.println(e);
        }

this.dispose();
BillInfo bi2 = new BillInfo();
bi2.getProjectInfo(tFProjectID.getText(), tFContractor.getText(), tFAdvanceValue.getText(), tFRetensionValue.getText(), tFWHTP.getText(), tFVATP.getText(), tFNBTP.getText());
bi2.setVisible(true);
}//GEN-LAST:event_jButton3ActionPerformed

private void cBProjectIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBProjectIDActionPerformed
cb =    (String) cBProjectID.getSelectedItem();
lBCriteria.setText(cb);
}//GEN-LAST:event_cBProjectIDActionPerformed

private void tFCriteriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tFCriteriaKeyReleased
    String search = tFCriteria.getText();

    if(cb.equals("Project ID")){

        try {

         Connection con = DB.getMyConnection();
         Statement st = con.createStatement();
         ResultSet rs =  st.executeQuery("SELECT * FROM project WHERE ProjectID like '"+search+"%' ");

         DefaultTableModel df = (DefaultTableModel) tBSearch.getModel();
         df.setRowCount(0);

           while ((rs.next())) {
                Vector v = new Vector();
                v.add(rs.getString("ProjectID"));
                v.add(rs.getString("ProjectName"));
                v.add(rs.getString("ContractorID"));
                v.add(rs.getString("pro_StatDate"));
                v.add(rs.getString("ContractorPrice"));
             

               df.addRow(v);

            }

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    if(cb.equals("Project Name")){

        try {

         Connection con = DB.getMyConnection();
         Statement st = con.createStatement();
         ResultSet rs =  st.executeQuery("SELECT * FROM project WHERE ProjectName like '"+search+"%' ");

         DefaultTableModel df = (DefaultTableModel) tBSearch.getModel();
         df.setRowCount(0);

           while ((rs.next())) {
                Vector v = new Vector();
                v.add(rs.getString("ProjectID"));
                v.add(rs.getString("ProjectName"));
                v.add(rs.getString("ContractorID"));
                v.add(rs.getString("pro_StatDate"));
                v.add(rs.getString("ContractorPrice"));


               df.addRow(v);

            }

        } catch (Exception e) {

            System.out.println(e);
        }

    }
    if(cb.equals("ContractorID")){

        try {

         Connection con = DB.getMyConnection();
         Statement st = con.createStatement();
         ResultSet rs =  st.executeQuery("SELECT * FROM project WHERE ContractorID like '"+search+"%' ");

         DefaultTableModel df = (DefaultTableModel) tBSearch.getModel();
         df.setRowCount(0);

           while ((rs.next())) {
                Vector v = new Vector();
                v.add(rs.getString("ProjectID"));
                v.add(rs.getString("ProjectName"));
                v.add(rs.getString("ContractorID"));
                v.add(rs.getString("pro_StatDate"));
                v.add(rs.getString("ContractorPrice"));


               df.addRow(v);

            }

        } catch (Exception e) {

            System.out.println(e);
        }

    }
}//GEN-LAST:event_tFCriteriaKeyReleased

private void tBSearchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tBSearchMouseReleased
    String date = tFstartdate.getText();
    String d = date.split("/")[0];
    System.out.println(d);
    int s = Integer.parseInt(d);
    jYearChooser1.setValue(s);



    try {




             Connection con = DB.getMyConnection();
             Statement st = con.createStatement();
             ResultSet rs =  st.executeQuery("SELECT * FROM tax_detail WHERE Year = '"+d+"' ");



           if ((rs.next())) {
               tFVATP.setText(rs.getString("VATpercentage"));
               tFNBTP.setText(rs.getString("NBTpercentage"));
               tFWHTP.setText(rs.getString("WHTpercentage"));


            }


        } catch (Exception e) {

            System.out.println(e);
        }


}//GEN-LAST:event_tBSearchMouseReleased

private void tFAdvancePFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFAdvancePFocusLost
String advanceP = tFAdvanceP.getText();
totalProValue = tFTotalProValue.getText();

double x = Integer.parseInt(advanceP);
y = Integer.parseInt(totalProValue);

z = y*(x/100);

String advanceValue2 = String.valueOf(z);
tFAdvanceValue.setText(advanceValue2);


}//GEN-LAST:event_tFAdvancePFocusLost

private void tFRetensionPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFRetensionPFocusLost
    String retensionP = tFRetensionP.getText();

    double x = Integer.parseInt(retensionP);

    z = y*(x/100);
    String retensionValue2 = String.valueOf(z);
    tFRetensionValue.setText(retensionValue2);


}//GEN-LAST:event_tFRetensionPFocusLost

private void jYearChooser1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jYearChooser1FocusLost
        

}//GEN-LAST:event_jYearChooser1FocusLost

private void jYearChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jYearChooser1MouseClicked

}//GEN-LAST:event_jYearChooser1MouseClicked

private void jYearChooser1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jYearChooser1FocusGained

}//GEN-LAST:event_jYearChooser1FocusGained

private void tFVATPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFVATPFocusGained
int s = jYearChooser1.getValue();
        String w = String.valueOf(s);
        System.out.println(s);
        try {

         Connection con = DB.getMyConnection();
         Statement st = con.createStatement();
         ResultSet rs =  st.executeQuery("SELECT * FROM tax_detail WHERE Year = '"+w+"' ");



           if((rs.next())) {
               System.out.println("done");
            tFVATP.setText(rs.getString("VATpercentage"));
            tFNBTP.setText(rs.getString("NBTpercentage"));
            tFWHTP.setText(rs.getString("WHTpercentage"));


            }

        } catch (Exception e) {

            System.out.println(e);
        }
}//GEN-LAST:event_tFVATPFocusGained

private void tFTotalProValueFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFTotalProValueFocusLost

}//GEN-LAST:event_tFTotalProValueFocusLost

private void tFAdvancePFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFAdvancePFocusGained
String projectID = tFProjectID.getText();

    try {

         Connection con = DB.getMyConnection();
         Statement st = con.createStatement();
         ResultSet rs =  st.executeQuery("SELECT * FROM advance_bond WHERE ProjectID = '"+projectID+"' ");



           if((rs.next())) {
              tFAdvanceP.setText(rs.getString("ab_Percentage"));


            }

        } catch (Exception e) {

            System.out.println(e);
        }

try {

         Connection con = DB.getMyConnection();
         Statement st = con.createStatement();
         ResultSet rs =  st.executeQuery("SELECT * FROM retention_bond WHERE ProjectID = '"+projectID+"' ");



           if((rs.next())) {
              tFRetensionP.setText(rs.getString("Percentage"));


            }

        } catch (Exception e) {

            System.out.println(e);
        }

}//GEN-LAST:event_tFAdvancePFocusGained

private void tFCriteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFCriteriaActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_tFCriteriaActionPerformed

private void tBSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tBSearchMousePressed
tFProjectID.setText((String) tBSearch.getValueAt(tBSearch.getSelectedRow(), 0));
tFProjectTitle.setText((String) tBSearch.getValueAt(tBSearch.getSelectedRow(), 1));
tFstartdate.setText((String) tBSearch.getValueAt(tBSearch.getSelectedRow(), 3));
tFContractor.setText((String) tBSearch.getValueAt(tBSearch.getSelectedRow(), 2));
tFTotalProValue.setText((String) tBSearch.getValueAt(tBSearch.getSelectedRow(), 4));
}//GEN-LAST:event_tBSearchMousePressed

private void tFAdvanceValueFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFAdvanceValueFocusGained
String advanceP = tFAdvanceP.getText();
totalProValue = tFTotalProValue.getText();

double x = Double.parseDouble(advanceP);
y = Double.parseDouble(totalProValue);

z = y*(x/100);

String advanceValue2 = String.valueOf(z);
tFAdvanceValue.setText(advanceValue2);
}//GEN-LAST:event_tFAdvanceValueFocusGained

private void tFRetensionValueFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFRetensionValueFocusGained
String retensionP = tFRetensionP.getText();

    double x = Integer.parseInt(retensionP);

    z = y*(x/100);
    String retensionValue2 = String.valueOf(z);
    tFRetensionValue.setText(retensionValue2);

}//GEN-LAST:event_tFRetensionValueFocusGained

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        
        try {
            
            UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
            
        } catch (Exception e) {
            
            System.out.println(e);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cBProjectID;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JLabel lBCriteria;
    private javax.swing.JTable tBSearch;
    private javax.swing.JTextField tFAdvanceP;
    private javax.swing.JTextField tFAdvanceValue;
    private javax.swing.JTextField tFContractor;
    private javax.swing.JTextField tFCriteria;
    private javax.swing.JTextField tFNBTP;
    private javax.swing.JTextField tFProjectID;
    private javax.swing.JTextField tFProjectTitle;
    private javax.swing.JTextField tFRetensionP;
    private javax.swing.JTextField tFRetensionValue;
    private javax.swing.JTextField tFTotalProValue;
    private javax.swing.JTextField tFVATP;
    private javax.swing.JTextField tFWHTP;
    private javax.swing.JTextField tFstartdate;
    // End of variables declaration//GEN-END:variables

}
