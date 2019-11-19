/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VideoClub;

import java.awt.TextArea;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author arouven
 */
public class SalesForm extends javax.swing.JFrame {

    /**
     * Creates new form SalesForm
     */
    public SalesForm() {
        initComponents();
        this.setTitle("Sales Form");
        setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitButton = new javax.swing.JButton();
        mainMenuButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        newSaleButton = new javax.swing.JButton();
        displayAllSalesButton = new javax.swing.JButton();
        updateSaleButton = new javax.swing.JButton();
        deleteSaleButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        mainMenuButton.setText("Main Menu");
        mainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sales Form", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 24))); // NOI18N

        newSaleButton.setText("New Sale");
        newSaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newSaleButtonActionPerformed(evt);
            }
        });

        displayAllSalesButton.setText("Display all sales");
        displayAllSalesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayAllSalesButtonActionPerformed(evt);
            }
        });

        updateSaleButton.setText("Update Sale");
        updateSaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSaleButtonActionPerformed(evt);
            }
        });

        deleteSaleButton.setText("Delete Sale");
        deleteSaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSaleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newSaleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayAllSalesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateSaleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteSaleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newSaleButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayAllSalesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateSaleButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteSaleButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainMenuButton)
                    .addComponent(exitButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_mainMenuButtonActionPerformed

    private void newSaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newSaleButtonActionPerformed
        AddSalesForm addSales = new AddSalesForm();
        addSales.setVisible(true);
    }//GEN-LAST:event_newSaleButtonActionPerformed

    private void displayAllSalesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayAllSalesButtonActionPerformed
        TextArea sDetails = new TextArea();
        String outputText = "";
        outputText = MainMenu.slArray.stream().map((sl) -> sl.printReceipt()).reduce(outputText, String::concat);
        sDetails.setText(outputText);
        JOptionPane.showMessageDialog(this, sDetails, "Sales Details", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_displayAllSalesButtonActionPerformed

    private void updateSaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSaleButtonActionPerformed
        try{
            String slIdToSearch = JOptionPane.showInputDialog(this, "Search the sale(id) to update: ", "Sale ID", JOptionPane.INFORMATION_MESSAGE);
            if (slIdToSearch != null) {
                int toIntId = Integer.parseInt(slIdToSearch);
                int currentPosition = 0;
                for(Sales sl : MainMenu.slArray){
                    int slId = sl.getSalesId();
                    if(toIntId == slId){
                        UpdateSalesForm updateSale = new UpdateSalesForm(currentPosition);
                        updateSale.setVisible(true);
                        System.out.println(currentPosition);
                        return;
                    }
                    currentPosition ++;
                }
                if(currentPosition > MainMenu.slArray.size()-1){
                    JOptionPane.showMessageDialog(this, "Sale " + slIdToSearch + " Not Found!", "Not Found", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                System.out.println("cancel is pressed.");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }//GEN-LAST:event_updateSaleButtonActionPerformed

    private void deleteSaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSaleButtonActionPerformed
        String slIdToSearch = JOptionPane.showInputDialog(this, "Search the sale(id) to delete: ", "Sale ID", JOptionPane.INFORMATION_MESSAGE);
        if (slIdToSearch != null) {
            int toIntId = Integer.parseInt(slIdToSearch);
            int currentPosition = 0;
            for(Sales sl: MainMenu.slArray){
                if(toIntId == sl.getSalesId()){
                    int descision = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this sale: " + toIntId + " ?","Delete Sale", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

                    if(descision == 0){
                        int boughtMov = sl.movieObj.getNoOfMovies();
                        for(Movie m: MainMenu.movArray){
                            if(m.getMovieId() == sl.movieObj.getMovieId()){
                                m.setNoOfMovies(m.getNoOfMovies() + boughtMov);
                                
                                MainMenu.slArray.remove(currentPosition);
                                System.out.println("deleted");
                                JOptionPane.showMessageDialog(this, toIntId + " was deleted.", "Sale Deleted", JOptionPane.DEFAULT_OPTION);
                                return;//exit the button function
                            }
                        }
                        
                        
                    }
                    else{
                        System.out.println("do nothing");
                    }
                    break;
                }
                currentPosition ++;
            }

            System.out.println("current " + currentPosition);
            System.out.println("size " + MainMenu.slArray.size());

            if(currentPosition > MainMenu.slArray.size()-1){
                JOptionPane.showMessageDialog(this, "Sale " + toIntId + " Not Found!", "Not Found", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            System.out.println("cancel is pressed.");
        }
    }//GEN-LAST:event_deleteSaleButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteSaleButton;
    private javax.swing.JButton displayAllSalesButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mainMenuButton;
    private javax.swing.JButton newSaleButton;
    private javax.swing.JButton updateSaleButton;
    // End of variables declaration//GEN-END:variables
}
