package presentation.components;

import entities.Categorie;
import entities.Chambre;
import entities.ModelUser;
import java.util.ArrayList;
import java.util.List;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import service.CategorieService;
import service.ChambreService;

public class Rooms extends javax.swing.JFrame {

    private final ChambreService chambreService;
    private final CategorieService categorieService;
    private final DefaultTableModel model;

    private final ModelUser user;

    public Rooms(ModelUser user) {
        this.user = user;
        initComponents();
        chambreService = new ChambreService();
        categorieService = new CategorieService();
        model = (DefaultTableModel) RoomsTable.getModel();
        remplirComboBoxCategorie();
        remplirComboBoxCategorieFilter();
        userName.setText(user.getUserName());
        loadTable();

    }

    private void loadTable() {
        model.setRowCount(0);

        for (Chambre chambre : chambreService.findAll()) {
            String libelleCategorie = (chambre.getCategorie() != null) ? chambre.getCategorie().getLibelle() : "Aucune catégorie";

            model.addRow(new Object[]{
                chambre.getId(),
                chambre.getNumero(),
                chambre.getTelephone(),
                libelleCategorie, // Affichez "Aucune catégorie" si null
            });
        }
    }

    private void cleanForm() {
        RoomId.setText("");
        RoomNum.setText("");
        RoomPhone.setText("");
        RoomCategorie.setSelectedIndex(-1);
    }

    public static void main(ModelUser user) {
        java.awt.EventQueue.invokeLater(() -> {
            new Rooms(user).setVisible(true);
        });

    }

    private void remplirComboBoxCategorie() {

        List<Categorie> categories = categorieService.findAll();

        RoomCategorie.removeAllItems();

        for (Categorie categorie : categories) {
            RoomCategorie.addItem(categorie.getLibelle());
        }
    }

    private void remplirComboBoxCategorieFilter() {

        List<Categorie> categories = categorieService.findAll();

        categorieComboBox.removeAllItems();

        for (Categorie categorie : categories) {
            categorieComboBox.addItem(categorie.getLibelle());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        userName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        RoomId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        RoomCategorie = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        RoomNum = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        RoomsTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AddRoomBtn = new javax.swing.JButton();
        EditRoom = new javax.swing.JButton();
        deleteRoomBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        RoomPhone = new javax.swing.JTextField();
        annulerBtn = new javax.swing.JButton();
        filterChambres = new javax.swing.JButton();
        categorieComboBox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        jLabel7.setFont(new java.awt.Font("Yu Gothic Light", 3, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Chambres");

        jLabel6.setFont(new java.awt.Font("Yu Gothic Light", 3, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Catégories");

        logoutBtn.setFont(new java.awt.Font("Yu Gothic Light", 3, 22)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("Logout");
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Yu Gothic Light", 3, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Reservations");

        jLabel10.setFont(new java.awt.Font("Yu Gothic Light", 3, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Dashboard");

        jLabel11.setFont(new java.awt.Font("Yu Gothic Light", 3, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Clients");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(17, 17, 17)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        RoomId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RoomId.setEnabled(false);
        RoomId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomIdActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Numéro");

        RoomCategorie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RoomCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomCategorieActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Télephone");
        jLabel5.setPreferredSize(new java.awt.Dimension(37, 22));

        RoomNum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RoomNum.setPreferredSize(new java.awt.Dimension(64, 22));
        RoomNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomNumActionPerformed(evt);
            }
        });

        RoomsTable.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        RoomsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Numéro", "Télephone", "Catégorie"
            }
        ));
        RoomsTable.setGridColor(new java.awt.Color(0, 0, 0));
        RoomsTable.setRowHeight(25);
        RoomsTable.setRowMargin(1);
        RoomsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RoomsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(RoomsTable);

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("System Gestion Hotel");

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gestion Chambres");

        AddRoomBtn.setBackground(new java.awt.Color(0, 204, 0));
        AddRoomBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddRoomBtn.setText("Ajouter");
        AddRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRoomBtnActionPerformed(evt);
            }
        });

        EditRoom.setBackground(new java.awt.Color(102, 153, 255));
        EditRoom.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EditRoom.setText("Modifier");
        EditRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditRoomActionPerformed(evt);
            }
        });

        deleteRoomBtn.setBackground(new java.awt.Color(255, 51, 51));
        deleteRoomBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteRoomBtn.setText("Supprimer");
        deleteRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRoomBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Catégorie");
        jLabel8.setPreferredSize(new java.awt.Dimension(37, 22));

        RoomPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RoomPhone.setPreferredSize(new java.awt.Dimension(64, 22));
        RoomPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomPhoneActionPerformed(evt);
            }
        });

        annulerBtn.setBackground(new java.awt.Color(153, 153, 153));
        annulerBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        annulerBtn.setText("Annuler");
        annulerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerBtnActionPerformed(evt);
            }
        });

        filterChambres.setBackground(new java.awt.Color(255, 102, 0));
        filterChambres.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        filterChambres.setText("Filter");
        filterChambres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterChambresActionPerformed(evt);
            }
        });

        categorieComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categorieComboBoxActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Catégorie :");

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(306, 306, 306))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addGap(48, 48, 48)
                                .addComponent(categorieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(filterChambres, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(RoomId, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(RoomNum, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(RoomCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(deleteRoomBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(AddRoomBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(EditRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(annulerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addComponent(RoomPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(64, 64, 64))))
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
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filterChambres)
                    .addComponent(categorieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RoomId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RoomNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RoomCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RoomPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddRoomBtn)
                            .addComponent(EditRoom)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteRoomBtn)
                    .addComponent(annulerBtn))
                .addGap(44, 44, 44))
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

    private void RoomIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomIdActionPerformed

    private void RoomNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomNumActionPerformed

    private void AddRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRoomBtnActionPerformed
        String numero = RoomNum.getText().trim();
        String telephone = RoomPhone.getText().trim();
        String libelleCat = (String) RoomCategorie.getSelectedItem();
        Categorie cat = categorieService.findByLibelle(libelleCat);
        if (numero.isEmpty() || telephone.isEmpty() || libelleCat.isEmpty()) {

            showMessageDialog(this, "Veuillez remplir tous les champs.", "Erreur", ERROR_MESSAGE);

        } else if (chambreService.isNumeroExist(numero, 0)) {

            showMessageDialog(this, "Ce numero existe deja.", "Erreur", ERROR_MESSAGE);
        } else if (chambreService.isPhoneExist(telephone, 0)) {

            showMessageDialog(this, "Ce télephone existe deja.", "Erreur", ERROR_MESSAGE);
        } else {
            Chambre chambre = new Chambre(numero, telephone, cat);

            if (chambreService.creat(chambre)) {
                showMessageDialog(this, "Chambre ajoutée avec succès.", "Succès", INFORMATION_MESSAGE);
                cleanForm();
                loadTable();
            } else {
                showMessageDialog(this, "Une erreur est survenue lors de l'ajout.", "Erreur", ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_AddRoomBtnActionPerformed

    private void EditRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditRoomActionPerformed
        int selectedRow = RoomsTable.getSelectedRow();
        if (selectedRow == -1) {
            showMessageDialog(this, "Veuillez sélectionner une chambre à modifier !");
            return;
        }
        String numero = RoomNum.getText().trim();
        String telephone = RoomPhone.getText().trim();
        String libelleCat = (String) RoomCategorie.getSelectedItem();
        Categorie cat = categorieService.findByLibelle(libelleCat);

        if (numero.isEmpty() || telephone.isEmpty() || libelleCat.isEmpty()) {

            showMessageDialog(this, "Veuillez remplir tous les champs.", "Erreur", ERROR_MESSAGE);

        } else if (chambreService.isNumeroExist(numero, (int) RoomsTable.getValueAt(selectedRow, 0))) {

            showMessageDialog(this, "Ce numero existe deja.", "Erreur", ERROR_MESSAGE);
        } else if (chambreService.isPhoneExist(telephone, (int) RoomsTable.getValueAt(selectedRow, 0))) {

            showMessageDialog(this, "Ce télephone existe deja.", "Erreur", ERROR_MESSAGE);
        } else {

            int id = (int) RoomsTable.getValueAt(selectedRow, 0);
            Chambre chambre = chambreService.findById(id);
            chambre.setNumero(numero);
            chambre.setTelephone(telephone);
            chambre.setCategorie(cat);
            int rep = showConfirmDialog(this, "Voulez vous vraiment modifier cette chambre ?");
            if (rep == 0) {
                if (chambreService.update(chambre)) {
                    showMessageDialog(this, "Chambre bien modifiée");
                    loadTable();
                    cleanForm();
                }
            }
        }
    }//GEN-LAST:event_EditRoomActionPerformed

    private void deleteRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRoomBtnActionPerformed
        int selectedRow = RoomsTable.getSelectedRow();
        if (selectedRow == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Veuillez sélectionner une chambre à supprimer !");
            return;
        }

        int id = (int) RoomsTable.getValueAt(selectedRow, 0);
        int reponse = showConfirmDialog(this, "Voulez-vous vraiment supprimer cette chambre ?");
        if (reponse == 0) {

            if (chambreService.delete(chambreService.findById(id))) {
                showMessageDialog(this, "Chambre bien supprimée");
                cleanForm();
                loadTable();
            } else {

                showMessageDialog(this, "Erreur lors de la suppression de la chambre !");
            }

        }
    }//GEN-LAST:event_deleteRoomBtnActionPerformed

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtnMouseClicked

    private void RoomPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomPhoneActionPerformed

    private void RoomsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoomsTableMouseClicked
        int selectedRow = RoomsTable.getSelectedRow();
        if (selectedRow != -1) {
            int id = (int) RoomsTable.getValueAt(selectedRow, 0);
            String numero = RoomsTable.getValueAt(selectedRow, 1).toString();
            String telephone = RoomsTable.getValueAt(selectedRow, 2).toString();
            String cat = RoomsTable.getValueAt(selectedRow, 3).toString();

            RoomId.setText(String.valueOf(id));
            RoomNum.setText(numero);
            RoomPhone.setText(telephone);
            RoomCategorie.setSelectedItem(cat);

        }
    }//GEN-LAST:event_RoomsTableMouseClicked

    private void annulerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerBtnActionPerformed
        cleanForm();
    }//GEN-LAST:event_annulerBtnActionPerformed

    private void categorieComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorieComboBoxActionPerformed


    }//GEN-LAST:event_categorieComboBoxActionPerformed

    private void loadTable(List<Chambre> chambres) {
        model.setRowCount(0);

        for (Chambre chambre : chambres) {
            String libelleCategorie = (chambre.getCategorie() != null) ? chambre.getCategorie().getLibelle() : "Aucune catégorie";

            model.addRow(new Object[]{
                chambre.getId(),
                chambre.getNumero(),
                chambre.getTelephone(),
                libelleCategorie, // Affichez "Aucune catégorie" si null
            });
        }
    }

    private void RoomCategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomCategorieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomCategorieActionPerformed

    private void filterChambresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterChambresActionPerformed
        String selectedItem = (String) categorieComboBox.getSelectedItem();

        Categorie categorie = categorieService.findByLibelle(selectedItem);

        if (selectedItem != null && categorie != null) {

            List<Chambre> filteredRooms = chambreService.findAvailableRooms(categorie.getId());
            loadTable(filteredRooms);
        }
    }//GEN-LAST:event_filterChambresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddRoomBtn;
    private javax.swing.JButton EditRoom;
    private javax.swing.JComboBox<String> RoomCategorie;
    private javax.swing.JTextField RoomId;
    private javax.swing.JTextField RoomNum;
    private javax.swing.JTextField RoomPhone;
    private javax.swing.JTable RoomsTable;
    private javax.swing.JButton annulerBtn;
    private javax.swing.JComboBox<String> categorieComboBox;
    private javax.swing.JButton deleteRoomBtn;
    private javax.swing.JButton filterChambres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
