package com.CodeMain.Response;

import com.CodeMain.domainModel.HoaDon;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class ViewHoaDonResponse {

    private String id;

    private String ma;

    private Date ngayTao;

    private String tenNV;

    private String tenKH;

    private int trangThai;

    public ViewHoaDonResponse(HoaDon hd) {
        this.ma = hd.getMa();
        this.ngayTao = hd.getCreatedDate();
        this.tenNV = hd.getNguoiDung() == null ? "Duy Hưng" : hd.getNguoiDung().getHoTen();
        this.tenKH = hd.getKhachHang() == null ? "Khách lẻ" : hd.getKhachHang().getHoTen();
        this.trangThai = hd.getTrangThai();
    }

    public Object[] rowData() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String TT = "";
        if (this.trangThai == 0) {
            TT = "Chưa thanh toán";
        } else if (this.trangThai == 1) {
            TT = "Đã thanh toán";
        } else {
            TT = "Hóa đơn hủy";
        }
        return new Object[]{
            this.ma, sdf.format(this.ngayTao), this.tenNV, this.tenKH, TT
        };
    }

}
