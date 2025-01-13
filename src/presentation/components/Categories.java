package presentation.components;

import entities.Categorie;
import entities.ModelUser;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import service.CategorieService;

public class Categories extends javax.swing.JFrame {

    private final CategorieService categorieService;
    private final DefaultTableModel model;
    private final ModelUser user;

    public Categories(ModelUser user) {
        this.user = user;
        initComponents();
        categorieService = new CategorieService();
        model = (DefaultTableModel) CategoriesTable.getModel();
        userName.setText(user.getUserName());
        loadTable();
    }

    private void loadTable() {
        model.setRowCount(0);

        for (Categorie cat : categorieService.findAll()) {
            model.addRow(new Object[]{
                cat.getId(),
                cat.getCode(),
                cat.getLibelle(),});

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        catBtn = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        userName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CategorieId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CategorieCode = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        CategoriesTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AddCategorieBtn = new javax.swing.JButton();
        EditCategorieBtn = new javax.swing.JButton();
        DeleteCategorieBtn = new javax.swing.JButton();
        CategorieLibelle = new javax.swing.JTextField();
        annulerBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        jLabel7.setFont(new java.awt.Font("Yu Gothic Light", 3, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Chambres");

        catBtn.setFont(new java.awt.Font("Yu Gothic Light", 3, 22)); // NOI18N
        catBtn.setForeground(new java.awt.Color(255, 255, 255));
        catBtn.setText("Catégories");
        catBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catBtnMouseClicked(evt);
            }
        });

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
                                    .addComponent(catBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(catBtn)
                .addGap(17, 17, 17)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
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
        userName.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(758, Short.MAX_VALUE)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("ID");

        CategorieId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CategorieId.setEnabled(false);
        CategorieId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategorieIdActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Code");

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Libelle");
        jLabel5.setPreferredSize(new java.awt.Dimension(37, 22));

        CategorieCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CategorieCode.setPreferredSize(new java.awt.Dimension(64, 22));
        CategorieCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategorieCodeActionPerformed(evt);
            }
        });

        CategoriesTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CategoriesTable.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        CategoriesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Code", "Libelle"
            }
        ));
        CategoriesTable.setGridColor(new java.awt.Color(0, 0, 0));
        CategoriesTable.setRowHeight(25);
        CategoriesTable.setRowMargin(1);
        CategoriesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoriesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CategoriesTable);

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("System Gestion Hotel");

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gestion Catégories");

        AddCategorieBtn.setBackground(new java.awt.Color(0, 204, 0));
        AddCategorieBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddCategorieBtn.setText("Ajouter");
        AddCategorieBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCategorieBtnActionPerformed(evt);
            }
        });

        EditCategorieBtn.setBackground(new java.awt.Color(102, 153, 255));
        EditCategorieBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EditCategorieBtn.setText("Modifier");
        EditCategorieBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditCategorieBtnActionPerformed(evt);
            }
        });

        DeleteCategorieBtn.setBackground(new java.awt.Color(255, 51, 51));
        DeleteCategorieBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DeleteCategorieBtn.setText("Supprimer");
        DeleteCategorieBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCategorieBtnActionPerformed(evt);
            }
        });

        CategorieLibelle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CategorieLibelle.setPreferredSize(new java.awt.Dimension(64, 22));

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(306, 306, 306))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(319, 319, 319))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CategorieId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CategorieCode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CategorieLibelle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DeleteCategorieBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AddCategorieBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EditCategorieBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(annulerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
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
                        .addComponent(CategorieId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CategorieCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CategorieLibelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EditCategorieBtn)
                            .addComponent(AddCategorieBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteCategorieBtn)
                            .addComponent(annulerBtn))
                        .addGap(0, 0, Short.MAX_VALUE))
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

    private void DeleteCategorieBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCategorieBtnActionPerformed
        int selectedRow = CategoriesTable.getSelectedRow();
        if (selectedRow == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Veuillez sélectionner une catégorie à supprimer !");
            return;
        }

        int id = (int) CategoriesTable.getValueAt(selectedRow, 0);
        int reponse = showConfirmDialog(this, "Voulez-vous vraiment supprimer cette catégorie ?");
        if (reponse == 0) {

            if (categorieService.delete(categorieService.findById(id))) {
                showMessageDialog(this, "Catégorie bien supprimée");
                cleanForm();
                loadTable();

            } else {

                showMessageDialog(this, "Erreur lors de la suppression de la catégorie !");
            }

        }
    }//GEN-LAST:event_DeleteCategorieBtnActionPerformed

    private void EditCategorieBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditCategorieBtnActionPerformed
        int selectedRow = CategoriesTable.getSelectedRow();
        if (selectedRow == -1) {
            showMessageDialog(this, "Veuillez sélectionner une catégorie à modifier !");
            return;
        }
        String code = CategorieCode.getText().trim();
        String libelle = CategorieLibelle.getText().trim();
        if (code.isEmpty() || libelle.isEmpty()) {

            showMessageDialog(this, "Veuillez remplir tous les champs.", "Erreur", ERROR_MESSAGE);

        } else if (categorieService.isCodeExist(code, (int) CategoriesTable.getValueAt(selectedRow, 0))) {

            showMessageDialog(this, "Ce code existe deja.", "Erreur", ERROR_MESSAGE);
        } else if (categorieService.isLibelleExist(libelle, (int) CategoriesTable.getValueAt(selectedRow, 0))) {

            showMessageDialog(this, "Ce libelle existe deja.", "Erreur", ERROR_MESSAGE);
        } else {

            int id = (int) CategoriesTable.getValueAt(selectedRow, 0);
            Categorie cat = categorieService.findById(id);
            cat.setCode(code);
            cat.setLibelle(libelle);
            int rep = showConfirmDialog(this, "Voulez vous vraiment modifier cette catégorie ?");
            if (rep == 0) {
                if (categorieService.update(cat)) {
                    showMessageDialog(this, "Catégorie bien modifiée");
                    loadTable();
                    cleanForm();
                }
            }
        }
    }//GEN-LAST:event_EditCategorieBtnActionPerformed

    private void cleanForm() {
        CategorieLibelle.setText("");
        CategorieCode.setText("");
        CategorieId.setText("");
    }
    private void AddCategorieBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCategorieBtnActionPerformed
        String code = CategorieCode.getText().trim();
        String libelle = CategorieLibelle.getText().trim();
        if (code.isEmpty() || libelle.isEmpty()) {

            showMessageDialog(this, "Veuillez remplir tous les champs.", "Erreur", ERROR_MESSAGE);

        } else if (categorieService.isCodeExist(code, 0)) {

            showMessageDialog(this, "Ce code existe deja.", "Erreur", ERROR_MESSAGE);
        } else if (categorieService.isLibelleExist(libelle, 0)) {

            showMessageDialog(this, "Ce libelle existe deja.", "Erreur", ERROR_MESSAGE);
        } else {
            Categorie cat = new Categorie(code, libelle);

            if (categorieService.creat(cat)) {
                showMessageDialog(this, "Categorie ajoutée avec succès.", "Succès", INFORMATION_MESSAGE);
                cleanForm();
                loadTable();
            } else {
                showMessageDialog(this, "Une erreur est survenue lors de l'ajout.", "Erreur", ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_AddCategorieBtnActionPerformed

    private void CategorieCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategorieCodeActionPerformed

    }//GEN-LAST:event_CategorieCodeActionPerformed

    private void CategorieIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategorieIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategorieIdActionPerformed

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtnMouseClicked

    private void CategoriesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoriesTableMouseClicked
        int selectedRow = CategoriesTable.getSelectedRow();
        if (selectedRow != -1) {
            int id = (int) CategoriesTable.getValueAt(selectedRow, 0);
            String code = CategoriesTable.getValueAt(selectedRow, 1).toString();
            String libelle = CategoriesTable.getValueAt(selectedRow, 2).toString();

            CategorieId.setText(String.valueOf(id));
            CategorieCode.setText(code);
            CategorieLibelle.setText(libelle);

        }
    }//GEN-LAST:event_CategoriesTableMouseClicked

    private void catBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catBtnMouseClicked
        //new Categories(user).setVisible(true);
        this.setVisible(true);

    }//GEN-LAST:event_catBtnMouseClicked

    private void annulerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerBtnActionPerformed
       cleanForm();
    }//GEN-LAST:event_annulerBtnActionPerformed

    public static void main(ModelUser user) {

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
            java.util.logging.Logger.getLogger(Categories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Categories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Categories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Categories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new Categories(user).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCategorieBtn;
    private javax.swing.JTextField CategorieCode;
    private javax.swing.JTextField CategorieId;
    private javax.swing.JTextField CategorieLibelle;
    private javax.swing.JTable CategoriesTable;
    private javax.swing.JButton DeleteCategorieBtn;
    private javax.swing.JButton EditCategorieBtn;
    private javax.swing.JButton annulerBtn;
    private javax.swing.JLabel catBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
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
