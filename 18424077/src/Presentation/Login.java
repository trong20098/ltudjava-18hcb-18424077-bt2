/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import ValueObjects.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import java.util.*;
import BussinessLogicLayers.BLL.*;

/**
 *
 * @author Nguy Minh Trong
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        txtusername.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblusername = new javax.swing.JLabel();
        lblLogin1 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnDangNhap = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();
        lblBanner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng Nhập");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(51, 51, 255));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(630, 410));
        setResizable(false);
        getContentPane().setLayout(null);

        lblusername.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblusername.setForeground(new java.awt.Color(255, 255, 255));
        lblusername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblusername.setText("Username:");
        lblusername.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lblusername.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblusername);
        lblusername.setBounds(320, 90, 90, 30);

        lblLogin1.setFont(new java.awt.Font("Times New Roman", 1, 52)); // NOI18N
        lblLogin1.setForeground(new java.awt.Color(255, 51, 51));
        lblLogin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin1.setText("LOGIN");
        lblLogin1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lblLogin1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblLogin1);
        lblLogin1.setBounds(320, 0, 310, 80);
        getContentPane().add(txtusername);
        txtusername.setBounds(420, 90, 190, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 132, 80, 30);

        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        btnDangNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDangNhapKeyPressed(evt);
            }
        });
        getContentPane().add(btnDangNhap);
        btnDangNhap.setBounds(370, 190, 110, 40);

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        getContentPane().add(btnThoat);
        btnThoat.setBounds(500, 190, 110, 40);
        getContentPane().add(txtpassword);
        txtpassword.setBounds(420, 130, 190, 30);

        lblBanner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/banner.jpg"))); // NOI18N
        lblBanner.setName("lblbanner"); // NOI18N
        getContentPane().add(lblBanner);
        lblBanner.setBounds(0, 0, 630, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        String user = txtusername.getText();
        String pass = new String(txtpassword.getPassword());
        List<UserObjects> lst = new UserBLL().CheckLogin(user, pass);
        boolean isExisted = false;
        if (lst.size() > 0) {
            isExisted = true;
            this.setVisible(false);
            MainSoftware main = new MainSoftware(user);
            main.setVisible(true);
        }
        if (isExisted == false) {
            JOptionPane.showMessageDialog(this, "Bạn đã đăng nhập thất bại");
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnDangNhapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDangNhapKeyPressed
        String user = txtusername.getText();
        String pass = new String(txtpassword.getPassword());
        List<UserObjects> lst = new UserBLL().CheckLogin(user, pass);
        boolean isExisted = false;
        if (lst.size() > 0) {
            isExisted = true;
            this.setVisible(false);
            MainSoftware main = new MainSoftware(user);
            main.setVisible(true);
        }
        if (isExisted == false) {
            JOptionPane.showMessageDialog(this, "Bạn đã đăng nhập thất bại");
        }
    }//GEN-LAST:event_btnDangNhapKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JLabel lblLogin1;
    private javax.swing.JLabel lblusername;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
