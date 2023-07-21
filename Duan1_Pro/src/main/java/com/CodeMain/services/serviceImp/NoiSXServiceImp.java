/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/serviceImp/NoiSXServiceImp.java
package CodeMain.services.serviceImp;

import CodeMain.domainModel.NoiSX;
import CodeMain.repository.NoiSXRepository;
import CodeMain.services.NSXService;
=======
package com.CodeMain.services.serviceImp;

import com.CodeMain.domainModel.NoiSX;
import com.CodeMain.repository.NoiSXRepository;
import com.CodeMain.services.NSXService;
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/serviceImp/NoiSXServiceImp.java
import java.util.ArrayList;
import java.util.List;

public class NoiSXServiceImp implements NSXService {

    NoiSXRepository nsxRepo;
    List<NoiSX> listNSX;

    public NoiSXServiceImp() {
        nsxRepo = new NoiSXRepository();
        listNSX = nsxRepo.getAll();
    }

    @Override
    public List<NoiSX> getListAll() {
        listNSX = nsxRepo.getAll();
        List<NoiSX> list = new ArrayList<>();
        for (NoiSX x : listNSX) {
            list.add(x);
        }
        return list.isEmpty() ? null : list;
    }

    @Override
    public NoiSX getOneObj(String ma) {
        return nsxRepo.getOneHang(ma);
    }

    @Override
    public void save(NoiSX nsx) throws Exception {
        nsx.setId(null);
        try {
            nsxRepo.create(nsx);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void update(NoiSX ctsp) throws Exception {
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/serviceImp/NoiSXServiceImp.java
         try {
=======
        try {
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/serviceImp/NoiSXServiceImp.java
            nsxRepo.create(ctsp);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void delete(String ma) throws Exception {
        try {
            nsxRepo.delete(ma);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

}
