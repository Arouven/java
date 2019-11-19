/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VideoClub;

//import static VideoClub.MainMenu.custArray;

import java.awt.TextArea;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author arouven
 */
public class CustomerForm extends javax.swing.JFrame {
    
    /**
     * Creates new form CustomerForm
     */
    public CustomerForm() {
        initComponents();
        this.setTitle("Customer Form");
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

        mainMenuButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        addCustomerButton = new javax.swing.JButton();
        displayAllCustomerButton = new javax.swing.JButton();
        searchCustomerButton = new javax.swing.JButton();
        updateCustomerButton = new javax.swing.JButton();
        deleteCustomerButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainMenuButton.setText("Main Menu");
        mainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer Form", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 24))); // NOI18N

        addCustomerButton.setText("Add Customer");
        addCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerButtonActionPerformed(evt);
            }
        });

        displayAllCustomerButton.setText("Display all customer");
        displayAllCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayAllCustomerButtonActionPerformed(evt);
            }
        });

        searchCustomerButton.setText("Search by Name");
        searchCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerButtonActionPerformed(evt);
            }
        });

        updateCustomerButton.setText("Update Customer");
        updateCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCustomerButtonActionPerformed(evt);
            }
        });

        deleteCustomerButton.setText("Delete Customer");
        deleteCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayAllCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addCustomerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayAllCustomerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchCustomerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateCustomerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteCustomerButton)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(mainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainMenuButton)
                    .addComponent(exitButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerButtonActionPerformed
        AddCustomerForm addCustomer = new AddCustomerForm();
        addCustomer.setVisible(true);
    }//GEN-LAST:event_addCustomerButtonActionPerformed

    private void displayAllCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayAllCustomerButtonActionPerformed
        TextArea cDetails = new TextArea();
        String outputText = "";
        outputText = MainMenu.custArray.stream().map((cust) -> cust.displayCustomerDetails()).reduce(outputText, String::concat);
        cDetails.setText(outputText);
        JOptionPane.showMessageDialog(this, cDetails, "Customer Detail", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_displayAllCustomerButtonActionPerformed

    private void deleteCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustomerButtonActionPerformed
        String custNameToSearch = JOptionPane.showInputDialog(this, "Search the customer(name) to delete: ", "Customer Name", JOptionPane.INFORMATION_MESSAGE);
        if (custNameToSearch != null) {
            int currentPosition = 0;        
            for(Customer cust: MainMenu.custArray){
                String custName = cust.getCustomerName();
                if(custNameToSearch.equals(custName)){
                    int descision = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this customer: " + custName + " ?","Delete Customer", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

                    if(descision == 0){
                        MainMenu.custArray.remove(currentPosition);
                        System.out.println("deleted");
                        JOptionPane.showMessageDialog(this, custName + " was deleted.", "Customer Deleted", JOptionPane.DEFAULT_OPTION);
                        return;//exit the button function
                    }   
                    else{
                        System.out.println("do nothing");
                    }
                    break;
                }
                currentPosition ++;
            }

            System.out.println("current " + currentPosition);
            System.out.println("size " + MainMenu.custArray.size());

            if(currentPosition > MainMenu.custArray.size()-1){
                JOptionPane.showMessageDialog(this, "Customer " + custNameToSearch + " Not Found!", "Not Found", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            System.out.println("cancel is pressed.");
        }
    }//GEN-LAST:event_deleteCustomerButtonActionPerformed

    private void updateCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCustomerButtonActionPerformed
        String custNameToSearch = JOptionPane.showInputDialog(this, "Search the customer(name) to update: ", "Customer Name", JOptionPane.INFORMATION_MESSAGE);
        if (custNameToSearch != null) {
            int currentPosition = 0;
            for(Customer cust : MainMenu.custArray){
                String custName = cust.getCustomerName();
                if(custNameToSearch.equals(custName)){
                    UpdateCustomerForm updateCustomer = new UpdateCustomerForm(currentPosition);
                    updateCustomer.setVisible(true);
                    System.out.println(currentPosition);    
                    return;
                }
                currentPosition ++;
            }        
            if(currentPosition > MainMenu.custArray.size()-1){
                JOptionPane.showMessageDialog(this, "Customer " + custNameToSearch + " Not Found!", "Not Found", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            System.out.println("cancel is pressed.");
        }
    }//GEN-LAST:event_updateCustomerButtonActionPerformed

    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_mainMenuButtonActionPerformed

    private void searchCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerButtonActionPerformed
        String custNameToSearch = JOptionPane.showInputDialog(this, "Search the customer(name): ", "Customer Name", JOptionPane.INFORMATION_MESSAGE);
        if (custNameToSearch != null) {
            int currentPosition = 0;
            for(Customer cust: MainMenu.custArray){
                String custName = cust.getCustomerName();
                if(custNameToSearch.equals(custName)){
                    TextArea cDetails = new TextArea();
                    cDetails.setText(cust.displayCustomerDetails());
                    JOptionPane.showMessageDialog(this, cDetails, "Customer Detail", JOptionPane.INFORMATION_MESSAGE);

                    return;
                }
                currentPosition ++;
            }

            System.out.println("current " + currentPosition);
            System.out.println("size " + MainMenu.custArray.size());

            if(currentPosition > MainMenu.custArray.size()-1){
                JOptionPane.showMessageDialog(this, "Customer " + custNameToSearch + " Not Found!", "Not Found", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            System.out.println("cancel is pressed");
        }

    }//GEN-LAST:event_searchCustomerButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustomerButton;
    private javax.swing.JButton deleteCustomerButton;
    private javax.swing.JButton displayAllCustomerButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mainMenuButton;
    private javax.swing.JButton searchCustomerButton;
    private javax.swing.JButton updateCustomerButton;
    // End of variables declaration//GEN-END:variables
}
