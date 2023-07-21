package com.CodeMain.Response;

import com.CodeMain.domainModel.ChiTietSP;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ViewCTSPReponse {

    private String id;
    private String ma;
    private String tenCTSP;
    //
    private String tenHang;
    private String tenDanhMuc;
    private String mauSac;
//<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/Response/ViewCTSPReponse.java
//    private BigDecimal donGia;
//=======
//>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/Response/ViewCTSPReponse.java
    private double donGia;
    private int soLuong;
    private int namBH;
    private String matKinh;
    private String noiSX;

    public ViewCTSPReponse(ChiTietSP ctsp) {
        this.id = ctsp.getId();
        this.ma = ctsp.getMa();
//        this.tenCTSP = ctsp.getSanPham().getTen() + " " + ctsp.getHang().getTen() + " " + ctsp.getDanhMuc().getTen();
        this.tenCTSP = ctsp.getSanPham().getTen();
        this.tenDanhMuc=ctsp.getDanhMuc().getTen();
        this.tenHang=ctsp.getHang().getTen();
        this.mauSac = ctsp.getMauSac().getTen();
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/Response/ViewCTSPReponse.java
//        this.donGia = ctsp.getDonGia().setScale(1);
=======
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/Response/ViewCTSPReponse.java
        this.donGia = ctsp.getDonGia();
        this.soLuong = ctsp.getSoLuong();
        this.namBH = ctsp.getNamBH();
        this.matKinh = ctsp.getMatKinh().getTen();
        this.noiSX = ctsp.getNoiSX().getTen();
    }
// giữ lại imei
  

    public Object[] rowData() {
//        DecimalFormat df = new DecimalFormat("#,###.0");
        Locale lc = new Locale("nv", "VN");
        NumberFormat nf = NumberFormat.getInstance(lc);
        return new Object[]{
            this.ma, this.tenCTSP, this.mauSac, nf.format(new BigDecimal(this.donGia))+ " đ", this.soLuong, this.namBH, this.matKinh, this.noiSX
        };
    }

}
