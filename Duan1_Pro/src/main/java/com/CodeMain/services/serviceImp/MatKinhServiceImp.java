/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/serviceImp/MatKinhServiceImp.java
package CodeMain.services.serviceImp;

import CodeMain.domainModel.MatKinh;
import CodeMain.repository.MatKinhRepository;
import CodeMain.services.MatKinhService;
=======
package com.CodeMain.services.serviceImp;

import com.CodeMain.domainModel.MatKinh;
import com.CodeMain.repository.MatKinhRepository;
import com.CodeMain.services.MatKinhService;
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/serviceImp/MatKinhServiceImp.java
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NhatAn
 */
public class MatKinhServiceImp implements MatKinhService {

    private MatKinhRepository _Repository;
    private List<MatKinh> _List;

    public MatKinhServiceImp() {
        _Repository = new MatKinhRepository();
        _List = _Repository.getAll();
    }

    @Override
    public List<MatKinh> getListAll() {
        _List = _Repository.getAll();
        List<MatKinh> list = new ArrayList<>();
        for (MatKinh x : _List) {
            list.add(x);
        }
        return list.isEmpty() ? null : list;
    }

    @Override
    public MatKinh getOneObj(String ma) {
        return _Repository.getOneHang(ma);
    }

    @Override
    public void save(MatKinh mk) throws Exception {
        mk.setId(null);
        try {
            _Repository.create(mk);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void update(MatKinh mk) throws Exception {
        try {
            _Repository.create(mk);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void delete(String ma) throws Exception {
        try {
            _Repository.delete(ma);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/serviceImp/MatKinhServiceImp.java
    public static void main(String[] args) {
        MatKinhServiceImp mk=new MatKinhServiceImp();
=======

    public static void main(String[] args) {
        MatKinhServiceImp mk = new MatKinhServiceImp();
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/serviceImp/MatKinhServiceImp.java
        for (var o : mk.getListAll()) {
            System.out.println(o.toString());
        }
    }

}
