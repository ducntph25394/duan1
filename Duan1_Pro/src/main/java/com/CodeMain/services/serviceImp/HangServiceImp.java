<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/serviceImp/HangServiceImp.java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodeMain.services.serviceImp;

import CodeMain.domainModel.Hang;
import CodeMain.services.HangService;
import CodeMain.repository.HangRepository;
=======
package com.CodeMain.services.serviceImp;

import com.CodeMain.domainModel.Hang;
import com.CodeMain.repository.HangRepository;
import com.com.CodeMain.services.HangService;
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/serviceImp/HangServiceImp.java
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NhatAn
 */
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/serviceImp/HangServiceImp.java
public class HangServiceImp implements HangService{
=======
public class HangServiceImp implements HangService {
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/serviceImp/HangServiceImp.java

    HangRepository hangrepo;
    List<Hang> listH;

    public HangServiceImp() {
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/serviceImp/HangServiceImp.java
        hangrepo=new HangRepository();
        listH=hangrepo.getAll();
    }
    
    
    @Override
    public List<Hang> getListAll() {
=======
        hangrepo = new HangRepository();
        listH = hangrepo.getAll();
    }

    @Override
    public List<Hang> getAll() {
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/serviceImp/HangServiceImp.java
        listH = hangrepo.getAll();
        List<Hang> list = new ArrayList<>();
        for (Hang x : listH) {
            list.add(x);
        }
        return list.isEmpty() ? null : list;
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/serviceImp/HangServiceImp.java
        
        
=======

>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/serviceImp/HangServiceImp.java
    }

    @Override
    public Hang getOneObj(String ma) {
//        return hangrepo
        return hangrepo.getOneHang(ma);
    }

    @Override
    public void save(Hang hang) throws Exception {
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/serviceImp/HangServiceImp.java
         hang.setId(null);
=======
        hang.setId(null);
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/serviceImp/HangServiceImp.java
        try {
            hangrepo.create(hang);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void update(Hang hang) throws Exception {
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/serviceImp/HangServiceImp.java
         try {
=======
        try {
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/serviceImp/HangServiceImp.java
            hangrepo.create(hang);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void delete(String ma) throws Exception {
        try {
            hangrepo.delete(ma);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/serviceImp/HangServiceImp.java
    public void getId(String id){
         try {
=======

    public void getId(String id) {
        try {
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/serviceImp/HangServiceImp.java
            hangrepo.getOneId(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/serviceImp/HangServiceImp.java
    public static void main(String[] args) {
        HangServiceImp hangImp=new HangServiceImp();
        for (var o : hangImp.getListAll()) {
=======

    public static void main(String[] args) {
        HangServiceImp hangImp = new HangServiceImp();
        for (var o : hangImp.getAll()) {
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/serviceImp/HangServiceImp.java
            System.out.println(o.toString());
        }
    }
}
