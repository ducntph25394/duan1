/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/serviceImp/SanPhamServiceImp.java
package CodeMain.services.serviceImp;

import CodeMain.domainModel.SanPham;
import CodeMain.repository.SanPhamRepository;
import CodeMain.services.SanPhamService;
import java.util.ArrayList;
import java.util.List;


public class SanPhamServiceImp implements SanPhamService{

    private SanPhamRepository _sprepo;
    private List<SanPham>_listsp;

    public SanPhamServiceImp() {
        _sprepo=new SanPhamRepository();
        _listsp=_sprepo.getList();
    }
    
    
    @Override
    public List<SanPham> getListAll() {
//   _listsp = _sprepo.getList();
        List<SanPham> list = new ArrayList<>();
        for (SanPham x : _listsp) {
            list.add(x);
        }
        return list.isEmpty() ? null : list;
    }
    @Override
    public SanPham getOneObj(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void save(SanPham sp) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(SanPham sp) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
=======
package com.CodeMain.services.serviceImp;

import com.CodeMain.domainModel.SanPham;
import com.CodeMain.domainModel.SanPham;
import com.CodeMain.repository.SanPhamRepository;
import com.CodeMain.repository.SanPhamRepository;
import com.CodeMain.services.SanPhamService;
import java.util.ArrayList;
import java.util.List;

public class SanPhamServiceImp implements SanPhamService {

    SanPhamRepository msRepository;

    public SanPhamServiceImp() {
        msRepository = new SanPhamRepository();
    }

    @Override
    public List<SanPham> getListAll() {
        return msRepository.getListAll();
    }

    @Override
    public SanPham getOneObj(String ma) {
        return msRepository.getOneSanPham(ma);
    }

    @Override
    public void save(SanPham hd) throws Exception {
        hd.setId(null);
        try {
            msRepository.create(hd);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void update(SanPham hd) throws Exception {
        try {
            msRepository.create(hd);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/serviceImp/SanPhamServiceImp.java
    }

    @Override
    public void delete(String ma) throws Exception {
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/serviceImp/SanPhamServiceImp.java
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        public static void main(String[] args) {
        SanPhamServiceImp spservice=new SanPhamServiceImp();
        for (var o : spservice.getListAll()) {
            System.out.println(o.toString());
        }
    }

=======
        try {
            msRepository.delete(ma);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args) {
        SanPhamServiceImp kh = new SanPhamServiceImp();
        for (var x : kh.getListAll()) {
            System.out.println(x);
        }
    }
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/serviceImp/SanPhamServiceImp.java
}
