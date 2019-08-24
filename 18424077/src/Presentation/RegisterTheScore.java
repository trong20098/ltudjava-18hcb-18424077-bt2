/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.awt.Dimension;
import java.awt.Toolkit;
import ValueObjects.*;
import BussinessLogicLayers.BLL.*;
import java.time.*;
import java.util.Date;
import java.util.List;
import javax.swing.*;

/**
 *
 * @author Nguy Minh Trong
 */
public class RegisterTheScore extends javax.swing.JFrame {

    /**
     * Creates new form RegisterTheScore
     */
    public RegisterTheScore() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPhucKhaoDiem = new javax.swing.JLabel();
        lblMSSV = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        lblMonThi = new javax.swing.JLabel();
        lblCotDiem = new javax.swing.JLabel();
        lblDiemMongMuon = new javax.swing.JLabel();
        lblLido = new javax.swing.JLabel();
        txtMSSV = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtMonThi = new javax.swing.JTextField();
        txtCotDiemCanPhucKhao = new javax.swing.JTextField();
        txtDiemMongMuon = new javax.swing.JTextField();
        txtLydo = new javax.swing.JTextField();
        btnDangKy = new javax.swing.JButton();
        cbbLopMonHoc = new javax.swing.JComboBox<>();
        lblLopMonHoc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblPhucKhaoDiem.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblPhucKhaoDiem.setForeground(new java.awt.Color(255, 0, 0));
        lblPhucKhaoDiem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhucKhaoDiem.setText("PHÚC KHẢO ĐIỂM");
        lblPhucKhaoDiem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblMSSV.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblMSSV.setText("Mã số sinh viên: ");

        lblHoTen.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblHoTen.setText("Họ tên sinh viên:");

        lblMonThi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblMonThi.setText("Môn thi: ");

        lblCotDiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblCotDiem.setText("Cột Điểm Cần Phúc Khảo: ");

        lblDiemMongMuon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDiemMongMuon.setText(" Điểm Mong Muốn:");

        lblLido.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblLido.setText("Lý Do Rõ Ràng Cụ Thể:");

        txtMonThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMonThiActionPerformed(evt);
            }
        });

        btnDangKy.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDangKy.setText("Đăng Ký Phúc Khảo Điểm");
        btnDangKy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDangKy.setBorderPainted(false);
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });

        cbbLopMonHoc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblLopMonHoc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblLopMonHoc.setText("Mã Lớp Môn Học:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPhucKhaoDiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(btnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMSSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMonThi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCotDiem, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(lblDiemMongMuon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLopMonHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbbLopMonHoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCotDiemCanPhucKhao)
                            .addComponent(txtMSSV, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                            .addComponent(txtMonThi, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                            .addComponent(txtDiemMongMuon, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLydo, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))))
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblPhucKhaoDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMSSV, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMonThi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMonThi, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbbLopMonHoc, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(lblLopMonHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCotDiemCanPhucKhao, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(lblCotDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiemMongMuon, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(lblDiemMongMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLydo, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(lblLido, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
        ReferencesPointObjects rp = new ReferencesPointObjects();
        rp.setStudentID(txtMSSV.getText());
        SubjectsObjects su = new SubjectsObjectsBLL().GetElementByTenMon(txtMonThi.getText());
        rp.setMaMon(su.getMaMon());
        String lopmonhoc = (String)cbbLopMonHoc.getSelectedItem();
        String[] malop = lopmonhoc.split("-");
        rp.setMalop(malop[0]);
        rp.setCotDiemPhucKhao(txtCotDiemCanPhucKhao.getText());
        rp.setDiemMongMuon(Float.parseFloat(txtDiemMongMuon.getText()));
        rp.setLiDo(txtLydo.getText());
        long milis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(milis);
        rp.setNgayDangKy(date);
        rp.setIDtinhtrang(1);
        boolean KQ = new ReferencesPointBLL().Insert(rp);
        if(KQ == true)
        {
            JOptionPane.showMessageDialog(this, "Bạn đã đăng ký phúc khảo thành công");
            this.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Bạn đã đăng ký không thành công");
        }
    }//GEN-LAST:event_btnDangKyActionPerformed

    private void txtMonThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMonThiActionPerformed
        cbbLopMonHoc.removeAllItems();
        SubjectsObjects su = new SubjectsObjectsBLL().GetElementByTenMon(txtMonThi.getText());
        List<ScheduledObjects> lst = new ScheduledBLL().getElementByMaMon(su.getMaMon());
        lst.forEach((sc) -> {
            cbbLopMonHoc.addItem(sc.getMaLop() + '-' + sc.getMaMon());
        });
    }//GEN-LAST:event_txtMonThiActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKy;
    private javax.swing.JComboBox<String> cbbLopMonHoc;
    private javax.swing.JLabel lblCotDiem;
    private javax.swing.JLabel lblDiemMongMuon;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblLido;
    private javax.swing.JLabel lblLopMonHoc;
    private javax.swing.JLabel lblMSSV;
    private javax.swing.JLabel lblMonThi;
    private javax.swing.JLabel lblPhucKhaoDiem;
    private javax.swing.JTextField txtCotDiemCanPhucKhao;
    private javax.swing.JTextField txtDiemMongMuon;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtLydo;
    private javax.swing.JTextField txtMSSV;
    private javax.swing.JTextField txtMonThi;
    // End of variables declaration//GEN-END:variables
}
