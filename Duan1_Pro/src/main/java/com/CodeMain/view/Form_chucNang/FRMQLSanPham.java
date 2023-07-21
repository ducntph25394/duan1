/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.CodeMain.view.Form_chucNang;

import com.CodeMain.Response.ViewCTSPReponse;
import com.CodeMain.domainModel.ChiTietSP;
import com.CodeMain.domainModel.DanhMuc;
import com.CodeMain.domainModel.Hang;
import com.CodeMain.domainModel.MatKinh;
import com.CodeMain.domainModel.MauSac;
import com.CodeMain.domainModel.NoiSX;
import com.CodeMain.domainModel.SanPham;
import com.CodeMain.repository.SanPhamRepository;
import com.CodeMain.services.DanhMucService;
import com.CodeMain.services.MatKinhService;
import com.CodeMain.services.MauSacService;
import com.CodeMain.services.NSXService;
import com.CodeMain.services.SanPhamService;
import com.CodeMain.services.serviceImp.CTSPServiceImp;
import com.CodeMain.services.serviceImp.DanhMucServiceImp;
import com.CodeMain.services.serviceImp.HangServiceImp;
import com.CodeMain.services.serviceImp.MatKinhServiceImp;
import com.CodeMain.services.serviceImp.MauSacServiceImp;
import com.CodeMain.services.serviceImp.NoiSXServiceImp;
import com.CodeMain.services.serviceImp.SanPhamServiceImp;
import com.com.CodeMain.services.HangService;
import java.awt.Image;
import java.io.File;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.bytebuddy.jar.asm.Handle;

/**
 *
 * @author hungs
 */
public class FRMQLSanPham extends javax.swing.JPanel {

    /**
     * Creates new form FRMQLSanPham
     */
    private CTSPServiceImp _CTSPServiceImp;
    private List<ViewCTSPReponse> listctsp;
    private List<MauSac> listms;
    private List<NoiSX> listNSX;
    private List<MatKinh> listMk;
    private List<DanhMuc> listDm;
    private List<Hang> listH;
    private List<SanPham> listSp;
    private NSXService _NoiSXServiceImp;
    private MauSacService _MauSacServiceImp;
    private MatKinhService _MatKinhServiceImp;
    private DanhMucService _DanhMucServiceImp;
    private HangService _HangServiceImp;
    private SanPhamService _SanPhamServiceImp;
    private String idClick;
    private DefaultTableModel _Model;
    private String mactsp;

    public FRMQLSanPham() {
        initComponents();

        _CTSPServiceImp = new CTSPServiceImp();
        _MauSacServiceImp = new MauSacServiceImp();
        _NoiSXServiceImp = new NoiSXServiceImp();
        _MatKinhServiceImp = new MatKinhServiceImp();
        _DanhMucServiceImp = new DanhMucServiceImp();
        _HangServiceImp = new HangServiceImp();
        _SanPhamServiceImp = new SanPhamServiceImp();

        listctsp = _CTSPServiceImp.getListRes();
        listSp = _SanPhamServiceImp.getListAll();
        listNSX = _NoiSXServiceImp.getListAll();
        listms = _MauSacServiceImp.getListAll();
        listMk = _MatKinhServiceImp.getListAll();
        listDm = _DanhMucServiceImp.getListAll();
        listH = _HangServiceImp.getAll();

        for (NoiSX o : listNSX) {
            cbo_noisx.addItem(o.getTen());
        }
        for (SanPham o : listSp) {
            cbo_ctsp.addItem(o.getTen());
        }
        for (MatKinh o : listMk) {
            cbo_matkinh.addItem(o.getTen());
        }
        for (MauSac o : listms) {
            cbo_mausac.addItem(o.getTen());
        }
        for (DanhMuc o : listDm) {
            cbo_danhmuc.addItem(o.getTen());
        }
        for (Hang o : listH) {
            cbo_hang.addItem(o.getTen());
        }
        LoadTable();

    }//D:\duan1_new\Duan1_ui\src\main\icon
//    String dirSystem = System.getProperty("user.dir");// cái này auto l?y dén duong dan c?a project xong chi + anh.png
//    String ddanAnh = dirSystem.concat(mactsp);
//    String anhMain = "anh1.jpg";// test cái này nhé. 
    String duongdananh = "";
//D:\\duan1_new\\Duan1_ui\\src\\main\\java\\CodeMain\\view\\image\\anh1.jpg"

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblDSCTSP = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cbo_noisx = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txt_ma = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbo_ctsp = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbo_mausac = new javax.swing.JComboBox<>();
        cbo_matkinh = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_mota = new javax.swing.JTextArea();
        txt_dongia = new javax.swing.JTextField();
        txt_soluong = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lbl_image = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt_nambh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbo_hang = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbo_danhmuc = new javax.swing.JComboBox<>();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        btn_clear = new javax.swing.JButton();

        tblDSCTSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tên Sản Phẩm", "Màu Sắc", "Nơi Sản Xuất", "Mặt Kính", "Đơn Giá", "Số Lượng", "Năm BH"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDSCTSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSCTSPMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDSCTSP);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ SẢN PHẨM");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Thông tin sp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel2.setText("MaCTSP");

        jLabel3.setText("Sản Phẩm");

        jLabel4.setText("NoiSX");

        jLabel6.setText("Màu Sắc");

        jLabel8.setText("Mặt  kính");

        jLabel10.setText("Năm BH");

        jLabel12.setText("Đơn giá");

        jLabel13.setText("Số lượng");

        txt_mota.setColumns(20);
        txt_mota.setRows(5);
        jScrollPane1.setViewportView(txt_mota);

        jLabel11.setText("Mô tả ");

        lbl_image.setText("image");
        lbl_image.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("Chon image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Hang");

        jLabel7.setText("DanhMuc");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbo_ctsp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_ma, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbo_noisx, 0, 158, Short.MAX_VALUE)
                            .addComponent(cbo_hang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(cbo_mausac, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbo_matkinh, 0, 154, Short.MAX_VALUE)
                            .addComponent(txt_nambh)
                            .addComponent(cbo_danhmuc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_dongia, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_soluong, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_soluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txt_ma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(cbo_ctsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(cbo_mausac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12)
                                        .addComponent(txt_dongia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(cbo_matkinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel4)
                                                .addComponent(cbo_noisx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(cbo_danhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(24, 24, 24)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(cbo_hang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10)
                                        .addComponent(txt_nambh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel7)))))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        btn_clear.setText("CLEAR");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(386, 386, 386)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btn_add)
                                .addGap(32, 32, 32)
                                .addComponent(btn_update)
                                .addGap(34, 34, 34)
                                .addComponent(btn_delete)
                                .addGap(67, 67, 67)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_clear)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add)
                    .addComponent(btn_update)
                    .addComponent(btn_delete)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void LoadTable() {
        _Model = (DefaultTableModel) tblDSCTSP.getModel();
        _Model.setRowCount(0);
        for (ViewCTSPReponse o : _CTSPServiceImp.getListRes()) {
            _Model.addRow(new Object[]{
                o.getMa(), o.getTenCTSP(), o.getMauSac(), o.getNoiSX(), o.getMatKinh(), o.getDonGia(), o.getSoLuong(), o.getNamBH()
            });
        }
    }

    public ChiTietSP getGUI() {

        String id, ma, mota;
        int namBH, soluong;
        double dongia;
        ma = txt_ma.getText();
        mota = txt_mota.getText();
        namBH = Integer.parseInt(txt_nambh.getText());
        dongia = Double.parseDouble(txt_dongia.getText());
        soluong = Integer.parseInt(txt_soluong.getText());

        int index1 = cbo_ctsp.getSelectedIndex();
        SanPham sp = listSp.get(index1);
//        ViewCTSPReponse ctsp = listctsp.get(index1);
        int index2 = cbo_noisx.getSelectedIndex();
        int index3 = cbo_matkinh.getSelectedIndex();
        int index4 = cbo_mausac.getSelectedIndex();
        int index5 = cbo_danhmuc.getSelectedIndex();
        int index6 = cbo_hang.getSelectedIndex();
        MauSac ms = listms.get(index4);
        MatKinh mk = listMk.get(index3);
        NoiSX nsx = listNSX.get(index2);
        DanhMuc dm = listDm.get(index5);
        Hang h = listH.get(index6);
//        ChiTietSP ctsp1 = new ChiTietSP(null, ma,sp, nsx, h, ms, mk, dm, null, namBH, mota, dongia, soluong);
        ChiTietSP ctsp1 = new ChiTietSP(null, ma, sp, nsx, h, ms, mk, dm, duongdananh, namBH, mota, dongia, soluong, new Date(), new Date(), true);
        return ctsp1;
    }

    public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(lbl_image.getWidth(), lbl_image.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    private void tblDSCTSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSCTSPMouseClicked
        // TODO add your handling code here:
        int rowclDanhsachSP = tblDSCTSP.getSelectedRow();
        if (rowclDanhsachSP == -1) {
            return;
        }

        mactsp = tblDSCTSP.getModel().getValueAt(rowclDanhsachSP, 0).toString();
        String tenctsp = tblDSCTSP.getModel().getValueAt(rowclDanhsachSP, 1).toString();
        //

//        idClick = tblDSCTSP.getModel().getValueAt(rowclDanhsachSP, 0).toString();
        ChiTietSP temp = _CTSPServiceImp.getOneObj(mactsp);
        mactsp = temp.getMa();
        txt_ma.setText(temp.getMa());
        txt_mota.setText(temp.getMoTa());
        txt_nambh.setText(String.valueOf(temp.getNamBH()));
        txt_soluong.setText(String.valueOf(temp.getSoLuong()));
        cbo_ctsp.setSelectedItem(temp.getSanPham().getTen());
        cbo_noisx.setSelectedItem(temp.getNoiSX().getTen());
        cbo_matkinh.setSelectedItem(temp.getMatKinh().getTen());
        cbo_mausac.setSelectedItem(temp.getMauSac().getTen());
        cbo_danhmuc.setSelectedItem(temp.getDanhMuc().getTen());
        cbo_hang.setSelectedItem(temp.getHang().getTen());
        txt_dongia.setText(String.valueOf(temp.getDonGia()));
        lbl_image.setIcon(ResizeImage(temp.getImage()));

        idClick = temp.getId();
        System.out.println(idClick);
    }//GEN-LAST:event_tblDSCTSPMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            JFileChooser f = new JFileChooser("D:\\img_dongho");
//            JFileChooser f = new JFileChooser(ddanAnh);
            f.setDialogTitle("open file");
            f.showOpenDialog(null);
            File ftenanh = f.getSelectedFile();
            duongdananh = ftenanh.getAbsolutePath();
            if (duongdananh != null) {
                lbl_image.setIcon(ResizeImage(String.valueOf(duongdananh)));
                System.out.println(duongdananh);
            } else {
                JOptionPane.showMessageDialog(this, "Ban chua chon anh");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ban chua chon anh");

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        try {
            if (checkForm()) {
                _CTSPServiceImp.save(getGUI());
                LoadTable();
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                reset();
            }

//JOptionPane.showMessageDialog(this, getGUI());
        } catch (Exception ex) {
//            Logger.getLogger(FRMQLSanPham.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "that bai");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed

        var temp = new ChiTietSP();
        temp.setMa(mactsp);
        try {
            _CTSPServiceImp.delete(mactsp);
            LoadTable();
            reset();
            mactsp = "";
            JOptionPane.showMessageDialog(this, "delete thanh cong");
        } catch (Exception ex) {
            Logger.getLogger(FRMQLSanPham.class.getName()).log(Level.SEVERE, null, ex);

        }

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        var temp = getGUI();
        temp.setId(idClick);
        try {
            _CTSPServiceImp.update(temp);
            LoadTable();
            JOptionPane.showMessageDialog(this, "update thanh cong");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "update that bai");
            ex.printStackTrace();

        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        reset();
    }//GEN-LAST:event_btn_clearActionPerformed

    public boolean checkForm() {
        String p_mota = "[a-zA-Z0-9]+";
        String p_so = "[0-9]+";
        if (txt_ma.getText().isEmpty() || txt_mota.getText().isEmpty() || txt_dongia.getText().isEmpty() || txt_nambh.getText().isEmpty() || txt_soluong.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhap du thong tin");
            return false;
        }
        if (txt_ma.getText().matches(p_mota) == false) {
            JOptionPane.showMessageDialog(this, "Mã không hop le!");
            return false;
        }
//        if (txt_mota.getText().matches(p_mota) == false) {
//            JOptionPane.showMessageDialog(this, "Mo ta khong hop le!");
//            return false;
//        }
        if (txt_nambh.getText().matches(p_so) == false || txt_soluong.getText().matches(p_so) == false) {
            JOptionPane.showMessageDialog(this, "So nhap vao khong hop le!");
            return false;
        }
        return true;
    }

    public void reset() {
        txt_ma.setText("");
        txt_dongia.setText("");
        txt_mota.setText("");
        txt_nambh.setText("");
        txt_soluong.setText("");
        lbl_image.setIcon(ResizeImage(""));
        cbo_ctsp.setSelectedIndex(0);
        cbo_danhmuc.setSelectedIndex(0);
        cbo_mausac.setSelectedIndex(0);
        cbo_hang.setSelectedIndex(0);
        cbo_noisx.setSelectedIndex(0);
        cbo_matkinh.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cbo_ctsp;
    private javax.swing.JComboBox<String> cbo_danhmuc;
    private javax.swing.JComboBox<String> cbo_hang;
    private javax.swing.JComboBox<String> cbo_matkinh;
    private javax.swing.JComboBox<String> cbo_mausac;
    private javax.swing.JComboBox<String> cbo_noisx;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JTable tblDSCTSP;
    private javax.swing.JTextField txt_dongia;
    private javax.swing.JTextField txt_ma;
    private javax.swing.JTextArea txt_mota;
    private javax.swing.JTextField txt_nambh;
    private javax.swing.JTextField txt_soluong;
    // End of variables declaration//GEN-END:variables
}
