/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author hungs
 */
@Entity
@Table(name = "Voucher")
@Getter
@Setter
//@ToString
//@AllArgsConstructor
@NoArgsConstructor
public class Voucher {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")

    @Column(name = "id")
    private String id;

    @Column(name = "ma")
    private String ma;

    @Column(name = "ten")
    private String ten;

    @Column(name = "giamGia")
    private Float giamGia;

    @Temporal(TemporalType.DATE)
    @Column(name = "ngayBD")
    private Date ngayBD;

    @Temporal(TemporalType.DATE)
    @Column(name = "ngayKT")
    private Date ngayKT;

    @Temporal(TemporalType.DATE)
    @Column(name = "createdDate")
    private Date createdDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "updatedDate")
    private Date updatedDate;

    @Column(name = "deleted")
    private boolean deleted;

    @OneToMany(mappedBy = "voucher",fetch = FetchType.LAZY)
    private List<HoaDon> listHoaDon = new ArrayList<>();

    public Voucher(String id, String ma, String ten, Float giamGia, Date ngayBD, Date ngayKT, Date createdDate, Date updatedDate, boolean deleted) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.giamGia = giamGia;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.deleted = deleted;
    }

    
    @Override
    public String toString() {
        return "Voucher{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + ", giamGia=" + giamGia + ", ngayBD=" + ngayBD + ", ngayKT=" + ngayKT + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", deleted=" + deleted + '}';
    }

    
}
