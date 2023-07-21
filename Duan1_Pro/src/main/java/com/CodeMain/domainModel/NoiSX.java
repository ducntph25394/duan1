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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "NoiSX")
@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
public class NoiSX {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id")
    private String id;

    private String ma;

    private String ten;

    private Date createdDate;

    private Date updatedDate;

    private boolean deleted;

    @OneToMany(mappedBy = "noiSX",fetch = FetchType.LAZY)
    private List<ChiTietSP> listCTSP = new ArrayList<>();

    public NoiSX(String id, String ma, String ten, Date createdDate, Date updatedDate, boolean deleted) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "NoiSX{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", deleted=" + deleted + '}';
    }
    
    
}
