/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CodeMain.repository;

import com.CodeMain.Config.HibernateUtil;
import com.CodeMain.domainModel.NguoiDung;
import com.CodeMain.domainModel.NguoiDung;
import com.CodeMain.domainModel.TaiKhoan;
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
public class NguoiDungRepository {

    public List<NguoiDung> getListAll() {
        List<NguoiDung> list = new ArrayList<>();
        try ( Session s = HibernateUtil.getFactory().openSession()) {
            TypedQuery<NguoiDung> qr = s.createQuery("from NguoiDung");
            list = qr.getResultList();
            s.close();
            return list;
        } catch (Exception e) {
            return null;
        }
    }

    public NguoiDung getOneNguoiDung(String ma) {
        NguoiDung nd;
        try ( Session s = HibernateUtil.getFactory().openSession()) {
            Query qr = s.createQuery("from NguoiDung where ma=:ma", NguoiDung.class);
            qr.setParameter("ma", ma);
            nd = (NguoiDung) qr.getSingleResult();
            //tat tam close 
            s.close();
            return nd;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void create(NguoiDung nd) throws Exception {

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
                Query qr = s.createQuery("delete from NguoiDung where ma=:ma");
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

    public static void main(String[] args) {
        NguoiDungRepository hd = new NguoiDungRepository();
        hd.getListAll().forEach(x -> {
            System.out.println(x);
        });

    }
}
