package clickerrpg;

public class GameUI extends javax.swing.JFrame {

    public GameUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameUIPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelGold = new javax.swing.JLabel();
        gameScreen = new javax.swing.JLayeredPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        labelEnemyName = new javax.swing.JLabel();
        enemyHealthBar = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(960, 720));
        setResizable(false);

        gameUIPanel.setBackground(new java.awt.Color(255, 204, 204));
        gameUIPanel.setMaximumSize(new java.awt.Dimension(960, 720));
        gameUIPanel.setMinimumSize(new java.awt.Dimension(960, 720));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("$");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("D");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("999 999 999");

        labelGold.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelGold.setText("999 999 999");
        labelGold.setName(""); // NOI18N

        gameScreen.setMaximumSize(new java.awt.Dimension(940, 440));
        gameScreen.setMinimumSize(new java.awt.Dimension(940, 440));
        gameScreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gameScreenMouseClicked(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setMaximumSize(new java.awt.Dimension(940, 440));
        jLabel5.setMinimumSize(new java.awt.Dimension(940, 440));
        jLabel5.setPreferredSize(new java.awt.Dimension(940, 440));
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

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("Player Name");

        jProgressBar2.setName(""); // NOI18N

        labelEnemyName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labelEnemyName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelEnemyName.setText("Enemy Name");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelEnemyName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enemyHealthBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        gameScreen.setLayer(jLabel5, -1);
        gameScreen.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        gameScreen.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        gameScreen.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout gameScreenLayout = new javax.swing.GroupLayout(gameScreen);
        gameScreen.setLayout(gameScreenLayout);
        gameScreenLayout.setHorizontalGroup(
            gameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameScreenLayout.createSequentialGroup()
                .addGroup(gameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gameScreenLayout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gameScreenLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(gameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gameScreenLayout.createSequentialGroup()
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        gameScreenLayout.setVerticalGroup(
            gameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameScreenLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addGroup(gameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
            .addGroup(gameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setMaximumSize(new java.awt.Dimension(940, 120));
        jPanel2.setMinimumSize(new java.awt.Dimension(940, 120));
        jPanel2.setPreferredSize(new java.awt.Dimension(940, 120));

        jButton3.setText("Shop");
        jButton3.setMaximumSize(new java.awt.Dimension(200, 100));
        jButton3.setMinimumSize(new java.awt.Dimension(200, 100));
        jButton3.setPreferredSize(new java.awt.Dimension(200, 100));

        jButton4.setText("Options");
        jButton4.setMaximumSize(new java.awt.Dimension(200, 100));
        jButton4.setMinimumSize(new java.awt.Dimension(200, 100));
        jButton4.setPreferredSize(new java.awt.Dimension(200, 100));

        jButton5.setLabel("Inventory");
        jButton5.setMaximumSize(new java.awt.Dimension(200, 100));
        jButton5.setMinimumSize(new java.awt.Dimension(200, 100));
        jButton5.setPreferredSize(new java.awt.Dimension(200, 100));

        jButton6.setText("Prestige");
        jButton6.setMaximumSize(new java.awt.Dimension(200, 100));
        jButton6.setMinimumSize(new java.awt.Dimension(200, 100));
        jButton6.setPreferredSize(new java.awt.Dimension(200, 100));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout gameUIPanelLayout = new javax.swing.GroupLayout(gameUIPanel);
        gameUIPanel.setLayout(gameUIPanelLayout);
        gameUIPanelLayout.setHorizontalGroup(
            gameUIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameUIPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gameUIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(gameUIPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelGold)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(gameScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gameUIPanelLayout.setVerticalGroup(
            gameUIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameUIPanelLayout.createSequentialGroup()
                .addGroup(gameUIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(labelGold)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(gameScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gameUIPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gameUIPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // <editor-fold defaultstate="collapsed" desc="Events">                          
    private void gameScreenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gameScreenMouseClicked
        int currentHealth = enemyHealthBar.getValue() - 11;
        
        if (currentHealth <= 0)
        {
            int gold = Integer.valueOf(labelGold.getText()) + 10;
            labelGold.setText(Integer.toString(gold));
            enemyHealthBar.setValue(100);
        }
        else 
        {
            enemyHealthBar.setValue(currentHealth );

        }
    }//GEN-LAST:event_gameScreenMouseClicked
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
        labelGold.setText("0");
        labelEnemyName.setText("Test Enemy");
        enemyHealthBar.setValue(100);
        super.update(this.getGraphics());
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar enemyHealthBar;
    private javax.swing.JLayeredPane gameScreen;
    private javax.swing.JPanel gameUIPanel;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JLabel labelEnemyName;
    private javax.swing.JLabel labelGold;
    // End of variables declaration//GEN-END:variables
}
