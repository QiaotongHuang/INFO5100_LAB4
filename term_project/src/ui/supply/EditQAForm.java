package ui.supply;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Category;
import controller.Imagefunc;
import model.Product;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1BestCsharp
 */
public class EditQAForm extends javax.swing.JFrame {

    /**
     * Creates new form EDIT_PRODUCT_FORM
     */
    
    // get the image path
    String imagePth = null;
    
    // get the id of the product to edit from the manage product form
    public Integer productId;
    
    public EditQAForm() {
        initComponents();
        
        // populate the combobox with key and value
        BindCombo();
        jComboBox1.setEditable(false);
        jComboBox1.setEnabled(false);
        jTextField_Name.setEditable(false);
        jTextField_Name.setEnabled(false);
        jTextField_Quantity.setEditable(false);
        jTextField_Quantity.setEnabled(false);
        jTextField_Price.setEditable(false);
        jTextField_Price.setEnabled(false);

        jButton_BROWSE_PIC.setBorderPainted( false );
        jButton_BROWSE_PIC.setFocusPainted( false );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Price = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_Quantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Name = new javax.swing.JTextField();
        jLabel_Picture = new javax.swing.JLabel();
        jButton_BROWSE_PIC = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton_EDIT_PRODUCT = new javax.swing.JButton();
        jButton_CANCEL = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        comboQA = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("QA Result:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Category:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Price:");

        jTextField_Price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Quantity:");

        jTextField_Quantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_QuantityKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Name:");

        jTextField_Name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel_Picture.setBackground(new java.awt.Color(255, 255, 204));
        jLabel_Picture.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_Picture.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Picture.setOpaque(true);

        jButton_BROWSE_PIC.setText("Select a Picture");
        jButton_BROWSE_PIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BROWSE_PICActionPerformed(evt);
            }
        });

        jButton_EDIT_PRODUCT.setBackground(new java.awt.Color(65, 131, 215));
        jButton_EDIT_PRODUCT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_EDIT_PRODUCT.setForeground(new java.awt.Color(255, 255, 255));
        jButton_EDIT_PRODUCT.setText("Update QA");
        jButton_EDIT_PRODUCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EDIT_PRODUCTActionPerformed(evt);
            }
        });

        jButton_CANCEL.setBackground(new java.awt.Color(255, 51, 0));
        jButton_CANCEL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_CANCEL.setForeground(new java.awt.Color(255, 255, 255));
        jButton_CANCEL.setText("Cancel");
        jButton_CANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CANCELActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Picture:");

        comboQA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "quality_approved", "quality_reject", "pending" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboQA, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_Quantity)
                            .addComponent(jTextField_Price)
                            .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton_CANCEL, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                            .addComponent(jButton_EDIT_PRODUCT, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton_BROWSE_PIC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                .addComponent(jLabel_Picture, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboQA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Picture, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jButton_BROWSE_PIC)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_EDIT_PRODUCT)
                    .addComponent(jButton_CANCEL))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // create the methode to fill combobox with keys and values

    public void BindCombo(){

        Category category = new Category();

        HashMap<String, Integer> map = category.populateCombo();

        for(String s : map.keySet()){

            jComboBox1.addItem(s);

        }

    }

    // browse image button
    private void jButton_BROWSE_PICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BROWSE_PICActionPerformed

        Imagefunc mf = new Imagefunc();
        imagePth = mf.browseImage(jLabel_Picture);
        System.out.println(imagePth);

    }//GEN-LAST:event_jButton_BROWSE_PICActionPerformed
    
    // update product
    private void jButton_EDIT_PRODUCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EDIT_PRODUCTActionPerformed

        Product product;
        Category category = new Category();

        HashMap<String, Integer> map = category.populateCombo();
        
        
        String name = jTextField_Name.getText();
        
        String price;
        String selectQA = comboQA.getSelectedItem().toString();
        String description = selectQA;
        Integer quantity;
        Integer catId;

        byte[] img;
        if(imagePth != null){// update the image to
            try {
                    if(verifFields())
                    {
                        Path path = Paths.get(imagePth);
                        img = Files.readAllBytes(path);

                        quantity = Integer.valueOf(jTextField_Quantity.getText());
                        
                        // get the category id
                        catId = map.get(jComboBox1.getSelectedItem().toString());
                        price = jTextField_Price.getText();

                        product = new Product(productId,name,catId,price,img,quantity,description,null);

                        Product.updateProduct(product, true);   
                    }
                
            }
            catch (IOException ex) {
                Logger.getLogger(EditQAForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{ // not updating the image to
             if(verifFields())
                    {
                        quantity = Integer.valueOf(jTextField_Quantity.getText());
                        catId = map.get(jComboBox1.getSelectedItem().toString());
                        price = jTextField_Price.getText();

                        product = new Product(productId,name,catId,price,null,quantity,description,null);
                        Product.updateProduct(product, false);
                    }
        }

    }//GEN-LAST:event_jButton_EDIT_PRODUCTActionPerformed

    private void jButton_CANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CANCELActionPerformed

        System.exit(0);

    }//GEN-LAST:event_jButton_CANCELActionPerformed

    // Allow OnLy Numbers on key typed
    private void jTextField_QuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_QuantityKeyTyped
        
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
        
    }//GEN-LAST:event_jTextField_QuantityKeyTyped

    
    // verify the empty fields
    public boolean verifFields()
    {
     
        if(jTextField_Quantity.getText().equals("") || jTextField_Price.getText().equals("") || jTextField_Name.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty", "Empty Fields", 0);
            return false;
        }
        else{
            try{
                Integer.valueOf(jTextField_Quantity.getText());
                Double.valueOf(jTextField_Price.getText());
                return true;
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Invalid Values", 0);
                return false;
            }
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(EditQAForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditQAForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditQAForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditQAForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditQAForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboQA;
    private javax.swing.JButton jButton_BROWSE_PIC;
    private javax.swing.JButton jButton_CANCEL;
    private javax.swing.JButton jButton_EDIT_PRODUCT;
    public javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel_Picture;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTextField_Name;
    public javax.swing.JTextField jTextField_Price;
    public javax.swing.JTextField jTextField_Quantity;
    // End of variables declaration//GEN-END:variables
}
