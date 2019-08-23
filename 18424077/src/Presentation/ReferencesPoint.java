/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;
import ValueObjects.*;
import BussinessLogicLayers.BLL.*;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.util.*;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

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
        jScrollPane1.setViewportView(tblPhucKhaoDiem);

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

        javax.swing.GroupLayout pnDatLichLayout = new javax.swing.GroupLayout(pnDatLich);
        pnDatLich.setLayout(pnDatLichLayout);
        pnDatLichLayout.setHorizontalGroup(
            pnDatLichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDatLichLayout.createSequentialGroup()
                .addGroup(pnDatLichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDatLichLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pnDatLichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblBatDau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblKetThuc, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnDatLichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dtcBegin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dtcEnd, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)))
                    .addGroup(pnDatLichLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(btnTaoLich, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnDatLichLayout.setVerticalGroup(
            pnDatLichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDatLichLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnDatLichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dtcBegin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBatDau, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnDatLichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dtcEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblKetThuc, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnTaoLich, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
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
                .addGap(16, 16, 16)
                .addComponent(pnDatLich, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        LoadDanhSachPhucKhao();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblPhucKhaoDiem.getModel();
        int selectedRowIndex = tblPhucKhaoDiem.getSelectedRow();
        String studentid = model.getValueAt(selectedRowIndex, 1).toString();
        String fullname = model.getValueAt(selectedRowIndex, 2).toString();
        String monthi = model.getValueAt(selectedRowIndex, 3).toString();
        String cotdiemphuckhao = model.getValueAt(selectedRowIndex, 4).toString();
        String diemmongmuon = model.getValueAt(selectedRowIndex, 5).toString();
        String lido = model.getValueAt(selectedRowIndex, 6).toString();
        String tinhtrang = model.getValueAt(selectedRowIndex, 7).toString();
        SubjectsObjects su = new SubjectsObjectsBLL().GetElementByTenMon(monthi);
        ReferencesPointObjects rp = new ReferencesPointBLL().GetElementByStudentIDandMaMon(studentid, su.getMaMon());
        if(rp != null)
        {
            
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnTaoLichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoLichActionPerformed
        
    }//GEN-LAST:event_btnTaoLichActionPerformed

    private void LoadDanhSachPhucKhao()
    {
        List<ReferencesPointObjects> lst = new ReferencesPointBLL().getElement();
        tblPhucKhaoDiem.setRowHeight(30);
        DefaultTableModel model = (DefaultTableModel) tblPhucKhaoDiem.getModel();
        model.setRowCount(0);
        String[] columnsName = {"STT", "Mã số sinh viên", "Họ tên", "Môn thi", "Cột điểm cần phúc khảo", "Điểm mong muốn", "Lí do", "Tình trạng phúc khảo"};
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
            row.add(rp.getCotDiemPhucKhao());
            row.add(rp.getDiemMongMuon());
            row.add(rp.getLiDo());
            TableColumn column = tblPhucKhaoDiem.getColumnModel().getColumn(7);
            JComboBox<String> cbb = new JComboBox<>();
            List<StatusReferencesPoint> list = new StatusReferencesPointBLL().getElement();
            for(StatusReferencesPoint str : list)
            {
                cbb.addItem(str.getTentinhtrangphuckhao());
            }
            column.setCellEditor(new DefaultCellEditor(cbb));
            row.add("Chưa xem");
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
    private javax.swing.JLabel lblBatDau;
    private javax.swing.JLabel lblDanhSach;
    private javax.swing.JLabel lblKetThuc;
    private javax.swing.JPanel pnDatLich;
    private javax.swing.JTable tblPhucKhaoDiem;
    // End of variables declaration//GEN-END:variables
}
