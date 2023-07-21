/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CodeMain.domainModel;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
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
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "DanhMuc")
@Getter
@Setter
//@ToString
//@AllArgsConstructor
@NoArgsConstructor
public class DanhMuc {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id")
    private String id;

    private String ma;

    private String ten;

    @Temporal(TemporalType.DATE)
    private Date createdDate;

    @Temporal(TemporalType.DATE)
    private Date updatedDate;

    private boolean deleted;
//    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "danhMuc", fetch = FetchType.EAGER)
    private List<ChiTietSP> listCTSP = new ArrayList<>();

    public DanhMuc(String id, String ma, String ten, Date createdDate, Date updatedDate, boolean deleted) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.deleted = deleted;
    }

<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/domainModel/DanhMuc.java
=======
    
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/domainModel/DanhMuc.java
    @Override
    public String toString() {
        return "DanhMuc{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", deleted=" + deleted + '}';
    }

}
