package presentation.components;

import entities.Categorie;
import entities.Chambre;
import entities.Client;
import entities.ModelUser;
import entities.Reservation;
import entities.ReservationStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import service.CategorieService;
import service.ChambreService;
import service.ClientService;
import service.ReservationService;

public class Reservations extends javax.swing.JFrame {

    private final DefaultTableModel model;
    private final ChambreService chambreService;
    private final CategorieService categorieService;
    private final ClientService clientService;
    private final ReservationService reservationService;

    public Reservations(ModelUser user) {
        initComponents();
        DateChangeListener();
        chambreService = new ChambreService();
        categorieService = new CategorieService();
        clientService = new ClientService();
        reservationService = new ReservationService();
        model = (DefaultTableModel) ReservationsTable.getModel();
        remplirComboBoxClients();
        remplirComboBoxRooms();
        remplirComboBoxCategorie();
        userName.setText(user.getUserName());
        loadTable();
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
        ReservationId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReservationsTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        reserver = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        clientComoBox = new javax.swing.JComboBox<>();
        RoomCategorie = new javax.swing.JComboBox<>();
        DateDebut = new com.toedter.calendar.JDateChooser();
        DateFin = new com.toedter.calendar.JDateChooser();
        annulerBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        roomComboBox = new javax.swing.JComboBox<>();
        annulerReservationBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        filterDateDebut = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        filterDateFin = new com.toedter.calendar.JDateChooser();
        filterBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

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

        ReservationId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ReservationId.setEnabled(false);
        ReservationId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservationIdActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Client");

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Catégorie");
        jLabel5.setPreferredSize(new java.awt.Dimension(37, 22));

        ReservationsTable.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        ReservationsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Date Début", "Date Fin", "Client", "Chambre", "Status"
            }
        ));
        ReservationsTable.setGridColor(new java.awt.Color(0, 0, 0));
        ReservationsTable.setRowHeight(25);
        ReservationsTable.setRowMargin(1);
        ReservationsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReservationsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ReservationsTable);
        if (ReservationsTable.getColumnModel().getColumnCount() > 0) {
            ReservationsTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            ReservationsTable.getColumnModel().getColumn(3).setPreferredWidth(80);
        }

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("System Gestion Hotel");

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gestion Réservations");

        reserver.setBackground(new java.awt.Color(0, 204, 0));
        reserver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        reserver.setText("Ajouter");
        reserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserverActionPerformed(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(102, 153, 255));
        updateBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateBtn.setText("Modifier");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(255, 51, 51));
        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteBtn.setText("Supprimer");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Chambre");
        jLabel8.setPreferredSize(new java.awt.Dimension(37, 22));

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Date Début");
        jLabel12.setPreferredSize(new java.awt.Dimension(37, 22));

        RoomCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomCategorieActionPerformed(evt);
            }
        });

        annulerBtn.setBackground(new java.awt.Color(0, 204, 204));
        annulerBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        annulerBtn.setText("Annuler");
        annulerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerBtnActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("Date Fin");
        jLabel13.setPreferredSize(new java.awt.Dimension(37, 22));

        annulerReservationBtn.setBackground(new java.awt.Color(255, 204, 102));
        annulerReservationBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        annulerReservationBtn.setText("Annuler réservation");
        annulerReservationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerReservationBtnActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("Date Début");
        jLabel14.setPreferredSize(new java.awt.Dimension(37, 22));

        jLabel15.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 102));
        jLabel15.setText("Date Fin");
        jLabel15.setPreferredSize(new java.awt.Dimension(37, 22));

        filterBtn.setBackground(new java.awt.Color(255, 153, 51));
        filterBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        filterBtn.setText("Filtrer");
        filterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterBtnActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 204, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Exporter");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(reserver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(annulerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(updateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)))
                                .addComponent(DateFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DateDebut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ReservationId, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(clientComoBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RoomCategorie, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(roomComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(filterDateDebut, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addComponent(filterBtn)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(filterDateFin, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(annulerReservationBtn))
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(298, 298, 298))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(annulerReservationBtn)
                    .addComponent(filterDateFin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(filterBtn)
                        .addComponent(filterDateDebut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ReservationId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clientComoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RoomCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DateDebut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DateFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reserver)
                            .addComponent(updateBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteBtn)
                            .addComponent(annulerBtn))))
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

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtnMouseClicked

    private void ReservationIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservationIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReservationIdActionPerformed

    private void reserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserverActionPerformed

        Date dateDebut = DateDebut.getDate();
        Date dateFin = DateFin.getDate();

        if (dateDebut == null || dateFin == null) {
            showMessageDialog(this, "Veuillez remplir tous les dates pour effectuer une réservation !");
            return;
        }

        if (dateDebut.after(dateFin)) {
            showMessageDialog(this, "La date début doit etre inférieure au date fin !");
            return;
        }

        String clientName = (String) clientComoBox.getSelectedItem();

        if (clientName == null || clientName.isEmpty()) {
            showMessageDialog(this, "Veuillez sélectionner un client !");
            return;
        }

        String[] clientParts = clientName.split(" ");
        if (clientParts.length < 1) {
            showMessageDialog(this, "Nom et prénom du client invalide !");
            return;
        }

        String clientPrenom = clientParts[0];

        Client client = clientService.findByPrenom(clientPrenom);

        if (client == null) {
            showMessageDialog(this, "Client non trouvé !");
            return;
        }

        String chambreNum = (String) roomComboBox.getSelectedItem();

        if (chambreNum == null || chambreNum.isEmpty()) {
            showMessageDialog(this, "Veuillez sélectionner une chambre !");
            return;
        }

        Chambre chambre = chambreService.findByNumero(chambreNum);

        if (chambre == null) {
            showMessageDialog(this, "Chambre non trouvée !");
            return;
        }

        ReservationStatus status = ReservationStatus.ACTIVE;

        Reservation reservation = new Reservation(dateDebut, dateFin, client, chambre, status);

        int rep = showConfirmDialog(this, "Voulez vous vraiment ajouter cette réservation ?");
        if (rep == 0) {
            if (reservationService.creat(reservation)) {
                showMessageDialog(this, "Réservation effectuée avec succès !");
                loadTable();
                cleanForm();
            } else {
                showMessageDialog(this, "Une erreur est survenue lors de la réservation.", "Erreur", ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_reserverActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed

        int selectedRow = ReservationsTable.getSelectedRow();
        if (selectedRow == -1) {
            showMessageDialog(this, "Veuillez sélectionner une réservation à modifier !");
            return;
        }

        Date dateDebut = DateDebut.getDate();
        Date dateFin = DateFin.getDate();

        if (dateDebut == null || dateFin == null) {
            showMessageDialog(this, "Veuillez remplir tous les dates pour modifier la réservation !");
            return;
        }

        if (dateDebut.after(dateFin)) {
            showMessageDialog(this, "La date début doit etre inférieure au date fin !");
            return;
        }

        String clientName = (String) clientComoBox.getSelectedItem();

        if (clientName == null || clientName.isEmpty()) {
            showMessageDialog(this, "Veuillez sélectionner un client !");
            return;
        }

        String[] clientParts = clientName.split(" ");
        if (clientParts.length < 1) {
            showMessageDialog(this, "Nom et prénom du client invalide !");
            return;
        }

        String clientPrenom = clientParts[0];

        Client client = clientService.findByPrenom(clientPrenom);

        if (client == null) {
            showMessageDialog(this, "Client non trouvé !");
            return;
        }

        String chambreNum = (String) roomComboBox.getSelectedItem();

        if (chambreNum == null || chambreNum.isEmpty()) {
            showMessageDialog(this, "Veuillez sélectionner une chambre !");
            return;
        }

        Chambre chambre = chambreService.findByNumero(chambreNum);

        if (chambre == null) {
            showMessageDialog(this, "Chambre non trouvée !");
            return;
        }

        int id = (int) ReservationsTable.getValueAt(selectedRow, 0);
        Reservation reservation = reservationService.findById(id);

        reservation.setDateDebut(dateDebut);
        reservation.setDateFin(dateFin);
        reservation.setClient(client);
        reservation.setChambre(chambre);

        int rep = showConfirmDialog(this, "Voulez vous vraiment modifier cette réservation ?");
        if (rep == 0) {
            if (reservationService.update(reservation)) {
                showMessageDialog(this, "Réservation bien modifiée");
                loadTable();
                cleanForm();
            }
        }

    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int selectedRow = ReservationsTable.getSelectedRow();
        if (selectedRow == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Veuillez sélectionner une reservation à supprimer !");
            return;
        }

        int id = (int) ReservationsTable.getValueAt(selectedRow, 0);
        int reponse = showConfirmDialog(this, "Voulez-vous vraiment supprimer cette reservation ?");
        if (reponse == 0) {

            if (reservationService.delete(reservationService.findById(id))) {
                showMessageDialog(this, "Réservation bien supprimée");
                cleanForm();
                loadTable();
            } else {

                showMessageDialog(this, "Erreur lors de la suppression de la réservation !");
            }

        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void annulerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerBtnActionPerformed
        cleanForm();
    }//GEN-LAST:event_annulerBtnActionPerformed


    private void RoomCategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomCategorieActionPerformed

        updateRoomsByDateAndCategory();
    }//GEN-LAST:event_RoomCategorieActionPerformed

    private void updateRoomsByDateAndCategory() {
        String selectedCategorieLibelle = (String) RoomCategorie.getSelectedItem();
        Date dateDebut = DateDebut.getDate();
        Date dateFin = DateFin.getDate();

        // Vérifier que la catégorie est sélectionnée
        if (selectedCategorieLibelle != null && !selectedCategorieLibelle.isEmpty()) {
            Categorie selectedCategorie = categorieService.findByLibelle(selectedCategorieLibelle);

            if (selectedCategorie != null) {
                List<Chambre> availableRooms;

                // Si les dates sont sélectionnées et valides
                if (dateDebut != null && dateFin != null && !dateDebut.after(dateFin)) {
                    availableRooms = chambreService.findAvailableRoomsByDatesAndCategory(
                            selectedCategorie.getId(), dateDebut, dateFin
                    );
                } else {
                    // Si les dates ne sont pas sélectionnées, filtrer uniquement par catégorie
                    availableRooms = chambreService.findAvailableRooms(selectedCategorie.getId());
                }

                // Mettre à jour le comboBox des chambres
                roomComboBox.removeAllItems();
                for (Chambre chambre : availableRooms) {
                    roomComboBox.addItem(chambre.getNumero());
                }
            }
        } else {
            roomComboBox.removeAllItems(); // Vider le comboBox si aucune catégorie n'est sélectionnée
        }
    }


    private void ReservationsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReservationsTableMouseClicked

        /*int selectedRow = ReservationsTable.getSelectedRow();
        if (selectedRow != -1) {
            int id = (int) ReservationsTable.getValueAt(selectedRow, 0);

            // Récupérer la date de début et la date de fin sous forme de String
            String dateDebutString = (String) ReservationsTable.getValueAt(selectedRow, 1);
            String dateFinString = (String) ReservationsTable.getValueAt(selectedRow, 2);

            // Convertir les chaînes en objets Date
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  // Adaptez ce format à votre cas
            Date dateDebut = null;
            Date dateFin = null;

            try {
                dateDebut = dateFormat.parse(dateDebutString);
                dateFin = dateFormat.parse(dateFinString);
            } catch (ParseException e) {
                e.printStackTrace();
                // Vous pouvez afficher un message d'erreur ou utiliser une date par défaut en cas d'erreur
            }

            // Récupérer les autres valeurs
            String client = ReservationsTable.getValueAt(selectedRow, 3).toString();
            String room = ReservationsTable.getValueAt(selectedRow, 4).toString();

            // Trouver la chambre par numéro
            Chambre chambre = chambreService.findByNumero(room);
            Categorie cat = chambre != null ? chambre.getCategorie() : null;

            // Remplir les champs avec les données
            ReservationId.setText(String.valueOf(id));
            if (dateDebut != null) {
                DateDebut.setDate(dateDebut);
            }
            if (dateFin != null) {
                DateFin.setDate(dateFin);
            }
            clientComoBox.setSelectedItem(client);
            if (cat != null) {
                RoomCategorie.setSelectedItem(cat.getLibelle());  // Assurez-vous que c'est le libellé de la catégorie
            }
            roomComboBox.setSelectedItem(room);
        }*/
        int selectedRow = ReservationsTable.getSelectedRow();
        if (selectedRow != -1) {

            // Récuperer l'ID
            int id = (int) ReservationsTable.getValueAt(selectedRow, 0);

            // Récupérer la date de début et la date de fin sous forme de String
            String dateDebutString = (String) ReservationsTable.getValueAt(selectedRow, 1);
            String dateFinString = (String) ReservationsTable.getValueAt(selectedRow, 2);

            // Convertir les chaînes en objets Date
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date dateDebut = null;
            Date dateFin = null;

            try {
                dateDebut = dateFormat.parse(dateDebutString);
                dateFin = dateFormat.parse(dateFinString);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            // Récupérer les autres valeurs
            String client = ReservationsTable.getValueAt(selectedRow, 3).toString();
            String room = ReservationsTable.getValueAt(selectedRow, 4).toString();

            if (room == null || room.isEmpty()) {
                System.out.println("Erreur : aucune chambre n'est assignée pour cette réservation.");
                return;
            }
            // Trouver la chambre actuelle par numéro
            Chambre chambre = chambreService.findByNumero(room);
            Categorie categorie = chambre != null ? chambre.getCategorie() : null;

            // Récupérer les chambres disponibles en fonction de la catégorie et des dates
            List<Chambre> availableRooms = new ArrayList<>();
            if (categorie != null) {
                availableRooms = chambreService.findAvailableRoomsByDatesAndCategory(categorie.getId(), dateDebut, dateFin);

                // Ajouter la chambre actuelle si elle n'est pas déjà dans la liste
                if (chambre != null && !availableRooms.contains(chambre)) {
                    availableRooms.add(chambre);
                }
            }

            // Mettre à jour le combobox avec les chambres disponibles
            /*roomComboBox.removeAllItems();
            for (Chambre availableRoom : availableRooms) {
                roomComboBox.addItem(availableRoom.getNumero());
            }*/
            // Remplir les champs avec les données de la réservation sélectionnée
            ReservationId.setText(String.valueOf(id));
            if (dateDebut != null) {
                DateDebut.setDate(dateDebut);
            }
            if (dateFin != null) {
                DateFin.setDate(dateFin);
            }
            clientComoBox.setSelectedItem(client);
            if (categorie != null) {
                RoomCategorie.setSelectedItem(categorie.getLibelle());
            }
            roomComboBox.setSelectedItem(room); // Sélectionner la chambre actuelle
        }

    }//GEN-LAST:event_ReservationsTableMouseClicked

    private void annulerReservationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerReservationBtnActionPerformed
        int selectedRow = ReservationsTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Veuillez sélectionner une réservation à annuler !");
            return;
        }

        int reservationId = (int) ReservationsTable.getValueAt(selectedRow, 0);
        int confirmation = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment annuler cette réservation ?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirmation == JOptionPane.YES_OPTION) {
            if (reservationService.updateStatus(reservationId, ReservationStatus.ANNULEE)) {
                JOptionPane.showMessageDialog(this, "Réservation annulée avec succès !");
                loadTable(); // Recharger la table avec les réservations actives
            } else {
                JOptionPane.showMessageDialog(this, "Erreur lors de l'annulation de la réservation !");
            }
        }
    }//GEN-LAST:event_annulerReservationBtnActionPerformed

    private void filterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterBtnActionPerformed
        Date startDate = filterDateDebut.getDate();
        Date endDate = filterDateFin.getDate();

        if (startDate == null || endDate == null) {
            JOptionPane.showMessageDialog(this, "Veuillez sélectionner les deux dates !");
            return;
        }

        if (startDate.after(endDate)) {
            JOptionPane.showMessageDialog(this, "La date de début doit être antérieure ou égale à la date de fin !");
            return;
        }

        List<Reservation> filteredReservations = reservationService.findByDateRange(startDate, endDate);
        loadTable(filteredReservations);
    }//GEN-LAST:event_filterBtnActionPerformed

    private void loadTable(List<Reservation> reservations) {
        DefaultTableModel model = (DefaultTableModel) ReservationsTable.getModel();
        model.setRowCount(0); // Effacer les lignes existantes

        for (Reservation reservation : reservations) {
            String dateDebut = (reservation.getDateDebut() != null) ? reservation.getDateDebut().toString() : "N/A";
            String dateFin = (reservation.getDateFin() != null) ? reservation.getDateFin().toString() : "N/A";
            String clientName = (reservation.getClient() != null) ? reservation.getClient().getPrenom() + " " + reservation.getClient().getNom() : "Non défini";
            String chambreNumero = (reservation.getChambre() != null) ? reservation.getChambre().getNumero() : "Non défini";

            model.addRow(new Object[]{
                reservation.getId(),
                dateDebut,
                dateFin,
                clientName,
                chambreNumero,
                reservation.getStatus()
            });
        }
    }

    private void DateChangeListener() {
        DateDebut.addPropertyChangeListener("date", evt -> updateRoomsByDateAndCategory());
        DateFin.addPropertyChangeListener("date", evt -> updateRoomsByDateAndCategory());
    }

    public static void main(ModelUser user) {
        java.awt.EventQueue.invokeLater(() -> {
            new Reservations(user).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateDebut;
    private com.toedter.calendar.JDateChooser DateFin;
    private javax.swing.JTextField ReservationId;
    private javax.swing.JTable ReservationsTable;
    private javax.swing.JComboBox<String> RoomCategorie;
    private javax.swing.JButton annulerBtn;
    private javax.swing.JButton annulerReservationBtn;
    private javax.swing.JComboBox<String> clientComoBox;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton filterBtn;
    private com.toedter.calendar.JDateChooser filterDateDebut;
    private com.toedter.calendar.JDateChooser filterDateFin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JButton reserver;
    private javax.swing.JComboBox<String> roomComboBox;
    private javax.swing.JButton updateBtn;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables

    private void remplirComboBoxClients() {
        List<Client> clients = clientService.findAll();

        clientComoBox.removeAllItems();

        for (Client client : clients) {
            clientComoBox.addItem(client.getPrenom() + " " + client.getNom());
        }
    }

    private void remplirComboBoxRooms() {
        List<Chambre> chambres = chambreService.findAll();

        roomComboBox.removeAllItems();

        for (Chambre chambre : chambres) {
            roomComboBox.addItem(chambre.getNumero());
        }
    }

    /*private void remplirComboBoxCategorie() {
        List<Categorie> categories = categorieService.findAll();

        RoomCategorie.removeAllItems();

        for (Categorie categorie : categories) {
            RoomCategorie.addItem(categorie.getLibelle());
        }
    }*/
    private void loadTable() {
        model.setRowCount(0);

        for (Reservation reservation : reservationService.findAll()) {

            String dateDebut = (reservation.getDateDebut() != null) ? reservation.getDateDebut().toString() : "N/A";
            String dateFin = (reservation.getDateFin() != null) ? reservation.getDateFin().toString() : "N/A";
            String clientName = (reservation.getClient() != null) ? reservation.getClient().getPrenom() + " " + reservation.getClient().getNom() : "Non défini";
            String chambreNumero = (reservation.getChambre() != null) ? reservation.getChambre().getNumero() : "Non défini";

            model.addRow(new Object[]{
                reservation.getId(),
                dateDebut,
                dateFin,
                clientName,
                chambreNumero,
                reservation.getStatus()
            });
        }
    }

    private void cleanForm() {

        ReservationId.setText("");
        DateDebut.setDate(null);
        DateFin.setDate(null);
        clientComoBox.setSelectedIndex(-1);
        roomComboBox.setSelectedIndex(-1);
        RoomCategorie.setSelectedIndex(-1);
    }

    private void remplirComboBoxCategorie() {
        List<Categorie> categories = categorieService.findAll();

        RoomCategorie.removeAllItems();

        for (Categorie categorie : categories) {
            RoomCategorie.addItem(categorie.getLibelle());
        }
    }
}
