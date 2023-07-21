/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/serviceImp/DanhMucServiceImp.java
package CodeMain.services.serviceImp;

import CodeMain.domainModel.DanhMuc;
import CodeMain.repository.DanhMucRepository;
=======
package com.CodeMain.services.serviceImp;

import com.CodeMain.domainModel.DanhMuc;
import com.CodeMain.domainModel.DanhMuc;
import com.CodeMain.repository.DanhMucRepository;
import com.CodeMain.services.DanhMucService;
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/serviceImp/DanhMucServiceImp.java
import java.util.ArrayList;
import java.util.List;

/**
 *
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/serviceImp/DanhMucServiceImp.java
 * @author NhatAn
 */
public class DanhMucServiceImp implements DanhMucService {

    private DanhMucRepository _Repository;
    private List<DanhMuc> _List;

    public DanhMucServiceImp() {
        _Repository = new DanhMucRepository();
        _List = _Repository.getAll();
=======
 * @author hungs
 */
public class DanhMucServiceImp implements DanhMucService {

    DanhMucRepository dmRepository;
    List<DanhMuc> listDM;

    public DanhMucServiceImp() {
        dmRepository = new DanhMucRepository();
        listDM = dmRepository.getListAll();
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/serviceImp/DanhMucServiceImp.java
    }

    @Override
    public List<DanhMuc> getListAll() {
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/serviceImp/DanhMucServiceImp.java
        _List = _Repository.getAll();
        List<DanhMuc> list = new ArrayList<>();
        for (DanhMuc x : _List) {
            list.add(x);
        }
        return list.isEmpty() ? null : list;
=======
        listDM = dmRepository.getListAll();
        return listDM.isEmpty() ? null : listDM;
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/serviceImp/DanhMucServiceImp.java
    }

    @Override
    public DanhMuc getOneObj(String ma) {
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/serviceImp/DanhMucServiceImp.java
        return _Repository.getOneHang(ma);
    }

    @Override
    public void save(DanhMuc dm) throws Exception {
        dm.setId(null);
        try {
            _Repository.create(dm);
=======
        return dmRepository.getOneDanhMuc(ma);
    }

    @Override
    public void save(DanhMuc hd) throws Exception {
        hd.setId(null);
        try {
            dmRepository.create(hd);
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/serviceImp/DanhMucServiceImp.java
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/serviceImp/DanhMucServiceImp.java
    public void update(DanhMuc dm) throws Exception {
         try {
            _Repository.create(dm);
=======
    public void update(DanhMuc hd) throws Exception {
        try {
            dmRepository.create(hd);
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/serviceImp/DanhMucServiceImp.java
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void delete(String ma) throws Exception {
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/serviceImp/DanhMucServiceImp.java
         try {
            _Repository.delete(ma);
=======
        try {
            dmRepository.delete(ma);
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/serviceImp/DanhMucServiceImp.java
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/serviceImp/DanhMucServiceImp.java
    public static void main(String[] args) {
        DanhMucServiceImp dm=new DanhMucServiceImp();
        for (var o : dm.getListAll()) {
            System.out.println(o.toString());
        }
=======

    public static void main(String[] args) {
        DanhMucServiceImp hd = new DanhMucServiceImp();
        hd.getListAll().forEach(x
                -> {
            System.out.println(x);
        }
        );
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/serviceImp/DanhMucServiceImp.java
    }

}
