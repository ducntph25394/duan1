package com.CodeMain.domainModel;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "TaiKhoan")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class TaiKhoan {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id")
    private String id;

    private String ma;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idNguoiDung")
    private NguoiDung nguoiDung;

    private String userName;

    private String passWord;

    @Temporal(TemporalType.DATE)
    private Date createdDate;

    @Temporal(TemporalType.DATE)
    private Date updatedDate;

    private boolean deleted;

    @Override
    public String toString() {
        return "TaiKhoan{" + "id=" + id + ", ma=" + ma + ", nguoiDung=" + nguoiDung + ", userName=" + userName + ", passWord=" + passWord + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", deleted=" + deleted + '}';
    }

}
