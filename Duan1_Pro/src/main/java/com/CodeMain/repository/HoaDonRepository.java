/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CodeMain.repository;

import com.CodeMain.Config.HibernateUtil;
import com.CodeMain.domainModel.HoaDon;
import com.CodeMain.domainModel.HoaDonCT;
//import RavenLogin.login.Login;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author hungs
 */
public class HoaDonRepository {

    //  private final Session s = HibernateUtil.getFactory().openSession();
    public List<HoaDon> getListAll() {
        List<HoaDon> list = new ArrayList<>();
        try ( Session s = HibernateUtil.getFactory().openSession()) {
            TypedQuery<HoaDon> qr = s.createQuery("from HoaDon order by ma");
            list = qr.getResultList();
            s.close();
            return list;
        } catch (Exception e) {
            return null;
        }
    }

    public HoaDon getOneHoaDon(String ma) {
        HoaDon nd;
        try ( Session s = HibernateUtil.getFactory().openSession()) {
            Query qr = s.createQuery("from HoaDon where ma=:ma", HoaDon.class);
            qr.setParameter("ma", ma);
            nd = (HoaDon) qr.getSingleResult();
         //tat tam close 
         s.close();
            return nd;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void create(HoaDon nd) throws Exception {

        try ( Session s = HibernateUtil.getFactory().openSession()) {
            Transaction trans = s.beginTransaction();
            try {
                s.saveOrUpdate(nd);
                trans.commit();
                s.close();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                throw e;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void delete(String ma) throws Exception {
        try ( Session s = HibernateUtil.getFactory().openSession()) {
            Transaction trans = s.beginTransaction();
            try {
                Query qr = s.createQuery("delete from HoaDon where ma=:ma");
                qr.setParameter("ma", ma);
                qr.executeUpdate();
                trans.commit();
                s.close();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                throw e;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Transactional()
    public List<HoaDonCT> getListHDCT(HoaDon hd) {
        return hd.getListHDCT();
    }

    public static void main(String[] args) {
        HoaDonRepository hd = new HoaDonRepository();
        HoaDon hoad = hd.getOneHoaDon("hd1");
       
//       
//        hd.getListHDCT(hoad).forEach(x->{
//             System.out.println(x);
//        });
      

        // HoaDon hoad = new HoaDon(null, "hd4", Login.ndLogin, null, null, new BigDecimal(0), new Date(), new Date(), 1);
//        try {
//            hd.create(hoad);
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }
        for (var x : hd.getListAll()) {
            System.out.println(x);
        }
//        System.out.println("");
        //    System.out.println(hd.getOneHoaDon("hd0"));
    }
}
