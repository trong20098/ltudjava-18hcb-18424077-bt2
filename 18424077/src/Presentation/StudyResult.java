/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import BussinessLogicLayers.BLL.*;
import ValueObjects.*;
import java.awt.HeadlessException;
import java.io.File;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.math.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Nguy Minh Trong
 */
public final class StudyResult extends javax.swing.JInternalFrame {

    private final JFileChooser filestudyResult;
    private String filename;

    /**
     * Creates new form StudyResult
     */
    public StudyResult() {
        initComponents();
        filestudyResult = new JFileChooser();
        filestudyResult.setCurrentDirectory(new File("C:\\Users\\Nguy Minh Trong\\Desktop"));
        filestudyResult.setFileFilter(new FileNameExtensionFilter("File CSV", "csv"));
        filestudyResult.setMultiSelectionEnabled(true);
        LoadLopMonHoc();
        String file = cbbLop.getItemAt(0);
    }

    public void LoadLopMonHoc() {
        List<ScheduledObjects> lst = new ScheduledBLL().getElement();
        lst.forEach((lop) -> {
            cbbLop.addItem(lop.getMaLop() + '-' + lop.getMaMon());
        });
    }

    public void LoadDiemSinhVien(String malop, String mamon) {
        List<StudyResultObjects> lst = new StudyResultBLL().GetElementByMaLopAndMaMon(malop, mamon);
        if (!lst.isEmpty()) {
            DefaultTableModel model = (DefaultTableModel) tblDanhSachDiem.getModel();
            model.setRowCount(0);
            String[] columnsName = {"STT", "MSSV", "Họ tên", "Điểm Giữa Kỳ", "Điểm Cuối Kỳ", "Điểm Khác", "Điểm Tổng Kết", "Kết Quả"};
            model.setColumnIdentifiers(columnsName);
            int i = 1;
            for (StudyResultObjects sr : lst) {
                Vector row = new Vector();
                String number = Integer.toString(i);
                row.add(number);
                row.add(sr.getStudentID());
                StudentObjects st = new StudentBLL().GetElementByID(sr.getStudentID());
                row.add(st.getHoten());
                row.add(sr.getDiemGK());
                row.add(sr.getDiemCK());
                row.add(sr.getDiemKhac());
                row.add(sr.getDiemTong());
                String KQ;
                if (sr.getDiemTong() < 5) {
                    KQ = "Rớt";
                } else {
                    KQ = "Đậu";
                }
                row.add(KQ);
                model.addRow(row);
                i++;
            }
            tblDanhSachDiem.setModel(model);
            int Dau = 0, Rot = 0, TileDau, TileRot;
            int size = lst.size();
            for (int j = 0; j < size; j++) {
                if (lst.get(j).getDiemTong() >= 5) {
                    Dau = Dau + 1;
                } else {
                    Rot = Rot + 1;
                }
            }
            txtDau.setText(Integer.toString(Dau));
            txtRot.setText(Integer.toString(Rot));
            int tong = Dau + Rot;
            TileDau = ((Dau * 100) / tong);
            TileRot = ((Rot * 100) / tong);
            txtTileDau.setText(Integer.toString(TileDau) + "%");
            txtTiLeRot.setText(Integer.toString(TileRot) + "%");
        }

    }

    public void LoadImportFileDiemSinhVien(String file) {
        List<StudyResultObjects> lst = new StudyResultBLL().GetElementImportfileCSV(file);
        if (!lst.isEmpty()) {
            DefaultTableModel model = (DefaultTableModel) tblDanhSachDiem.getModel();
            model.setRowCount(0);
            String[] columnsName = {"STT", "MSSV", "Họ tên", "Điểm Giữa Kỳ", "Điểm Cuối Kỳ", "Điểm Khác", "Điểm Tổng Kết", "Kết Quả"};
            model.setColumnIdentifiers(columnsName);
            int i = 1;
            for (StudyResultObjects sr : lst) {
                Vector row = new Vector();
                String number = Integer.toString(i);
                row.add(number);
                row.add(sr.getStudentID());
                StudentObjects st = new StudentBLL().GetElementByID(sr.getStudentID());
                row.add(st.getHoten());
                row.add(sr.getDiemGK());
                row.add(sr.getDiemCK());
                row.add(sr.getDiemKhac());
                row.add(sr.getDiemTong());
                String KQ;
                if (sr.getDiemTong() < 5) {
                    KQ = "Rớt";
                } else {
                    KQ = "Đậu";
                }
                row.add(KQ);
                model.addRow(row);
                i++;
            }
            tblDanhSachDiem.setModel(model);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnThongTinDiem = new javax.swing.JPanel();
        lblthongtin = new javax.swing.JLabel();
        lblMSSV = new javax.swing.JLabel();
        txtMSSV = new javax.swing.JTextField();
        lblHoTen = new javax.swing.JLabel();
        txtHoten = new javax.swing.JTextField();
        lblDiemGiuaKy = new javax.swing.JLabel();
        txtDiemGiuaKy = new javax.swing.JTextField();
        lblDiemCuoiKy = new javax.swing.JLabel();
        txtDiemCuoiKy = new javax.swing.JTextField();
        lblDiemKhac = new javax.swing.JLabel();
        txtDiemKhac = new javax.swing.JTextField();
        lblDiemTong = new javax.swing.JLabel();
        txtDiemTong = new javax.swing.JTextField();
        btnLuu = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        pnKetQuaDiem = new javax.swing.JPanel();
        spDanhSachDiem = new javax.swing.JScrollPane();
        tblDanhSachDiem = new javax.swing.JTable();
        btnBangDiem = new javax.swing.JButton();
        cbbLop = new javax.swing.JComboBox<>();
        lblDau = new javax.swing.JLabel();
        lblRot = new javax.swing.JLabel();
        txtDau = new javax.swing.JTextField();
        txtRot = new javax.swing.JTextField();
        lblTiLe = new javax.swing.JLabel();
        lblTiLe1 = new javax.swing.JLabel();
        txtTileDau = new javax.swing.JTextField();
        txtTiLeRot = new javax.swing.JTextField();

        setClosable(true);
        setVisible(true);

        pnThongTinDiem.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin Chi Tiết"));

        lblthongtin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblthongtin.setForeground(new java.awt.Color(255, 0, 0));
        lblthongtin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblthongtin.setText("THÔNG TIN ĐIỂM CỦA SINH VIÊN");
        lblthongtin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblMSSV.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblMSSV.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMSSV.setText("Mã số sinh viên:");
        lblMSSV.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txtMSSV.setEditable(false);

        lblHoTen.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblHoTen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHoTen.setText("Họ tên sinh viên:");
        lblHoTen.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txtHoten.setEditable(false);

        lblDiemGiuaKy.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDiemGiuaKy.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDiemGiuaKy.setText("Điểm Giữa Kỳ:");
        lblDiemGiuaKy.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblDiemCuoiKy.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDiemCuoiKy.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDiemCuoiKy.setText("Điểm Cuối Kỳ:");
        lblDiemCuoiKy.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblDiemKhac.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDiemKhac.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDiemKhac.setText("Điểm Khác:");
        lblDiemKhac.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblDiemTong.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDiemTong.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDiemTong.setText("Điểm Tổng:");
        lblDiemTong.setFocusable(false);
        lblDiemTong.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btnLuu.setText(" Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnHuy.setText("Hủy");

        javax.swing.GroupLayout pnThongTinDiemLayout = new javax.swing.GroupLayout(pnThongTinDiem);
        pnThongTinDiem.setLayout(pnThongTinDiemLayout);
        pnThongTinDiemLayout.setHorizontalGroup(
            pnThongTinDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongTinDiemLayout.createSequentialGroup()
                .addComponent(lblthongtin, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
            .addGroup(pnThongTinDiemLayout.createSequentialGroup()
                .addGroup(pnThongTinDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnThongTinDiemLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(pnThongTinDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDiemTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDiemKhac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDiemCuoiKy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDiemGiuaKy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(lblMSSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnThongTinDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMSSV)
                            .addComponent(txtHoten)
                            .addComponent(txtDiemGiuaKy)
                            .addComponent(txtDiemCuoiKy)
                            .addComponent(txtDiemKhac)
                            .addComponent(txtDiemTong, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)))
                    .addGroup(pnThongTinDiemLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnThongTinDiemLayout.setVerticalGroup(
            pnThongTinDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongTinDiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblthongtin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnThongTinDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnThongTinDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnThongTinDiemLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                    .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnThongTinDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnThongTinDiemLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblDiemGiuaKy, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                    .addComponent(txtDiemGiuaKy, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnThongTinDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiemCuoiKy, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiemCuoiKy, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnThongTinDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiemKhac, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiemKhac, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnThongTinDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(pnThongTinDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnKetQuaDiem.setBorder(javax.swing.BorderFactory.createTitledBorder("Kết Quả Điểm Của Sinh Viên"));
        pnKetQuaDiem.setToolTipText("");

        tblDanhSachDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDanhSachDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachDiemMouseClicked(evt);
            }
        });
        spDanhSachDiem.setViewportView(tblDanhSachDiem);

        btnBangDiem.setText("Import Bảng Điểm");
        btnBangDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangDiemActionPerformed(evt);
            }
        });

        cbbLop.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbbLop.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbLopItemStateChanged(evt);
            }
        });

        lblDau.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDau.setText("SÔ SINH VIÊN ĐẬU:");

        lblRot.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblRot.setText("SỐ SINH VIÊN RỚT:");

        txtDau.setEditable(false);
        txtDau.setBackground(new java.awt.Color(153, 153, 153));
        txtDau.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtRot.setEditable(false);
        txtRot.setBackground(new java.awt.Color(153, 153, 153));
        txtRot.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblTiLe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTiLe.setText("TỈ LỆ: ");

        lblTiLe1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTiLe1.setText("TỈ LỆ: ");

        txtTileDau.setEditable(false);
        txtTileDau.setBackground(new java.awt.Color(153, 153, 153));
        txtTileDau.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtTiLeRot.setEditable(false);
        txtTiLeRot.setBackground(new java.awt.Color(153, 153, 153));
        txtTiLeRot.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnKetQuaDiemLayout = new javax.swing.GroupLayout(pnKetQuaDiem);
        pnKetQuaDiem.setLayout(pnKetQuaDiemLayout);
        pnKetQuaDiemLayout.setHorizontalGroup(
            pnKetQuaDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spDanhSachDiem, javax.swing.GroupLayout.DEFAULT_SIZE, 1077, Short.MAX_VALUE)
            .addGroup(pnKetQuaDiemLayout.createSequentialGroup()
                .addGroup(pnKetQuaDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnKetQuaDiemLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cbbLop, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBangDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnKetQuaDiemLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(pnKetQuaDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnKetQuaDiemLayout.createSequentialGroup()
                                .addComponent(lblRot, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRot))
                            .addGroup(pnKetQuaDiemLayout.createSequentialGroup()
                                .addComponent(lblDau, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDau, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(pnKetQuaDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnKetQuaDiemLayout.createSequentialGroup()
                                .addComponent(lblTiLe, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTileDau, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnKetQuaDiemLayout.createSequentialGroup()
                                .addComponent(lblTiLe1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTiLeRot)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnKetQuaDiemLayout.setVerticalGroup(
            pnKetQuaDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnKetQuaDiemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnKetQuaDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBangDiem, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(cbbLop))
                .addGap(44, 44, 44)
                .addComponent(spDanhSachDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnKetQuaDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDau, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDau, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTiLe, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTileDau, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnKetQuaDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnKetQuaDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRot)
                        .addComponent(lblTiLe1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTiLeRot, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnThongTinDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnKetQuaDiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnThongTinDiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnKetQuaDiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static String filename(String str, char sep, char ext) {
        String fullpath = str;
        int dot1 = fullpath.lastIndexOf(ext);
        int sep1 = fullpath.lastIndexOf(sep);
        return fullpath.substring(sep1 + 1, dot1);
    }

    private void btnBangDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBangDiemActionPerformed
        int returnvalue = filestudyResult.showOpenDialog(this);
        if (returnvalue == JFileChooser.APPROVE_OPTION) {
            File[] files = filestudyResult.getSelectedFiles();
            for (File file : files) {
                try {
                    filename = file.toString();
                    String fi = filename(filename, '\\', '-');
                    String mh = filename(filename, '-', '.');
                    List<BangDiem> lstimportdanhsach = new BangDiemBLL().GetElementImportfileCSV(filename);
                    int size = lstimportdanhsach.size();
                    for (int i = 0; i < size; i++) {
                        StudyResultObjects sr = new StudyResultObjects();
                        sr.setMaLop(fi);
                        sr.setMaMon(mh);
                        sr.setStudentID(lstimportdanhsach.get(i).getStudenID());
                        sr.setDiemGK(lstimportdanhsach.get(i).getDiemGK());
                        sr.setDiemCK(lstimportdanhsach.get(i).getDiemCK());
                        sr.setDiemKhac(lstimportdanhsach.get(i).getDiemKhac());
                        sr.setDiemTong(lstimportdanhsach.get(i).getDiemTong());
                        new StudyResultBLL().Insert(sr);
                    }
                    LoadDiemSinhVien(fi, mh);
                    cbbLop.removeAllItems();
                    LoadLopMonHoc();
                    cbbLop.setSelectedItem(fi);
                } catch (Exception ex) {
                    ex.getMessage();
                }
            }
    }//GEN-LAST:event_btnBangDiemActionPerformed
    }

    private void tblDanhSachDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachDiemMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblDanhSachDiem.getModel();
        int selectedRowIndex = tblDanhSachDiem.getSelectedRow();
        txtMSSV.setEditable(false);
        txtMSSV.setText(model.getValueAt(selectedRowIndex, 1).toString());
        txtHoten.setText(model.getValueAt(selectedRowIndex, 2).toString());
        txtDiemGiuaKy.setText(model.getValueAt(selectedRowIndex, 3).toString());
        txtDiemCuoiKy.setText(model.getValueAt(selectedRowIndex, 4).toString());
        txtDiemKhac.setText(model.getValueAt(selectedRowIndex, 5).toString());
        txtDiemTong.setText(model.getValueAt(selectedRowIndex, 6).toString());
    }//GEN-LAST:event_tblDanhSachDiemMouseClicked

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        filename = (String) cbbLop.getSelectedItem();
        String[] file = filename.split("-");
        String mssv = txtMSSV.getText();
        String Hoten = txtHoten.getText();
        float DiemGK = Float.parseFloat(txtDiemGiuaKy.getText());
        float DiemCK = Float.parseFloat(txtDiemCuoiKy.getText());
        float DiemKhac = Float.parseFloat(txtDiemKhac.getText());
        float DiemTong = Float.parseFloat(txtDiemTong.getText());
        StudyResultObjects sr = new StudyResultBLL().GetElementByMaLopAndMaMonAndStudentID(file[0], file[1], mssv);
        if (sr != null) {
            sr.setDiemGK(DiemGK);
            sr.setDiemCK(DiemCK);
            sr.setDiemKhac(DiemKhac);
            sr.setDiemTong(DiemTong);
            boolean KQ = new StudyResultBLL().Update(sr);
            if (KQ == true) {
                JOptionPane.showMessageDialog(this, "Bạn đã cập nhật thành công");
            } else {
                JOptionPane.showMessageDialog(this, "Bạn đã cập nhật không thành công");
            }
        }
        LoadDiemSinhVien(file[0], file[1]);
    }//GEN-LAST:event_btnLuuActionPerformed

    private void cbbLopItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbLopItemStateChanged
        // TODO add your handling code here:
        filename = (String) cbbLop.getSelectedItem();
        String[] file = filename.split("-");
        LoadDiemSinhVien(file[0], file[1]);
    }//GEN-LAST:event_cbbLopItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBangDiem;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JComboBox<String> cbbLop;
    private javax.swing.JLabel lblDau;
    private javax.swing.JLabel lblDiemCuoiKy;
    private javax.swing.JLabel lblDiemGiuaKy;
    private javax.swing.JLabel lblDiemKhac;
    private javax.swing.JLabel lblDiemTong;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblMSSV;
    private javax.swing.JLabel lblRot;
    private javax.swing.JLabel lblTiLe;
    private javax.swing.JLabel lblTiLe1;
    private javax.swing.JLabel lblthongtin;
    private javax.swing.JPanel pnKetQuaDiem;
    private javax.swing.JPanel pnThongTinDiem;
    private javax.swing.JScrollPane spDanhSachDiem;
    private javax.swing.JTable tblDanhSachDiem;
    private javax.swing.JTextField txtDau;
    private javax.swing.JTextField txtDiemCuoiKy;
    private javax.swing.JTextField txtDiemGiuaKy;
    private javax.swing.JTextField txtDiemKhac;
    private javax.swing.JTextField txtDiemTong;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JTextField txtMSSV;
    private javax.swing.JTextField txtRot;
    private javax.swing.JTextField txtTiLeRot;
    private javax.swing.JTextField txtTileDau;
    // End of variables declaration//GEN-END:variables
}
