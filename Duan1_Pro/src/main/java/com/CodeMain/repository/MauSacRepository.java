/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/repository/MauSacRepository.java
package CodeMain.repository;

import java.util.Date;
import CodeMain.Config.HibernateUtil;
import CodeMain.domainModel.Hang;
import CodeMain.domainModel.MauSac;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author NhatAn
 */
public class MauSacRepository {
     public List<MauSac>getAll(){
        List<MauSac>list=new ArrayList<>();
        String hql="from MauSac";
        try (Session session=HibernateUtil.getFactory().openSession()){
            TypedQuery<MauSac>qr=session.createQuery(hql);
            list=qr.getResultList();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
       public boolean create(MauSac ms){
        Transaction tran=null;
        try (Session session=HibernateUtil.getFactory().openSession()){
            tran=session.beginTransaction();
            session.saveOrUpdate(ms);
            tran.commit();
            session.close();
            return true;
           
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
       
        public boolean delete(String ma){
        Transaction tran=null;
        try(Session session =HibernateUtil.getFactory().openSession()) {
            tran=session.beginTransaction();
            Query<Hang>qr=session.createQuery("delete from MauSac where ma=:ma");
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
        public MauSac getOneMauSac(String ma) {
        MauSac ms;
        try ( Session s = HibernateUtil.getFactory().openSession()) {
            Query qr = s.createQuery("from MauSac where ma like:ma", MauSac.class);
            qr.setParameter("ma", ma+"%");
            ms = (MauSac) qr.getSingleResult();
            s.close();
            return ms;
=======
package com.CodeMain.repository;

import com.CodeMain.Config.HibernateUtil;
import com.CodeMain.domainModel.MauSac;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author hungs
 */
public class MauSacRepository {

    public List<MauSac> getListAll() {
        List<MauSac> list = new ArrayList<>();
        try ( Session s = HibernateUtil.getFactory().openSession()) {
            TypedQuery<MauSac> qr = s.createQuery("from MauSac");
            list = qr.getResultList();
            s.close();
            return list;
        } catch (Exception e) {
            return null;
        }
    }

    public MauSac getOneMauSac(String ma) {
        MauSac nd;
        try ( Session s = HibernateUtil.getFactory().openSession()) {
            Query qr = s.createQuery("from MauSac where ma=:ma", MauSac.class);
            qr.setParameter("ma", ma);
            nd = (MauSac) qr.getSingleResult();
            //tat tam close 
            s.close();
            return nd;
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/repository/MauSacRepository.java
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/repository/MauSacRepository.java
        
//       
      public static void main(String[] args) {
        MauSacRepository msrepo=new MauSacRepository();
          for (var o : msrepo.getAll()) {
//              System.out.println(o.toString());
System.out.println(msrepo.getOneMauSac("ms1").toString());
          }
            
        
    }
     
=======

    public void create(MauSac nd) throws Exception {

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
                Query qr = s.createQuery("delete from MauSac where ma=:ma");
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
        MauSacRepository hd = new MauSacRepository();
        hd.getListAll().forEach(x -> {
            System.out.println(x);
        });

    }
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/repository/MauSacRepository.java
}
