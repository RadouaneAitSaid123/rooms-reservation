package presentation.components;

import entities.Client;
import entities.ModelUser;
import javax.swing.ImageIcon;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import service.ClientService;

public class Clients extends javax.swing.JFrame {

    private final ClientService clientService;
    private final DefaultTableModel model;
    private final ModelUser user;

    public Clients(ModelUser user) {
        initComponents();
        this.user = user;
        clientService = new ClientService();
        model = (DefaultTableModel) ClientsTable.getModel();
        userName.setText(user.getUserName());
        loadTable();
        hotelIcon.setIcon(new ImageIcon(getClass().getResource("/presentation/icon/hotel.png")));
    }

    private void loadTable() {
        model.setRowCount(0);

        for (Client client : clientService.findAll()) {

            model.addRow(new Object[]{
                client.getId(),
                client.getNom(),
                client.getPrenom(),
                client.getTelephone(),
                client.getEmail(),});
        }
    }

    private void cleanForm() {
        ClientId.setText("");
        ClientNom.setText("");
        ClientPrenom.setText("");
        ClientPhone.setText("");
        ClientMail.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
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
        ClientId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ClientNom = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ClientsTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ajouterBtn = new javax.swing.JButton();
        editeBtn = new javax.swing.JButton();
        supprimerBtn = new javax.swing.JButton();
        ClientPrenom = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ClientPhone = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ClientMail = new javax.swing.JTextField();
        annulerBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));

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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(logoutBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(roomLink2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(reservationLink2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dashboardLink2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(clientLink2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(userLink3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(catLink2))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(hotelIcon)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(hotelIcon)
                .addGap(95, 95, 95)
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
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        ClientId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ClientId.setEnabled(false);
        ClientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientIdActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Nom");

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Prénom");
        jLabel5.setPreferredSize(new java.awt.Dimension(37, 22));

        ClientNom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ClientNom.setPreferredSize(new java.awt.Dimension(64, 22));
        ClientNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientNomActionPerformed(evt);
            }
        });

        ClientsTable.setBackground(new java.awt.Color(0, 204, 153));
        ClientsTable.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        ClientsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nom", "Prénom", "Télephone", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ClientsTable.setGridColor(new java.awt.Color(0, 0, 0));
        ClientsTable.setRowHeight(25);
        ClientsTable.setRowMargin(1);
        ClientsTable.setShowGrid(true);
        ClientsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ClientsTable);
        if (ClientsTable.getColumnModel().getColumnCount() > 0) {
            ClientsTable.getColumnModel().getColumn(0).setResizable(false);
            ClientsTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            ClientsTable.getColumnModel().getColumn(1).setPreferredWidth(40);
            ClientsTable.getColumnModel().getColumn(2).setPreferredWidth(40);
            ClientsTable.getColumnModel().getColumn(3).setPreferredWidth(30);
            ClientsTable.getColumnModel().getColumn(4).setPreferredWidth(120);
        }

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("System Gestion Hotel");

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gestion Clients");

        ajouterBtn.setBackground(new java.awt.Color(0, 204, 0));
        ajouterBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ajouterBtn.setText("Ajouter");
        ajouterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterBtnActionPerformed(evt);
            }
        });

        editeBtn.setBackground(new java.awt.Color(102, 153, 255));
        editeBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        editeBtn.setText("Modifier");
        editeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editeBtnActionPerformed(evt);
            }
        });

        supprimerBtn.setBackground(new java.awt.Color(255, 51, 51));
        supprimerBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        supprimerBtn.setText("Supprimer");
        supprimerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerBtnActionPerformed(evt);
            }
        });

        ClientPrenom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ClientPrenom.setPreferredSize(new java.awt.Dimension(64, 22));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Email");
        jLabel8.setPreferredSize(new java.awt.Dimension(37, 22));

        ClientPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ClientPhone.setPreferredSize(new java.awt.Dimension(64, 22));

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Télephone");
        jLabel12.setPreferredSize(new java.awt.Dimension(37, 22));

        ClientMail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ClientMail.setPreferredSize(new java.awt.Dimension(64, 22));

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
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ClientId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ClientNom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ClientPrenom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ClientPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ClientMail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ajouterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(supprimerBtn, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(38, 38, 38)
                                        .addComponent(annulerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(127, 127, 127)
                                        .addComponent(editeBtn)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1)
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(306, 306, 306))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(336, 336, 336))))))))
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
                        .addComponent(ClientId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ClientNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ClientPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ClientPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ClientMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editeBtn)
                            .addComponent(ajouterBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(supprimerBtn)
                            .addComponent(annulerBtn)))
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

    private void ClientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClientIdActionPerformed

    private void ClientNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClientNomActionPerformed

    private void ajouterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterBtnActionPerformed
        String nom = ClientNom.getText().trim();
        String prenom = ClientPrenom.getText().trim();
        String phone = ClientPhone.getText().trim();
        String email = ClientMail.getText().trim();
        if (nom.isEmpty() || prenom.isEmpty() || phone.isEmpty() || email.isEmpty()) {

            showMessageDialog(this, "Veuillez remplir tous les champs.", "Erreur", ERROR_MESSAGE);

        } else if (clientService.isPhoneExist(phone, 0)) {

            showMessageDialog(this, "Ce numero existe deja.", "Erreur", ERROR_MESSAGE);
        } else if (clientService.isEmailExist(email, 0)) {

            showMessageDialog(this, "Cet email existe deja.", "Erreur", ERROR_MESSAGE);
        } else {
            Client client = new Client(nom, prenom, phone, email);

            if (clientService.creat(client)) {
                showMessageDialog(this, "Client ajouté avec succès.", "Succès", INFORMATION_MESSAGE);
                cleanForm();
                loadTable();
            } else {
                showMessageDialog(this, "Une erreur est survenue lors de l'ajout.", "Erreur", ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_ajouterBtnActionPerformed

    private void editeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editeBtnActionPerformed
        int selectedRow = ClientsTable.getSelectedRow();
        if (selectedRow == -1) {
            showMessageDialog(this, "Veuillez sélectionner un client à modifier !");
            return;
        }
        String nom = ClientNom.getText().trim();
        String prenom = ClientPrenom.getText().trim();
        String phone = ClientPhone.getText().trim();
        String email = ClientMail.getText().trim();
     
        if (nom.isEmpty() || prenom.isEmpty() || phone.isEmpty() || email.isEmpty()) {

            showMessageDialog(this, "Veuillez remplir tous les champs.", "Erreur", ERROR_MESSAGE);

        } else if (clientService.isPhoneExist(phone, (int) ClientsTable.getValueAt(selectedRow, 0))) {

            showMessageDialog(this, "Ce numero existe deja.", "Erreur", ERROR_MESSAGE);
        } else if (clientService.isEmailExist(email, (int) ClientsTable.getValueAt(selectedRow, 0))) {

            showMessageDialog(this, "Cet email existe deja.", "Erreur", ERROR_MESSAGE);
        } else {

            int id = (int) ClientsTable.getValueAt(selectedRow, 0);
            Client client = clientService.findById(id);
            client.setNom(nom);
            client.setPrenom(prenom);
            client.setTelephone(phone);
            client.setEmail(email);
            int rep = showConfirmDialog(this, "Voulez vous vraiment modifier ce client ?");
            if (rep == 0) {
                if (clientService.update(client)) {
                    showMessageDialog(this, "Client bien modifiée");
                    loadTable();
                    cleanForm();
                }
            }
        }
    }//GEN-LAST:event_editeBtnActionPerformed

    private void supprimerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerBtnActionPerformed
        int selectedRow = ClientsTable.getSelectedRow();
        if (selectedRow == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Veuillez sélectionner un client à supprimer !");
            return;
        }

        int id = (int) ClientsTable.getValueAt(selectedRow, 0);
        int reponse = showConfirmDialog(this, "Voulez-vous vraiment supprimer ce client ?");
        if (reponse == 0) {

            if (clientService.delete(clientService.findById(id))) {
                showMessageDialog(this, "Client bien supprimé");
                cleanForm();
                loadTable();
            } else {

                showMessageDialog(this, "Erreur lors de la suppression du client !");
            }

        }
    }//GEN-LAST:event_supprimerBtnActionPerformed

    private void annulerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerBtnActionPerformed
        cleanForm();
    }//GEN-LAST:event_annulerBtnActionPerformed

    private void ClientsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientsTableMouseClicked
        int selectedRow = ClientsTable.getSelectedRow();
        if (selectedRow != -1) {
            int id = (int) ClientsTable.getValueAt(selectedRow, 0);
            String nom = ClientsTable.getValueAt(selectedRow, 1).toString();
            String prenom = ClientsTable.getValueAt(selectedRow, 2).toString();
            String phone = ClientsTable.getValueAt(selectedRow, 3).toString();
            String email = ClientsTable.getValueAt(selectedRow, 4).toString();

            ClientId.setText(String.valueOf(id));
            ClientNom.setText(nom);
            ClientPrenom.setText(prenom);
            ClientPhone.setText(phone);
            ClientMail.setText(email);

        }
    }//GEN-LAST:event_ClientsTableMouseClicked

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
        this.setVisible(true);
    }//GEN-LAST:event_clientLink2MouseClicked

    private void userLink3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userLink3MouseClicked
        new Users(user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_userLink3MouseClicked

    public static void main(ModelUser user) {
        java.awt.EventQueue.invokeLater(() -> {
            new Clients(user).setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ClientId;
    private javax.swing.JTextField ClientMail;
    private javax.swing.JTextField ClientNom;
    private javax.swing.JTextField ClientPhone;
    private javax.swing.JTextField ClientPrenom;
    private javax.swing.JTable ClientsTable;
    private javax.swing.JButton ajouterBtn;
    private javax.swing.JButton annulerBtn;
    private javax.swing.JLabel catLink2;
    private javax.swing.JLabel clientLink2;
    private javax.swing.JLabel dashboardLink2;
    private javax.swing.JButton editeBtn;
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
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutBtn3;
    private javax.swing.JLabel reservationLink2;
    private javax.swing.JLabel roomLink2;
    private javax.swing.JButton supprimerBtn;
    private javax.swing.JLabel userLink3;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
