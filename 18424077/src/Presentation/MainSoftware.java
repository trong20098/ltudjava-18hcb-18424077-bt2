/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.awt.Dimension;
import javax.swing.*;

/**
 *
 * @author Nguy Minh Trong
 */
public class MainSoftware extends javax.swing.JFrame {

    private final String username = null;
    private static String user;

    /**
     * Creates new form MainSoftware
     *
     * @param username
     */
    public MainSoftware(String username) {
        initComponents();
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        btnDangNhap.setVisible(false);
        user = username;
        this.setTitle(username);
        if (username.equals("giaovu")) {
            pnThongTinChung.setVisible(true);
            pnChucNang.setVisible(true);
            pnHoTro.setVisible(true);
            btnXemDiem.setVisible(false);
        } else {
            pnThongTinChung.setVisible(true);
            pnChucNang.setVisible(false);
            pnHoTro.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnThongTinChung = new javax.swing.JPanel();
        btnChangePassword = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        btnXemDiem = new javax.swing.JButton();
        btnDangNhap = new javax.swing.JButton();
        pnChucNang = new javax.swing.JPanel();
        btnDanhSachLop = new javax.swing.JButton();
        btnThoiKhoaBieu = new javax.swing.JButton();
        btnDiem = new javax.swing.JButton();
        btnLopMonHoc = new javax.swing.JButton();
        btnPhucKhao = new javax.swing.JButton();
        pnHoTro = new javax.swing.JPanel();
        btnThoat = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Sinh Viên");
        setName("frmQuanLySinhVIen"); // NOI18N

        pnThongTinChung.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin chung"));
        pnThongTinChung.setName(""); // NOI18N

        btnChangePassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnChangePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/administrator-icon.png"))); // NOI18N
        btnChangePassword.setText("Đổi Mật Khẩu");
        btnChangePassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnChangePassword.setFocusPainted(false);
        btnChangePassword.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChangePassword.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        btnDangXuat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ModernXP-02-System-Power-icon.png"))); // NOI18N
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDangXuat.setFocusPainted(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        btnXemDiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnXemDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Desktop-My-Documents-icon.png"))); // NOI18N
        btnXemDiem.setText("Xem Điểm Sinh Viên");
        btnXemDiem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXemDiem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnXemDiem.setOpaque(false);
        btnXemDiem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnXemDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemDiemActionPerformed(evt);
            }
        });

        btnDangNhap.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login-icon.png"))); // NOI18N
        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDangNhap.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangNhap.setOpaque(false);
        btnDangNhap.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout pnThongTinChungLayout = new javax.swing.GroupLayout(pnThongTinChung);
        pnThongTinChung.setLayout(pnThongTinChungLayout);
        pnThongTinChungLayout.setHorizontalGroup(
            pnThongTinChungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongTinChungLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXemDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        pnThongTinChungLayout.setVerticalGroup(
            pnThongTinChungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongTinChungLayout.createSequentialGroup()
                .addGroup(pnThongTinChungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnChangePassword, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXemDiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnChucNang.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));

        btnDanhSachLop.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDanhSachLop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Danh-sach-lop.png"))); // NOI18N
        btnDanhSachLop.setText("Danh Sách Lớp");
        btnDanhSachLop.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDanhSachLop.setFocusPainted(false);
        btnDanhSachLop.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDanhSachLop.setMaximumSize(new java.awt.Dimension(70, 75));
        btnDanhSachLop.setMinimumSize(new java.awt.Dimension(70, 73));
        btnDanhSachLop.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDanhSachLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhSachLopActionPerformed(evt);
            }
        });

        btnThoiKhoaBieu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnThoiKhoaBieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/calendar-icon.png"))); // NOI18N
        btnThoiKhoaBieu.setText("Thời Khóa Biểu");
        btnThoiKhoaBieu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThoiKhoaBieu.setFocusPainted(false);
        btnThoiKhoaBieu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThoiKhoaBieu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThoiKhoaBieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoiKhoaBieuActionPerformed(evt);
            }
        });

        btnDiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/graduated-icon.png"))); // NOI18N
        btnDiem.setText("Điểm");
        btnDiem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDiem.setFocusPainted(false);
        btnDiem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDiem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiemActionPerformed(evt);
            }
        });

        btnLopMonHoc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnLopMonHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Book1.png"))); // NOI18N
        btnLopMonHoc.setText("Lớp Môn Học");
        btnLopMonHoc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLopMonHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLopMonHoc.setOpaque(false);
        btnLopMonHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLopMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLopMonHocActionPerformed(evt);
            }
        });

        btnPhucKhao.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnPhucKhao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/phuckhao.jpg"))); // NOI18N
        btnPhucKhao.setText("Phúc Khảo");
        btnPhucKhao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPhucKhao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPhucKhao.setOpaque(false);
        btnPhucKhao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout pnChucNangLayout = new javax.swing.GroupLayout(pnChucNang);
        pnChucNang.setLayout(pnChucNangLayout);
        pnChucNangLayout.setHorizontalGroup(
            pnChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChucNangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDanhSachLop, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThoiKhoaBieu, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLopMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPhucKhao, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );
        pnChucNangLayout.setVerticalGroup(
            pnChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChucNangLayout.createSequentialGroup()
                .addGroup(pnChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDanhSachLop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThoiKhoaBieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLopMonHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPhucKhao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnHoTro.setBorder(javax.swing.BorderFactory.createTitledBorder("Hỗ trợ"));

        btnThoat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Alarm-Error-icon.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThoat.setFocusPainted(false);
        btnThoat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThoat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnHoTroLayout = new javax.swing.GroupLayout(pnHoTro);
        pnHoTro.setLayout(pnHoTroLayout);
        pnHoTroLayout.setHorizontalGroup(
            pnHoTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHoTroLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnHoTroLayout.setVerticalGroup(
            pnHoTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHoTroLayout.createSequentialGroup()
                .addComponent(btnThoat)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jDesktopPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDesktopPane1.setDragMode(javax.swing.JDesktopPane.OUTLINE_DRAG_MODE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnThongTinChung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnHoTro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnThongTinChung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnHoTro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnDanhSachLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhSachLopActionPerformed
        Student st = new Student();
        st.setVisible(true);
        jDesktopPane1.removeAll();
        jDesktopPane1.add(st);
    }//GEN-LAST:event_btnDanhSachLopActionPerformed

    private void btnThoiKhoaBieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoiKhoaBieuActionPerformed
        Scheduled sc = new Scheduled();
        sc.setVisible(true);
        jDesktopPane1.removeAll();
        jDesktopPane1.add(sc);
    }//GEN-LAST:event_btnThoiKhoaBieuActionPerformed

    private void btnDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiemActionPerformed
        StudyResult sr = new StudyResult();
        sr.setVisible(true);
        jDesktopPane1.removeAll();
        jDesktopPane1.add(sr);
    }//GEN-LAST:event_btnDiemActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        ChangePassword cp = new ChangePassword(user);
        cp.setVisible(true);
        jDesktopPane1.removeAll();
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension internalFramesize = cp.getSize();
        cp.setLocation((desktopSize.width - internalFramesize.width) / 2, (desktopSize.height - internalFramesize.height) / 2);
        jDesktopPane1.add(cp);
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        pnChucNang.setVisible(false);
        pnHoTro.setVisible(false);
        pnThongTinChung.setVisible(false);
        Login lg = new Login();
        lg.setVisible(true);
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnXemDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemDiemActionPerformed

    }//GEN-LAST:event_btnXemDiemActionPerformed

    private void btnLopMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLopMonHocActionPerformed
        ClassSubjects cs = new ClassSubjects();
        cs.setVisible(true);
        jDesktopPane1.removeAll();
        jDesktopPane1.add(cs);
    }//GEN-LAST:event_btnLopMonHocActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDanhSachLop;
    private javax.swing.JButton btnDiem;
    private javax.swing.JButton btnLopMonHoc;
    private javax.swing.JButton btnPhucKhao;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnThoiKhoaBieu;
    private javax.swing.JButton btnXemDiem;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel pnChucNang;
    private javax.swing.JPanel pnHoTro;
    private javax.swing.JPanel pnThongTinChung;
    // End of variables declaration//GEN-END:variables
}
