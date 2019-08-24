/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import ValueObjects.*;
import BussinessLogicLayers.BLL.*;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.util.*;

/**
 *
 * @author Nguy Minh Trong
 */
public class ReferencesPoint extends javax.swing.JInternalFrame {

    /**
     * Creates new form ReferencesPoint
     */
    public ReferencesPoint() {
        initComponents();
        LoadDanhSachPhucKhao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDanhSach = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhucKhaoDiem = new javax.swing.JTable();
        btnCapNhat = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        pnDatLich = new javax.swing.JPanel();
        lblBatDau = new javax.swing.JLabel();
        lblKetThuc = new javax.swing.JLabel();
        btnTaoLich = new javax.swing.JButton();
        dtcBegin = new com.toedter.calendar.JDateChooser();
        dtcEnd = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLichPhucKhao = new javax.swing.JTable();

        lblDanhSach.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblDanhSach.setForeground(new java.awt.Color(255, 0, 51));
        lblDanhSach.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDanhSach.setText("DANH SÁCH SINH VIÊN PHÚC KHẢO ĐIỂM");
        lblDanhSach.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tblPhucKhaoDiem.setAutoCreateRowSorter(true);
        tblPhucKhaoDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblPhucKhaoDiem.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tblPhucKhaoDiem);
        tblPhucKhaoDiem.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        btnCapNhat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCapNhat.setText("Cập nhật danh sách phúc khảo");
        btnCapNhat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCapNhat.setBorderPainted(false);
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnHuy.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnHuy.setText("Hủy Cập Nhật");
        btnHuy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHuy.setBorderPainted(false);
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        pnDatLich.setBorder(javax.swing.BorderFactory.createTitledBorder("Đặt Lịch Phúc Khảo Điểm"));

        lblBatDau.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblBatDau.setText("Thời Gian Bắt Đầu:");

        lblKetThuc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblKetThuc.setText("Thời Gian Kết Thúc:");

        btnTaoLich.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnTaoLich.setText("Tạo Lịch Phúc Khảo");
        btnTaoLich.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTaoLich.setBorderPainted(false);
        btnTaoLich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoLichActionPerformed(evt);
            }
        });

        dtcBegin.setDateFormatString("dd/MM/yyyy");

        dtcEnd.setDateFormatString("dd/MM/yyyy");

        tblLichPhucKhao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblLichPhucKhao);

        javax.swing.GroupLayout pnDatLichLayout = new javax.swing.GroupLayout(pnDatLich);
        pnDatLich.setLayout(pnDatLichLayout);
        pnDatLichLayout.setHorizontalGroup(
            pnDatLichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDatLichLayout.createSequentialGroup()
                .addGroup(pnDatLichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDatLichLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pnDatLichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnDatLichLayout.createSequentialGroup()
                                .addComponent(lblKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dtcEnd, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addGroup(pnDatLichLayout.createSequentialGroup()
                                .addComponent(lblBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dtcBegin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(pnDatLichLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnTaoLich, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2))
        );
        pnDatLichLayout.setVerticalGroup(
            pnDatLichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDatLichLayout.createSequentialGroup()
                .addGroup(pnDatLichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnDatLichLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnDatLichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dtcBegin, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(lblBatDau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnDatLichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dtcEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnTaoLich, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDanhSach, javax.swing.GroupLayout.DEFAULT_SIZE, 1590, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnDatLich, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblDanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnDatLich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        LoadDanhSachPhucKhao();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        boolean kq = false;
        DefaultTableModel model = (DefaultTableModel) tblPhucKhaoDiem.getModel();
        int rows = tblPhucKhaoDiem.getRowCount();
        for (int row = 0; row < rows; row++) {
            String studentid = model.getValueAt(row, 1).toString();
            String fullname = model.getValueAt(row, 2).toString();
            String monthi = model.getValueAt(row, 3).toString();
            String malopmonhoc = model.getValueAt(row, 4).toString();
            String[] malop = malopmonhoc.split("-");
            String cotdiemcanphuckhao = model.getValueAt(row, 5).toString();
            String diemmongmuon = model.getValueAt(row, 6).toString();
            String lido = model.getValueAt(row, 7).toString();
            String ngaydangky = model.getValueAt(row, 8).toString();
            String tinhtrangphuckhao = model.getValueAt(row, 9).toString();
            StatusReferencesPoint sta = new StatusReferencesPointBLL().GetElementByTinhTrang(tinhtrangphuckhao);
            ReferencesPointObjects rp = new ReferencesPointBLL().GetElementByStudentIDandMaMon(studentid, malop[0], malop[1]);
            if(rp != null)
            {
                rp.setIDtinhtrang(sta.getID());
                kq = new ReferencesPointBLL().Update(rp);
            }
        }
        if(kq == true)
        {
            JOptionPane.showMessageDialog(this, "Bạn đã cập nhật thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Bạn đã cập nhật không thành công");
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnTaoLichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoLichActionPerformed

    }//GEN-LAST:event_btnTaoLichActionPerformed

    private void LoadDanhSachPhucKhao() {
        List<ReferencesPointObjects> lst = new ReferencesPointBLL().getElement();
        tblPhucKhaoDiem.setRowHeight(30);
        DefaultTableModel model = (DefaultTableModel) tblPhucKhaoDiem.getModel();
        model.setRowCount(0);
        String[] columnsName = {"STT", "Mã số sinh viên", "Họ tên", "Môn thi", "Lớp môn học", "Cột điểm cần phúc khảo", "Điểm mong muốn", "Lí do", "Ngày đăng ký", "Tình trạng phúc khảo"};
        model.setColumnIdentifiers(columnsName);
        int i = 1;
        for (ReferencesPointObjects rp : lst) {
            Vector row = new Vector();
            String number = Integer.toString(i);
            row.add(number);
            row.add(rp.getStudentID());
            StudentObjects st = new StudentBLL().GetElementByID(rp.getStudentID());
            row.add(st.getHoten());
            SubjectsObjects su = new SubjectsObjectsBLL().GetElementByID(rp.getMaMon());
            row.add(su.getTenMon());
            row.add(rp.getMalop() + '-' + rp.getMaMon());
            row.add(rp.getCotDiemPhucKhao());
            row.add(rp.getDiemMongMuon());
            row.add(rp.getLiDo());
            SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
            row.add(dt.format(rp.getNgayDangKy()));
            TableColumn column = tblPhucKhaoDiem.getColumnModel().getColumn(9);
            JComboBox<String> cbb = new JComboBox<>();
            List<StatusReferencesPoint> list = new StatusReferencesPointBLL().getElement();
            list.forEach((str) -> {
                cbb.addItem(str.getTentinhtrangphuckhao());
            });
            column.setCellEditor(new DefaultCellEditor(cbb));
            StatusReferencesPoint sr = new StatusReferencesPointBLL().getElementByID(rp.getIDtinhtrang());
            String tinhtrang = sr.getTentinhtrangphuckhao();
            row.add(sr.getTentinhtrangphuckhao());
            model.addRow(row);
            i++;
        }
        tblPhucKhaoDiem.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnTaoLich;
    private com.toedter.calendar.JDateChooser dtcBegin;
    private com.toedter.calendar.JDateChooser dtcEnd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBatDau;
    private javax.swing.JLabel lblDanhSach;
    private javax.swing.JLabel lblKetThuc;
    private javax.swing.JPanel pnDatLich;
    private javax.swing.JTable tblLichPhucKhao;
    private javax.swing.JTable tblPhucKhaoDiem;
    // End of variables declaration//GEN-END:variables
}
