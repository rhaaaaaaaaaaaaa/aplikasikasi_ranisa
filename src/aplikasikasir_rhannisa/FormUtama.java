/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasikasir_rhannisa;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class FormUtama extends javax.swing.JFrame {
Connection konek;
PreparedStatement pst;
ResultSet rst;
    /**
     * Creates new form FormUtama
     */
    public FormUtama() {
        initComponents();
        konek = Koneksi.koneksiDB();
        mulai();
        tampilWaktu();
        
    }
public void mulai(){
        Register.setEnabled(false);
        Logout.setEnabled(false);
        Master.setEnabled(false);
        Transaksi.setEnabled(false);
        Laporan.setEnabled(false);
        txtJam.setEnabled(false);
        txtTanggal.setEnabled(false);
        FormLogin.setVisible(false);
        btnRegister.setEnabled(false);
        btnProduk.setEnabled(false);
        btnPelanggan.setEnabled(false);
        btnPenjualan.setEnabled(false);
    }
    
    public void tampilWaktu(){
        Thread clock=new Thread(){
            public void run(){
                for(;;){
                    Calendar cal = Calendar.getInstance();
                    SimpleDateFormat Jam = new SimpleDateFormat("hh:mm:ss");
                    SimpleDateFormat Tanggal = new SimpleDateFormat("dd-MM-yyyy");
                    txtJam.setText(Jam.format(cal.getTime()));
                    txtTanggal.setText(Tanggal.format(cal.getTime()));
                }
            }
        };
        clock.start();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegister = new javax.swing.JButton();
        lbluser = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnPelanggan = new javax.swing.JButton();
        btnProduk = new javax.swing.JButton();
        btnPenjualan = new javax.swing.JButton();
        txtTanggal = new javax.swing.JTextField();
        txtJam = new javax.swing.JTextField();
        FormLogin = new javax.swing.JInternalFrame();
        jLabel3 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        cmbAkses = new javax.swing.JComboBox<>();
        btnBatal = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Beranda = new javax.swing.JMenu();
        Register = new javax.swing.JMenuItem();
        Logout = new javax.swing.JMenuItem();
        Login = new javax.swing.JMenuItem();
        Master = new javax.swing.JMenu();
        Pelanggan = new javax.swing.JMenuItem();
        Produk = new javax.swing.JMenuItem();
        Transaksi = new javax.swing.JMenu();
        Penjualan = new javax.swing.JMenuItem();
        Laporan = new javax.swing.JMenu();
        RcpLaporan = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("form kasir Rhannisa ( Menu Utama)");

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        btnRegister.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-register-30.png"))); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        lbluser.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lbluser.setText("Selamat Datang Anda Bisa Login Terlebih Dahulu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnRegister)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbluser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbluser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegister)
                .addGap(37, 37, 37))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        btnPelanggan.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnPelanggan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-customer-30.png"))); // NOI18N
        btnPelanggan.setText("Pelanggan");
        btnPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPelangganActionPerformed(evt);
            }
        });

        btnProduk.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnProduk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-product-30.png"))); // NOI18N
        btnProduk.setText("Produk");
        btnProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdukActionPerformed(evt);
            }
        });

        btnPenjualan.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-sale-30_1.png"))); // NOI18N
        btnPenjualan.setText("Penjualan");
        btnPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPenjualanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnPelanggan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnPenjualan)
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPelanggan)
                    .addComponent(btnProduk)
                    .addComponent(btnPenjualan))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        txtTanggal.setBackground(new java.awt.Color(204, 204, 255));

        txtJam.setBackground(new java.awt.Color(204, 204, 255));

        FormLogin.setVisible(true);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-password-20 (1).png"))); // NOI18N
        jLabel3.setText("Password");

        txtPassword.setText("jPasswordField1");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-access-20 (1).png"))); // NOI18N
        jLabel4.setText("Hak Akses");

        cmbAkses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih Salah Satu-", "Admin", "Petugas", "" }));
        cmbAkses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAksesActionPerformed(evt);
            }
        });

        btnBatal.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-list-20.png"))); // NOI18N
        btnBatal.setText("BATAL");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-login-20 (2)_2.png"))); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-login-20 (2)_2.png"))); // NOI18N
        jLabel2.setText("FORM LOGIN");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(148, 148, 148))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/username.png"))); // NOI18N
        jLabel5.setText("Username");

        javax.swing.GroupLayout FormLoginLayout = new javax.swing.GroupLayout(FormLogin.getContentPane());
        FormLogin.getContentPane().setLayout(FormLoginLayout);
        FormLoginLayout.setHorizontalGroup(
            FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FormLoginLayout.createSequentialGroup()
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormLoginLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel4)
                        .addGap(29, 29, 29)
                        .addComponent(cmbAkses, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FormLoginLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(btnBatal)
                        .addGap(6, 6, 6)
                        .addComponent(btnLogin))
                    .addGroup(FormLoginLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(FormLoginLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(26, 26, 26)
                                .addComponent(txtusername))
                            .addGroup(FormLoginLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 78, Short.MAX_VALUE))
        );
        FormLoginLayout.setVerticalGroup(
            FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormLoginLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormLoginLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5))
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormLoginLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3))
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormLoginLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4))
                    .addComponent(cmbAkses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        Beranda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-home-30.png"))); // NOI18N
        Beranda.setText("Beranda");
        Beranda.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        Register.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Register.setText("Register");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        Beranda.add(Register);

        Logout.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Logout.setText("Log Out");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        Beranda.add(Logout);

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        Beranda.add(Login);

        jMenuBar1.add(Beranda);

        Master.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-master-30.png"))); // NOI18N
        Master.setText("Master");
        Master.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        Pelanggan.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Pelanggan.setText("Pelanggan");
        Pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PelangganActionPerformed(evt);
            }
        });
        Master.add(Pelanggan);

        Produk.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Produk.setText("Produk");
        Produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdukActionPerformed(evt);
            }
        });
        Master.add(Produk);

        jMenuBar1.add(Master);

        Transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-transaction-30.png"))); // NOI18N
        Transaksi.setText("Transaksi");
        Transaksi.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        Penjualan.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Penjualan.setText("Penjualan");
        Transaksi.add(Penjualan);

        jMenuBar1.add(Transaksi);

        Laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-report-30.png"))); // NOI18N
        Laporan.setText("Laporan");
        Laporan.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        RcpLaporan.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        RcpLaporan.setText("Recap Laporan");
        RcpLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RcpLaporanActionPerformed(evt);
            }
        });
        Laporan.add(RcpLaporan);

        jMenuBar1.add(Laporan);

        Help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-about-30.png"))); // NOI18N
        Help.setText("Help");
        Help.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpActionPerformed(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jMenuItem1.setText("Tentang");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Help.add(jMenuItem1);

        jMenuBar1.add(Help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FormLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtJam, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(FormLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
new FormRegister().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
new FormUtama().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutActionPerformed

    private void PelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PelangganActionPerformed
new FormPenjualan().setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_PelangganActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
FormLogin.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_LoginActionPerformed

    private void ProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdukActionPerformed
new FormProduk().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_ProdukActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
new FormRegister().setVisible(true);                // TODO add your handling code here:
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdukActionPerformed
new FormProduk().setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_btnProdukActionPerformed

    private void btnPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPelangganActionPerformed
new FormPelanggan().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnPelangganActionPerformed

    private void btnPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPenjualanActionPerformed
new FormPenjualan().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_btnPenjualanActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
new FormUtama().setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
try{
    String sql = "select * from login where Username='"+txtusername.getText()+"' and Password='"+txtPassword.getText()+"' and HakAkses='"+cmbAkses.getSelectedItem()+"'";
    pst = konek.prepareStatement(sql);
    rst = pst.executeQuery();
    if(rst.next()){
    if(txtusername.getText().equals(rst.getString("username"))&& txtPassword.getText().equals(rst.getString("Password"))&&cmbAkses.getSelectedItem().equals(rst.getString("HakAkses")));
    if(cmbAkses.getSelectedItem().equals("Admin")){
        Register.setEnabled(true);
                         Logout.setEnabled(true);
                         Master.setEnabled(true);
                         Transaksi.setEnabled(true);
                         Laporan.setEnabled(true);
                         txtJam.setEnabled(false);
                         txtTanggal.setEnabled(false);
                         FormLogin.setVisible(false);
                         btnRegister.setEnabled(true);
                         btnProduk.setEnabled(true);
                         btnPelanggan.setEnabled(true);
                         btnPenjualan.setEnabled(true);
                     } else if (cmbAkses.getSelectedItem().equals("Petugas")){
                         Register.setEnabled(false);
                         Logout.setEnabled(true);
                         Master.setEnabled(true);
                         Transaksi.setEnabled(true);
                         Laporan.setEnabled(true);
                         txtJam.setEnabled(false);
                         txtTanggal.setEnabled(false);
                         FormLogin.setVisible(false);
                         btnRegister.setEnabled(false);
                         btnProduk.setEnabled(true);
                         btnPelanggan.setEnabled(true);
                         btnPenjualan.setEnabled(true);
                     }
        {
            JOptionPane.showMessageDialog(null, "Selamat Datang '"+txtusername.getText()+"'");
            String text = txtusername.getText();
            lbluser.setText(text);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Gagal Login. Periksa kembali Username, Password dan Hak Akses");
        txtusername.setText("");
        txtPassword.setText("");
        cmbAkses.setSelectedItem("-Pilih Salah Satu");
    }
} catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);   
    }
// TODO add your handling code here:
    }//GEN-LAST:event_btnLoginActionPerformed

    private void cmbAksesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAksesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAksesActionPerformed

    private void RcpLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RcpLaporanActionPerformed
new formlaptransaksi().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_RcpLaporanActionPerformed

    private void HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_HelpActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       new formabout().setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Beranda;
    private javax.swing.JInternalFrame FormLogin;
    private javax.swing.JMenu Help;
    private javax.swing.JMenu Laporan;
    private javax.swing.JMenuItem Login;
    private javax.swing.JMenuItem Logout;
    private javax.swing.JMenu Master;
    private javax.swing.JMenuItem Pelanggan;
    private javax.swing.JMenuItem Penjualan;
    private javax.swing.JMenuItem Produk;
    private javax.swing.JMenuItem RcpLaporan;
    private javax.swing.JMenuItem Register;
    private javax.swing.JMenu Transaksi;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnPelanggan;
    private javax.swing.JButton btnPenjualan;
    private javax.swing.JButton btnProduk;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cmbAkses;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbluser;
    private javax.swing.JTextField txtJam;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTanggal;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}