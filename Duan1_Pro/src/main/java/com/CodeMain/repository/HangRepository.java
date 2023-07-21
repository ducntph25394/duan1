/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/repository/HangRepository.java
package CodeMain.repository;

import CodeMain.Config.HibernateUtil;
import CodeMain.domainModel.Hang;
=======
package com.CodeMain.repository;

import com.CodeMain.Config.HibernateUtil;
import com.CodeMain.domainModel.Hang;
import com.CodeMain.domainModel.Hang;
import com.CodeMain.domainModel.Hang;
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/repository/HangRepository.java
//import java.sql.Date;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
//import org.apache.log4j.Logger;
//import org.springframework.util.ObjectUtils;

/**
 *
 * @author NhatAn
 */
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/repository/HangRepository.java

public class HangRepository {

//    private static final Logger logger = Logger.getLogger(HangRepository.class);
    private Session session = HibernateUtil.getFactory().openSession();

    public List<Hang> getAll() {
        List<Hang> list = new ArrayList<>();
        String hql = "from Hang";
        try ( Session session = HibernateUtil.getFactory().openSession()) {
            TypedQuery<Hang> qr = session.createQuery(hql);
            list = qr.getResultList();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
=======
public class HangRepository {

    public List<Hang> getAll() {
        List<Hang> list = new ArrayList<>();
        try ( Session s = HibernateUtil.getFactory().openSession()) {
            TypedQuery<Hang> qr = s.createQuery("from Hang");
            list = qr.getResultList();
            s.close();
            return list;
        } catch (Exception e) {
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/repository/HangRepository.java
            return null;
        }
    }

<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/repository/HangRepository.java
    public boolean create(Hang hang) {
        Transaction tran = null;
        try ( Session session = HibernateUtil.getFactory().openSession()) {
            tran = session.beginTransaction();
            session.saveOrUpdate(hang);
            tran.commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(String ma) {
        Transaction tran = null;
        try ( Session session = HibernateUtil.getFactory().openSession()) {
            tran = session.beginTransaction();
            Query<Hang> qr = session.createQuery("delete from Hang where ma=:ma");
            qr.setParameter("ma", ma);
            qr.executeUpdate();
            tran.commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            tran.rollback();
            return false;
        }
    }

=======
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/repository/HangRepository.java
    public Hang getOneId(String id) {
        Hang nsx;
        try ( Session s = HibernateUtil.getFactory().openSession()) {
            Query qr = s.createQuery("from Hang where id like:ma", Hang.class);
            qr.setParameter("id", "%" + id + "%");
            nsx = (Hang) qr.getSingleResult();
            s.close();
            return nsx;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Hang getOneHang(String ma) {
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/repository/HangRepository.java
        String hql = "From Hang where ma=:ma";
        Query query = session.createQuery(hql, Hang.class);
        query.setParameter("ma", ma);
        Hang hang = (Hang) query.getSingleResult();
//        if (ObjectUtils.isEmpty(hang)) {
//            logger.debug("hang null ");
//        }
        session.close();
        return hang == null ? null : hang;
//        Hang hang;
//        try ( Session s = HibernateUtil.getFactory().openSession()) {         
//            Query qr = s.createQuery("from Hang where ma =:ma", Hang.class);
//            qr.setParameter("ma", ma);
//            hang = (Hang) qr.getSingleResult();           
//            s.close();
//            return hang;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
    }

    public static void main(String[] args) throws ParseException {
        HangRepository hangRepo = new HangRepository();
//        for (var o : hangRepo.getAll()) {
//            System.out.println(o.toString());
//        }
//        Hang h1=new Hang(null, "ma2", "laptop", new java.sql.Date(0), new java.sql.Date(0), true);
=======
        Hang nd;
        try ( Session s = HibernateUtil.getFactory().openSession()) {
            javax.persistence.Query qr = s.createQuery("from Hang where ma=:ma", Hang.class);
            qr.setParameter("ma", ma);
            nd = (Hang) qr.getSingleResult();
            //tat tam close 
            s.close();
            return nd;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void create(Hang nd) throws Exception {

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
                javax.persistence.Query qr = s.createQuery("delete from Hang where ma=:ma");
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
        HangRepository hd = new HangRepository();
        hd.getAll().forEach(x -> {
            System.out.println(x);
        });
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/repository/HangRepository.java

    }
}
