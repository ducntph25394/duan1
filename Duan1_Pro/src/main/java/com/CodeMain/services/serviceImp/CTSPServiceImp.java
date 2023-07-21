package com.CodeMain.services.serviceImp;

import com.CodeMain.Response.ViewCTSPReponse;
import com.CodeMain.domainModel.ChiTietSP;
import com.CodeMain.domainModel.HoaDon;
import com.CodeMain.repository.CTSPRepository;
import java.util.ArrayList;
import java.util.List;
import com.CodeMain.services.CTSPService;

/**
 *
 * @author hungs
 */
public class CTSPServiceImp implements CTSPService {

    List<ChiTietSP> listCTSP;
    CTSPRepository ctspRepo;

    public CTSPServiceImp() {
        ctspRepo = new CTSPRepository();
        listCTSP = ctspRepo.getListAll();

    }

    @Override
    public List<ViewCTSPReponse> getListRes() {
        listCTSP = ctspRepo.getListAll();
        List<ViewCTSPReponse> list = new ArrayList<>();
        for (ChiTietSP x : listCTSP) {
            list.add(new ViewCTSPReponse(x));
        }
        return list.isEmpty() ? null : list;
    }

    @Override
    public ChiTietSP getOneObj(String ma) {
        return ctspRepo.getOneChiTietSP(ma);
    }

    @Override
    public void save(ChiTietSP ctsp) throws Exception {
        ctsp.setId(null);
        try {
            ctspRepo.create(ctsp);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void update(ChiTietSP ctsp) throws Exception {
        try {
            ctspRepo.create(ctsp);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void delete(String ma) throws Exception {
        try {
            ctspRepo.delete(ma);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args) {
        CTSPServiceImp c = new CTSPServiceImp();

        for (ViewCTSPReponse x : c.getListRes()) {
            System.out.println(x);
        }

    }

    @Override
    public List<ViewCTSPReponse> getListFind(String text) {
        List<ViewCTSPReponse> list = new ArrayList<>();
        for (ChiTietSP x : ctspRepo.getListAll()) {
            if (x.getMa().toLowerCase().contains(text.toLowerCase()) || x.getHang().getTen().toLowerCase().contains(text.toLowerCase())) {
                list.add(new ViewCTSPReponse(x));
            }
        }
        return list;
    }

    @Override
    public List<ChiTietSP> getListAll() {
        return ctspRepo.getListAll();
    }

}
