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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
@Table(name = "MatKinh")
@Getter
@Setter

//@AllArgsConstructor
@NoArgsConstructor
public class MatKinh {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id")
    private String id;
    
    private String ma;
    
    private String ten;
    
    private  Date createdDate;
    
    private Date updatedDate;
    
    private boolean deleted;
    
    @OneToMany(mappedBy="matKinh")
    private List<ChiTietSP> ListCTSP= new ArrayList<>();

    public MatKinh(String id, String ma, String ten, Date createdDate, Date updatedDate, boolean deleted) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "MatKinh{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", deleted=" + deleted + '}';
    }
    
    
}
