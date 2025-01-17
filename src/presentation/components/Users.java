package presentation.components;

import entities.ModelUser;
import javax.swing.ImageIcon;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import service.UserService;

public class Users extends javax.swing.JFrame {

    private final UserService userService;
    private final DefaultTableModel model;
    private final ModelUser user;

    public Users(ModelUser user) {
        initComponents();
        this.user = user;
        userService = new UserService();
        model = (DefaultTableModel) UsersTable.getModel();
        userName.setText(user.getUserName());
        loadTable();
        hotelIcon.setIcon(new ImageIcon(getClass().getResource("/presentation/icon/hotel.png")));
    }

    private void loadTable() {
        model.setRowCount(0);

        for (ModelUser user : userService.findAll()) {

            model.addRow(new Object[]{
                user.getUserID(),
                user.getUserName(),
                user.getEmail(),
                user.getPassword(),
                user.getVerifyCode(),
                user.getStatus()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        roomLink2 = new javax.swing.JLabel();
        catLink2 = new javax.swing.JLabel();
        logoutBtn3 = new javax.swing.JLabel();
        reservationLink2 = new javax.swing.JLabel();
        dashboardLink2 = new javax.swing.JLabel();
        clientLink2 = new javax.swing.JLabel();
        userLink3 = new javax.swing.JLabel();
        hotelIcon = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        userName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        UserId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        UsersTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        deleteUserBtn = new javax.swing.JButton();
        UserEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        UserPassword = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        UserVerifyCode = new javax.swing.JTextField();
        annulerBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));

        roomLink2.setFont(new java.awt.Font("Yu Gothic Light", 3, 22)); // NOI18N
        roomLink2.setForeground(new java.awt.Color(255, 255, 255));
        roomLink2.setText("Chambres");
        roomLink2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomLink2MouseClicked(evt);
            }
        });

        catLink2.setFont(new java.awt.Font("Yu Gothic Light", 3, 22)); // NOI18N
        catLink2.setForeground(new java.awt.Color(255, 255, 255));
        catLink2.setText("Catégories");
        catLink2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catLink2MouseClicked(evt);
            }
        });

        logoutBtn3.setFont(new java.awt.Font("Yu Gothic Light", 3, 22)); // NOI18N
        logoutBtn3.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn3.setText("Logout");
        logoutBtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtn3MouseClicked(evt);
            }
        });

        reservationLink2.setFont(new java.awt.Font("Yu Gothic Light", 3, 22)); // NOI18N
        reservationLink2.setForeground(new java.awt.Color(255, 255, 255));
        reservationLink2.setText("Reservations");
        reservationLink2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservationLink2MouseClicked(evt);
            }
        });

        dashboardLink2.setFont(new java.awt.Font("Yu Gothic Light", 3, 22)); // NOI18N
        dashboardLink2.setForeground(new java.awt.Color(255, 255, 255));
        dashboardLink2.setText("Dashboard");
        dashboardLink2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardLink2MouseClicked(evt);
            }
        });

        clientLink2.setFont(new java.awt.Font("Yu Gothic Light", 3, 22)); // NOI18N
        clientLink2.setForeground(new java.awt.Color(255, 255, 255));
        clientLink2.setText("Clients");
        clientLink2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientLink2MouseClicked(evt);
            }
        });

        userLink3.setFont(new java.awt.Font("Yu Gothic Light", 3, 22)); // NOI18N
        userLink3.setForeground(new java.awt.Color(255, 255, 255));
        userLink3.setText("Users");
        userLink3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userLink3MouseClicked(evt);
            }
        });

        hotelIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(logoutBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(catLink2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(roomLink2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(dashboardLink2, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                        .addGap(8, 8, 8))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(clientLink2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(userLink3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(reservationLink2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(hotelIcon)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(hotelIcon)
                .addGap(101, 101, 101)
                .addComponent(dashboardLink2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roomLink2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(catLink2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reservationLink2)
                .addGap(17, 17, 17)
                .addComponent(clientLink2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userLink3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn3)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        userName.setFont(new java.awt.Font("Yu Gothic Light", 3, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(760, Short.MAX_VALUE)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("ID");

        UserId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UserId.setEnabled(false);
        UserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserIdActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("UserName");

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Email");
        jLabel5.setPreferredSize(new java.awt.Dimension(37, 22));

        UserName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UserName.setEnabled(false);
        UserName.setPreferredSize(new java.awt.Dimension(64, 22));
        UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameActionPerformed(evt);
            }
        });

        UsersTable.setBackground(new java.awt.Color(0, 204, 153));
        UsersTable.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        UsersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "UserName", "Email", "Password", "VerifyCode", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        UsersTable.setGridColor(new java.awt.Color(0, 0, 0));
        UsersTable.setRowHeight(25);
        UsersTable.setRowMargin(1);
        UsersTable.setShowGrid(true);
        UsersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(UsersTable);
        if (UsersTable.getColumnModel().getColumnCount() > 0) {
            UsersTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            UsersTable.getColumnModel().getColumn(1).setPreferredWidth(30);
            UsersTable.getColumnModel().getColumn(2).setPreferredWidth(110);
            UsersTable.getColumnModel().getColumn(3).setPreferredWidth(30);
            UsersTable.getColumnModel().getColumn(4).setPreferredWidth(30);
            UsersTable.getColumnModel().getColumn(5).setPreferredWidth(30);
        }

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("System Gestion Hotel");

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gestion Utilisateurs");

        deleteUserBtn.setBackground(new java.awt.Color(255, 51, 51));
        deleteUserBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteUserBtn.setText("Supprimer");
        deleteUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserBtnActionPerformed(evt);
            }
        });

        UserEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UserEmail.setEnabled(false);
        UserEmail.setPreferredSize(new java.awt.Dimension(64, 22));
        UserEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserEmailActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("VerifyCode");
        jLabel8.setPreferredSize(new java.awt.Dimension(37, 22));

        UserPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UserPassword.setEnabled(false);
        UserPassword.setPreferredSize(new java.awt.Dimension(64, 22));

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Password");
        jLabel12.setPreferredSize(new java.awt.Dimension(37, 22));

        UserVerifyCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UserVerifyCode.setEnabled(false);
        UserVerifyCode.setPreferredSize(new java.awt.Dimension(64, 22));

        annulerBtn.setBackground(new java.awt.Color(153, 153, 153));
        annulerBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        annulerBtn.setText("Annuler");
        annulerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UserId, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UserName, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UserEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(UserPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UserVerifyCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(deleteUserBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(annulerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel3))
                                .addGap(306, 306, 306))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UserVerifyCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteUserBtn)
                            .addComponent(annulerBtn))
                        .addGap(29, 29, 29))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
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

    private void UserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserIdActionPerformed

    private void UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameActionPerformed

    private void UsersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersTableMouseClicked
        int selectedRow = UsersTable.getSelectedRow();
        if (selectedRow != -1) {
            int id = (int) UsersTable.getValueAt(selectedRow, 0);
            String nameUser = UsersTable.getValueAt(selectedRow, 1).toString();
            String email = UsersTable.getValueAt(selectedRow, 2).toString();
            String password = UsersTable.getValueAt(selectedRow, 3).toString();
            String verifyCode = UsersTable.getValueAt(selectedRow, 4).toString();

            UserId.setText(String.valueOf(id));
            UserName.setText(nameUser);
            UserEmail.setText(email);
            UserPassword.setText(password);
            UserVerifyCode.setText(verifyCode);

        }
    }//GEN-LAST:event_UsersTableMouseClicked

    private void deleteUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserBtnActionPerformed
        int selectedRow = UsersTable.getSelectedRow();
        if (selectedRow == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Veuillez sélectionner un user à supprimer !");
            return;
        }

        int id = (int) UsersTable.getValueAt(selectedRow, 0);
        int reponse = showConfirmDialog(this, "Voulez-vous vraiment supprimer ce user ?");
        if (reponse == 0) {

            if (userService.delete(userService.findById(id))) {
                showMessageDialog(this, "User bien supprimé");
                cleanForm();
                loadTable();
            } else {

                showMessageDialog(this, "Erreur lors de la suppression de user !");
            }

        }
    }//GEN-LAST:event_deleteUserBtnActionPerformed

    private void cleanForm() {
        UserId.setText("");
        UserName.setText("");
        UserEmail.setText("");
        UserPassword.setText("");
        UserVerifyCode.setText("");

    }

    private void annulerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerBtnActionPerformed
        cleanForm();
    }//GEN-LAST:event_annulerBtnActionPerformed

    private void UserEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserEmailActionPerformed

    private void roomLink2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomLink2MouseClicked
         new Rooms(user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_roomLink2MouseClicked

    private void catLink2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catLink2MouseClicked
        new Categories(user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_catLink2MouseClicked

    private void logoutBtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtn3MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtn3MouseClicked

    private void reservationLink2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservationLink2MouseClicked
        new Reservations(user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reservationLink2MouseClicked

    private void dashboardLink2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardLink2MouseClicked
        new Dashboard(user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dashboardLink2MouseClicked

    private void clientLink2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientLink2MouseClicked
        new Clients(user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_clientLink2MouseClicked

    private void userLink3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userLink3MouseClicked
        this.setVisible(true);
    }//GEN-LAST:event_userLink3MouseClicked

    public static void main(ModelUser user) {

        java.awt.EventQueue.invokeLater(() -> {
            new Users(user).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField UserEmail;
    private javax.swing.JTextField UserId;
    private javax.swing.JTextField UserName;
    private javax.swing.JTextField UserPassword;
    private javax.swing.JTextField UserVerifyCode;
    private javax.swing.JTable UsersTable;
    private javax.swing.JButton annulerBtn;
    private javax.swing.JLabel catLink2;
    private javax.swing.JLabel clientLink2;
    private javax.swing.JLabel dashboardLink2;
    private javax.swing.JButton deleteUserBtn;
    private javax.swing.JLabel hotelIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutBtn3;
    private javax.swing.JLabel reservationLink2;
    private javax.swing.JLabel roomLink2;
    private javax.swing.JLabel userLink3;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
