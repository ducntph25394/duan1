/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/repository/MatKinhRepository.java
package CodeMain.repository;

import CodeMain.domainModel.MatKinh;
import CodeMain.Config.HibernateUtil;
=======
package com.CodeMain.repository;

import com.CodeMain.domainModel.MatKinh;
import com.CodeMain.Config.HibernateUtil;
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/repository/MatKinhRepository.java

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
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/repository/MatKinhRepository.java
public class MatKinhRepository {
    
=======

public class MatKinhRepository {

>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/repository/MatKinhRepository.java
    public List<MatKinh> getAll() {
        List<MatKinh> list = new ArrayList<>();
        String hql = "from MatKinh";
        try ( Session session = HibernateUtil.getFactory().openSession()) {
            TypedQuery<MatKinh> qr = session.createQuery(hql);
            list = qr.getResultList();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean create(MatKinh dm) {
        Transaction tran = null;
        try ( Session session = HibernateUtil.getFactory().openSession()) {
            tran = session.beginTransaction();
            session.saveOrUpdate(dm);
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
            Query<MatKinh> qr = session.createQuery("delete from MatKinh where ma=:ma");
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

    public MatKinh getOneId(String id) {
        MatKinh nsx;
        try ( Session s = HibernateUtil.getFactory().openSession()) {
            Query qr = s.createQuery("from MatKinh where id like:ma", MatKinh.class);
            qr.setParameter("id", "%" + id + "%");
            nsx = (MatKinh) qr.getSingleResult();
            s.close();
            return nsx;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public MatKinh getOneHang(String ma) {
        String hql = "From MatKinh where ma=:ma";
        try ( Session s = HibernateUtil.getFactory().openSession()) {
            Query query = s.createQuery(hql, MatKinh.class);
            query.setParameter("ma", ma);
            MatKinh hang = (MatKinh) query.getSingleResult();
            s.close();
            return hang == null ? null : hang;
        } catch (Exception e) {
            return null;
        }

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
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/repository/MatKinhRepository.java
    public static void main(String[] args) {
        MatKinhRepository dm=new MatKinhRepository();
=======

    public static void main(String[] args) {
        MatKinhRepository dm = new MatKinhRepository();
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/repository/MatKinhRepository.java
        for (var o : dm.getAll()) {
            System.out.println(o.toString());
        }
    }
}
