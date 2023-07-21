/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CodeMain.services.serviceImp;

import com.CodeMain.domainModel.NguoiDung;
import com.CodeMain.repository.NguoiDungRepository;
import com.CodeMain.services.NguoiDungService;
import java.util.List;

/**
 *
 * @author hungs
 */
public class NguoiDungServiceImp implements NguoiDungService{
    
    NguoiDungRepository msRepository;

    public NguoiDungServiceImp() {
        msRepository = new NguoiDungRepository();
    }

    @Override
    public List<NguoiDung> getListAll() {
        return msRepository.getListAll();
    }

    @Override
    public NguoiDung getOneObj(String ma) {
        return msRepository.getOneNguoiDung(ma);
    }

    @Override
    public void save(NguoiDung hd) throws Exception {
        hd.setId(null);
        try {
            msRepository.create(hd);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void update(NguoiDung hd) throws Exception {
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
        NguoiDungServiceImp kh = new NguoiDungServiceImp();
        for (var x : kh.getListAll()) {
            System.out.println(x);
        }
    }

}
