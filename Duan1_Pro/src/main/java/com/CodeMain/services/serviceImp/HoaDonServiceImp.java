package com.CodeMain.services.serviceImp;

import com.CodeMain.Response.ViewHoaDonResponse;
import com.CodeMain.domainModel.ChiTietSP;
import com.CodeMain.domainModel.HoaDon;
import com.CodeMain.repository.HoaDonRepository;
import com.CodeMain.services.HoaDonService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hungs
 */
public class HoaDonServiceImp implements HoaDonService {

    HoaDonRepository hdRepository;
    List<HoaDon> listHD;

    public HoaDonServiceImp() {
        hdRepository = new HoaDonRepository();
        listHD = hdRepository.getListAll();
    }

    @Override
    public List<ViewHoaDonResponse> getListRes() {
        listHD = hdRepository.getListAll();
        List<ViewHoaDonResponse> list = new ArrayList<>();
        for (HoaDon x : listHD) {
            list.add(new ViewHoaDonResponse(x));
        }
        return list.isEmpty() ? null : list;
    }

    @Override
    public List<HoaDon> getListAll() {
        return hdRepository.getListAll();
    }

    @Override
    public HoaDon getOneObj(String ma) {
        return hdRepository.getOneHoaDon(ma);
    }

    @Override
    public void save(HoaDon hd) throws Exception {
        hd.setId(null);
        try {
            hdRepository.create(hd);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void update(HoaDon hd) throws Exception {
        try {
            hdRepository.create(hd);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void delete(String ma) throws Exception {
        try {
            hdRepository.delete(ma);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args) {
        HoaDonServiceImp hd = new HoaDonServiceImp();
        hd.getListRes().forEach(x -> {
            System.out.println(x);
        });
    }

}
