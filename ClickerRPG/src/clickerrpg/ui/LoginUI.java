package clickerrpg.ui;

import clickerrpg.MainClass;
import clickerrpg.Player;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class LoginUI extends javax.swing.JFrame {

    String selectedPlayer;
    public LoginUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelSwordsman = new javax.swing.JPanel();
        lblSwordsman = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        detailsSwordsman = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        panelMarksman = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        detailsMarksman = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblMarksman = new javax.swing.JLabel();
        panelMagician = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        detailsMagician = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        lblMarksman1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtPlayerName = new javax.swing.JTextField();
        lblPlayerName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.gray);
        setMaximumSize(new java.awt.Dimension(645, 730));
        setMinimumSize(new java.awt.Dimension(645, 730));
        setPreferredSize(new java.awt.Dimension(645, 730));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        jLabel1.setText("LOGIN");

        btnLogin.setBackground(new java.awt.Color(102, 102, 102));
        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("BEGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Select a Character");

        panelSwordsman.setBackground(new java.awt.Color(102, 102, 102));
        panelSwordsman.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        panelSwordsman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelSwordsmanMouseClicked(evt);
            }
        });

        lblSwordsman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clickerrpg/img/Player_Swordsman.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        detailsSwordsman.setEditable(false);
        detailsSwordsman.setBackground(new java.awt.Color(102, 102, 102));
        detailsSwordsman.setColumns(20);
        detailsSwordsman.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        detailsSwordsman.setForeground(new java.awt.Color(0, 0, 0));
        detailsSwordsman.setRows(5);
        detailsSwordsman.setText("Attack : 15\nHealth : 150\nDefense : 3");
        detailsSwordsman.setEnabled(false);
        detailsSwordsman.setFocusable(false);
        detailsSwordsman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detailsSwordsmanMouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Swordsman");

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Be brave. Be strong. ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailsSwordsman, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detailsSwordsman, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout panelSwordsmanLayout = new javax.swing.GroupLayout(panelSwordsman);
        panelSwordsman.setLayout(panelSwordsmanLayout);
        panelSwordsmanLayout.setHorizontalGroup(
            panelSwordsmanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSwordsmanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSwordsmanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSwordsman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelSwordsmanLayout.setVerticalGroup(
            panelSwordsmanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSwordsmanLayout.createSequentialGroup()
                .addComponent(lblSwordsman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelMarksman.setBackground(new java.awt.Color(102, 102, 102));
        panelMarksman.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        panelMarksman.setFocusable(false);
        panelMarksman.setPreferredSize(new java.awt.Dimension(188, 351));
        panelMarksman.setRequestFocusEnabled(false);
        panelMarksman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMarksmanMouseClicked(evt);
            }
        });

        jPanel17.setBackground(new java.awt.Color(102, 102, 102));

        detailsMarksman.setEditable(false);
        detailsMarksman.setBackground(new java.awt.Color(102, 102, 102));
        detailsMarksman.setColumns(20);
        detailsMarksman.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        detailsMarksman.setForeground(new java.awt.Color(0, 0, 0));
        detailsMarksman.setRows(5);
        detailsMarksman.setText("Attack : 30\nHealth : 100\nDefense : 1");
        detailsMarksman.setEnabled(false);
        detailsMarksman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detailsMarksmanMouseClicked(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Marksman");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("One shot, one kill.");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(detailsMarksman, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(detailsMarksman, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel4))
        );

        lblMarksman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clickerrpg/img/Player_Marksman.png"))); // NOI18N
        lblMarksman.setPreferredSize(new java.awt.Dimension(160, 160));

        javax.swing.GroupLayout panelMarksmanLayout = new javax.swing.GroupLayout(panelMarksman);
        panelMarksman.setLayout(panelMarksmanLayout);
        panelMarksmanLayout.setHorizontalGroup(
            panelMarksmanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarksmanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMarksman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMarksmanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233))
        );
        panelMarksmanLayout.setVerticalGroup(
            panelMarksmanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMarksmanLayout.createSequentialGroup()
                .addComponent(lblMarksman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );

        panelMagician.setBackground(new java.awt.Color(102, 102, 102));
        panelMagician.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        panelMagician.setPreferredSize(new java.awt.Dimension(188, 351));
        panelMagician.setRequestFocusEnabled(false);
        panelMagician.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMagicianMouseClicked(evt);
            }
        });

        jPanel19.setBackground(new java.awt.Color(102, 102, 102));

        detailsMagician.setEditable(false);
        detailsMagician.setBackground(new java.awt.Color(102, 102, 102));
        detailsMagician.setColumns(20);
        detailsMagician.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        detailsMagician.setForeground(new java.awt.Color(0, 0, 0));
        detailsMagician.setRows(5);
        detailsMagician.setText("Attack : 50\nHealth : 50\nDefense : 0");
        detailsMagician.setEnabled(false);
        detailsMagician.setFocusable(false);
        detailsMagician.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detailsMagicianMouseClicked(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Magician");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel15))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(detailsMagician, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(detailsMagician, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        lblMarksman1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clickerrpg/img/Player_Magician.png"))); // NOI18N
        lblMarksman1.setPreferredSize(new java.awt.Dimension(160, 160));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fireball!!!~ Kya~");

        javax.swing.GroupLayout panelMagicianLayout = new javax.swing.GroupLayout(panelMagician);
        panelMagician.setLayout(panelMagicianLayout);
        panelMagicianLayout.setHorizontalGroup(
            panelMagicianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMagicianLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMagicianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelMagicianLayout.createSequentialGroup()
                        .addComponent(lblMarksman1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelMagicianLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMagicianLayout.setVerticalGroup(
            panelMagicianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMagicianLayout.createSequentialGroup()
                .addComponent(lblMarksman1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSwordsman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMarksman, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMagician, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(245, 245, 245))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMagician, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                    .addComponent(panelMarksman, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                    .addComponent(panelSwordsman, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(187, 187, 187));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPlayerName.setBackground(new java.awt.Color(153, 153, 153));
        txtPlayerName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtPlayerName.setForeground(new java.awt.Color(0, 0, 0));
        txtPlayerName.setText("LiftLift");
        txtPlayerName.setToolTipText("");

        lblPlayerName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblPlayerName.setForeground(new java.awt.Color(0, 0, 0));
        lblPlayerName.setText("Player Name :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPlayerName)
                .addGap(18, 18, 18)
                .addComponent(txtPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String playerName = txtPlayerName.getText();
        switch (selectedPlayer) {
            case "Swordsman":
                MainClass.player = new Player(playerName, "Swordsman", 150, 15, 3);
                break;
            case "Marksman":
                MainClass.player = new Player(playerName, "Marksman", 100, 30, 1);
                break;
            case "Magician":
                MainClass.player = new Player(playerName, "Magician", 50, 50, 0);
                break;
        }

        this.setVisible(false);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void panelSwordsmanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSwordsmanMouseClicked
        selection("Swordsman");
    }//GEN-LAST:event_panelSwordsmanMouseClicked

    private void panelMarksmanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMarksmanMouseClicked
        selection("Marksman");
    }//GEN-LAST:event_panelMarksmanMouseClicked

    private void panelMagicianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMagicianMouseClicked
        selection("Magician");
    }//GEN-LAST:event_panelMagicianMouseClicked

    private void detailsMagicianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsMagicianMouseClicked
        selection("Magician");
    }//GEN-LAST:event_detailsMagicianMouseClicked

    private void detailsMarksmanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsMarksmanMouseClicked
        selection("Marksman");
    }//GEN-LAST:event_detailsMarksmanMouseClicked

    private void detailsSwordsmanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsSwordsmanMouseClicked
        selection("Swordsman");
    }//GEN-LAST:event_detailsSwordsmanMouseClicked

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
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }

    public void startUp() {
        setResizable(false);
        resetBorders();
        setLocationRelativeTo(null);
        btnLogin.setEnabled(false);
        setVisible(true);
    }

    private void selection(String selection) {
        resetBorders();
        LineBorder border = new LineBorder(Color.RED, 3, true);
        switch (selection) {
            case "Swordsman":
                panelSwordsman.setBorder(border);
                selectedPlayer = "Swordsman";
                break;
            case "Marksman":
                panelMarksman.setBorder(border);
                selectedPlayer = "Marksman";
                break;
            case "Magician":
                panelMagician.setBorder(border);
                selectedPlayer = "Magician";
                break;
        }
        
        btnLogin.setEnabled(true);
    }

    private void resetBorders() {
        LineBorder border = new LineBorder(Color.BLACK, 3, true);

        panelSwordsman.setBorder(border);
        panelMarksman.setBorder(border);        
        panelMagician.setBorder(border);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JTextArea detailsMagician;
    private javax.swing.JTextArea detailsMarksman;
    private javax.swing.JTextArea detailsSwordsman;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblMarksman;
    private javax.swing.JLabel lblMarksman1;
    private javax.swing.JLabel lblPlayerName;
    private javax.swing.JLabel lblSwordsman;
    private javax.swing.JPanel panelMagician;
    private javax.swing.JPanel panelMarksman;
    private javax.swing.JPanel panelSwordsman;
    private javax.swing.JTextField txtPlayerName;
    // End of variables declaration//GEN-END:variables
}
