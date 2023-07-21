/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/serviceImp/MauSacServiceImp.java
package CodeMain.services.serviceImp;

import CodeMain.domainModel.MauSac;
import CodeMain.repository.MauSacRepository;
import CodeMain.services.MauSacService;
import java.util.ArrayList;
=======
package com.CodeMain.services.serviceImp;

import com.CodeMain.domainModel.MauSac;
import com.CodeMain.repository.MauSacRepository;
import com.CodeMain.services.MauSacService;
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/serviceImp/MauSacServiceImp.java
import java.util.List;

/**
 *
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/serviceImp/MauSacServiceImp.java
 * @author NhatAn
 */
public class MauSacServiceImp implements MauSacService{
      MauSacRepository msrepo;
    List<MauSac> listms;

    public MauSacServiceImp() {
        msrepo=new MauSacRepository();
        listms=msrepo.getAll();
    }
    
    @Override
    public List<MauSac> getListAll() {
         listms = msrepo.getAll();
        List<MauSac> list = new ArrayList<>();
        for (MauSac x : listms) {
            list.add(x);
        }
        return list.isEmpty() ? null : list;
=======
 * @author hungs
 */
public class MauSacServiceImp implements MauSacService {

    MauSacRepository msRepository;

    public MauSacServiceImp() {
        msRepository = new MauSacRepository();
    }

    @Override
    public List<MauSac> getListAll() {
        return msRepository.getListAll();
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/serviceImp/MauSacServiceImp.java
    }

    @Override
    public MauSac getOneObj(String ma) {
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/serviceImp/MauSacServiceImp.java
        return msrepo.getOneMauSac(ma);
    }

    @Override
    public void save(MauSac ms) throws Exception {     
         ms.setId(null);
        try {
            msrepo.create(ms);
=======
        return msRepository.getOneMauSac(ma);
    }

    @Override
    public void save(MauSac hd) throws Exception {
        hd.setId(null);
        try {
            msRepository.create(hd);
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/serviceImp/MauSacServiceImp.java
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/serviceImp/MauSacServiceImp.java
    public void update(MauSac ms) throws Exception {
         try {
            msrepo.create(ms);
=======
    public void update(MauSac hd) throws Exception {
        try {
            msRepository.create(hd);
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/serviceImp/MauSacServiceImp.java
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void delete(String ma) throws Exception {
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/serviceImp/MauSacServiceImp.java
         try {
            msrepo.delete(ma);
=======
        try {
            msRepository.delete(ma);
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/serviceImp/MauSacServiceImp.java
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/serviceImp/MauSacServiceImp.java
      
    public static void main(String[] args) {
        MauSacServiceImp msImp=new MauSacServiceImp();
        for (var o : msImp.getListAll()) {
            System.out.println(o.toString());
        }
    }
=======

    public static void main(String[] args) {
        MauSacServiceImp kh = new MauSacServiceImp();
        for (var x : kh.getListAll()) {
            System.out.println(x);
        }
    }

>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/serviceImp/MauSacServiceImp.java
}
