package ui.supply;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.JTableHeader;
import controller.TableModel;
import model.Product;


public class QAFrom extends javax.swing.JFrame {

    /**
     * Creates new form MANAGE_PRODUCTS_FORM
     */
    String imagePth = null;
    Product product;
    
    public QAFrom() {
        
        initComponents();
       
        populateJtable("");
        
        jTable_Products.setShowGrid(true);
        
        jTable_Products.setGridColor(Color.gray);
        
        jTable_Products.setSelectionBackground(Color.gray);
        
        JTableHeader th = jTable_Products.getTableHeader();

        th.setFont(new Font("Tahoma", Font.PLAIN, 12));
    }
    
    
    public JPanel getAddProduct() {
        return addProduct;
    }

    
    
    // populate the jtable
    public void populateJtable(String val){
        
        Product prd = new Product();
        ArrayList<Product> ProductList = prd.productsList(val);
        
        String[] colNames = {"Id","Name","Price","Quantity","Image","QA Result","Category"};
        Object[][] rows = new Object[ProductList.size()][7];
        
        for(int i = 0; i < ProductList.size(); i++){
            rows[i][0] = ProductList.get(i).getId();
            rows[i][1] = ProductList.get(i).getName();
            rows[i][2] = ProductList.get(i).getPrice();
            rows[i][3] = ProductList.get(i).getQuantity();
            
                        ImageIcon pic = new ImageIcon(new ImageIcon
                                          (ProductList.get(i).getPicture())
                                           .getImage()
                                           .getScaledInstance(120, 80, Image.SCALE_SMOOTH));
            
            rows[i][4] = pic;
            
            rows[i][5] = ProductList.get(i).getDescription();
            rows[i][6] = ProductList.get(i).getCategoryName(ProductList.get(i).getId());

        }
        
        TableModel mmd = new TableModel(rows, colNames);
        jTable_Products.setModel(mmd);
        jTable_Products.setRowHeight(80);
        jTable_Products.getColumnModel().getColumn(5).setPreferredWidth(150);
        jTable_Products.getColumnModel().getColumn(4).setPreferredWidth(120);
    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addProduct = new javax.swing.JPanel();
        jButton_UPDATE_PRODUCT_ = new javax.swing.JButton();
        jButton_DELETE_PRODUCT_ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Products = new javax.swing.JTable();
        jTextField_VALUE_TO_SEARCH = new javax.swing.JTextField();
        jButton_SEARCH_ = new javax.swing.JButton();
        jButton_REFRESH_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));

        addProduct.setBackground(new java.awt.Color(255, 255, 255));

        jButton_UPDATE_PRODUCT_.setBackground(new java.awt.Color(65, 131, 215));
        jButton_UPDATE_PRODUCT_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_UPDATE_PRODUCT_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_UPDATE_PRODUCT_.setText("Update Quality");
        jButton_UPDATE_PRODUCT_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UPDATE_PRODUCT_ActionPerformed(evt);
            }
        });

        jButton_DELETE_PRODUCT_.setBackground(new java.awt.Color(246, 36, 89));
        jButton_DELETE_PRODUCT_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_DELETE_PRODUCT_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_DELETE_PRODUCT_.setText("Remove Selected Product");
        jButton_DELETE_PRODUCT_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DELETE_PRODUCT_ActionPerformed(evt);
            }
        });

        jTable_Products.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jTable_Products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable_Products);

        jTextField_VALUE_TO_SEARCH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton_SEARCH_.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton_SEARCH_.setText("Search");
        jButton_SEARCH_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SEARCH_ActionPerformed(evt);
            }
        });

        jButton_REFRESH_.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton_REFRESH_.setText("Refresh");
        jButton_REFRESH_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_REFRESH_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addProductLayout = new javax.swing.GroupLayout(addProduct);
        addProduct.setLayout(addProductLayout);
        addProductLayout.setHorizontalGroup(
            addProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addProductLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(addProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_UPDATE_PRODUCT_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_DELETE_PRODUCT_, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(56, 56, 56)
                .addGroup(addProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addProductLayout.createSequentialGroup()
                        .addComponent(jTextField_VALUE_TO_SEARCH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_SEARCH_, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_REFRESH_, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132))
                    .addGroup(addProductLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(96, Short.MAX_VALUE))))
        );
        addProductLayout.setVerticalGroup(
            addProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addProductLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(addProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_SEARCH_)
                    .addComponent(jTextField_VALUE_TO_SEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_REFRESH_))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addProductLayout.createSequentialGroup()
                        .addComponent(jButton_UPDATE_PRODUCT_, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton_DELETE_PRODUCT_, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // button search
    private void jButton_SEARCH_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SEARCH_ActionPerformed
       
        populateJtable(jTextField_VALUE_TO_SEARCH.getText());
        
    }//GEN-LAST:event_jButton_SEARCH_ActionPerformed

    
    // button update product
    private void jButton_UPDATE_PRODUCT_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UPDATE_PRODUCT_ActionPerformed
       
        try{

            // open the edit product form and display data into the fields
            EditQAForm editProductForm = new EditQAForm();

            Integer rowIndex = jTable_Products.getSelectedRow();

            editProductForm.productId = Integer.valueOf(jTable_Products.getValueAt(rowIndex, 0).toString());
            editProductForm.jTextField_Name.setText(jTable_Products.getValueAt(rowIndex, 1).toString());
            editProductForm.jTextField_Price.setText(jTable_Products.getValueAt(rowIndex, 2).toString());
            editProductForm.jTextField_Quantity.setText(jTable_Products.getValueAt(rowIndex, 3).toString());
            //editProductForm.jTextField_Description.setText(jTable_Products.getValueAt(rowIndex, 5).toString());
            
            
            //editProductForm.comboQA.setSelectedItem(jTable_Products.getValueAt(rowIndex, 5));
            editProductForm.jComboBox1.setSelectedItem(jTable_Products.getValueAt(rowIndex, 6));

            // display the image in jlabel
            ImageIcon image1 = (ImageIcon)jTable_Products.getValueAt(rowIndex, 4);
            Image image2 = image1.getImage().getScaledInstance(editProductForm.jLabel_Picture.getWidth(), editProductForm.jLabel_Picture.getHeight()
                     , Image.SCALE_SMOOTH);
            ImageIcon image3 = new ImageIcon(image2);
            editProductForm.jLabel_Picture.setIcon(image3);

            editProductForm.setVisible(true);
                    editProductForm.pack();
                    editProductForm.setLocationRelativeTo(null);
                    editProductForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }catch(Exception Ex){
            JOptionPane.showMessageDialog(null, "You Must Select A Product From The Table", "No Product Selected", 2);
        }
    }//GEN-LAST:event_jButton_UPDATE_PRODUCT_ActionPerformed

    
    // button delete product
    private void jButton_DELETE_PRODUCT_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DELETE_PRODUCT_ActionPerformed
        
        try{
            Integer rowIndex = jTable_Products.getSelectedRow();
            Integer id = Integer.valueOf(jTable_Products.getValueAt(rowIndex, 0).toString());
            Product.deleteProduct(id);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "You Must Select A Product From The Table", "No Product Selected", 2);
        }
    }//GEN-LAST:event_jButton_DELETE_PRODUCT_ActionPerformed

    
    // button refresh
    private void jButton_REFRESH_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_REFRESH_ActionPerformed
     
        populateJtable("");
        
    }//GEN-LAST:event_jButton_REFRESH_ActionPerformed

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
            java.util.logging.Logger.getLogger(QAFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QAFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QAFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QAFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QAFrom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addProduct;
    private javax.swing.JButton jButton_DELETE_PRODUCT_;
    private javax.swing.JButton jButton_REFRESH_;
    private javax.swing.JButton jButton_SEARCH_;
    private javax.swing.JButton jButton_UPDATE_PRODUCT_;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Products;
    private javax.swing.JTextField jTextField_VALUE_TO_SEARCH;
    // End of variables declaration//GEN-END:variables
}
