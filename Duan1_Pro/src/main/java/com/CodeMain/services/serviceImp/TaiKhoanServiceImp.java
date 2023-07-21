/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CodeMain.services.serviceImp;

import com.CodeMain.domainModel.TaiKhoan;
import com.CodeMain.repository.TaiKhoanRepository;
import com.CodeMain.services.TaiKhoanService;
import java.util.List;

/**
 *
 * @author hungs
 */
public class TaiKhoanServiceImp implements TaiKhoanService{

    TaiKhoanRepository msRepository;

    public TaiKhoanServiceImp() {
        msRepository = new TaiKhoanRepository();
    }

    @Override
    public List<TaiKhoan> getListAll() {
        return msRepository.getListAll();
    }

    @Override
    public TaiKhoan getOneObj(String ma) {
        return msRepository.getOneTaiKhoan(ma);
    }

    @Override
    public void save(TaiKhoan hd) throws Exception {
        hd.setId(null);
        try {
            msRepository.create(hd);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void update(TaiKhoan hd) throws Exception {
        try {
            msRepository.create(hd);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void delete(String ma) throws Exception {
        try {
            msRepository.delete(ma);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args) {
        TaiKhoanServiceImp kh = new TaiKhoanServiceImp();
        for (var x : kh.getListAll()) {
            System.out.println(x);
        }
    }
}
