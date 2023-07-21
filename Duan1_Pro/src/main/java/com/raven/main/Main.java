package com.raven.main;

import CodeMain.view.Form_chucNang.FrmKhuyenMai;
import com.CodeMain.Response.ViewCTSPReponse;
import com.CodeMain.Response.ViewHoaDonResponse;
import com.CodeMain.domainModel.ChiTietSP;
import com.CodeMain.domainModel.HoaDon;
import com.CodeMain.services.CTSPService;
import com.CodeMain.services.HoaDonService;
import com.CodeMain.services.serviceImp.CTSPServiceImp;
import com.CodeMain.services.serviceImp.HoaDonServiceImp;
import com.CodeMain.view.Form_chucNang.DangNhap;
import com.CodeMain.view.Form_chucNang.FRMQLKhachHang;
import com.CodeMain.view.Form_chucNang.FRMQLNhanVien;
import com.CodeMain.view.Form_chucNang.FRMQLSanPham;
import com.CodeMain.view.Form_chucNang.FRMThongKe;
import com.CodeMain.view.Form_chucNang.FRMThongtincanhan;
import com.CodeMain.view.Form_chucNang.FrmBanHang;
import com.CodeMain.view.Form_chucNang.FrmHoaDon;
import com.raven.event.EventMenu;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    CTSPService chiTietSPService;
    HoaDonService hoaDonService;
    List<ViewCTSPReponse> _loadCTSP = new ArrayList<>();
    List<ViewHoaDonResponse> _loadHd = new ArrayList<>();

    public Main() {
        initComponents();
        init();
        chiTietSPService = new CTSPServiceImp();
        hoaDonService = new HoaDonServiceImp();
        _loadCTSP = chiTietSPService.getListRes();
        _loadHd = hoaDonService.getListRes();
    }

    // fixx delay
    public List<ViewCTSPReponse> MainloadCTSP() {
        return _loadCTSP;
    }

    public List<ViewHoaDonResponse> MainloadHd() {
        return _loadHd;
    }
//

    private void init() {

        setBackground(new Color(0, 0, 0, 0));  //  Remove background
        menu2.initMoving(this);
        menu2.addEventMenu(new EventMenu() {
            @Override
            public void menuIndexChange(int index) {
//                JOptionPane.showMessageDialog(null, index + "");
                loadJpanel(index);

            }
        });
    }

    public void loadJpanel(int index) {
        switch (index) {
            case 0:
                formMain1.showForm(new FrmBanHang());
                break;
            case 1:
                formMain1.showForm(new FRMQLSanPham());
                break;
            case 2:
                formMain1.showForm(new FrmHoaDon());
                break;
            case 3:
                formMain1.showForm(new FrmKhuyenMai());
                break;
            case 4:
                formMain1.showForm(new FRMThongKe());
                break;
            case 5:
                formMain1.showForm(new FRMQLNhanVien());
                break;
            case 6:
                formMain1.showForm(new FRMQLKhachHang());
                break;
            case 7:
                formMain1.showForm(new FRMThongtincanhan());
                break;
            case 8://dăng xuất
                int dx = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn đăng xuất", "Đăng xuất", 1);
                if (dx == 0) {
                    this.dispose();
                    new DangNhap().setVisible(true);
                }
                break;
            case 9://out
                int outt = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn đóng ứng dụng");
                if (outt == 0) {
                    System.exit(0);
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new com.raven.swing.PanelBorder();
        menu2 = new com.raven.component.Menu();
        formMain1 = new com.raven.component.FormMain();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelBorder1.setBackground(new java.awt.Color(242, 242, 242));

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formMain1, javax.swing.GroupLayout.DEFAULT_SIZE, 1124, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menu2, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                    .addComponent(formMain1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.component.FormMain formMain1;
    private com.raven.component.Menu menu2;
    private com.raven.swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
