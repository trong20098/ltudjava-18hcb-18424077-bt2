/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import BussinessLogicLayers.BLL.*;
import ValueObjects.*;
import java.awt.Dimension;
import java.io.File;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nguy Minh Trong
 */
public class SeePointed extends javax.swing.JInternalFrame {

    private static String filename, username;

    /**
     * Creates new form SeePointed
     *
     * @param user
     */
    public SeePointed(String user) {
        username = user;
        initComponents();
        LoadMonHoc();
        txtMSSV.setText(user);
        StudentObjects st = new StudentBLL().GetElementByID(txtMSSV.getText());
        txtHoTen.setText(st.getHoten());
    }

    public static String filename(String str, char sep, char ext) {
        String fullpath = str;
        int dot1 = fullpath.lastIndexOf(ext);
        int sep1 = fullpath.lastIndexOf(sep);
        return fullpath.substring(sep1 + 1, dot1);
    }

    public void Loadlistlopcuasinhvien() {
        String mh = (String) cbbMonHoc.getSelectedItem();
        SubjectsObjects su = new SubjectsObjectsBLL().GetElementByTenMon(mh);
        List<ClassSubjectsObjects> lst = new ClassSubjectsBLL().GetElementByMonHoc(su.getMaMon());
        for (ClassSubjectsObjects cs : lst) {
            cbblop.addItem(cs.getMaLop() + "-" + cs.getMaMon());
        }
    }

    public void LoadMonHoc() {
        List<SubjectsObjects> lstMonHoc = new SubjectsObjectsBLL().getElement();
        for (SubjectsObjects su : lstMonHoc) {
            cbbMonHoc.addItem(su.getTenMon());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDiemSV = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        lblMSSV = new javax.swing.JLabel();
        txtMSSV = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblMonHoc = new javax.swing.JLabel();
        cbbMonHoc = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBangDiem = new javax.swing.JTable();
        btnXemDiem = new javax.swing.JButton();
        cbblop = new javax.swing.JComboBox<>();
        btnPhucKhaoDiem = new javax.swing.JButton();

        setClosable(true);

        lblDiemSV.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblDiemSV.setForeground(new java.awt.Color(255, 0, 0));
        lblDiemSV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDiemSV.setText("ĐIỂM CỦA SINH VIÊN");

        lblHoTen.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblHoTen.setText("Họ Tên Sinh Viên:");

        txtHoTen.setEditable(false);
        txtHoTen.setBackground(new java.awt.Color(204, 204, 204));

        lblMSSV.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblMSSV.setText("Mã Số Sinh Viên:");

        txtMSSV.setEditable(false);
        txtMSSV.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Lớp:");

        lblMonHoc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblMonHoc.setText("Môn Học:");

        cbbMonHoc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbbMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMonHocActionPerformed(evt);
            }
        });

        tblBangDiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblBangDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblBangDiem);

        btnXemDiem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXemDiem.setText("Xem Điểm");
        btnXemDiem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXemDiem.setBorderPainted(false);
        btnXemDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemDiemActionPerformed(evt);
            }
        });

        cbblop.setBackground(new java.awt.Color(204, 204, 204));
        cbblop.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnPhucKhaoDiem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnPhucKhaoDiem.setText("Phúc Khảo Điểm");
        btnPhucKhaoDiem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPhucKhaoDiem.setBorderPainted(false);
        btnPhucKhaoDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhucKhaoDiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDiemSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1575, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblMonHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbbMonHoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbblop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(563, 563, 563))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnXemDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnPhucKhaoDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(593, 593, 593))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblDiemSV, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbbMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbblop, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXemDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPhucKhaoDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXemDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemDiemActionPerformed
        String malopmonhoc = (String) cbblop.getSelectedItem();
        boolean Tim = false;
        String[] ma = malopmonhoc.split("-");
        StudyResultObjects diem = new StudyResultBLL().GetElementByMaLopAndMaMonAndStudentID(ma[0], ma[1], txtMSSV.getText());
        DefaultTableModel model = (DefaultTableModel) tblBangDiem.getModel();
        model.setRowCount(0);
        String[] columnsName = {"MSSV", "Họ Tên", "Điểm Giữa kỳ", "Điểm Cuối kỳ", "Điểm Khác", "Điểm Tổng Kết", "Kết Quả"};
        model.setColumnIdentifiers(columnsName);
        Vector row = new Vector();
        row.add(txtMSSV.getText());
        row.add(txtHoTen.getText());
        row.add(diem.getDiemGK());
        row.add(diem.getDiemCK());
        row.add(diem.getDiemKhac());
        row.add(diem.getDiemTong());
        String KQ;
        if (diem.getDiemTong() < 5) {
            KQ = "Rớt";
        } else {
            KQ = "Đậu";
        }
        row.add(KQ);
        model.addRow(row);
        if(diem == null)
        {
            JOptionPane.showMessageDialog(this, "Không tim thấy điểm");
        }
    }//GEN-LAST:event_btnXemDiemActionPerformed

    private void cbbMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMonHocActionPerformed
        cbblop.removeAllItems();
        Loadlistlopcuasinhvien();
    }//GEN-LAST:event_cbbMonHocActionPerformed

    private void btnPhucKhaoDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhucKhaoDiemActionPerformed
        RegisterTheScore rs = new RegisterTheScore();
        rs.setVisible(true);
    }//GEN-LAST:event_btnPhucKhaoDiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPhucKhaoDiem;
    private javax.swing.JButton btnXemDiem;
    private javax.swing.JComboBox<String> cbbMonHoc;
    private javax.swing.JComboBox<String> cbblop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDiemSV;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblMSSV;
    private javax.swing.JLabel lblMonHoc;
    private javax.swing.JTable tblBangDiem;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMSSV;
    // End of variables declaration//GEN-END:variables
}
