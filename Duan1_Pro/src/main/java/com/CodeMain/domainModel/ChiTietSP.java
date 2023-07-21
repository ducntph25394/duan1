package com.CodeMain.domainModel;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author hungs
 */
@Entity
@Table(name = "CTSP")
@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
public class ChiTietSP {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id")
    private String id;

    private String ma;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "idSP")
    private SanPham sanPham;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "idNoiSX")
    private NoiSX noiSX;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "idHang")
    private Hang hang;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "idMauSac")
    private MauSac mauSac;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "idMatKinh")
    private MatKinh matKinh;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "idDanhMuc")
    private DanhMuc danhMuc;

    private String image;

    private int namBH;

    private String moTa;

<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/domainModel/ChiTietSP.java
//    private BigDecimal donGia;
=======
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/domainModel/ChiTietSP.java
    private double donGia;

    private int soLuong;

    @Temporal(TemporalType.DATE)
    private Date createdDate;

    @Temporal(TemporalType.DATE)
    private Date updatedDate;

    private boolean deleted;

    @OneToMany(mappedBy = "chiTietSP", fetch = FetchType.LAZY)
    private List<HoaDonCT> ListHDCT = new ArrayList<>();

    public ChiTietSP(String id, String ma, SanPham sanPham, NoiSX noiSX, Hang hang, MauSac mauSac, MatKinh matKinh, DanhMuc danhMuc, String image, int namBH, String moTa, double donGia, int soLuong, Date createdDate, Date updatedDate, boolean deleted) {
        this.id = id;
        this.ma = ma;
        this.sanPham = sanPham;
        this.noiSX = noiSX;
        this.hang = hang;
        this.mauSac = mauSac;
        this.matKinh = matKinh;
        this.danhMuc = danhMuc;
        this.image = image;
        this.namBH = namBH;
        this.moTa = moTa;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.deleted = deleted;
    }

<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/domainModel/ChiTietSP.java
  
//
//    public ChiTietSP(String id, String ma, SanPham sanPham, NoiSX noiSX, Hang hang, MauSac mauSac, MatKinh matKinh, DanhMuc danhMuc, String image, int namBH, String moTa, double donGia, int soLuong) {
//        this.id = id;
//        this.ma = ma;
//        this.sanPham = sanPham;
//        this.noiSX = noiSX;
//        this.hang = hang;
//        this.mauSac = mauSac;
//        this.matKinh = matKinh;
//        this.danhMuc = danhMuc;
//        this.image = image;
//        this.namBH = namBH;
//        this.moTa = moTa;
//        this.donGia = donGia;
//        this.soLuong = soLuong;
//    }

    @Override
    public String toString() {
        return "ChiTietSP{" + "id=" + id + ", ma=" + ma + ", sanPham=" + sanPham + ", noiSX=" + noiSX + ", hang=" + hang + ", mauSac=" + mauSac + ", matKinh=" + matKinh + ", danhMuc=" + danhMuc + ", image=" + image + ", namBH=" + namBH + ", moTa=" + moTa + ", donGia=" + donGia + ", soLuong=" + soLuong + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", deleted=" + deleted +  '}';
=======
    @Override
    public String toString() {
        return "ChiTietSP{" + "id=" + id + ", ma=" + ma + ", sanPham=" + sanPham + ", noiSX=" + noiSX + ", hang=" + hang + ", mauSac=" + mauSac + ", matKinh=" + matKinh + ", danhMuc=" + danhMuc + ", image=" + image + ", namBH=" + namBH + ", moTa=" + moTa + ", donGia=" + donGia + ", soLuong=" + soLuong + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", deleted=" + deleted + '}';
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/domainModel/ChiTietSP.java
    }

}
