/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import javax.swing.table.DefaultTableModel;
import java.util.*;
import ValueObjects.*;
import BussinessLogicLayers.BLL.*;
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
        MonHoc();
    }

    public final void LopMonHoc() {
        List<ScheduledObjects> lst = new ScheduledBLL().getElement();
        lst.forEach((lop) -> {
            cbbLopMonHoc.addItem(lop.getMaLop() + '-' + lop.getMaMon());
        });
    }

    public final void Lop() {
        List<ClassObjects> lst = new ClassBLL().getElement();
        lst.forEach((lop) -> {
            cbbLop.addItem(lop.getMaLop());
        });
    }
    
    public final void MonHoc()
    {
        List<SubjectsObjects> lst = new SubjectsObjectsBLL().getElement();
        lst.forEach((su) -> {
            cbbMonHoc.addItem(su.getTenMon());
        });
    }

    public void LoadSinhVien(String malop, String mamon) {
        List<ClassSubjectsObjects> lst = new ClassSubjectsBLL().GetElementByLopAndMonHoc(malop, mamon);
        if (lst.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không có dữ liệu");
        }
        DefaultTableModel model = (DefaultTableModel) tblDanhSachLopMonHoc.getModel();
        model.setRowCount(0);
        String[] columnsName = {"STT", "MSSV", "Họ tên", "Giới tính", "CMND"};
        model.setColumnIdentifiers(columnsName);
        int i = 1;
        for (ClassSubjectsObjects cs : lst) {
            Vector row = new Vector();
            String number = Integer.toString(i);
            row.add(number);
            StudentObjects st = new StudentBLL().GetElementByID(cs.getStudentID());
            row.add(st.getMSSV());
            row.add(st.getHoten());
            if(st.getGioitinh() == 0)
            {
                row.add("Nam");
            }
            else
            {
                row.add("Nữ");
            }
            row.add(st.getCMND());
            model.addRow(row);
            i++;
        }
        tblDanhSachLopMonHoc.setModel(model);
    }

    public static String filename(String str, char sep, char ext) {
        String fullpath = str;
        int dot1 = fullpath.lastIndexOf(ext);
        int sep1 = fullpath.lastIndexOf(sep);
        return fullpath.substring(sep1 + 1, dot1);
    }

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
        lblLop = new javax.swing.JLabel();
        cbbLop = new javax.swing.JComboBox<>();
        lblMonHoc = new javax.swing.JLabel();
        cbbMonHoc = new javax.swing.JComboBox<>();
        btnLuu = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        lblHocKy = new javax.swing.JLabel();
        radChinh = new javax.swing.JRadioButton();
        radTrano = new javax.swing.JRadioButton();
        lblLopMonHoc = new javax.swing.JLabel();
        cbbMaLopMonHoc = new javax.swing.JComboBox<>();
        radhoclai = new javax.swing.JRadioButton();

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
                .addContainerGap(225, Short.MAX_VALUE))
        );

        pnThongTin.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin Sinh Viên"));

        lblthongtin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblthongtin.setForeground(new java.awt.Color(255, 51, 0));
        lblthongtin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblthongtin.setText("THÔNG TIN SINH VIÊN ĐĂNG KÝ MÔN HỌC");

        lblMSSV.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblMSSV.setText("Mã Số Sinh Viên:");

        txtMSSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMSSVActionPerformed(evt);
            }
        });

        lblHoTen.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblHoTen.setText("Họ Tên Sinh Viên:");

        lblLop.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblLop.setText(" Lớp: ");

        cbbLop.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbbLop.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblMonHoc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblMonHoc.setText("Môn Học:");

        cbbMonHoc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbbMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMonHocActionPerformed(evt);
            }
        });

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

        lblHocKy.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblHocKy.setText("Học Kỳ:");

        buttonGroup1.add(radChinh);
        radChinh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radChinh.setText(" Chính");
        radChinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        buttonGroup1.add(radTrano);
        radTrano.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radTrano.setText("Trả nợ");
        radTrano.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblLopMonHoc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblLopMonHoc.setText("Mã Lớp Môn Học: ");

        cbbMaLopMonHoc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbbMaLopMonHoc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonGroup1.add(radhoclai);
        radhoclai.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radhoclai.setText("Học lại");
        radhoclai.setHideActionText(true);
        radhoclai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        radhoclai.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

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
                        .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnThongTinLayout.createSequentialGroup()
                                .addComponent(lblHocKy, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(radChinh, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(radTrano, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(radhoclai, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnThongTinLayout.createSequentialGroup()
                                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblLopMonHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblLop, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblHoTen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(lblMSSV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMonHoc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnThongTinLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnThongTinLayout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtMSSV, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                                                    .addComponent(txtHoTen)))
                                            .addComponent(cbbMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbbLop, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnThongTinLayout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(cbbMaLopMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(pnThongTinLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
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
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLop, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbLop, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbMaLopMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLopMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHocKy, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radChinh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radTrano, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radhoclai, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        String lopmonhoc = (String) cbbLopMonHoc.getSelectedItem();
        String[] lmh = lopmonhoc.split("-");
        LoadSinhVien(lmh[0], lmh[1]);
    }//GEN-LAST:event_cbbLopMonHocActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblDanhSachLopMonHoc.getModel();
        int selectedRowIndex = tblDanhSachLopMonHoc.getSelectedRow();
        MSSV = (String) model.getValueAt(selectedRowIndex, 1);
        String malopmonhoc = (String)cbbLopMonHoc.getSelectedItem();
        String[] lopmonhoc = malopmonhoc.split("-");
        boolean KQ = new ClassSubjectsBLL().Delete(lopmonhoc[0], lopmonhoc[1], MSSV);
        if(KQ == true)
        {
            JOptionPane.showMessageDialog(this, "Bạn đã xóa thành công");
            LoadSinhVien(lopmonhoc[0], lopmonhoc[1]);
            cbbLopMonHoc.setSelectedItem(lopmonhoc[0] + "-" + lopmonhoc[1]);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Bạn đã xóa không thành công");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        String malopmonhoc = (String)cbbMaLopMonHoc.getSelectedItem();
        String[] lopmonhoc = malopmonhoc.split("-");
        ClassSubjectsObjects cs = new ClassSubjectsObjects();
        cs.setMaLop(lopmonhoc[0]);
        cs.setMaMon(lopmonhoc[1]);
        cs.setStudentID(txtMSSV.getText());
        if(radChinh.isSelected())
        {
            cs.setStatus(0);
        }
        else
        {
            if(radTrano.isSelected())
            {
                cs.setStatus(1);
            }
            else
            {
                if(radhoclai.isSelected())
                {
                    cs.setStatus(1);
                }
            }
        }
        boolean KQ = new ClassSubjectsBLL().Insert(cs);
        if(KQ == true)
        {
            JOptionPane.showMessageDialog(this, "Bạn đã đăng ký thành công");
            LoadSinhVien(lopmonhoc[0], lopmonhoc[1]);
            cbbLopMonHoc.setSelectedItem(lopmonhoc[0] + "-" + lopmonhoc[1]);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Bạn đã đăng ký không thành công");
        }
        
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        txtMSSV.setText("");
        txtHoTen.setText("");
    }//GEN-LAST:event_btnHuyActionPerformed

    private void cbbMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMonHocActionPerformed
        cbbMaLopMonHoc.removeAllItems();
        String monhoc = (String) cbbMonHoc.getSelectedItem();
        SubjectsObjects su = new SubjectsObjectsBLL().GetElementByTenMon(monhoc);
        List<ScheduledObjects> lst = new ScheduledBLL().getElementByMaMon(su.getMaMon());
        int size = lst.size();
        for (int i = 0; i < size; i++) {
            cbbMaLopMonHoc.addItem(lst.get(i).getMaLop() + '-' + lst.get(i).getMaMon());
        }
    }//GEN-LAST:event_cbbMonHocActionPerformed

    private void txtMSSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMSSVActionPerformed
        StudentObjects st = new StudentBLL().GetElementByID(txtMSSV.getText());
        txtHoTen.setText(st.getHoten());
        cbbLop.setSelectedItem(st.getClassName());
    }//GEN-LAST:event_txtMSSVActionPerformed

    class sortbyroll implements Comparator<StudentObjects> {

        @Override
        public int compare(StudentObjects a, StudentObjects b) {
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
    private javax.swing.JComboBox<String> cbbMaLopMonHoc;
    private javax.swing.JComboBox<String> cbbMonHoc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblHocKy;
    private javax.swing.JLabel lblLop;
    private javax.swing.JLabel lblLopMonHoc;
    private javax.swing.JLabel lblMSSV;
    private javax.swing.JLabel lblMonHoc;
    private javax.swing.JLabel lblthongtin;
    private javax.swing.JPanel pnDanhSach;
    private javax.swing.JPanel pnThongTin;
    private javax.swing.JRadioButton radChinh;
    private javax.swing.JRadioButton radTrano;
    private javax.swing.JRadioButton radhoclai;
    private javax.swing.JTable tblDanhSachLopMonHoc;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMSSV;
    // End of variables declaration//GEN-END:variables
}
