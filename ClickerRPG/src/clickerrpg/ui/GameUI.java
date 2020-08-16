package clickerrpg.ui;
import clickerrpg.MainClass;
import java.awt.Font;
import javax.swing.ImageIcon;

public class GameUI extends javax.swing.JFrame {

    private final String imageFolderPath = "src/clickerrpg/img/";
    
    public GameUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameUIPanel = new javax.swing.JPanel();
        lblGoldIcon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblStage = new javax.swing.JLabel();
        lblGold = new javax.swing.JLabel();
        gameScreen = new javax.swing.JLayeredPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelPlayerName = new javax.swing.JLabel();
        playerHealthBar = new javax.swing.JProgressBar();
        labelEnemyName = new javax.swing.JLabel();
        enemyHealthBar = new javax.swing.JProgressBar();
        lblHelper1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblHelper2 = new javax.swing.JLabel();
        lblHelper3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        enemyAttackBar = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnInventory = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(960, 655));
        setMinimumSize(new java.awt.Dimension(960, 655));
        setUndecorated(true);
        setResizable(false);

        gameUIPanel.setBackground(new java.awt.Color(102, 102, 102));
        gameUIPanel.setMaximumSize(new java.awt.Dimension(960, 720));
        gameUIPanel.setMinimumSize(new java.awt.Dimension(960, 720));

        lblGoldIcon.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblGoldIcon.setForeground(new java.awt.Color(255, 215, 0));
        lblGoldIcon.setText("$");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Stage");

        lblStage.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblStage.setForeground(new java.awt.Color(255, 255, 255));
        lblStage.setText("999");

        lblGold.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblGold.setForeground(new java.awt.Color(255, 215, 0));
        lblGold.setText("999 999 999");
        lblGold.setName(""); // NOI18N

        gameScreen.setMaximumSize(new java.awt.Dimension(940, 440));
        gameScreen.setMinimumSize(new java.awt.Dimension(940, 440));
        gameScreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gameScreenMouseClicked(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clickerrpg/img/background.png"))); // NOI18N
        jLabel5.setRequestFocusEnabled(false);
        jLabel5.setVerifyInputWhenFocusTarget(false);

        jLabel7.setMaximumSize(new java.awt.Dimension(80, 80));
        jLabel7.setMinimumSize(new java.awt.Dimension(80, 80));
        jLabel7.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel12.setMaximumSize(new java.awt.Dimension(80, 80));
        jLabel12.setMinimumSize(new java.awt.Dimension(80, 80));
        jLabel12.setPreferredSize(new java.awt.Dimension(80, 80));

        jPanel3.setMaximumSize(new java.awt.Dimension(920, 80));
        jPanel3.setMinimumSize(new java.awt.Dimension(920, 80));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(920, 80));
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setVerifyInputWhenFocusTarget(false);

        labelPlayerName.setBackground(new java.awt.Color(0, 0, 0));
        labelPlayerName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labelPlayerName.setText("Player Name");

        playerHealthBar.setForeground(new java.awt.Color(0, 204, 0));
        playerHealthBar.setName(""); // NOI18N

        labelEnemyName.setBackground(new java.awt.Color(0, 0, 0));
        labelEnemyName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labelEnemyName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelEnemyName.setText("Enemy Name");

        enemyHealthBar.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEnemyName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enemyHealthBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelEnemyName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerHealthBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enemyHealthBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clickerrpg/img/enemy1.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clickerrpg/img/player150x90.png"))); // NOI18N

        enemyAttackBar.setForeground(new java.awt.Color(204, 204, 0));
        enemyAttackBar.setMaximumSize(new java.awt.Dimension(300, 10));
        enemyAttackBar.setMinimumSize(new java.awt.Dimension(300, 10));
        enemyAttackBar.setOpaque(true);
        enemyAttackBar.setPreferredSize(new java.awt.Dimension(300, 10));

        gameScreen.setLayer(jLabel5, -1);
        gameScreen.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        gameScreen.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        gameScreen.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        gameScreen.setLayer(lblHelper1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        gameScreen.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        gameScreen.setLayer(lblHelper2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        gameScreen.setLayer(lblHelper3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        gameScreen.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        gameScreen.setLayer(enemyAttackBar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout gameScreenLayout = new javax.swing.GroupLayout(gameScreen);
        gameScreen.setLayout(gameScreenLayout);
        gameScreenLayout.setHorizontalGroup(
            gameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameScreenLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblHelper2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHelper1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHelper3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(gameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gameScreenLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(gameScreenLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(gameScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameScreenLayout.createSequentialGroup()
                        .addComponent(enemyAttackBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(gameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gameScreenLayout.createSequentialGroup()
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 9, Short.MAX_VALUE)))
        );
        gameScreenLayout.setVerticalGroup(
            gameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameScreenLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enemyAttackBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(gameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameScreenLayout.createSequentialGroup()
                        .addComponent(lblHelper1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(lblHelper3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameScreenLayout.createSequentialGroup()
                        .addComponent(lblHelper2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameScreenLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(107, 107, 107))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameScreenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(gameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(gameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gameScreenLayout.createSequentialGroup()
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setMaximumSize(new java.awt.Dimension(940, 120));
        jPanel2.setMinimumSize(new java.awt.Dimension(940, 120));
        jPanel2.setPreferredSize(new java.awt.Dimension(940, 120));

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 153, 153));
        jButton3.setText("Shop");
        jButton3.setFocusPainted(false);
        jButton3.setMaximumSize(new java.awt.Dimension(200, 100));
        jButton3.setMinimumSize(new java.awt.Dimension(200, 100));
        jButton3.setPreferredSize(new java.awt.Dimension(200, 100));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(153, 153, 153));
        jButton4.setText("Stats");
        jButton4.setFocusPainted(false);
        jButton4.setMaximumSize(new java.awt.Dimension(200, 100));
        jButton4.setMinimumSize(new java.awt.Dimension(200, 100));
        jButton4.setPreferredSize(new java.awt.Dimension(200, 100));

        btnInventory.setBackground(new java.awt.Color(51, 51, 51));
        btnInventory.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnInventory.setForeground(new java.awt.Color(153, 153, 153));
        btnInventory.setFocusPainted(false);
        btnInventory.setLabel("Inventory");
        btnInventory.setMaximumSize(new java.awt.Dimension(200, 100));
        btnInventory.setMinimumSize(new java.awt.Dimension(200, 100));
        btnInventory.setPreferredSize(new java.awt.Dimension(200, 100));
        btnInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventoryActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(51, 51, 51));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(153, 153, 153));
        jButton6.setText("Helper");
        jButton6.setFocusPainted(false);
        jButton6.setMaximumSize(new java.awt.Dimension(200, 100));
        jButton6.setMinimumSize(new java.awt.Dimension(200, 100));
        jButton6.setPreferredSize(new java.awt.Dimension(200, 100));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnInventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout gameUIPanelLayout = new javax.swing.GroupLayout(gameUIPanel);
        gameUIPanel.setLayout(gameUIPanelLayout);
        gameUIPanelLayout.setHorizontalGroup(
            gameUIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameUIPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gameUIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gameUIPanelLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameUIPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(gameUIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(gameUIPanelLayout.createSequentialGroup()
                                .addComponent(gameScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(gameUIPanelLayout.createSequentialGroup()
                                .addComponent(lblGoldIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblGold)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(lblStage)
                                .addGap(28, 28, 28))))))
        );
        gameUIPanelLayout.setVerticalGroup(
            gameUIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameUIPanelLayout.createSequentialGroup()
                .addGroup(gameUIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGoldIcon)
                    .addComponent(lblStage)
                    .addComponent(lblGold)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(gameScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gameUIPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gameUIPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 655, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // <editor-fold defaultstate="collapsed" desc="Events">                          
    private void gameScreenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gameScreenMouseClicked
        MainClass.attack(MainClass.player.getAttack());
    }//GEN-LAST:event_gameScreenMouseClicked

    private void btnInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventoryActionPerformed
        InventoryUI inventoryUI = new InventoryUI();
        inventoryUI.startUp();        
        this.setEnabled(false);
    }//GEN-LAST:event_btnInventoryActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        HelperUI helperUI = new HelperUI();
        helperUI.startUp();
        this.setEnabled(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ShopUI shopUI = new ShopUI();
        shopUI.startUp();    }//GEN-LAST:event_jButton3ActionPerformed
    // </editor-fold>
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
            java.util.logging.Logger.getLogger(GameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameUI().setVisible(true);
            }
        });
        
    }
    
    public void startUp(){
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void updateGameUI(){
        labelPlayerName.setText(MainClass.player.getName());
        playerHealthBar.setMaximum((int)MainClass.player.getMaxHealth());
        playerHealthBar.setValue((int)MainClass.player.getCurHealth());
        playerHealthBar.setString(playerHealthBar.getValue() + " / " + playerHealthBar.getMaximum() + " Health");
        playerHealthBar.setStringPainted(true);
        playerHealthBar.setFont(new Font("Arial", Font.PLAIN , 18));
        

        labelEnemyName.setText(MainClass.enemy.getName());
        enemyHealthBar.setMaximum((int)MainClass.enemy.getMaxHealth());
        enemyHealthBar.setValue((int)MainClass.enemy.getCurHealth());
        enemyHealthBar.setString(enemyHealthBar.getValue() + " / " + enemyHealthBar.getMaximum() + " Health");
        enemyHealthBar.setStringPainted(true);
        enemyHealthBar.setFont(new Font("Arial", Font.PLAIN , 18));
        
        lblGold.setText(String.format("%d",(int)MainClass.player.getGold()));
        
        lblStage.setText(String.valueOf(MainClass.stage));
    }
    
    public void updateAttackBars(){
        enemyAttackBar.setMaximum(MainClass.enemy.getAttackPeriod());
        enemyAttackBar.setValue(MainClass.enemy.getCurrentAttackPeriod());
    }
    
    public void updateHelper(){
        switch (MainClass.assignedHelperList.size()){
            case 0:
                lblHelper1.setIcon(null);
                lblHelper2.setIcon(null);
                lblHelper3.setIcon(null);
                break;
            case 1:
                lblHelper1.setIcon(new ImageIcon(imageFolderPath + MainClass.assignedHelperList.get(0).getImageUrl()));
                lblHelper2.setIcon(null);
                lblHelper3.setIcon(null);
                break;
            case 2:
                lblHelper1.setIcon(new ImageIcon(imageFolderPath + MainClass.assignedHelperList.get(0).getImageUrl()));
                lblHelper2.setIcon(new ImageIcon(imageFolderPath + MainClass.assignedHelperList.get(1).getImageUrl()));
                lblHelper3.setIcon(null);
                break;
            case 3:
                lblHelper1.setIcon(new ImageIcon(imageFolderPath + MainClass.assignedHelperList.get(0).getImageUrl()));
                lblHelper2.setIcon(new ImageIcon(imageFolderPath + MainClass.assignedHelperList.get(1).getImageUrl()));
                lblHelper3.setIcon(new ImageIcon(imageFolderPath + MainClass.assignedHelperList.get(2).getImageUrl()));
                break;
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInventory;
    private javax.swing.JProgressBar enemyAttackBar;
    private javax.swing.JProgressBar enemyHealthBar;
    private javax.swing.JLayeredPane gameScreen;
    private javax.swing.JPanel gameUIPanel;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelEnemyName;
    private javax.swing.JLabel labelPlayerName;
    private javax.swing.JLabel lblGold;
    private javax.swing.JLabel lblGoldIcon;
    private javax.swing.JLabel lblHelper1;
    private javax.swing.JLabel lblHelper2;
    private javax.swing.JLabel lblHelper3;
    private javax.swing.JLabel lblStage;
    private javax.swing.JProgressBar playerHealthBar;
    // End of variables declaration//GEN-END:variables
}
