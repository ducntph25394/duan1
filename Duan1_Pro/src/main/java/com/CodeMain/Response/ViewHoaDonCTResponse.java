package com.CodeMain.Response;

import com.CodeMain.domainModel.HoaDonCT;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author hungs
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class ViewHoaDonCTResponse {

    private String idHDCT;
    private String maCTSP;
    private String tenCTSP;
    private int soLuong;
    private double donGia;

    public ViewHoaDonCTResponse(HoaDonCT hdct) {
        this.idHDCT = hdct.getId();
        this.maCTSP = hdct.getChiTietSP().getMa();
        this.tenCTSP = hdct.getChiTietSP().getSanPham().getTen() + " " + hdct.getChiTietSP().getHang().getTen() + " " + hdct.getChiTietSP().getDanhMuc().getTen();
        this.soLuong = hdct.getSoLuong();
        this.donGia = hdct.getDonGia();
    }

    public Object[] rowData() {
//        DecimalFormat df = new DecimalFormat("#,###.0");
        Locale lc = new Locale("nv", "VN");
        NumberFormat nf = NumberFormat.getInstance(lc);
        return new Object[]{
            this.maCTSP, this.tenCTSP, this.soLuong, nf.format(new BigDecimal(this.donGia))+" đ"
        };
    }

}
