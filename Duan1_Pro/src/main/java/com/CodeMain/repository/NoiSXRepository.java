/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/repository/NoiSXRepository.java
package CodeMain.repository;

import java.util.Date;
import CodeMain.Config.HibernateUtil;
import CodeMain.domainModel.Hang;
import CodeMain.domainModel.NoiSX;
=======
package com.CodeMain.repository;

import java.util.Date;
import com.CodeMain.Config.HibernateUtil;
import com.CodeMain.domainModel.Hang;
import com.CodeMain.domainModel.NoiSX;
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/repository/NoiSXRepository.java
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
public class NoiSXRepository {
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/repository/NoiSXRepository.java
     public List<NoiSX>getAll(){
        List<NoiSX>list=new ArrayList<>();
        String hql="from NoiSX";
        try (Session session=HibernateUtil.getFactory().openSession()){
            TypedQuery<NoiSX>qr=session.createQuery(hql);
            list=qr.getResultList();
=======

    public List<NoiSX> getAll() {
        List<NoiSX> list = new ArrayList<>();
        String hql = "from NoiSX";
        try ( Session session = HibernateUtil.getFactory().openSession()) {
            TypedQuery<NoiSX> qr = session.createQuery(hql);
            list = qr.getResultList();
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/repository/NoiSXRepository.java
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/repository/NoiSXRepository.java
     
      public boolean create(NoiSX nsx){
        Transaction tran=null;
        try (Session session=HibernateUtil.getFactory().openSession()){
            tran=session.beginTransaction();
=======

    public boolean create(NoiSX nsx) {
        Transaction tran = null;
        try ( Session session = HibernateUtil.getFactory().openSession()) {
            tran = session.beginTransaction();
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/repository/NoiSXRepository.java
            session.saveOrUpdate(nsx);
            tran.commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/repository/NoiSXRepository.java
      
       public boolean delete(String ma){
        Transaction tran=null;
        try(Session session =HibernateUtil.getFactory().openSession()) {
            tran=session.beginTransaction();
            Query<NoiSX>qr=session.createQuery("delete from NoiSX where ma=:ma");
=======

    public boolean delete(String ma) {
        Transaction tran = null;
        try ( Session session = HibernateUtil.getFactory().openSession()) {
            tran = session.beginTransaction();
            Query<NoiSX> qr = session.createQuery("delete from NoiSX where ma=:ma");
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/repository/NoiSXRepository.java
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
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/repository/NoiSXRepository.java
       
         public NoiSX getOneHang(String ma) {
        NoiSX nsx;
        try ( Session s = HibernateUtil.getFactory().openSession()) {
            Query qr = s.createQuery("from NoiSX where ma like:ma", NoiSX.class);
            qr.setParameter("ma","%"+ ma+"%");
=======

    public NoiSX getOneHang(String ma) {
        NoiSX nsx;
        try ( Session s = HibernateUtil.getFactory().openSession()) {
            Query qr = s.createQuery("from NoiSX where ma like:ma", NoiSX.class);
            qr.setParameter("ma", "%" + ma + "%");
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/repository/NoiSXRepository.java
            nsx = (NoiSX) qr.getSingleResult();
            s.close();
            return nsx;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/repository/NoiSXRepository.java
     public static void main(String[] args) {
        NoiSXRepository nsxrepo=new NoiSXRepository();
         for (var o : nsxrepo.getAll()) {
             System.out.println(o.toString());
         }
=======

    public static void main(String[] args) {
        NoiSXRepository nsxrepo = new NoiSXRepository();
        for (var o : nsxrepo.getAll()) {
            System.out.println(o.toString());
        }
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/repository/NoiSXRepository.java
    }
}
