/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.io.File;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import ValueObjects.*;
import BussinessLogicLayers.BLL.*;
import java.util.function.Consumer;
import javax.swing.*;

/**
 *
 * @author Nguy Minh Trong
 */
public class ClassSubjects extends javax.swing.JInternalFrame {

    public static String MSSV, filename;

    /**
     * Creates new form ClassSubjects
     */
    public ClassSubjects() {
        initComponents();
        LopMonHoc();
        Lop();
    }

    public final void LopMonHoc() {
        try {
            File f = new File("src/DataAccessLayers/Database/Lop Theo Mon");
            String[] files = f.list();
            for (String file : files) {
                cbbLopMonHoc.addItem(filename(file, '/', '.'));
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    public final void Lop() {

        try {
            File f = new File("src/DataAccessLayers/Database/SinhVien");
            String[] files = f.list();
            for (String file : files) {
                cbbLop.addItem(filename(file, '/', '.'));
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    public void LoadSinhVien(String filename) {
//        List<StudentObjects> lst = new ClassSubjectsBLL().getElement(filename);
//        if (lst.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Không có dữ liệu");
//        }
//        DefaultTableModel model = (DefaultTableModel) tblDanhSachLopMonHoc.getModel();
//        model.setRowCount(0);
//        String[] columnsName = {"STT", "MSSV", "Họ tên", "Giới tính", "CMND"};
//        model.setColumnIdentifiers(columnsName);
//        int i = 1;
//        for (StudentObjects st : lst) {
//            Vector row = new Vector();
//            String number = Integer.toString(i);
//            row.add(number);
//            row.add(st.getMSSV());
//            row.add(st.getHoten());
//            row.add(st.getGioitinh());
//            row.add(st.getCMND());
//            model.addRow(row);
//            i++;
//        }
//        tblDanhSachLopMonHoc.setModel(model);
    }

    public static String filename(String str, char sep, char ext) {
        String fullpath = str;
        int dot1 = fullpath.lastIndexOf(ext);
        int sep1 = fullpath.lastIndexOf(sep);
        return fullpath.substring(sep1 + 1, dot1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnDanhSach = new javax.swing.JPanel();
        cbbLopMonHoc = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSachLopMonHoc = new javax.swing.JTable();
        btnXoa = new javax.swing.JButton();
        pnThongTin = new javax.swing.JPanel();
        lblthongtin = new javax.swing.JLabel();
        lblMSSV = new javax.swing.JLabel();
        txtMSSV = new javax.swing.JTextField();
        lblHoTen = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        lblGioiTinh = new javax.swing.JLabel();
        radNam = new javax.swing.JRadioButton();
        radNu = new javax.swing.JRadioButton();
        lblCMND = new javax.swing.JLabel();
        txtCMND = new javax.swing.JTextField();
        lblLop = new javax.swing.JLabel();
        cbbLop = new javax.swing.JComboBox<>();
        lblMonHoc = new javax.swing.JLabel();
        cbbMonHoc = new javax.swing.JComboBox<>();
        btnLuu = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();

        setClosable(true);

        pnDanhSach.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh Sách Sinh Viên"));

        cbbLopMonHoc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbbLopMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbLopMonHocActionPerformed(evt);
            }
        });

        tblDanhSachLopMonHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDanhSachLopMonHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachLopMonHocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhSachLopMonHoc);

        btnXoa.setText("Xóa Sinh Viên");
        btnXoa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnDanhSachLayout = new javax.swing.GroupLayout(pnDanhSach);
        pnDanhSach.setLayout(pnDanhSachLayout);
        pnDanhSachLayout.setHorizontalGroup(
            pnDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDanhSachLayout.createSequentialGroup()
                .addContainerGap(424, Short.MAX_VALUE)
                .addComponent(cbbLopMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(401, 401, 401))
            .addGroup(pnDanhSachLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        pnDanhSachLayout.setVerticalGroup(
            pnDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDanhSachLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(cbbLopMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnThongTin.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin Sinh Viên"));

        lblthongtin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblthongtin.setForeground(new java.awt.Color(255, 51, 0));
        lblthongtin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblthongtin.setText("THÔNG TIN SINH VIÊN ĐĂNG KÝ MÔN HỌC");

        lblMSSV.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblMSSV.setText("Mã Số Sinh Viên:");

        lblHoTen.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblHoTen.setText("Họ Tên Sinh Viên:");

        lblGioiTinh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblGioiTinh.setText("Giới Tính:");

        buttonGroup1.add(radNam);
        radNam.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radNam.setText("Nam");

        buttonGroup1.add(radNu);
        radNu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radNu.setText("Nữ");

        lblCMND.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblCMND.setText("Số CMND:");

        lblLop.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblLop.setText(" Lớp: ");

        cbbLop.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbbLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbLopActionPerformed(evt);
            }
        });

        lblMonHoc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblMonHoc.setText("Môn Học:");

        cbbMonHoc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnLuu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLuu.setBorderPainted(false);
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnHuy.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnHuy.setText("Hủy");
        btnHuy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHuy.setBorderPainted(false);
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnThongTinLayout = new javax.swing.GroupLayout(pnThongTin);
        pnThongTin.setLayout(pnThongTinLayout);
        pnThongTinLayout.setHorizontalGroup(
            pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongTinLayout.createSequentialGroup()
                .addComponent(lblthongtin, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
            .addGroup(pnThongTinLayout.createSequentialGroup()
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnThongTinLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblLop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCMND, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblGioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addComponent(lblMSSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnThongTinLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(radNam, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(radNu, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnThongTinLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbbMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMSSV)
                                        .addComponent(txtHoTen)
                                        .addComponent(txtCMND)
                                        .addComponent(cbbLop, 0, 278, Short.MAX_VALUE))))))
                    .addGroup(pnThongTinLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnThongTinLayout.setVerticalGroup(
            pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongTinLayout.createSequentialGroup()
                .addComponent(lblthongtin, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radNu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(radNam, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCMND, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCMND, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbbLop, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnDanhSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnDanhSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDanhSachLopMonHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachLopMonHocMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblDanhSachLopMonHoc.getModel();
        int selectedRowIndex = tblDanhSachLopMonHoc.getSelectedRow();
        MSSV = (String) model.getValueAt(selectedRowIndex, 1);
    }//GEN-LAST:event_tblDanhSachLopMonHocMouseClicked

    private void cbbLopMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbLopMonHocActionPerformed
        filename = cbbLopMonHoc.getSelectedItem() + ".csv";
        LoadSinhVien(filename);
    }//GEN-LAST:event_cbbLopMonHocActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
//        DefaultTableModel model = (DefaultTableModel) tblDanhSachLopMonHoc.getModel();
//        int selectedRowIndex = tblDanhSachLopMonHoc.getSelectedRow();
//        MSSV = (String) model.getValueAt(selectedRowIndex, 1);
//        List<StudentObjects> lst = new ClassSubjectsBLL().getElement(filename);
//        StudentObjects st = null;
//        int size = lst.size();
//        for (int i = 0; i < size; i++) {
//            if (lst.get(i).getMSSV().equals(MSSV)) {
//                st = lst.get(i);
//            }
//        }
//        if (st != null) {
//            lst.remove(st);
//            new ClassSubjectsBLL().Insert(filename, lst);
//            LoadSinhVien(filename);
//        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
//        String lop = cbbLop.getSelectedItem().toString();
//        String monhoc = cbbMonHoc.getSelectedItem().toString();
//        String mamonhoc = null;
//        String f = lop + ".csv";
//        List<ScheduledObjects> lstMonHoc = new ScheduledBLL().getElement(f);
//        for (ScheduledObjects sc : lstMonHoc) {
//            if (monhoc.equals(sc.getTenMon())) {
//                mamonhoc = sc.getMaMon();
//                break;
//            }
//        }
//        String file = lop + "-" + mamonhoc + ".csv";
//        List<StudentObjects> lst = new ClassSubjectsBLL().getElement(file);
//        for (StudentObjects st : lst) {
//            if (txtMSSV.getText().equals(st.getMSSV())) {
//                JOptionPane.showMessageDialog(this, "Mã số sinh viên " + txtMSSV.getText() + " đã có");
//            }
//        }
//        StudentObjects st = new StudentObjects();
//        st.setMSSV(txtMSSV.getText());
//        st.setHoten(txtHoTen.getText());
//        if (radNam.isSelected()) {
//            st.setGioitinh("Nam");
//        } else {
//            st.setGioitinh("Nữ");
//        }
//        st.setCMND(txtCMND.getText());
//        lst.add(st);
//        Collections.sort(lst, new sortbyroll());
//        new ClassSubjectsBLL().Insert(file, lst);
//        LoadSinhVien(file);
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        txtMSSV.setText("");
        txtHoTen.setText("");
        txtCMND.setText("");
    }//GEN-LAST:event_btnHuyActionPerformed

    private void cbbLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbLopActionPerformed
//        cbbMonHoc.removeAllItems();
//        String f = cbbLop.getSelectedItem() + ".csv";
//        List<ScheduledObjects> lstMonHoc = new ScheduledBLL().getElement(f);
//        lstMonHoc.forEach((ScheduledObjects sc) -> {
//            cbbMonHoc.addItem(sc.getTenMon());
//        });
    }//GEN-LAST:event_cbbLopActionPerformed

    class sortbyroll implements Comparator<StudentObjects>
    {
        @Override
        public int compare(StudentObjects a, StudentObjects b)
        {
            return Integer.parseInt(a.getMSSV()) - Integer.parseInt(b.getMSSV());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbLop;
    private javax.swing.JComboBox<String> cbbLopMonHoc;
    private javax.swing.JComboBox<String> cbbMonHoc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCMND;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblLop;
    private javax.swing.JLabel lblMSSV;
    private javax.swing.JLabel lblMonHoc;
    private javax.swing.JLabel lblthongtin;
    private javax.swing.JPanel pnDanhSach;
    private javax.swing.JPanel pnThongTin;
    private javax.swing.JRadioButton radNam;
    private javax.swing.JRadioButton radNu;
    private javax.swing.JTable tblDanhSachLopMonHoc;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMSSV;
    // End of variables declaration//GEN-END:variables
}
