/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/DanhMucService.java
package CodeMain.services.serviceImp;

import CodeMain.domainModel.DanhMuc;
=======
package com.CodeMain.services;

import com.CodeMain.domainModel.DanhMuc;
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/DanhMucService.java
import java.util.List;

/**
 *
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/DanhMucService.java
 * @author NhatAn
 */
public interface DanhMucService {
    public List<DanhMuc> getListAll();

    public DanhMuc getOneObj(String ma);
=======
 * @author hungs
 */
public interface DanhMucService {

    public List<DanhMuc> getListAll();

    public DanhMuc getOneObj(String id);
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/DanhMucService.java

    public void save(DanhMuc dm) throws Exception;

    public void update(DanhMuc dm) throws Exception;

<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/DanhMucService.java
    public void delete(String ma) throws Exception;
=======
    public void delete(String id) throws Exception;
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/DanhMucService.java
}
