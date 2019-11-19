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
public class UpdateSalesForm extends javax.swing.JFrame {

    private int indexOfUpdate;
    private int previousPurchase;
    private int inStock;
    

    public UpdateSalesForm() {
        this.setTitle("Update Sale");
        initComponents(); 
        setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    
    public UpdateSalesForm(int indexOfUpdate) {
        this.indexOfUpdate = indexOfUpdate;
        this.setTitle("Update Sale");
        initComponents();
        Sales sl = MainMenu.slArray.get(indexOfUpdate); 
        salesId.setText(Integer.toString(sl.getSalesId()));        
        movieId.setText(Integer.toString(sl.movieObj.getMovieId()));
        movieName.setText(sl.movieObj.getMovieName());
        previousPurchase = sl.movieObj.getNoOfMovies();
        noOfMovies.setText(Integer.toString(previousPurchase));
 
        staffId.setText(Integer.toString(sl.staffObj.getStaffId()));
        staffName.setText(sl.staffObj.getStaffName());
         
        customerId.setText(Integer.toString(sl.customerObj.getCustomerId()));
        customerName.setText(sl.customerObj.getCustomerName());        
        member.setSelected(sl.customerObj.isMember()); 
        
        setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        try{            
            int toIntId = sl.movieObj.getMovieId();
            int currentPosition = 0;
            for(Movie mov: MainMenu.movArray){
                int mvId = mov.getMovieId();
                if(toIntId == mvId){
                    inStock = mov.getNoOfMovies();
                    System.out.println(currentPosition);
                    return;
                }
                currentPosition ++;
            }
            if(currentPosition > MainMenu.movArray.size()-1){
                JOptionPane.showMessageDialog(this, "Movie " + toIntId + " Not Found!", "Not Found", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
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
        UpdateButton = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        staffFormButton.setText("Sale Form");
        staffFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffFormButtonActionPerformed(evt);
            }
        });

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update Sale", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 24))); // NOI18N

        jLabel2.setText("Movie Name: ");

        noOfMovies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noOfMoviesActionPerformed(evt);
            }
        });

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
                            .addComponent(jLabel7))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customerName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(customerId, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(movieId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
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
                .addComponent(member)
                .addContainerGap())
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateButton)
                    .addComponent(staffFormButton)
                    .addComponent(exitButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void staffFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffFormButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_staffFormButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
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
            else{
                int slId = Integer.parseInt(salesId.getText());
                int movId = Integer.parseInt(movieId.getText());
                String movName = movieName.getText();
                int boughtMovNo = Integer.parseInt(noOfMovies.getText());
                int stId = Integer.parseInt(staffId.getText());
                String stName = staffName.getText();
                int custId = Integer.parseInt(customerId.getText());
                String custName = customerName.getText();
                boolean mem = member.isSelected();

                Sales mySal = MainMenu.slArray.get(indexOfUpdate);  
                mySal.setSalesId(slId);
                mySal.movieObj.setMovieId(movId);
                mySal.movieObj.setMovieName(movName);

                mySal.staffObj.setStaffId(stId);
                mySal.staffObj.setStaffName(stName);

                mySal.customerObj.setCustomerId(custId);
                mySal.customerObj.setCustomerName(custName);
                mySal.customerObj.setMember(mem);
                
                
                
                String performSales = "";
                for (Movie m : MainMenu.movArray){//if movie registered in array
                    if(m.getMovieId() == movId){
                        if(m.getNoOfMovies() >= boughtMovNo){
                            System.out.println("obj"+m.getNoOfMovies());
                            System.out.println("bought"+boughtMovNo);
                            performSales = mySal.performSales(boughtMovNo);                            
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "Not enough in stock: "+m.getNoOfMovies(), "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    }
                }
                
                this.setVisible(false);
                
                
                //for updating the array
                int movIDToSearch = movId;
                int currentPosition = 0;
                for(Movie mov: MainMenu.movArray){
                    int movgetId = mov.getMovieId();
                    if(movIDToSearch == movgetId){
                        System.out.println("found match. movIDToSearch:"+movIDToSearch+"\tmovgetId:"+movgetId);
                        
                        
                        //update movie array in main
                        Movie toUpdate = MainMenu.movArray.get(currentPosition);
                        int returnToOriginalStock = inStock + previousPurchase;
                        toUpdate.setNoOfMovies(returnToOriginalStock);//before purchase
                        if(toUpdate.getNoOfMovies() <= 0){
                            JOptionPane.showMessageDialog(this, "Movie " + toUpdate.getMovieName() + ".\nYou have " + toUpdate.getNoOfMovies() + " remaining", "Stock!!!", JOptionPane.ERROR_MESSAGE);                
                            return;
                        }
                        else{                            
                            int remainingMovies = toUpdate.getNoOfMovies()-boughtMovNo;
                            toUpdate.setNoOfMovies(remainingMovies);   
                            System.out.println("updated");
                            JOptionPane.showMessageDialog(this, performSales, "Sale receipt", JOptionPane.DEFAULT_OPTION);
                            return;
                        }
                    }
                    currentPosition ++;
                }

                System.out.println("current " + currentPosition);
                System.out.println("size " + MainMenu.movArray.size());

                
                if(currentPosition > MainMenu.movArray.size()-1){
                    JOptionPane.showMessageDialog(this, "Movie " + movIDToSearch + " Not Found!\nAdd Movie to continue.", "Not Found", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
                
                
                
                
                

         
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberActionPerformed
       
    }//GEN-LAST:event_memberActionPerformed

    private void noOfMoviesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noOfMoviesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noOfMoviesActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateSalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateSalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateSalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateSalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateSalesForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdateButton;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox member;
    private javax.swing.JTextField movieId;
    private javax.swing.JTextField movieName;
    private javax.swing.JTextField noOfMovies;
    private javax.swing.JTextField salesId;
    private javax.swing.JButton staffFormButton;
    private javax.swing.JTextField staffId;
    private javax.swing.JTextField staffName;
    // End of variables declaration//GEN-END:variables
}
