/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CodeMain.services.serviceImp;

import com.CodeMain.domainModel.KhachHang;
import com.CodeMain.domainModel.KhachHang;
import com.CodeMain.repository.KhachHangRepository;
import com.CodeMain.services.KhachHangService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hungs
 */
public class KhachHangServiceImp implements KhachHangService {

    KhachHangRepository khRepository;

    public KhachHangServiceImp() {
        khRepository = new KhachHangRepository();
    }

    @Override
    public List<KhachHang> getListAll() {
        return khRepository.getListAll();
    }

    @Override
    public KhachHang getOneObj(String ma) {
        return khRepository.getOneKhachHang(ma);
    }

    @Override
    public void save(KhachHang hd) throws Exception {
        hd.setId(null);
        try {
            khRepository.create(hd);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void update(KhachHang hd) throws Exception {
        try {
            khRepository.create(hd);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void delete(String ma) throws Exception {
        try {
            khRepository.delete(ma);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args) {
        KhachHangServiceImp kh = new KhachHangServiceImp();
        for (var x : kh.getListAll()) {
            System.out.println(x);
        }
    }

}
