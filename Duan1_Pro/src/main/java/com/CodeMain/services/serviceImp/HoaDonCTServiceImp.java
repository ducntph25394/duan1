package com.CodeMain.services.serviceImp;

import com.CodeMain.Response.ViewHoaDonCTResponse;
import com.CodeMain.domainModel.ChiTietSP;
import com.CodeMain.domainModel.HoaDon;
import com.CodeMain.domainModel.HoaDonCT;
import com.CodeMain.repository.HoaDonCTRepository;
import com.CodeMain.services.HoaDonCTService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hungs
 */
public class HoaDonCTServiceImp implements HoaDonCTService {

    HoaDonCTRepository hdctRepository;

    public HoaDonCTServiceImp() {
        hdctRepository = new HoaDonCTRepository();
        // getListAll();
    }

    @Override
    public List<ViewHoaDonCTResponse> getListRes() {
        List<ViewHoaDonCTResponse> list = new ArrayList<>();
        for (HoaDonCT x : hdctRepository.getListAll()) {
            list.add(new ViewHoaDonCTResponse(x));
        }
        return list.isEmpty() ? null : list;
    }

    @Override
    public HoaDonCT getOneObj(String ma) {
        return hdctRepository.getOneHoaDonCT(ma);
    }

    @Override
    public void save(HoaDonCT hdct) throws Exception {
        hdct.setId(null);
        try {
            hdctRepository.create(hdct);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void update(HoaDonCT hdct) throws Exception {
        try {
            hdctRepository.create(hdct);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void delete(String id) throws Exception {
        try {
            hdctRepository.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args) {
        HoaDonCTServiceImp hd = new HoaDonCTServiceImp();
        for (ViewHoaDonCTResponse x : hd.getListRes()) {
            System.out.println(x);
        }
    }
//    @Override
//    public List<ViewHoaDonCTResponse> getListHDCTRespon(HoaDon hd) {
//        List<ViewHoaDonCTResponse> list = new ArrayList<>();
//        if (hd.getListHDCT().isEmpty()) {
//            return null;
//        } else {
//            for (HoaDonCT x : hd.getListHDCT()) {
//                list.add(new ViewHoaDonCTResponse(x));
//            }
//            return list;
//        }
//
//    }

    @Override
    public List<HoaDonCT> getListAll() {
        return hdctRepository.getListAll();
    }
}
