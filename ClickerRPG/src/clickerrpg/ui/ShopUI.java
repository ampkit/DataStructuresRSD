/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clickerrpg.ui;
import clickerrpg.Equipment;
import clickerrpg.MainClass;
import clickerrpg.Upgrade;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Button;
import java.awt.Label;
import javax.swing.JButton;
 

public class ShopUI extends javax.swing.JFrame {
        
        private static int page = 1;
        private static String sort = "Equipt";
        private static String view = "Equipment";
      

     
    public ShopUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonEqp = new java.awt.Button();
        btnUpgrade = new java.awt.Button();
        lblGold = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        buttonHelmet = new java.awt.Button();
        buttonWeapon = new java.awt.Button();
        buttonChest = new java.awt.Button();
        buttonLeggings = new java.awt.Button();
        buttonBoots = new java.awt.Button();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblItemPic = new javax.swing.JLabel();
        label2 = new java.awt.Label();
        lblCost = new java.awt.Label();
        lblItemName = new java.awt.Label();
        buttonPurchase = new javax.swing.JButton();
        labelDetail = new javax.swing.JLabel();
        lblItem1a = new javax.swing.JLabel();
        lblItem2a = new javax.swing.JLabel();
        lblItem2b = new javax.swing.JLabel();
        lblItem3a = new javax.swing.JLabel();
        lblItem3b = new javax.swing.JLabel();
        lblItem4a = new javax.swing.JLabel();
        lblItem4b = new javax.swing.JLabel();
        lblItem1b = new javax.swing.JLabel();
        jbNext = new javax.swing.JButton();
        jbPrevious = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Store");

        buttonEqp.setActionCommand("btnEquipment");
        buttonEqp.setBackground(new java.awt.Color(0, 51, 51));
        buttonEqp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        buttonEqp.setForeground(new java.awt.Color(255, 153, 153));
        buttonEqp.setLabel("Equipment");
        buttonEqp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEqpActionPerformed(evt);
            }
        });

        btnUpgrade.setActionCommand("btnUpgrade");
        btnUpgrade.setBackground(new java.awt.Color(0, 51, 51));
        btnUpgrade.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnUpgrade.setForeground(new java.awt.Color(255, 153, 153));
        btnUpgrade.setLabel("Upgrade");
        btnUpgrade.setMinimumSize(new java.awt.Dimension(101, 29));
        btnUpgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpgradeActionPerformed(evt);
            }
        });

        lblGold.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblGold.setForeground(new java.awt.Color(255, 215, 0));
        lblGold.setText("99999");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 215, 0));
        jLabel2.setText("$");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonEqp, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpgrade, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 359, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGold, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonEqp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUpgrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
            .addComponent(lblGold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnUpgrade.getAccessibleContext().setAccessibleName("");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        buttonHelmet.setBackground(new java.awt.Color(0, 51, 51));
        buttonHelmet.setFont(new java.awt.Font("Microsoft JhengHei Light", 3, 18)); // NOI18N
        buttonHelmet.setForeground(new java.awt.Color(255, 255, 255));
        buttonHelmet.setLabel("Helmet");
        buttonHelmet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHelmetActionPerformed(evt);
            }
        });

        buttonWeapon.setBackground(new java.awt.Color(0, 51, 51));
        buttonWeapon.setFont(new java.awt.Font("Microsoft JhengHei Light", 3, 18)); // NOI18N
        buttonWeapon.setForeground(new java.awt.Color(255, 255, 255));
        buttonWeapon.setLabel("Weapon");
        buttonWeapon.setMinimumSize(new java.awt.Dimension(75, 33));
        buttonWeapon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonWeaponActionPerformed(evt);
            }
        });

        buttonChest.setBackground(new java.awt.Color(0, 51, 51));
        buttonChest.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonChest.setFont(new java.awt.Font("Microsoft JhengHei Light", 3, 18)); // NOI18N
        buttonChest.setForeground(new java.awt.Color(255, 255, 255));
        buttonChest.setLabel("Chest");
        buttonChest.setMinimumSize(new java.awt.Dimension(75, 33));
        buttonChest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChestActionPerformed(evt);
            }
        });

        buttonLeggings.setBackground(new java.awt.Color(0, 51, 51));
        buttonLeggings.setFont(new java.awt.Font("Microsoft JhengHei Light", 3, 18)); // NOI18N
        buttonLeggings.setForeground(new java.awt.Color(255, 255, 255));
        buttonLeggings.setLabel("Leggings");
        buttonLeggings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLeggingsActionPerformed(evt);
            }
        });

        buttonBoots.setBackground(new java.awt.Color(0, 51, 51));
        buttonBoots.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 3, 18)); // NOI18N
        buttonBoots.setForeground(new java.awt.Color(255, 255, 255));
        buttonBoots.setLabel("Boots");
        buttonBoots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBootsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonHelmet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonWeapon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonChest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonLeggings, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
            .addComponent(buttonBoots, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(buttonWeapon, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonHelmet, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonChest, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonLeggings, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonBoots, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        buttonHelmet.getAccessibleContext().setAccessibleName("");

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        lblItemPic.setBackground(new java.awt.Color(153, 153, 153));
        lblItemPic.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        label2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        label2.setText("Details");

        lblCost.setFont(new java.awt.Font("Eras Demi ITC", 2, 18)); // NOI18N
        lblCost.setText("Cost : $");

        lblItemName.setFont(new java.awt.Font("Nirmala UI", 3, 18)); // NOI18N
        lblItemName.setText("label9");

        buttonPurchase.setFont(new java.awt.Font("Sitka Small", 3, 18)); // NOI18N
        buttonPurchase.setText("Purchase");
        buttonPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPurchaseActionPerformed(evt);
            }
        });

        labelDetail.setFont(new java.awt.Font("Eras Demi ITC", 2, 18)); // NOI18N
        labelDetail.setText("jLabel3");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblItemPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(buttonPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblItemName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDetail)
                            .addComponent(lblCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lblItemPic, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDetail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(buttonPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        lblItem1a.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblItem2a.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblItem2b.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblItem3a.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblItem3b.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblItem4a.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblItem4b.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblItem1b.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbNext.setText(">");
        jbNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNextActionPerformed(evt);
            }
        });

        jbPrevious.setText("<");
        jbPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPreviousActionPerformed(evt);
            }
        });

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblItem1a, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(lblItem2a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblItem3a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblItem4a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblItem1b, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(lblItem2b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblItem3b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblItem4b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbPrevious)
                        .addGap(37, 37, 37)
                        .addComponent(jbNext)
                        .addGap(29, 29, 29)
                        .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblItem1a, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItem1b, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblItem2b, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItem2a, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblItem3a, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItem3b, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblItem4a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblItem4b, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNext)
                    .addComponent(jbPrevious))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonUpgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpgradeActionPerformed
        view = "Upgrade";
        page = 1;
        loadUpgrade();
        
    }//GEN-LAST:event_buttonUpgradeActionPerformed

    private void buttonEqpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEqpActionPerformed
        view = "Equipment";
        page = 1;
        changeButtonVisibility(true);
        loadData();
      
      
    }//GEN-LAST:event_buttonEqpActionPerformed

    private void buttonWeaponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonWeaponActionPerformed
        
        loadWeapon();
    }//GEN-LAST:event_buttonWeaponActionPerformed

    private void buttonHelmetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHelmetActionPerformed
       loadHelmet();
    }//GEN-LAST:event_buttonHelmetActionPerformed

    private void buttonChestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChestActionPerformed
        loadChest();
    }//GEN-LAST:event_buttonChestActionPerformed

    private void buttonLeggingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLeggingsActionPerformed
        loadleggings();
    }//GEN-LAST:event_buttonLeggingsActionPerformed

    private void buttonBootsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBootsActionPerformed
        loadBoots();
    }//GEN-LAST:event_buttonBootsActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        MainClass.gameUI.updateGameUI();
        this.setVisible(false);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jbPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPreviousActionPerformed
        page --;
        switch(view){
            case "Equipment":
            {
                loadData();
                break;
            }
            case "Upgrade":
            {
                loadUpgrade();
                break;
            }

        }
    }//GEN-LAST:event_jbPreviousActionPerformed

    private void jbNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNextActionPerformed
  
        page ++;
        switch(view){
            case "Equipment":
            {
                loadData();
                break;
            }
            case "Upgrade":
            {
                loadUpgrade();
                break;
            }

        }
    }//GEN-LAST:event_jbNextActionPerformed

    private void buttonPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPurchaseActionPerformed
        JButton jButton = (JButton) evt.getSource();
        buttonPurchase.setEnabled(false);
        switch(sort)
        {
            case "Equipt" :
            {

                Equipment equipment = (Equipment) jButton.getClientProperty("items");
                if(MainClass.player.getGold() >= equipment.getPrice() )
                {
                    buttonPurchase.setEnabled(true);
                    if (equipment.isEquipped()) {
                        buttonPurchase.setEnabled(false);
                    }
                    else
                    {
                        MainClass.player.deductGold(equipment.getPrice());
                        lblGold.setText(String.format("%.2f", MainClass.player.getGold()));
                        MainClass.equipmentInventory.add(equipment);
                    }

                }

            }
            case "Upgrade" :
            {
                Upgrade upgrade = (Upgrade) jButton.getClientProperty("items");
                if(MainClass.player.getGold() >= upgrade.getCost() )
                {
                    buttonPurchase.setEnabled(true);
                    MainClass.player.deductGold(upgrade.getCost());
                    lblGold.setText(String.format("%.2f", MainClass.player.getGold()));
                    if( upgrade.getAttack() !=0 )
                    {
                        MainClass.player.addAttack(upgrade.getAttack());
                    }else
                    if(upgrade.getHealth()!=0)
                    {
                        MainClass.player.addHealth(upgrade.getHealth());
                    }else
                    if (upgrade.getDefense()!=0)
                    {
                        MainClass.player.addDefense(upgrade.getDefense());
                    }
                }
            }
        }
    }//GEN-LAST:event_buttonPurchaseActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShopUI().setVisible(true);
            }
        });
    }
    
     public void startUp() {
         page = 1;
        setAlwaysOnTop(true);
        setLocationRelativeTo(null);
        setVisible(true);
        loadData();
        setMouseListeners();
       
       

    }
     
     private void clearData() {
        lblGold.setText(String.format("%d",(int)MainClass.player.getGold()));

        JLabel[] labels
                = {lblItem1a, lblItem1b, lblItem2a, lblItem2b, lblItem3a,
                    lblItem3b, lblItem4a, lblItem4b};

        for (int i = 0; i < 8; i++) {
            JLabel label = labels[i];
            label.setIcon(null);
            label.setText(null);
        }
        lblItemPic.setIcon(null);
        lblItemName.setText(null);
        labelDetail.setText(null);
        lblCost.setText(null);
        lblItem1a.putClientProperty("items",null);
        lblItem1b.putClientProperty("items", null);
        lblItem2a.putClientProperty("items", null);
        lblItem2b.putClientProperty("items", null);
        lblItem3a.putClientProperty("items", null);
        lblItem3b.putClientProperty("items", null);     
        lblItem4a.putClientProperty("items", null);
        lblItem4b.putClientProperty("items", null);       
    }
     
     private void loadData() {
       clearData();
       sort = "Equipt";
        lblGold.setText(String.format("%.2f", MainClass.player.getGold()));
        JLabel[] label
                = {lblItem1a, lblItem1b, lblItem2a, lblItem2b, lblItem3a,
                    lblItem3b, lblItem4a, lblItem4b};

        for (int i = (page * 8) - 8, j = 0;
                i < MainClass.equipmentList.getLength() && j < 8;
                i++, j++) {
                    label[j].putClientProperty("items", MainClass.equipmentList.getEntry(i));
                    label[j].setIcon(new ImageIcon(MainClass.equipmentList.getEntry(i).getImageIcon().getImage().getScaledInstance(160, 160, Image.SCALE_SMOOTH)));

                    if (j == 7)
                    {
                       
                        jbNext.setEnabled(true);
                    }
                    else 
                    {
                        jbNext.setEnabled(false);
                    }
                }
            if (page == 1) 
            {
                jbPrevious.setEnabled(false);
            }
            else
            {
                jbPrevious.setEnabled(true);
            }
       
    }
     
     
      private void loadUpgrade() {
       clearData();
       sort = "Upgrade";
       changeButtonVisibility(false);
        lblGold.setText(String.format("%.2f", MainClass.player.getGold()));
        JLabel[] label
                = {lblItem1a, lblItem1b, lblItem2a, lblItem2b, lblItem3a,
                    lblItem3b, lblItem4a, lblItem4b};

        for (int i = (page * 8) - 8, j = 0;
                i < MainClass.upgradeList.getLength() && j < 8;
                i++, j++) {
                    label[j].putClientProperty("items", MainClass.upgradeList.getEntry(i));
                    label[j].setIcon(new ImageIcon(MainClass.upgradeList.getEntry(i).getImg().getImage().getScaledInstance(160, 160, Image.SCALE_SMOOTH)));

                    if (j == 7)
                    {
                       
                        jbNext.setEnabled(true);
                    }
                    else 
                    {
                        jbNext.setEnabled(false);
                    }
                }
            if (page != 1) 
            {
                jbPrevious.setEnabled(true);
            }
            else
            {
                jbPrevious.setEnabled(false);
            }
       
    }
     
     
        private void loadWeapon() {
       clearData();
       sort = "Equipt";
        lblGold.setText(String.format("%.2f", MainClass.player.getGold()));
        JLabel[] label
                = {lblItem1a, lblItem1b, lblItem2a, lblItem2b, lblItem3a,
                    lblItem3b, lblItem4a, lblItem4b};

        for (int i = (page * 8) - 8, j = 0;
                i < MainClass.equipmentList.getLength() && j < 8;
                i++, j++) {
                    
                    Equipment equipment = MainClass.equipmentList.getEntry(i);
                    String type = equipment.getEqSlot();
                    if ( type != "Weapon") {
                       j--;
                    }
                    else{
                        label[j].putClientProperty("items", MainClass.equipmentList.getEntry(i));
                    label[j].setIcon(new ImageIcon(MainClass.equipmentList.getEntry(i).getImageIcon().getImage().getScaledInstance(160, 160, Image.SCALE_SMOOTH)));
                 
                    }

                    if (j == 7)
                    {
                        jbNext.setEnabled(true);
                    }
                    else 
                    {
                        jbNext.setEnabled(false);
                    }
                }
            if (page == 1) 
            {
                jbPrevious.setEnabled(false);
            }
            else
            {
                jbPrevious.setEnabled(true);
            }
       
    }
        
        private void loadHelmet() {
       clearData();
       sort = "Equipt";
        lblGold.setText(String.format("%.2f", MainClass.player.getGold()));
        JLabel[] label
                = {lblItem1a, lblItem1b, lblItem2a, lblItem2b, lblItem3a,
                    lblItem3b, lblItem4a, lblItem4b};

        for (int i = (page * 8) - 8, j = 0;
                i < MainClass.equipmentList.getLength() && j < 8;
                i++, j++) {
                    
                    Equipment equipment = MainClass.equipmentList.getEntry(i);
                    String type = equipment.getEqSlot();
                   
                    if ( type != "Helmet") {
                    j--;
                    
                    }
                    else
                    {
                    label[j].putClientProperty("items", MainClass.equipmentList.getEntry(i));
                    label[j].setIcon(new ImageIcon(MainClass.equipmentList.getEntry(i).getImageIcon().getImage().getScaledInstance(160, 160, Image.SCALE_SMOOTH)));
                    
                    }
                    
                   
                    if (j == 7)
                    {
                        jbNext.setEnabled(true);
                    }
                    else 
                    {
                        jbNext.setEnabled(false);
                    }
                }
            if (page == 1) 
            {
                jbPrevious.setEnabled(false);
            }
            else
            {
                jbPrevious.setEnabled(true);
            }
       
    }
        
        private void loadChest() {
         clearData();
         sort = "Equipt";
        lblGold.setText(String.format("%.2f", MainClass.player.getGold()));
        JLabel[] label
                = {lblItem1a, lblItem1b, lblItem2a, lblItem2b, lblItem3a,
                    lblItem3b, lblItem4a, lblItem4b};

        for (int i = (page * 8) - 8, j = 0;
                i < MainClass.equipmentList.getLength() && j < 8;
                i++, j++) {
                    
                    Equipment equipment = MainClass.equipmentList.getEntry(i);
                    String type = equipment.getEqSlot();
                   
                    if ( type != "Chestplate") {
                    j--;
                    }
                    else
                    {
                    label[j].putClientProperty("items", MainClass.equipmentList.getEntry(i));
                    label[j].setIcon(new ImageIcon(MainClass.equipmentList.getEntry(i).getImageIcon().getImage().getScaledInstance(160, 160, Image.SCALE_SMOOTH)));
                     
                    }
                    
                   
                    if (j == 7)
                    {
                        jbNext.setEnabled(true);
                    }
                    else 
                    {
                        jbNext.setEnabled(false);
                    }
                }
            if (page == 1) 
            {
                jbPrevious.setEnabled(false);
            }
            else
            {
                jbPrevious.setEnabled(true);
            }
       
    }
        
        private void loadleggings() {
         clearData();
         sort = "Equipt";
         lblGold.setText(String.format("%.2f", MainClass.player.getGold()));
         JLabel[] label
                = {lblItem1a, lblItem1b, lblItem2a, lblItem2b, lblItem3a,
                    lblItem3b, lblItem4a, lblItem4b};

        for (int i = (page * 8) - 8, j = 0;
                i < MainClass.equipmentList.getLength() && j < 8;
                i++, j++) {
                    
                    Equipment equipment = MainClass.equipmentList.getEntry(i);
                    String type = equipment.getEqSlot();
                   
                    if ( type != "Leggings") {
                    j--;
                    }
                    else
                    {
                    label[j].putClientProperty("items", MainClass.equipmentList.getEntry(i));
                    label[j].setIcon(new ImageIcon(MainClass.equipmentList.getEntry(i).getImageIcon().getImage().getScaledInstance(160, 160, Image.SCALE_SMOOTH)));
                     
                    }
                    
                   
                    if (j == 7)
                    {
                        jbNext.setEnabled(true);
                    }
                    else 
                    {
                        jbNext.setEnabled(false);
                    }
                }
            if (page == 1) 
            {
                jbPrevious.setEnabled(false);
            }
            else
            {
                jbPrevious.setEnabled(true);
            }
       
    }
        
        private void loadBoots() {
       clearData();
       sort = "Equipt";
        lblGold.setText(String.format("%.2f", MainClass.player.getGold()));
        JLabel[] label
                = {lblItem1a, lblItem1b, lblItem2a, lblItem2b, lblItem3a,
                    lblItem3b, lblItem4a, lblItem4b};

        for (int i = (page * 8) - 8, j = 0;
                i < MainClass.equipmentList.getLength() && j < 8;
                i++, j++) {
                    
                    Equipment equipment = MainClass.equipmentList.getEntry(i);
                    String type = equipment.getEqSlot();
                   
                    if ( type != "Boots") {
                    j--;
                    
                    }
                    else
                    {
                    label[j].putClientProperty("items", MainClass.equipmentList.getEntry(i));
                    label[j].setIcon(new ImageIcon(MainClass.equipmentList.getEntry(i).getImageIcon().getImage().getScaledInstance(160, 160, Image.SCALE_SMOOTH)));
                    
                    }
                    
                   
                    if (j == 7)
                    {
                        jbNext.setEnabled(true);
                    }
                    else 
                    {
                        jbNext.setEnabled(false);
                    }
                }
            if (page == 1) 
            {
                jbPrevious.setEnabled(false);
            }
            else
            {
                jbPrevious.setEnabled(true);
            }
       
    }
     
     private void itemClick(java.awt.event.MouseEvent evt) {                             
        JLabel jLabel = (JLabel) evt.getSource();
        switch(view)
        {
            case "Equipment":
                EqDetailsShow((Equipment) jLabel.getClientProperty("items"));
                break;
            case "Upgrade":
                 DetailsShow((Upgrade) jLabel.getClientProperty("items"));
                 break;
        }
        
    }  
     private void EqDetailsShow(Equipment equipment) {
         
         
         lblItemPic.setIcon(new ImageIcon(equipment.getImageIcon().getImage().getScaledInstance(280, 280, Image.SCALE_SMOOTH)));
         lblItemName.setText(equipment.getEqName());
         lblItemName.setFont(new Font("Nirmala UI", Font.BOLD, 25));
        String itemDetails = "";
        itemDetails += "<html><p>";
        if (equipment.getAttack() != 0) {
            
            itemDetails += "<br>Attack : " + equipment.getAttack();
            
        }
        if (equipment.getDefense() != 0) {
           
            itemDetails += "<br><br>Defense : " + equipment.getDefense();
        }
        if (equipment.getHealth() != 0) {
           
            itemDetails += "<br><br>Health : " + equipment.getHealth();
        }
        itemDetails += "</p></html>";
         labelDetail.setText(itemDetails);
         lblCost.setText("Cost : $ " +equipment.getPrice());
         buttonPurchase.putClientProperty("items",equipment);
  
         if(MainClass.player.getGold() < equipment.getPrice())
         {
             buttonPurchase.setEnabled(false);
         }
         else
         {
             buttonPurchase.setEnabled(true);
         }
     }
     
     private void DetailsShow(Upgrade upgrade) {
         
         lblItemPic.setIcon(new ImageIcon(upgrade.getImg().getImage().getScaledInstance(280, 280, Image.SCALE_SMOOTH)));
         lblItemName.setText(upgrade.getName());
         lblItemName.setFont(new Font("Nirmala UI", Font.BOLD, 25));
        String itemDetails = "";
        itemDetails += "<html><p>";
        if (upgrade.getAttack() != 0) {
            itemDetails += "<br>Attack : " + upgrade.getAttack();
        }
        if (upgrade.getDefense() != 0) {
             itemDetails += "<br>Defense : " + upgrade.getDefense();
        }
        if (upgrade.getHealth() != 0) {
            itemDetails += "<br>Health : " + upgrade.getHealth();
        }
         itemDetails += "</p></html>";
         labelDetail.setText(itemDetails);
         lblCost.setText("Cost : $ " +upgrade.getCost());
         buttonPurchase.putClientProperty("items",upgrade);
  
         if(MainClass.player.getGold() < upgrade.getCost())
         {
             buttonPurchase.setEnabled(false);
         }
         else
         {
             buttonPurchase.setEnabled(true);
         }
     }
     
     
     
     
 private void setMouseListeners() {
        JLabel[] label
                = {lblItem1a, lblItem1b, lblItem2a, lblItem2b, lblItem3a,
                    lblItem3b, lblItem4a, lblItem4b};
        Button[] button
                ={btnUpgrade};
        
        for (JLabel labels : label) {
            labels.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    itemClick(evt);
                }
            });
        }
        
        
        
        btnUpgrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                
                page = 1;
                loadUpgrade();
            }
        });     
               
    }
    private void changeButtonVisibility(Boolean visibility) {
          buttonWeapon.setVisible(visibility);
          buttonHelmet.setVisible(visibility);
          buttonChest.setVisible(visibility);
          buttonLeggings.setVisible(visibility);
          buttonBoots.setVisible(visibility);      
      }
    
    


       
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnUpgrade;
    private java.awt.Button buttonBoots;
    private java.awt.Button buttonChest;
    private java.awt.Button buttonEqp;
    private java.awt.Button buttonHelmet;
    private java.awt.Button buttonLeggings;
    private javax.swing.JButton buttonPurchase;
    private java.awt.Button buttonWeapon;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jbNext;
    private javax.swing.JButton jbPrevious;
    private java.awt.Label label2;
    private javax.swing.JLabel labelDetail;
    private java.awt.Label lblCost;
    private java.awt.Label lblGold;
    private javax.swing.JLabel lblItem1a;
    private javax.swing.JLabel lblItem1b;
    private javax.swing.JLabel lblItem2a;
    private javax.swing.JLabel lblItem2b;
    private javax.swing.JLabel lblItem3a;
    private javax.swing.JLabel lblItem3b;
    private javax.swing.JLabel lblItem4a;
    private javax.swing.JLabel lblItem4b;
    private java.awt.Label lblItemName;
    private javax.swing.JLabel lblItemPic;
    // End of variables declaration//GEN-END:variables


}
