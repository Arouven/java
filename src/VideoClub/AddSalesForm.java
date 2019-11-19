/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VideoClub;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author arouven
 */
public class AddSalesForm extends javax.swing.JFrame {

    /**
     * Creates new form AddSalesForm
     */
    public AddSalesForm() {
        this.setTitle("Performing Sales");
        initComponents();
        
        try{
            int lastMovieIndex = MainMenu.movArray.size()-1;
            if(lastMovieIndex < 0){
                throw new Exception("No movie registered");
            }
            else{
                Movie mov = MainMenu.movArray.get(lastMovieIndex);  
                movieId.setText(Integer.toString(mov.getMovieId()));
                movieName.setText(mov.getMovieName());
                percentageDiscount.setText(Double.toString(mov.getPercentageDiscount()));
            }

            
            int lastStaffIndex = MainMenu.stArray.size()-1;
            if(lastStaffIndex < 0){
                throw new Exception("No staff registered");
            }
            else{
                Staff st = MainMenu.stArray.get(lastStaffIndex);    
                staffId.setText(Integer.toString(st.getStaffId()));
                staffName.setText(st.getStaffName());
            }

            
            int lastCustomerIndex = MainMenu.custArray.size()-1;  
            if(lastCustomerIndex < 0){
                throw new Exception("No customer registered");
            }
            else{
                Customer cust = MainMenu.custArray.get(lastCustomerIndex);       
                customerId.setText(Integer.toString(cust.getCustomerId()));             
                customerName.setText(cust.getCustomerName());
                member.setSelected(cust.isMember());
            }

            
        }
        catch(Exception e){
            System.out.println(e);
            
            movieId.setText("");
            movieName.setText("");
            percentageDiscount.setText("");

   
            staffId.setText("");
            staffName.setText("");

            
            customerId.setText("");             
            customerName.setText("");
            member.setSelected(false);
           
                    //break;
            //String custNameToSearch = JOptionPane.showInputDialog(this, e, "error", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            //break;
            //dispose();
            System.exit(0);
        }
        if(member.isSelected() == true){
            percentageDiscount.setText("20.0");
        }
        setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);   
        
        checkActive();
        
    }
   
    private void checkActive(){
        if(member.isSelected() == true){
            percentageDiscount.setEditable(true);
        }
        else{
            percentageDiscount.setEditable(false);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        staffFormButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        movieName = new javax.swing.JTextField();
        noOfMovies = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        staffId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        staffName = new javax.swing.JTextField();
        member = new javax.swing.JCheckBox();
        salesId = new javax.swing.JTextField();
        movieId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        customerId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        customerName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        percentageDiscount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        staffFormButton.setText("Sale Form");
        staffFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffFormButtonActionPerformed(evt);
            }
        });

        AddButton.setText("Sale");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Sale", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 24))); // NOI18N

        jLabel2.setText("Movie Name: ");

        jLabel4.setText("No. Bought:");

        jLabel5.setText("Staff ID:");

        jLabel3.setText("Staff Name:");

        member.setText("Member");
        member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberActionPerformed(evt);
            }
        });

        jLabel8.setText("Movie ID:");

        jLabel1.setText("Sale ID:");

        jLabel6.setText("Customer ID:");

        jLabel7.setText("Customer Name:");

        percentageDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentageDiscountActionPerformed(evt);
            }
        });

        jLabel9.setText("Percentage Discount:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(member))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(percentageDiscount, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(customerName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(customerId, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(movieId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(movieName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(noOfMovies, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(staffId, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(staffName)
                            .addComponent(salesId))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salesId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movieId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movieName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noOfMovies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staffId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staffName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(percentageDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(12, 12, 12)
                .addComponent(member)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(staffFormButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton)
                    .addComponent(staffFormButton)
                    .addComponent(exitButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void staffFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffFormButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_staffFormButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        try{
            if(salesId.getText().isEmpty()){
                throw new Exception("Empty sale id");
            }
            else if(movieId.getText().isEmpty()){
                throw new Exception("Empty movie id");
            }            
            else if(movieName.getText().isEmpty()){
                throw new Exception("Empty movie name");
            }
            else if(noOfMovies.getText().isEmpty()){
                throw new Exception("Empty Number of movies to buy");
            }
            else if(staffId.getText().isEmpty()){
                throw new Exception("Empty staff id");
            }
            else if(staffName.getText().isEmpty()){
                throw new Exception("Empty staff name");
            }
            else if(customerId.getText().isEmpty()){
                throw new Exception("Empty customer id");
            }
            else if(customerName.getText().isEmpty()){
                throw new Exception("Empty customer name");
            }
            else if(percentageDiscount.getText().isEmpty()){
                throw new Exception("Empty percentage");
            }
            else{
                int slId = Integer.parseInt(salesId.getText());
                int movId = Integer.parseInt(movieId.getText());
                String movName = movieName.getText();
                int boughtMovNo = Integer.parseInt(noOfMovies.getText());
                int stId = Integer.parseInt(staffId.getText());
                String stName = staffName.getText();
                int custId = Integer.parseInt(customerId.getText());
                String custName = customerName.getText();
                double percentDisc = Double.parseDouble(percentageDiscount.getText()); 
                boolean mem = member.isSelected();
                
                
                Sales mySal = new Sales();
                mySal.setSalesId(slId);
                mySal.movieObj.setMovieId(movId);
                mySal.movieObj.setMovieName(movName);
                
                mySal.staffObj.setStaffId(stId);
                mySal.staffObj.setStaffName(stName);
                
                mySal.customerObj.setCustomerId(custId);
                mySal.customerObj.setCustomerName(custName);
                mySal.customerObj.setMember(mem);
                mySal.movieObj.setPercentageDiscount(percentDisc);
                String performSales = mySal.performSales(boughtMovNo);
                
                
                MainMenu.slArray.add(mySal);
                this.setVisible(false);
                JOptionPane.showMessageDialog(this, performSales, "Sale receipt", JOptionPane.DEFAULT_OPTION);

                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberActionPerformed
        checkActive();        
    }//GEN-LAST:event_memberActionPerformed

    private void percentageDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentageDiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_percentageDiscountActionPerformed

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
            java.util.logging.Logger.getLogger(AddSalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSalesForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField customerId;
    private javax.swing.JTextField customerName;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox member;
    private javax.swing.JTextField movieId;
    private javax.swing.JTextField movieName;
    private javax.swing.JTextField noOfMovies;
    private javax.swing.JTextField percentageDiscount;
    private javax.swing.JTextField salesId;
    private javax.swing.JButton staffFormButton;
    private javax.swing.JTextField staffId;
    private javax.swing.JTextField staffName;
    // End of variables declaration//GEN-END:variables
}
