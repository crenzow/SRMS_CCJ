
package gui;

import dbConnection.DatabaseConnection;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import java.util.*;



public class MainUser extends javax.swing.JFrame {
    private int userID;

    


    public MainUser(int userID) {
        this.userID = userID;
        initComponents();
        loadProductsTable();
        loadUserData();
        salesRecordData();
        loadProductNames(productNameCombo);
        loadUserTotalSales();
        loadUserTotalProductsSold();
        loadMostSoldProduct();
        loadBestSellingCategory();
        displaySalesPieChart();
        
        
    }
    public MainUser() {
        this(0); // Calls the other constructor with default userID = 0
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        homePanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        welcomeLBL = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bestSellingCategoryLBL = new javax.swing.JLabel();
        mostSoldProductLBL = new javax.swing.JLabel();
        totalProductsLBL = new javax.swing.JLabel();
        totalSalesLBL = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        warehousePanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        searchTXT = new javax.swing.JTextField();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        productstable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        salesPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        quantitySpinner = new javax.swing.JSpinner();
        productNameCombo = new javax.swing.JComboBox<>();
        addsaleBTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        salesRecordTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        logoutPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setPreferredSize(new java.awt.Dimension(1000, 650));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1000, 650));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1000, 650));
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        homePanel.setBackground(new java.awt.Color(153, 153, 255));
        homePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        homePanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 605));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        homePanel.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 500, 245));

        welcomeLBL.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        welcomeLBL.setText("WELCOME! ");
        homePanel.add(welcomeLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 470, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);
        homePanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 245, 500, 370));

        bestSellingCategoryLBL.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        bestSellingCategoryLBL.setText("Best Category");
        homePanel.add(bestSellingCategoryLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 230, 40));

        mostSoldProductLBL.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        mostSoldProductLBL.setText("Product");
        homePanel.add(mostSoldProductLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, 260, 40));

        totalProductsLBL.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        totalProductsLBL.setText("Total Products");
        homePanel.add(totalProductsLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, 240, 40));

        totalSalesLBL.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        totalSalesLBL.setText("Sales");
        homePanel.add(totalSalesLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, 300, 40));

        label1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label1.setText("My Total Sales: ");
        homePanel.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 220, 40));

        label2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label2.setText("Total Products Sold: ");
        homePanel.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 240, 40));

        label3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label3.setText("Most Sold Product:");
        homePanel.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 230, 40));

        label4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label4.setText("Best Selling Category:");
        homePanel.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 260, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wp3716612-periwinkle-wallpapers.jpg"))); // NOI18N
        jLabel10.setText("jLabel6");
        homePanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 610));

        jTabbedPane1.addTab("HOME", homePanel);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTXTActionPerformed(evt);
            }
        });
        jPanel5.add(searchTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 250, 40));

        searchBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchBTN.setText("SEARCH");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });
        jPanel5.add(searchBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 50, -1, 40));

        productidLBL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        productidLBL.setText("Product ID:");
        jPanel5.add(productidLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 130, 30));

        productidTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productidTXTActionPerformed(evt);
            }
        });
        jPanel5.add(productidTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 140, 40));

        productnameLBL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        productnameLBL.setText("Product Name:");
        jPanel5.add(productnameLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 140, 40));

        productnameTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productnameTXTActionPerformed(evt);
            }
        });
        jPanel5.add(productnameTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, 140, 40));

        categoryLBL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        categoryLBL.setText("Category:");
        jPanel5.add(categoryLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 90, 30));

        categoryTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryTXTActionPerformed(evt);
            }
        });
        jPanel5.add(categoryTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 140, 40));

        priceLBL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        priceLBL.setText("Price:");
        jPanel5.add(priceLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 90, 30));

        priceTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTXTActionPerformed(evt);
            }
        });
        jPanel5.add(priceTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, 140, 40));

        stocksLBL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stocksLBL.setText("Stocks:");
        jPanel5.add(stocksLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 60, 30));

        stocksTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stocksTXTActionPerformed(evt);
            }
        });
        jPanel5.add(stocksTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, 140, 40));

        clearBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clearBTN.setText("CLEAR");
        clearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTNActionPerformed(evt);
            }
        });
        jPanel5.add(clearBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 450, 140, 40));

        filterCMBBX.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        filterCMBBX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Product ID", "Lowest to Highest Price", "Highest to Lowest Price", "Lowest to Highest Stocks", "Highest to Lowest Stocks", "Sort A-Z (Product Name)", "Sort Z-A (Product Name)" }));
        filterCMBBX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterCMBBXActionPerformed(evt);
            }
        });
        jPanel5.add(filterCMBBX, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 190, 30));

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

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wp3716612-periwinkle-wallpapers.jpg"))); // NOI18N
        jLabel8.setText("jLabel6");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 610));

        javax.swing.GroupLayout warehousePanelLayout = new javax.swing.GroupLayout(warehousePanel);
        warehousePanel.setLayout(warehousePanelLayout);
        warehousePanelLayout.setHorizontalGroup(
            warehousePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        warehousePanelLayout.setVerticalGroup(
            warehousePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("WAREHOUSE", warehousePanel);

        salesPanel.setBackground(new java.awt.Color(204, 204, 255));
        salesPanel.setMinimumSize(new java.awt.Dimension(650, 353));
        salesPanel.setPreferredSize(new java.awt.Dimension(650, 353));
        salesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Quantity:");
        salesPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));
        salesPanel.add(quantitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 165, 50));

        productNameCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameComboActionPerformed(evt);
            }
        });
        salesPanel.add(productNameCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 165, 50));

        addsaleBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addsaleBTN.setText("ADD SALE");
        addsaleBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsaleBTNActionPerformed(evt);
            }
        });
        salesPanel.add(addsaleBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 140, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Product Name: ");
        salesPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        salesRecordTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sales ID", "Product Name", "Quantity Sold", "Total Price", "Sale Date"
            }
        ));
        jScrollPane2.setViewportView(salesRecordTable);

        salesPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 580, 460));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wp3716612-periwinkle-wallpapers.jpg"))); // NOI18N
        jLabel9.setText("jLabel6");
        salesPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 610));

        jTabbedPane1.addTab("MY SALES", salesPanel);

        javax.swing.GroupLayout logoutPanelLayout = new javax.swing.GroupLayout(logoutPanel);
        logoutPanel.setLayout(logoutPanelLayout);
        logoutPanelLayout.setHorizontalGroup(
            logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        logoutPanelLayout.setVerticalGroup(
            logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 609, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("LOGOUT", logoutPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
        int selectedIndex = jTabbedPane1.getSelectedIndex();

    // Check if the "Logout" tab (index 5) is selected
    if (selectedIndex == 3) {
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
    String selectedProductName = (String) productNameCombo.getSelectedItem();
    int quantitySold = (int) quantitySpinner.getValue();  // Get quantity from JSpinner

    if (selectedProductName == null || quantitySold <= 0) {
        JOptionPane.showMessageDialog(null, "Please select a product and enter a valid quantity.");
        return;
    }

    // Get the user ID from the text field
   // int userID = Integer.parseInt(useridTXT.getText());

    // Database connection
    Connection conn = DatabaseConnection.getInstance().getConnection();
    
    try {
        // Fetch product details (ID, price, stock)
        String sql = "SELECT productID, price, stockQuantity FROM products WHERE productName = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, selectedProductName);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int productID = rs.getInt("productID");
            double productPrice = rs.getDouble("price");
            int currentStock = rs.getInt("stockQuantity");  // Get current stock

            if (currentStock < quantitySold) {
                JOptionPane.showMessageDialog(null, "Insufficient stock!");
                return;
            }

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
            insertPs.executeUpdate();

            // Update the stock in the products table
            String updateStockSQL = "UPDATE products SET stockQuantity = stockQuantity - ? WHERE productID = ?";
            PreparedStatement updatePs = conn.prepareStatement(updateStockSQL);
            updatePs.setInt(1, quantitySold);
            updatePs.setInt(2, productID);
            updatePs.executeUpdate();

            JOptionPane.showMessageDialog(null, "Sale added successfully! Stock updated.");
            
            // refresh table
            salesRecordData();

            // Close statements
            insertPs.close();
            updatePs.close();
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

    private void productNameComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameComboActionPerformed

    private void loadUserData() {
        if (userID == 0) {
        // Handle the special case for admin when running MainUser directly
            welcomeLBL.setText("WELCOME!");  // Admin-specific message
            return;  // Skip the database query for the admin case
         }
        
        Connection conn = DatabaseConnection.getInstance().getConnection();
        if (conn != null) {
            String query = "SELECT firstName FROM users WHERE userID = ?";
            try {
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1, userID);  // Use userID to query the specific user
                ResultSet rs = ps.executeQuery();
                
                if (rs.next()) {
                    String firstName = rs.getString("firstName"); // Get the first name
                    
                    String upperCaseFirstName = firstName.toUpperCase();
                    
                    // Update the welcomeLBL with the first name
                    welcomeLBL.setText("WELCOME, " + upperCaseFirstName + "!");
                }
                else {
                welcomeLBL.setText("USER NOT FOUND");
            }
                
                
            } catch (SQLException ex) {
                System.out.println("Error loading user data: " + ex.getMessage());
            }
        }
    }
    
    private void loadUserTotalSales() {
    if (userID == 0) {
        // Skip the query if it's an admin (userID 0)
        totalSalesLBL.setText("My Total Sales: ₱0.00");  
        return;
    }

    Connection conn = DatabaseConnection.getInstance().getConnection();
    if (conn != null) {
        String query = "SELECT SUM(totalPrice) AS totalSales FROM sales WHERE userID = ?"; 
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, userID); // Use userID to filter sales
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                double totalSales = rs.getDouble("totalSales"); // Get total sales
                NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "PH")); 
                String formattedSales = currencyFormat.format(totalSales); // Format as PHP currency

                totalSalesLBL.setText(formattedSales); // Display in label
            } else {
                totalSalesLBL.setText("My Total Sales: ₱0.00"); // Default if no sales
            }

            rs.close();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error loading total sales: " + ex.getMessage());
        }
    }
}

    
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
            
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "PH"));

            while (rs.next()) {
                // Get data from ResultSet
                String productID = rs.getString("productID");
                String productName = rs.getString("productName");
                String category = rs.getString("category");
           //     String price = rs.getString("price");
                String stockQuantity = rs.getString("stockQuantity");
                
                double price = rs.getDouble("price");
                String formattedPrice = currencyFormat.format(price);
                

                // Add row to table
                model.addRow(new Object[]{productID, productName, category, formattedPrice, stockQuantity});
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

        String sql = "SELECT * FROM products"; // Default query

        switch (sortOption) {
            case "Lowest to Highest Price":
                sql += " ORDER BY price ASC";
                break;
            case "Highest to Lowest Price":
                sql += " ORDER BY price DESC";
                break;
            case "Lowest to Highest Stocks":
                sql += " ORDER BY stockQuantity ASC";
                break;
            case "Highest to Lowest Stocks":
                sql += " ORDER BY stockQuantity DESC";
                break;
            case "Product ID":
                sql += " ORDER BY CAST(productID AS UNSIGNED) ASC"; // Corrected numeric sorting
                break;
            case "Sort A-Z (Product Name)":
                sql += " ORDER BY productName ASC";
                break;
            case "Sort Z-A (Product Name)":
                sql += " ORDER BY productName DESC";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid sort option!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
        }

        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "PH"));

            while (rs.next()) {
                String productID = rs.getString("productID");
                String productName = rs.getString("productName");
                String category = rs.getString("category");
               // String price = rs.getString("price");
                String stockQuantity = rs.getString("stockQuantity");
                
                double priceValue = Double.parseDouble(rs.getString("price"));  // Convert string to double
            String formattedPrice = currencyFormat.format(priceValue); // Format with ₱ and commas


                // Add row to table
                model.addRow(new Object[]{productID, productName, category, formattedPrice, stockQuantity});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Loading Data!", "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    public void salesRecordData() {
    // Database connection
        Connection conn = DatabaseConnection.getInstance().getConnection();
        // Create a DefaultTableModel to display the data in JTable
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.setRowCount(0);

        // SQL query to fetch the sales data
      /*  String sql = "SELECT s.salesID, CONCAT(u.firstName, ' ', u.lastName) AS salesPerson, "
                   + "p.productName, s.quantitySold, s.totalPrice AS sales, s.saleDate "
                   + "FROM sales s "
                   + "JOIN users u ON s.userID = u.userID "
                   + "JOIN products p ON s.productID = p.productID "
                   + "ORDER BY s.salesID ASC";       */ // Sort by salesID in ascending order
                   
          String sql = "SELECT s.salesID, CONCAT(u.firstName, ' ', u.lastName) AS salesPerson, "
                    + "p.productName, s.quantitySold, s.totalPrice AS sales, s.saleDate "
                    + "FROM sales s "
                    + "JOIN users u ON s.userID = u.userID "
                    + "JOIN products p ON s.productID = p.productID "
                    + "WHERE s.userID = ? "
                    + "ORDER BY s.salesID ASC"; // Sort by salesID in ascending order



        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, userID); // Use the stored userID
            ResultSet rs = ps.executeQuery();

            

            // Adding column headers to the table model
            tableModel.addColumn("Sales ID");
        //    tableModel.addColumn("Sales Person");
            tableModel.addColumn("Product Name");
            tableModel.addColumn("Quantity Sold");
            tableModel.addColumn("Sales");
            tableModel.addColumn("Sale Date");

            
          
            // Currency formatter for Philippine Peso
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "PH"));

            // Adding fetched data into the table model
            while (rs.next()) {
                int salesID = rs.getInt("salesID");
           //     String salesPerson = rs.getString("salesPerson");
                String productName = rs.getString("productName");
                int quantitySold = rs.getInt("quantitySold");
                double sales = rs.getDouble("sales");
                java.sql.Date saleDate = rs.getDate("saleDate");
                
                // Format sales amount
                String formattedSales = currencyFormat.format(sales);

                // Add the row to the JTable
                tableModel.addRow(new Object[]{salesID, productName, quantitySold, formattedSales, saleDate});

            }

            // Set the JTable model to display the data
            salesRecordTable.setModel(tableModel);
            
            // Close the resources
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error retrieving sales data!");
            e.printStackTrace();
        }
    }
    
    private void loadProductNamesWithStock() {
        String query = "SELECT productName FROM products WHERE stockQuantity > 0"; // SQL to get product names with stock
        try (Connection conn = DatabaseConnection.getInstance().getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String productName = rs.getString("productName");
                productNameCombo.addItem(productName);  // Add product name to ComboBox
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to load product names with stock.");
        }
    }
    
    public void loadProductNames(JComboBox<String> productNameCombo) {
    Connection conn = DatabaseConnection.getInstance().getConnection();
    
    if (conn == null) {
        System.out.println("Database connection is null.");
        return;
    }

    String query = "SELECT productName FROM products";
    
    try (PreparedStatement pst = conn.prepareStatement(query);
         ResultSet rs = pst.executeQuery()) {
        
        productNameCombo.removeAllItems(); // Clear existing items
        
        while (rs.next()) {
            productNameCombo.addItem(rs.getString("productName"));
        }
        
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    
    private void loadUserTotalProductsSold() {
    if (userID == 0) {
        // Skip the query if it's an admin (userID 0)
        totalProductsLBL.setText("Total Products Sold: 0");  
        return;
    }

    Connection conn = DatabaseConnection.getInstance().getConnection();
    if (conn != null) {
        String query = "SELECT SUM(quantitySold) AS totalProducts FROM sales WHERE userID = ?"; 
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, userID); // Use userID to filter sales
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int totalProducts = rs.getInt("totalProducts"); // Get total quantity
                totalProductsLBL.setText("" + totalProducts + " items"); // Display in label
            } else {
                totalProductsLBL.setText("Total Products Sold: 0"); // Default if no sales
            }

            rs.close();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error loading total products sold: " + ex.getMessage());
        }
    }
}
    private void loadMostSoldProduct() {
    if (userID == 0) {
        // Skip the query if it's an admin (userID 0)
        mostSoldProductLBL.setText("Most Sold Product: None");  
        return;
    }

    Connection conn = DatabaseConnection.getInstance().getConnection();
    if (conn != null) {
        String query = "SELECT p.productName, SUM(s.quantitySold) AS totalQuantity "
                     + "FROM sales s "
                     + "JOIN products p ON s.productID = p.productID "
                     + "WHERE s.userID = ? "
                     + "GROUP BY p.productName "
                     + "ORDER BY totalQuantity DESC LIMIT 1"; // Get the most sold product

        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, userID); // Use userID to filter sales
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String productName = rs.getString("productName"); // Get the product name
                int totalQuantity = rs.getInt("totalQuantity"); // Get total quantity sold
                
                mostSoldProductLBL.setText(productName + " (" + totalQuantity + ")");
            } else {
                mostSoldProductLBL.setText("Most Sold Product: None"); // Default if no sales
            }

            rs.close();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error loading most sold product: " + ex.getMessage());
        }
    }
}
    
    private void loadBestSellingCategory() {
    if (userID == 0) {
        // Handle the special case for admin when running MainUser directly
        return;  // Skip the database query for the admin case
    }

    Connection conn = DatabaseConnection.getInstance().getConnection();
    if (conn != null) {
        String query = "SELECT p.category, SUM(s.quantitySold) AS totalQuantity "
                     + "FROM sales s "
                     + "JOIN products p ON s.productID = p.productID "
                     + "WHERE s.userID = ? "
                     + "GROUP BY p.category "
                     + "ORDER BY totalQuantity DESC LIMIT 1";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, userID);  // Use userID to query the specific user
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                String bestSellingCategory = rs.getString("category");
                // Display the best-selling category
                bestSellingCategoryLBL.setText(bestSellingCategory);
            } else {
                bestSellingCategoryLBL.setText("No sales data available");
            }
        } catch (SQLException ex) {
            System.out.println("Error loading best-selling category: " + ex.getMessage());
        }
    }
}
    
private void displaySalesBarChart() {
    // Create the dataset
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();

    // Database connection and query to fetch total sales by product
    Connection conn = DatabaseConnection.getInstance().getConnection();
    if (conn != null) {
        String query = "SELECT p.productName, SUM(s.totalPrice) AS totalSales " +
                       "FROM sales s " +
                       "JOIN products p ON s.productID = p.productID " +
                       "WHERE s.userID = ? " +
                       "GROUP BY p.productName";

        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, userID); // Make sure userID is set properly
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String productName = rs.getString("productName");
                double totalSales = rs.getDouble("totalSales");
                dataset.addValue(totalSales, "Sales", productName);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error fetching sales data: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Create the bar chart using JFreeChart
    JFreeChart chart = ChartFactory.createBarChart(
            "Total Sales by Product", // Chart title
            "Product",                // X-axis label
            "Total Sales",            // Y-axis label
            dataset                   // Dataset
    );

    // Create a ChartPanel to display the chart
    ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setPreferredSize(new java.awt.Dimension(460, 260)); // Set preferred size

    // Create a JPanel to hold the chart panel, and set its bounds
    JPanel chartPanelContainer = new JPanel();
    chartPanelContainer.setLayout(new BorderLayout());
    chartPanelContainer.setBounds(516, 292, 460, 260);  // Set the bounds (location and size)
    chartPanelContainer.add(chartPanel, BorderLayout.CENTER); // Add chart to the panel

    // Add the chartPanelContainer to the current frame's content pane
    jLabel10.setLayout(null); // Make sure layout is set to null for absolute positioning
    jLabel10.add(chartPanelContainer);  // Add the panel with the chart
    revalidate();  // Revalidate the frame to apply changes
    repaint();     // Repaint to update the display
}

    private void displaySalesPieChart() {
    // Create the dataset
    DefaultPieDataset dataset = new DefaultPieDataset();

    // Database connection and query to fetch total sales by product
    Connection conn = DatabaseConnection.getInstance().getConnection();
    if (conn != null) {
        String query = "SELECT p.productName, SUM(s.totalPrice) AS totalSales " +
                       "FROM sales s " +
                       "JOIN products p ON s.productID = p.productID " +
                       "WHERE s.userID = ? " +
                       "GROUP BY p.productName";

        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, userID); // Make sure userID is set properly
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String productName = rs.getString("productName");
                double totalSales = rs.getDouble("totalSales");
                dataset.setValue(productName, totalSales);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error fetching sales data: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Create the Pie Chart using JFreeChart
    JFreeChart chart = ChartFactory.createPieChart(
            "My Total Sales by Product",  // Chart title
            dataset,                   // Dataset
            true,                      // Include legend
            true,                      // Use tooltips
            false                      // URLs disabled
    );

    // Create a ChartPanel to display the chart
    ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setPreferredSize(new java.awt.Dimension(460, 295)); // Set preferred size

    // Create a JPanel to hold the chart panel, and set its bounds
    JPanel chartPanelContainer = new JPanel();
    chartPanelContainer.setLayout(new BorderLayout());
    chartPanelContainer.setBounds(18, 11, 460, 295);  // Set the bounds (location and size)
    chartPanelContainer.add(chartPanel, BorderLayout.CENTER); // Add chart to the panel

    // Add the chartPanelContainer to the current frame's content pane
    jPanel2.setLayout(null); // Make sure layout is set to null for absolute positioning
    jPanel2.add(chartPanelContainer);  // Add the panel with the chart
    revalidate();  // Revalidate the frame to apply changes
    repaint();     // Repaint to update the displayedge
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
    private javax.swing.JLabel bestSellingCategoryLBL;
    private javax.swing.JLabel categoryLBL;
    private javax.swing.JTextField categoryTXT;
    private javax.swing.JButton clearBTN;
    private javax.swing.JComboBox<String> filterCMBBX;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JPanel logoutPanel;
    private javax.swing.JLabel mostSoldProductLBL;
    private javax.swing.JLabel priceLBL;
    private javax.swing.JTextField priceTXT;
    private javax.swing.JComboBox<String> productNameCombo;
    private javax.swing.JLabel productidLBL;
    private javax.swing.JTextField productidTXT;
    private javax.swing.JLabel productnameLBL;
    private javax.swing.JTextField productnameTXT;
    private javax.swing.JTable productstable;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JPanel salesPanel;
    private javax.swing.JTable salesRecordTable;
    private javax.swing.JButton searchBTN;
    private javax.swing.JTextField searchTXT;
    private javax.swing.JLabel stocksLBL;
    private javax.swing.JTextField stocksTXT;
    private javax.swing.JLabel totalProductsLBL;
    private javax.swing.JLabel totalSalesLBL;
    private javax.swing.JPanel warehousePanel;
    private javax.swing.JLabel welcomeLBL;
    // End of variables declaration//GEN-END:variables
}
