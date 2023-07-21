package com.CodeMain.repository;

import com.CodeMain.Config.HibernateUtil;
import com.CodeMain.domainModel.ChiTietSP;
import com.CodeMain.domainModel.HoaDon;
import com.CodeMain.domainModel.HoaDonCT;
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
public class HoaDonCTRepository {

    public List<HoaDonCT> getListAll() {
        List<HoaDonCT> list = new ArrayList<>();
        try ( Session s = HibernateUtil.getFactory().openSession()) {
            TypedQuery<HoaDonCT> qr = s.createQuery("from HoaDonCT");
            list = qr.getResultList();
            s.close();
            return list;
        } catch (Exception e) {
            return null;
        }
    }

    public HoaDonCT getOneHoaDonCT(String id) {
        HoaDonCT hdct;
        try ( Session s = HibernateUtil.getFactory().openSession()) {
            Query qr = s.createQuery("from HoaDonCT where id=:id", HoaDonCT.class);
            qr.setParameter("id", id);
            hdct = (HoaDonCT) qr.getSingleResult();
            s.close();
            return hdct;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void create(HoaDonCT hdct) throws Exception {

        try ( Session s = HibernateUtil.getFactory().openSession()) {
            Transaction trans = s.beginTransaction();
            try {
                s.saveOrUpdate(hdct);
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

    public void delete(String id) throws Exception {
        try ( Session s = HibernateUtil.getFactory().openSession()) {
            Transaction trans = s.beginTransaction();
            try {
                Query qr = s.createQuery("delete from HoaDonCT where id=:id");
                qr.setParameter("id", id);
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
        HoaDonCTRepository hdct = new HoaDonCTRepository();
        for (var x : hdct.getListAll()) {
            System.out.println(x);
        }
        //  System.out.println(hdct.getOneHoaDonCT("ABCD49AF-9E91-40DF-445A-5FBF99769C75"));
    }
}
