
package gui;

import dbConnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MainUser extends javax.swing.JFrame {


    public MainUser() {
        initComponents();
        loadProductsTable();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        searchTXT = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        productstable = new javax.swing.JTable();
        searchBTN = new javax.swing.JButton();
        productidLBL = new javax.swing.JLabel();
        productidTXT = new javax.swing.JTextField();
        productnameLBL = new javax.swing.JLabel();
        productnameTXT = new javax.swing.JTextField();
        categoryLBL = new javax.swing.JLabel();
        categoryTXT = new javax.swing.JTextField();
        priceLBL = new javax.swing.JLabel();
        priceTXT = new javax.swing.JTextField();
        stocksLBL = new javax.swing.JLabel();
        stocksTXT = new javax.swing.JTextField();
        clearBTN = new javax.swing.JButton();
        filterCMBBX = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        quantitySpinner = new javax.swing.JSpinner();
        productnameCMBBX = new javax.swing.JComboBox<>();
        addsaleBTN = new javax.swing.JButton();
        useridTXT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1171, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("HOME", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1171, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("PERFORMANCE", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTXTActionPerformed(evt);
            }
        });
        jPanel5.add(searchTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 270, 40));

        productstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Category", "Price", "Stocks"
            }
        ));
        jScrollPane1.setViewportView(productstable);

        jScrollPane2.setViewportView(jScrollPane1);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 460, 410));

        searchBTN.setText("SEARCH");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });
        jPanel5.add(searchBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 50, -1, 40));

        productidLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        productidLBL.setText("Product ID:");
        jPanel5.add(productidLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 90, 30));

        productidTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productidTXTActionPerformed(evt);
            }
        });
        jPanel5.add(productidTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 140, 40));

        productnameLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        productnameLBL.setText("Product Name:");
        jPanel5.add(productnameLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 120, 30));

        productnameTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productnameTXTActionPerformed(evt);
            }
        });
        jPanel5.add(productnameTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 140, 40));

        categoryLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        categoryLBL.setText("Category:");
        jPanel5.add(categoryLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 90, 30));

        categoryTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryTXTActionPerformed(evt);
            }
        });
        jPanel5.add(categoryTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 140, 40));

        priceLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        priceLBL.setText("Price:");
        jPanel5.add(priceLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 90, 30));

        priceTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTXTActionPerformed(evt);
            }
        });
        jPanel5.add(priceTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 140, 40));

        stocksLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stocksLBL.setText("Stocks:");
        jPanel5.add(stocksLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 60, 30));

        stocksTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stocksTXTActionPerformed(evt);
            }
        });
        jPanel5.add(stocksTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, 140, 40));

        clearBTN.setText("CLEAR");
        clearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTNActionPerformed(evt);
            }
        });
        jPanel5.add(clearBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 450, 130, 30));

        filterCMBBX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Product ID", "Lowest to Highest Price", "Highest to Lowest Price", "Lowest to Highest Stocks", "Highest to Lowest Stocks" }));
        filterCMBBX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterCMBBXActionPerformed(evt);
            }
        });
        jPanel5.add(filterCMBBX, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 190, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("WAREHOUSE", jPanel4);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Quantity");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("User id");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));
        jPanel6.add(quantitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 270, 50));

        productnameCMBBX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ceremic Plates", "Silver Fork", "Glass Wine Goblet" }));
        jPanel6.add(productnameCMBBX, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 270, 55));

        addsaleBTN.setText("add sale");
        addsaleBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsaleBTNActionPerformed(evt);
            }
        });
        jPanel6.add(addsaleBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));
        jPanel6.add(useridTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 280, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Product Name ");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 84, -1, -1));

        jTabbedPane1.addTab("ADD SALES", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1171, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("LOGOUT", jPanel7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
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

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
        int selectedIndex = jTabbedPane1.getSelectedIndex();

    // Check if the "Logout" tab (index 5) is selected
    if (selectedIndex == 4) {
        // Call the logout function to go back to Login frame
        logout();
    }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void searchTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTXTActionPerformed

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
        Connection conn = DatabaseConnection.getInstance().getConnection();
        String searchQuery = searchTXT.getText().trim();

        if (searchQuery.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Product ID or Name!");
            return;
        }

        try {
            String sql = "SELECT * FROM products WHERE productID = ? OR productName = ?";
            PreparedStatement ps = conn.prepareStatement(sql);  // Fix: changed `query` to `sql`
            ps.setString(1, searchQuery);
            ps.setString(2, searchQuery);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                productidTXT.setText(rs.getString("productID"));
                productnameTXT.setText(rs.getString("productName"));
                categoryTXT.setText(rs.getString("category"));
                priceTXT.setText(rs.getString("price"));
                stocksTXT.setText(rs.getString("stockQuantity"));
            } else {
                JOptionPane.showMessageDialog(null, "Product Not Found!");
            }

            // Close resources
            rs.close();
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Retrieving Data!");
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchBTNActionPerformed

    private void productidTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productidTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productidTXTActionPerformed

    private void productnameTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productnameTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productnameTXTActionPerformed

    private void categoryTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryTXTActionPerformed

    private void priceTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTXTActionPerformed

    private void stocksTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stocksTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stocksTXTActionPerformed

    private void clearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTNActionPerformed
        // Clear all text fields
        searchTXT.setText("");
        productidTXT.setText("");
        productnameTXT.setText("");
        categoryTXT.setText("");
        priceTXT.setText("");
        stocksTXT.setText("");

    }//GEN-LAST:event_clearBTNActionPerformed

    private void filterCMBBXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterCMBBXActionPerformed
        String selectedOption = (String) filterCMBBX.getSelectedItem();
        sortProductsTable(selectedOption);
    }//GEN-LAST:event_filterCMBBXActionPerformed

    private void addsaleBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addsaleBTNActionPerformed
         // Get the selected product name and quantity from the UI
    String selectedProductName = (String) productnameCMBBX.getSelectedItem();
    int quantitySold = (int) quantitySpinner.getValue();  // Get quantity from JSpinner

    if (selectedProductName == null || quantitySold <= 0) {
        JOptionPane.showMessageDialog(null, "Please select a product and enter a valid quantity.");
        return;
    }

    // Get the user ID from the text field
    int userID = Integer.parseInt(useridTXT.getText());  // Get userID from the text field

    // Database connection
    Connection conn = DatabaseConnection.getInstance().getConnection();
    String sql = "SELECT productID, price FROM products WHERE productName = ?";

    try {
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, selectedProductName);  // Fetch product details
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int productID = rs.getInt("productID");
            double productPrice = rs.getDouble("price");

            // Calculate total price (quantity * product price)
            double totalPrice = productPrice * quantitySold;

            // Get the current date
            java.sql.Date saleDate = new java.sql.Date(System.currentTimeMillis());

            // Insert the sale into the database
            String insertSQL = "INSERT INTO sales (quantitySold, saleDate, totalPrice, productID, userID) "
                             + "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement insertPs = conn.prepareStatement(insertSQL);
            insertPs.setInt(1, quantitySold);
            insertPs.setDate(2, saleDate);
            insertPs.setDouble(3, totalPrice);
            insertPs.setInt(4, productID);
            insertPs.setInt(5, userID);

            insertPs.executeUpdate();  // Execute the insert query

            JOptionPane.showMessageDialog(null, "Sale added successfully!");

            insertPs.close();
        } else {
            JOptionPane.showMessageDialog(null, "Product not found!");
        }

        ps.close();
        rs.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error adding sale!");
        e.printStackTrace();
    }
    }//GEN-LAST:event_addsaleBTNActionPerformed

    private void logout() {
        // Hide the current frame (MainAdmin or MainUser)
        this.setVisible(false);

        // Show the Login frame (assuming Login.java is your login frame class)
        Login loginFrame = new Login(); // Create a new instance of Login frame
        loginFrame.setVisible(true);

        // Optionally, add a WindowListener to exit the app when Login window is closed
        loginFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0); // Exit the application when Login window is closed
            }
        });
    }
    
    private void loadProductsTable() {
        Connection conn = DatabaseConnection.getInstance().getConnection();
        DefaultTableModel model = (DefaultTableModel) productstable.getModel();

        // Clear existing table data
        model.setRowCount(0);

        try {
            String sql = "SELECT * FROM products";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                // Get data from ResultSet
                String productID = rs.getString("productID");
                String productName = rs.getString("productName");
                String category = rs.getString("category");
                String price = rs.getString("price");
                String stockQuantity = rs.getString("stockQuantity");

                // Add row to table
                model.addRow(new Object[]{productID, productName, category, price, stockQuantity});
            }

            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Loading Data!");
            e.printStackTrace();
        }
    }
    private void sortProductsTable(String sortOption) {
        Connection conn = DatabaseConnection.getInstance().getConnection();
        DefaultTableModel model = (DefaultTableModel) productstable.getModel();

        // Clear existing table data
        model.setRowCount(0);

        String sql = "";
        switch (sortOption) {
            case "Lowest to Highest Price":
                sql = "SELECT * FROM products ORDER BY price ASC";
                break;
            case "Highest to Lowest Price":
                sql = "SELECT * FROM products ORDER BY price DESC";
                break;
            case "Lowest to Highest Stocks":
                sql = "SELECT * FROM products ORDER BY stockQuantity ASC";
                break;
            case "Highest to Lowest Stocks":
                sql = "SELECT * FROM products ORDER BY stockQuantity DESC";
                break;
            case "Sort by Product ID":
                sql = "SELECT * FROM products ORDER BY productID ASC";
                break;
        }

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String productID = rs.getString("productID");
                String productName = rs.getString("productName");
                String category = rs.getString("category");
                String price = rs.getString("price");
                String stockQuantity = rs.getString("stockQuantity");

                // Add row to table
                model.addRow(new Object[]{productID, productName, category, price, stockQuantity});
            }

            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Loading Data!");
            e.printStackTrace();
        }
    }
    // Ensure the user exists in the users table
    private boolean isUserExists(int userID) {
        String sql = "SELECT COUNT(*) FROM users WHERE userID = ?";
        try (Connection conn = DatabaseConnection.getInstance().getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, userID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;  // Return true if userID exists
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
}


    
    
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
            java.util.logging.Logger.getLogger(MainUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addsaleBTN;
    private javax.swing.JLabel categoryLBL;
    private javax.swing.JTextField categoryTXT;
    private javax.swing.JButton clearBTN;
    private javax.swing.JComboBox<String> filterCMBBX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel priceLBL;
    private javax.swing.JTextField priceTXT;
    private javax.swing.JLabel productidLBL;
    private javax.swing.JTextField productidTXT;
    private javax.swing.JComboBox<String> productnameCMBBX;
    private javax.swing.JLabel productnameLBL;
    private javax.swing.JTextField productnameTXT;
    private javax.swing.JTable productstable;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JButton searchBTN;
    private javax.swing.JTextField searchTXT;
    private javax.swing.JLabel stocksLBL;
    private javax.swing.JTextField stocksTXT;
    private javax.swing.JTextField useridTXT;
    // End of variables declaration//GEN-END:variables
}
