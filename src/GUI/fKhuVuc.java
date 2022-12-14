/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.daoKhuVuc;
import DTO.KhuVuc;
import DTO.LoaiKho;
import java.awt.Image;
import java.awt.Toolkit;
import java.lang.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VIENTHONGA
 */
public class fKhuVuc extends javax.swing.JFrame {

    /**
     * Creates new form JKhuVuc
     */
    public int id_nv;
    public ArrayList<KhuVuc> DuLieuMau;
    public ArrayList<KhuVuc> DanhSachKhuVuc;

    public fKhuVuc() {
        initComponents();
        setIcon();
        build();
    }

    public fKhuVuc(int id_nv) {
        this.id_nv = id_nv;
        DuLieuMau = daoKhuVuc.getInstance().getListKhuVuc();
        initComponents();
        setIcon();
        build();
    }

    public void build() {
        DanhSachKhuVuc = DuLieuMau;
        jLabelKetQua.setText("Có tổng cộng " + DanhSachKhuVuc.size() + " kết quả");
        DefaultTableModel model = (DefaultTableModel) jTableKhuVuc.getModel();
        while (jTableKhuVuc.getRowCount() > 0) {
            model.removeRow(0);
        }
        DanhSachKhuVuc.stream().forEach((item) -> {
            LoaiKho lk = DAO.daoLoaiKho.getInstance().getLoaiKho(item.id_loai_kho);
            model.addRow(new Object[]{item.id_khu_vuc, item.ten_khu_vuc, item.vi_tri, lk.ten_loai_kho});
        });
        jButtonSua.setEnabled(false);
        jButtonHuy.setEnabled(false);
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/Logo2.png")));
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
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButtonHuy = new javax.swing.JButton();
        jButtonSua = new javax.swing.JButton();
        jButtonThem = new javax.swing.JButton();
        jButtonTimKiem = new javax.swing.JButton();
        jLabelKetQua = new javax.swing.JLabel();
        jButtonLamMoi = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableKhuVuc = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Khu vực");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButtonHuy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonHuy.setText("Hủy");
        ImageIcon imgHuy = new ImageIcon(getClass().getResource("/icon/icons8-waste-48.png"));
        ImageIcon ImgHuy = new ImageIcon(imgHuy.getImage().getScaledInstance(19, 19, Image.SCALE_SMOOTH));
        jButtonHuy.setIcon(ImgHuy);
        jButtonHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHuyActionPerformed(evt);
            }
        });

        jButtonSua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSua.setText("Sửa");
        ImageIcon imgSua = new ImageIcon(getClass().getResource("/icon/icons8-maintenance-48.png"));
        ImageIcon ImgSua = new ImageIcon(imgSua.getImage().getScaledInstance(19, 19, Image.SCALE_SMOOTH));
        jButtonSua.setIcon(ImgSua);
        jButtonSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuaActionPerformed(evt);
            }
        });

        jButtonThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonThem.setText("Tạo");
        ImageIcon imgTaoMoi = new ImageIcon(getClass().getResource("/icon/icons8-plus-48.png"));
        ImageIcon ImgTaoMoi = new ImageIcon(imgTaoMoi.getImage().getScaledInstance(19, 19, Image.SCALE_SMOOTH));
        jButtonThem.setIcon(ImgTaoMoi);
        jButtonThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonThembtnThemnhacungcap(evt);
            }
        });
        jButtonThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemjButton2ActionPerformed(evt);
            }
        });

        jButtonTimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ImageIcon imgTimKiem = new ImageIcon(getClass().getResource("/icon/icons8-search.png"));
        ImageIcon ImgTimKiem = new ImageIcon(imgTimKiem.getImage().getScaledInstance(19, 19, Image.SCALE_SMOOTH));
        jButtonTimKiem.setIcon(ImgTimKiem);
        jButtonTimKiem.setText("Tìm kiếm");
        jButtonTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTimKiemActionPerformed(evt);
            }
        });

        jLabelKetQua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelKetQua.setForeground(new java.awt.Color(255, 255, 255));
        jLabelKetQua.setText("Có tổng cộng 000 kết quả");

        jButtonLamMoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ImageIcon imgLamMoi = new ImageIcon(getClass().getResource("/icon/icons8-synchronize-30.png"));
        ImageIcon ImgLamMoi = new ImageIcon(imgLamMoi.getImage().getScaledInstance(19, 19, Image.SCALE_SMOOTH));
        jButtonLamMoi.setIcon(ImgLamMoi);
        jButtonLamMoi.setText("Tải lại");
        jButtonLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLamMoiActionPerformed(evt);
            }
        });

        jTableKhuVuc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Tên khu vực", "Vị trí", "Loại kho"
            }
        ));
        jTableKhuVuc.setRowHeight(20);
        jTableKhuVuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableKhuVucMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableKhuVuc);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonHuy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonTimKiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLamMoi))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelKetQua))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonLamMoi, jButtonTimKiem});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTimKiem)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonThem)
                    .addComponent(jButtonSua)
                    .addComponent(jButtonHuy)
                    .addComponent(jButtonLamMoi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelKetQua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonLamMoi, jButtonTimKiem});

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Phần mềm quản lý kho");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("siêu thị S.O.S");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jLabel2))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 422, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButtonHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHuyActionPerformed
        int selectedRowIndex = jTableKhuVuc.getSelectedRow();
        int id = jTableKhuVuc.getValueAt(selectedRowIndex, 0).hashCode();
        JFrame ThongBao = new fThongBaoHuy("KhuVuc", id, id_nv);
        ThongBao.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonHuyActionPerformed

    private void jButtonSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaActionPerformed
        int selectedRowIndex = jTableKhuVuc.getSelectedRow();
        int id = jTableKhuVuc.getValueAt(selectedRowIndex, 0).hashCode();
        JFrame Xem = new fCreateKhuVuc(id_nv, true, id);
        Xem.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSuaActionPerformed

    private void jButtonThembtnThemnhacungcap(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonThembtnThemnhacungcap
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonThembtnThemnhacungcap

    private void jButtonThemjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemjButton2ActionPerformed
        JFrame Them = new fCreateKhuVuc(id_nv, false, 0);
        Them.setVisible(true);
    }//GEN-LAST:event_jButtonThemjButton2ActionPerformed

    private void jButtonTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimKiemActionPerformed
        DanhSachKhuVuc = DuLieuMau;
        //FindList();
        jButtonSua.setEnabled(false);
        jButtonHuy.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonTimKiemActionPerformed

    private void jButtonLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLamMoiActionPerformed
        invalidate();
        validate();
        repaint();
        DuLieuMau = daoKhuVuc.getInstance().getListKhuVuc();
        build();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLamMoiActionPerformed

    private void jTableKhuVucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableKhuVucMouseClicked
        jButtonSua.setEnabled(true);
        jButtonHuy.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableKhuVucMouseClicked

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
            java.util.logging.Logger.getLogger(fKhuVuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fKhuVuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fKhuVuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fKhuVuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fKhuVuc(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonHuy;
    private javax.swing.JButton jButtonLamMoi;
    private javax.swing.JButton jButtonSua;
    private javax.swing.JButton jButtonThem;
    private javax.swing.JButton jButtonTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelKetQua;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableKhuVuc;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
