/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentation.components;

import entities.Client;
import javax.swing.JInternalFrame;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import service.ClientService;

/**
 *
 * @author PC
 */
public class ClientFrame extends JInternalFrame {

    private ClientService cs;
    private DefaultTableModel model;
    private static int id;

    /**
     * Creates new form ClientFrame
     */
    public ClientFrame() {
        initComponents();
        this.setTitle("Gestion des clients");
        cs = new ClientService();
        model = (DefaultTableModel) ClientTable.getModel();
        loadTable();
    }

    private void loadTable() {
        model.setRowCount(0);

        for (Client c : cs.findAll()) {
            model.addRow(new Object[]{
                c.getId(),
                c.getNom(),
                c.getPrenom(),
                c.getTelephone(),
                c.getEmail(),});
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        ClientForm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nomTxt = new javax.swing.JTextField();
        prenomTxt = new javax.swing.JTextField();
        telephoneTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        AddClient = new javax.swing.JButton();
        SupprimerClient = new javax.swing.JButton();
        ModifierClient = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ClientTable = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion des clients");

        ClientForm.setBackground(new java.awt.Color(255, 204, 102));
        ClientForm.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Nom :");

        jLabel2.setText("Prénom :");

        jLabel3.setText("Télephone :");

        jLabel4.setText("Email :");

        nomTxt.setBackground(new java.awt.Color(204, 204, 204));

        prenomTxt.setBackground(new java.awt.Color(204, 204, 204));
        prenomTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomTxtActionPerformed(evt);
            }
        });

        telephoneTxt.setBackground(new java.awt.Color(204, 204, 204));

        emailTxt.setBackground(new java.awt.Color(204, 204, 204));

        AddClient.setText("Ajouter");
        AddClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClientActionPerformed(evt);
            }
        });

        SupprimerClient.setText("Supprimer");
        SupprimerClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerClientActionPerformed(evt);
            }
        });

        ModifierClient.setText("Modifier");
        ModifierClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ClientFormLayout = new javax.swing.GroupLayout(ClientForm);
        ClientForm.setLayout(ClientFormLayout);
        ClientFormLayout.setHorizontalGroup(
            ClientFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientFormLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(ClientFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClientFormLayout.createSequentialGroup()
                        .addGroup(ClientFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ClientFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prenomTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telephoneTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ClientFormLayout.createSequentialGroup()
                        .addComponent(AddClient)
                        .addGap(56, 56, 56)
                        .addComponent(SupprimerClient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ModifierClient)
                        .addGap(37, 37, 37))))
        );
        ClientFormLayout.setVerticalGroup(
            ClientFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientFormLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(ClientFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ClientFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(prenomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(ClientFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClientFormLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3))
                    .addGroup(ClientFormLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(telephoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(ClientFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ClientFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddClient)
                    .addComponent(SupprimerClient)
                    .addComponent(ModifierClient))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        ClientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom", "Prénom", "Télephone", "Email"
            }
        ));
        ClientTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientTableMouseClicked(evt);
            }
        });
        ClientTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ClientTableKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(ClientTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ClientForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ClientForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prenomTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomTxtActionPerformed

    private void SupprimerClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerClientActionPerformed
        int selectedRow = ClientTable.getSelectedRow();
        if (selectedRow == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Veuillez sélectionner un client à supprimer !");
            return;
        }

        int reponse = showConfirmDialog(this, "Voulez-vous vraiment supprimer ce client");
        if (reponse == 0) {
            if (cs.delete(cs.findById(id))) {
                showMessageDialog(this, "Client bien supprimé");
                loadTable();
            }

        }

    }//GEN-LAST:event_SupprimerClientActionPerformed


    private void ModifierClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierClientActionPerformed
        int selectedRow = ClientTable.getSelectedRow();
        if (selectedRow == -1) {
            showMessageDialog(this, "Veuillez sélectionner un client à modiffier !");
            return;
        }
        String nom = nomTxt.getText();
        String prenom = prenomTxt.getText();
        String tel = telephoneTxt.getText();
        String mail = emailTxt.getText();
        Client cl = cs.findById(id);
        cl.setNom(nom);
        cl.setPrenom(prenom);
        cl.setTelephone(tel);
        cl.setEmail(mail);
        int rep = showConfirmDialog(this, "Voulez vous vraiment modifier ce client");
        if (rep == 0) {
            if (cs.update(cl)) {
                showMessageDialog(this, "Client bien modifié");
                loadTable();
            }
        }
    }//GEN-LAST:event_ModifierClientActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void AddClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClientActionPerformed
        String nom = nomTxt.getText();
        String prenom = prenomTxt.getText();
        String tel = telephoneTxt.getText();
        String mail = emailTxt.getText();

        //vérification des champs vides
        if (nom.isEmpty() || prenom.isEmpty() || tel.isEmpty() || mail.isEmpty()) {
            showMessageDialog(this, "Veuillez remplir tous les champs.", "Erreur", ERROR_MESSAGE);
            return;
        }

        // Vérification du format de l'email
        if (!isEmailValid(mail)) {
            showMessageDialog(this, "Veuillez entrer un email valide.", "Erreur", ERROR_MESSAGE);
            return;
        }

        // Vérification de l'unicité de l'email
        if (cs.isEmailExist(mail)) {
            showMessageDialog(this, "Cet email est déjà utilisé.", "Erreur", ERROR_MESSAGE);
            return;
        }

        // Vérification de l'unicité du téléphone
        if (cs.isPhoneExist(tel)) {
            showMessageDialog(this, "Ce numéro de téléphone est déjà utilisé.", "Erreur", ERROR_MESSAGE);
            return;
        }

        Client cl = new Client(nom, prenom, tel, mail);

        if (cs.creat(cl)) {
            showMessageDialog(this, "Client ajouté avec succès.", "Succès", INFORMATION_MESSAGE);

            nomTxt.setText("");
            prenomTxt.setText("");
            telephoneTxt.setText("");
            emailTxt.setText("");

            loadTable();
        } else {
            showMessageDialog(this, "Une erreur est survenue lors de l'ajout.", "Erreur", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AddClientActionPerformed

    private boolean isEmailValid(String email) {
        return email != null && email.matches("^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
    }

    private void ClientTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientTableMouseClicked
        int selectedRow = ClientTable.getSelectedRow();
        if (selectedRow != -1) {
            id = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
            nomTxt.setText((String) model.getValueAt(selectedRow, 1));
            prenomTxt.setText((String) model.getValueAt(selectedRow, 2));
            telephoneTxt.setText((String) model.getValueAt(selectedRow, 3));
            emailTxt.setText((String) model.getValueAt(selectedRow, 4));
        }

    }//GEN-LAST:event_ClientTableMouseClicked

    private void ClientTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ClientTableKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClientTableKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddClient;
    private javax.swing.JPanel ClientForm;
    private javax.swing.JTable ClientTable;
    private javax.swing.JButton ModifierClient;
    private javax.swing.JButton SupprimerClient;
    private javax.swing.JTextField emailTxt;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nomTxt;
    private javax.swing.JTextField prenomTxt;
    private javax.swing.JTextField telephoneTxt;
    // End of variables declaration//GEN-END:variables

}