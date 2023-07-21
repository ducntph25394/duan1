/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CodeMain.services.serviceImp;

import com.CodeMain.Config.HibernateUtil;
import com.CodeMain.domainModel.Voucher;
import com.CodeMain.domainModel.Voucher;
import com.CodeMain.domainModel.Voucher;
import com.CodeMain.repository.VoucherRepository;
import com.CodeMain.repository.VoucherRepository;
import com.CodeMain.repository.VoucherRepository;
import com.CodeMain.services.VoucherService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author hungs
 */
public class VoucherServiceImp implements VoucherService {

    VoucherRepository msRepository;

    public VoucherServiceImp() {
        msRepository = new VoucherRepository();
    }

    @Override
    public List<Voucher> getListAll() {
        return msRepository.getListAll();
    }

    @Override
    public Voucher getOneObj(String ma) {
        return msRepository.getOneVoucher(ma);
    }

    @Override
    public void save(Voucher hd) throws Exception {
        hd.setId(null);
        try {
            msRepository.create(hd);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void update(Voucher hd) throws Exception {
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
        VoucherServiceImp kh = new VoucherServiceImp();
        for (var x : kh.getListAll()) {
            System.out.println(x);
        }
    }

}
