/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapp;

import java.awt.Container;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author eamon
 */
public class TransferFunds extends javax.swing.JFrame {
        

    /**
     * Creates new form Login
     */
    public TransferFunds() {
        initComponents();
        
    }
    
    public TransferFunds(Account ac) {
        initComponents();
        txtAccountID.setVisible(false);
        populateData(ac);
        
    }
    
    public void populateData(Account ac) { 
        txtAccountID.setText(Integer.toString(ac.getAccountID()));
        txtAccountNumber.setText(Integer.toString(ac.getAccountNumber()));
        txtSortCode.setText(Integer.toString(ac.getSortCode()));
        txtBalance.setText(Integer.toString(ac.getBalance()));       
    }   
        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUpdate = new javax.swing.JButton();
        txtAccountNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSortCode = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtBalance = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        txtAccountID = new javax.swing.JTextField();
        txtRecAccountNumber = new javax.swing.JTextField();
        txtRecSortCode = new javax.swing.JTextField();
        txtTransferAmt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transfer Funds");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtAccountNumber.setEditable(false);
        txtAccountNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountNumberActionPerformed(evt);
            }
        });

        jLabel7.setText("Account Number");

        txtSortCode.setEditable(false);
        txtSortCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSortCodeActionPerformed(evt);
            }
        });

        jLabel8.setText("Sort Code");

        txtBalance.setEditable(false);
        txtBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBalanceActionPerformed(evt);
            }
        });

        jLabel9.setText("Initial Balance");

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtAccountID.setEditable(false);
        txtAccountID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountIDActionPerformed(evt);
            }
        });

        txtRecAccountNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecAccountNumberActionPerformed(evt);
            }
        });

        txtRecSortCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecSortCodeActionPerformed(evt);
            }
        });

        txtTransferAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTransferAmtActionPerformed(evt);
            }
        });

        jLabel10.setText("Recipient Account Number");

        jLabel11.setText("Recipient Sort Code");

        jLabel12.setText("Transfer Amount");

        jMenu1.setText("File");

        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        jMenu1.add(menuExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(txtAccountID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtSortCode, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtRecSortCode, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTransferAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102)
                                .addComponent(txtRecAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addGap(124, 124, 124))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRecAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSortCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRecSortCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTransferAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87)
                        .addComponent(txtAccountID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnExit))))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
                
        
        String sBal  = txtBalance.getText();
        int bal      = Integer.parseInt(sBal);
        String sRAcc = txtRecAccountNumber.getText();
        int rAcc     = Integer.parseInt(sRAcc);
        String sRSrt = txtRecSortCode.getText();
        int rSrt     = Integer.parseInt(sRSrt);
        String sTAmt = txtTransferAmt.getText();
        
        int tAmt     = 0;
        
        try {
           tAmt    = Integer.parseInt(sTAmt);
        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter a numeric amount");
            txtTransferAmt.setText("0");
        }
        
        if (tAmt <= bal) { 
            Account recAcc = new Account();
            
            try {
                recAcc = DBMethods.fetch(rAcc, rSrt);
                
                if(recAcc.getAccountID() != 0) {
                    try {
                        int newRecBal = recAcc.getBalance() + tAmt;
                        DBMethods.updateAccount(recAcc.getAccountID(), newRecBal);
                        
                        try {
                            int newSendBal = bal - tAmt;
                            DBMethods.updateAccount(Integer.parseInt(txtAccountID.getText()), newSendBal);
                        }
                        catch (Exception ex){
                            JOptionPane.showMessageDialog(null, "Error: Sender account not updated! - " + ex);
                        }
                        
                        
                        // receiver transaction
                        
                        Transaction recTrans = new Transaction();
                        recTrans.setAccountNumber(recAcc.getAccountNumber());
                        recTrans.setSortCode(recAcc.getSortCode());
                        recTrans.setDescription("Deposit into " + recAcc.getAccountNumber());
                        recTrans.setCreditAmount(tAmt);
                        recTrans.setDebitAmount(0);
                        recTrans.setBalance(newRecBal);
                        recTrans.setDatetime(new Date());
                        try {
                            DBMethods.insertTransaction(recTrans);
                        }
                        catch (Exception ex)
                        {
                            JOptionPane.showMessageDialog(null, "Error: Transaction not updated! - " + ex);
                        }
                        
                        // sender transaction
                        
                        Transaction sendTrans = new Transaction();
                        sendTrans.setAccountNumber(Integer.parseInt(txtAccountNumber.getText()));
                        sendTrans.setSortCode(Integer.parseInt(txtSortCode.getText()));
                        sendTrans.setDescription("Withdrawl from " + txtAccountNumber.getText());
                        sendTrans.setCreditAmount(0);
                        sendTrans.setDebitAmount(tAmt);
                        sendTrans.setBalance(bal - tAmt);
                        sendTrans.setDatetime(new Date());
                        try {
                            DBMethods.insertTransaction(sendTrans);
                        }
                        catch (Exception ex)
                        {
                            JOptionPane.showMessageDialog(null, "Error: Transaction not updated! - " + ex);
                        }
                        
                        this.dispose();
                        new Menu().setVisible(true);
                    }
                    catch (Exception ex)
                    {
                        JOptionPane.showMessageDialog(null, "Error: Receiver account not updated! - " + ex);
                    }   
                    JOptionPane.showMessageDialog(null,"Accounts updated!");
                }
                else {
                    // just update the sender account
                    try {
                        int newSendBal = bal - tAmt;
                        DBMethods.updateAccount(Integer.parseInt(txtAccountID.getText()), newSendBal);
                        
  
                        // receiver transaction
                        
                        Transaction recTrans = new Transaction();
                        recTrans.setAccountNumber(rAcc);
                        recTrans.setSortCode(rSrt);
                        recTrans.setDescription("Deposit into (External Account) " + rAcc);
                        recTrans.setCreditAmount(tAmt);
                        recTrans.setDebitAmount(0);
                        recTrans.setBalance(0); // unknown balance - not an internal account
                        recTrans.setDatetime(new Date());
                        try {
                            DBMethods.insertTransaction(recTrans);
                        }
                        catch (Exception ex)
                        {
                            JOptionPane.showMessageDialog(null, "Error: Transaction not updated! - " + ex);
                        }
                       
                        // sender transaction
                        
                        Transaction sendTrans = new Transaction();
                        sendTrans.setAccountNumber(Integer.parseInt(txtAccountNumber.getText()));
                        sendTrans.setSortCode(Integer.parseInt(txtSortCode.getText()));
                        sendTrans.setDescription("Withdrawl from " + txtAccountNumber.getText());
                        sendTrans.setCreditAmount(0);
                        sendTrans.setDebitAmount(tAmt);
                        sendTrans.setBalance(bal - tAmt);
                        sendTrans.setDatetime(new Date());
                        try {
                            DBMethods.insertTransaction(sendTrans);
                        }
                        catch (Exception ex)
                        {
                            JOptionPane.showMessageDialog(null, "Error: Transaction not updated! - " + ex);
                        }
                        
                        JOptionPane.showMessageDialog(null,"Accounts updated!");    
                        this.dispose();
                        new Menu().setVisible(true);
                    }
                    catch (Exception ex)
                    {
                        JOptionPane.showMessageDialog(null, "Error: Receiver account not updated! - " + ex);
                    }
                }
                
            }
            catch (Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Error: Account not found! - " + ex);
            }            
            
        }   
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    
    
    private void txtAccountNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountNumberActionPerformed

    private void txtSortCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSortCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSortCodeActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtAccountIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountIDActionPerformed

    private void txtBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBalanceActionPerformed

    private void txtRecAccountNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecAccountNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecAccountNumberActionPerformed

    private void txtRecSortCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecSortCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecSortCodeActionPerformed

    private void txtTransferAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTransferAmtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTransferAmtActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        this.dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_menuExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TransferFunds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransferFunds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransferFunds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransferFunds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransferFunds().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JTextField txtAccountID;
    private javax.swing.JTextField txtAccountNumber;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtRecAccountNumber;
    private javax.swing.JTextField txtRecSortCode;
    private javax.swing.JTextField txtSortCode;
    private javax.swing.JTextField txtTransferAmt;
    // End of variables declaration//GEN-END:variables
}
