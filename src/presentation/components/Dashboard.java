package presentation.components;

import entities.Categorie;
import entities.Client;
import entities.ModelUser;
import java.util.List;
import javax.swing.ImageIcon;
import static javax.swing.JOptionPane.showMessageDialog;
import service.CategorieService;
import service.ChambreService;
import service.ClientService;
import service.ReservationService;

public class Dashboard extends javax.swing.JFrame {

    private final ModelUser user;
    private final CategorieService categorieService;
    private final ChambreService chambreService;
    private final ClientService clientService;
    private final ReservationService reservationService;

    public Dashboard(ModelUser user) {
        initComponents();
        this.user = user;
        userName.setText(user.getUserName());
        categorieService = new CategorieService();
        chambreService = new ChambreService();
        clientService = new ClientService();
        reservationService = new ReservationService();
        remplirComboBoxCategorie();
        remplirComboBoxClients();
        iconRoom.setIcon(new ImageIcon(getClass().getResource("/presentation/icon/bedroom.png")));
        hotelIcon.setIcon(new ImageIcon(getClass().getResource("/presentation/icon/hotel.png")));
        iconReservation.setIcon(new ImageIcon(getClass().getResource("/presentation/icon/reserve.png")));
        iconClient.setIcon(new ImageIcon(getClass().getResource("/presentation/icon/client.png")));
        nbrClients.setText(clientService.nbrClients() + " Clients");

    }

    private void remplirComboBoxCategorie() {

        List<Categorie> categories = categorieService.findAll();

        catComboBox.removeAllItems();

        for (Categorie categorie : categories) {
            catComboBox.addItem(categorie.getLibelle());
        }
    }

    private void remplirComboBoxClients() {
        List<Client> clients = clientService.findAll();

        clientComboBox.removeAllItems();

        for (Client client : clients) {
            clientComboBox.addItem(client.getPrenom() + " " + client.getNom());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        nbrChambres = new javax.swing.JLabel();
        iconRoom = new javax.swing.JLabel();
        catComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        clientComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        nbrReservations = new javax.swing.JLabel();
        iconReservation = new javax.swing.JLabel();
        yearCombo = new com.toedter.calendar.JYearChooser();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        nbrClients = new javax.swing.JLabel();
        iconClient = new javax.swing.JLabel();

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1100, 620));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 620));

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
                            .addComponent(reservationLink2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dashboardLink2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(clientLink2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(userLink3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(hotelIcon)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(hotelIcon)
                .addGap(98, 98, 98)
                .addComponent(dashboardLink2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roomLink2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(catLink2)
                .addGap(17, 17, 17)
                .addComponent(reservationLink2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clientLink2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userLink3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
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
                .addContainerGap(803, Short.MAX_VALUE)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("System Gestion Hotel");

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Dashboard");

        jPanel7.setBackground(new java.awt.Color(255, 0, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre de chambres par catégorie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12))); // NOI18N
        jPanel7.setPreferredSize(new java.awt.Dimension(304, 196));
        jPanel7.setLayout(new java.awt.BorderLayout());

        nbrChambres.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 18)); // NOI18N
        nbrChambres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(nbrChambres, java.awt.BorderLayout.CENTER);

        iconRoom.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        iconRoom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(iconRoom, java.awt.BorderLayout.PAGE_START);

        catComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("Catégorie :");

        clientComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("Client");

        jPanel10.setBackground(new java.awt.Color(255, 255, 102));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre de réservations d'un client pour une année", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12))); // NOI18N
        jPanel10.setPreferredSize(new java.awt.Dimension(304, 196));
        jPanel10.setLayout(new java.awt.BorderLayout());

        nbrReservations.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 18)); // NOI18N
        nbrReservations.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(nbrReservations, java.awt.BorderLayout.CENTER);

        iconReservation.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        iconReservation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(iconReservation, java.awt.BorderLayout.PAGE_START);

        yearCombo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                yearComboPropertyChange(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setText("Année");

        jPanel9.setBackground(new java.awt.Color(51, 102, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre total des clients", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12))); // NOI18N
        jPanel9.setPreferredSize(new java.awt.Dimension(304, 196));
        jPanel9.setLayout(new java.awt.BorderLayout());

        nbrClients.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 18)); // NOI18N
        nbrClients.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(nbrClients, java.awt.BorderLayout.CENTER);

        iconClient.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        iconClient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(iconClient, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(catComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(yearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(clientComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(187, 187, 187)
                                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(362, 362, 362)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(53, 53, 53))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(320, 320, 320)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(catComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(clientComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel5))
                    .addComponent(yearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1235, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void catComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catComboBoxActionPerformed
        String selectedCategorie = (String) catComboBox.getSelectedItem();
        Categorie categorie = categorieService.findByLibelle(selectedCategorie);

        nbrChambres.setText(String.valueOf(chambreService.nombreChambreParCategorie(categorie)) + " Chambres");
        //nbrReservations.setText(String.valueOf(chambreService.nombreChambreParCategorie(categorie)) + " Chambres");
    }//GEN-LAST:event_catComboBoxActionPerformed

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
        this.setVisible(true);
    }//GEN-LAST:event_dashboardLink2MouseClicked

    private void clientLink2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientLink2MouseClicked
        new Clients(user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_clientLink2MouseClicked

    private void userLink3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userLink3MouseClicked
        new Users(user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_userLink3MouseClicked


    private void clientComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientComboBoxActionPerformed
        String clientName = (String) clientComboBox.getSelectedItem();

        if (clientName == null || clientName.isEmpty()) {
            return;
        }

        String[] clientParts = clientName.split(" ");
        if (clientParts.length < 1) {
            showMessageDialog(this, "Nom et prénom du client invalide !");
            return;
        }

        String clientPrenom = clientParts[0];

        Client client = clientService.findByPrenom(clientPrenom);

        int selectedYear = yearCombo.getYear();

        if (client != null) {

            int count = reservationService.getReservationCountByClientAndYear(client, selectedYear);
            nbrReservations.setText(+count + " Réservations");
        } else {
            nbrReservations.setText("Veuillez sélectionner un client.");
        }

    }//GEN-LAST:event_clientComboBoxActionPerformed

    private void yearComboPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_yearComboPropertyChange
        String clientName = (String) clientComboBox.getSelectedItem();

        if (clientName == null || clientName.isEmpty()) {
            return;
        }

        String[] clientParts = clientName.split(" ");
        if (clientParts.length < 1) {
            showMessageDialog(this, "Nom et prénom du client invalide !");
            return;
        }

        String clientPrenom = clientParts[0];

        Client client = clientService.findByPrenom(clientPrenom);

        int selectedYear = yearCombo.getYear();

        if (client != null) {

            int count = reservationService.getReservationCountByClientAndYear(client, selectedYear);
            nbrReservations.setText(+count + " Réservations");
        } else {
            nbrReservations.setText("Veuillez sélectionner un client.");
        }
    }//GEN-LAST:event_yearComboPropertyChange

    public static void main(ModelUser user) {

        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard(user).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> catComboBox;
    private javax.swing.JLabel catLink2;
    private javax.swing.JComboBox<String> clientComboBox;
    private javax.swing.JLabel clientLink2;
    private javax.swing.JLabel dashboardLink2;
    private javax.swing.JLabel hotelIcon;
    private javax.swing.JLabel iconClient;
    private javax.swing.JLabel iconReservation;
    private javax.swing.JLabel iconRoom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel logoutBtn3;
    private javax.swing.JLabel nbrChambres;
    private javax.swing.JLabel nbrClients;
    private javax.swing.JLabel nbrReservations;
    private javax.swing.JLabel reservationLink2;
    private javax.swing.JLabel roomLink2;
    private javax.swing.JLabel userLink3;
    private javax.swing.JLabel userName;
    private com.toedter.calendar.JYearChooser yearCombo;
    // End of variables declaration//GEN-END:variables
}
