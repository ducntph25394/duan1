package com.CodeMain.repository;

<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/repository/CTSPRepository.java
import CodeMain.Config.HibernateUtil;
import CodeMain.domainModel.ChiTietSP;
import CodeMain.domainModel.DanhMuc;
import CodeMain.domainModel.Hang;
import CodeMain.domainModel.MatKinh;
import CodeMain.domainModel.MauSac;
import CodeMain.domainModel.NoiSX;
import CodeMain.domainModel.SanPham;
=======
import com.CodeMain.Config.HibernateUtil;
import com.CodeMain.domainModel.ChiTietSP;
import com.CodeMain.domainModel.DanhMuc;
import com.CodeMain.domainModel.Hang;
import com.CodeMain.domainModel.MatKinh;
import com.CodeMain.domainModel.MauSac;
import com.CodeMain.domainModel.NoiSX;
import com.CodeMain.domainModel.SanPham;
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/repository/CTSPRepository.java
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author hungs
 */
public class CTSPRepository {

//list
    public List<ChiTietSP> getListAll() {
        List<ChiTietSP> list = new ArrayList<>();
        try ( Session s = HibernateUtil.getFactory().openSession()) {
            TypedQuery<ChiTietSP> qr = s.createQuery("from ChiTietSP order by ma");
            list = qr.getResultList();
            s.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ChiTietSP getOneChiTietSP(String ma) {
        ChiTietSP nd;
        try ( Session s = HibernateUtil.getFactory().openSession()) {
            Query qr = s.createQuery("from ChiTietSP where ma=:ma", ChiTietSP.class);
            qr.setParameter("ma", ma);
            nd = (ChiTietSP) qr.getSingleResult();
            s.close();
            return nd;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void create(ChiTietSP ctsp) throws Exception {
        try ( Session s = HibernateUtil.getFactory().openSession()) {
            Transaction trans = s.beginTransaction();
            try {
                s.saveOrUpdate(ctsp);
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

    public void delete(String ma) throws Exception {//xóa là update deleted =1;
        try ( Session s = HibernateUtil.getFactory().openSession()) {
            Transaction trans = s.beginTransaction();
            try {
                Query qr = s.createQuery("delete from ChiTietSP where ma=:ma");
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

    public void save(ChiTietSP ctsp) {
        try ( Session s = HibernateUtil.getFactory().openSession()) {
            Transaction trans = s.beginTransaction();
            try {
                s.save(ctsp);
                trans.commit();
                s.close();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CTSPRepository ctsp = new CTSPRepository();
//        for (var x : ctsp.getListAll()) {
//            System.out.println(x);
//        }
        Session s = HibernateUtil.getFactory().openSession();

        SanPham sp = s.get(SanPham.class, "17AE886E-F066-4EEC-A204-2454AD772206");
        MauSac ms = s.get(MauSac.class, "BF5B2B71-3152-45F6-B70D-72D3B09E50CA");
        DanhMuc dm = s.get(DanhMuc.class, "7907C782-60EF-4996-B195-51D28B29D63A");
        MatKinh mk = s.get(MatKinh.class, "3ECA6E0C-888A-4888-9AD7-82D7CCCA94F5");
        NoiSX nsx = s.get(NoiSX.class, "4F746BEC-C514-4053-9031-0223A9AFE565");
        Hang hang = s.get(Hang.class, "E3AD0E43-0885-40A3-9B7A-580F2946CA82");

//        ChiTietSP ctsp2 = new ChiTietSP(null, "ctsp0001", sp, nsx, hang, ms, mk, dm, null, 1, "dep", 2000, 10);
        ChiTietSP ctsp3 = new ChiTietSP(null, "ctsp0001", sp, nsx, hang, ms, mk, dm, null, 1, "dep", 2000, 10, null, null, false);
        try {
            ctsp.create(ctsp3);
        } catch (Exception ex) {
            Logger.getLogger(CTSPRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/repository/CTSPRepository.java
        s.close();
//        System.out.println(ctsp3);
=======
//        Session s = HibernateUtil.getFactory().openSession();
//        SanPham sp = s.get(SanPham.class, "17AE886E-F066-4EEC-A204-2454AD772206");
//        DanhMuc dm = s.get(DanhMuc.class, "7907C782-60EF-4996-B195-51D28B29D63A");
//        MauSac ms = s.get(MauSac.class, "BF5B2B71-3152-45F6-B70D-72D3B09E50CA");
//        MatKinh mk = s.get(MatKinh.class, "3ECA6E0C-888A-4888-9AD7-82D7CCCA94F5");
//        NoiSX nsx = s.get(NoiSX.class, "4F746BEC-C514-4053-9031-0223A9AFE565");
//        Hang h = s.get(Hang.class, "E3AD0E43-0885-40A3-9B7A-580F2946CA82");
//        s.close();
//        ChiTietSP ct = new ChiTietSP(null, "ctsp5", sp, nsx, h, ms, mk, dm, null, 0, "hfd", 0, 0, new Date(), null, false);
//        try {
//            ctsp.create(ct);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            Logger.getLogger(CTSPRepository.class.getName()).log(Level.SEVERE, null, ex);
//        }
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/repository/CTSPRepository.java

    }
}
