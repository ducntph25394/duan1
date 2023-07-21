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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "HoaDon")
@Getter
@Setter

//@ToString
//@AllArgsConstructor
@NoArgsConstructor
public class HoaDon {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id")
    private String id;

    private String ma;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idND", nullable = true)
    private NguoiDung nguoiDung;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "idKH", nullable = true)

    private KhachHang khachHang;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "idVoucher", nullable = true)
    private Voucher voucher;

    @Column(name = "tongTien")
    private double tongTien;

    @Temporal(TemporalType.DATE)
    @Column(name = "createdDate")
    private Date createdDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "updatedDate")
    private Date updatedDate;

    private int trangThai;
    
    @LazyCollection(LazyCollectionOption.FALSE)//fix bug lazy  no session. fix cho jpa 2.0 
    @OneToMany(mappedBy = "hoaDon")//close lazy
    private List<HoaDonCT> ListHDCT = new ArrayList<>();

    public HoaDon(String id, String ma, NguoiDung nguoiDung, KhachHang khachHang, Voucher voucher, double tongTien, Date createdDate, Date updatedDate, int trangThai) {
        this.id = id;
        this.ma = ma;
        this.nguoiDung = nguoiDung;
        this.khachHang = khachHang;
        this.voucher = voucher;
        this.tongTien = tongTien;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.trangThai = trangThai;
    }
   

    @Override
    public String toString() {
        return "HoaDon{" + "id=" + id + ", ma=" + ma + ", nguoiDung=" + nguoiDung + ", khachHang=" + khachHang + ", voucher=" + voucher + ", tongTien=" + tongTien + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", trangThai=" + trangThai + '}';
    }

}
