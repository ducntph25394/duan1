/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/SanPhamService.java
package CodeMain.services;

import CodeMain.domainModel.SanPham;
=======
package com.CodeMain.services;

import com.CodeMain.domainModel.SanPham;
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/SanPhamService.java
import java.util.List;

/**
 *
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/SanPhamService.java
 * @author NhatAn
 */
public interface SanPhamService {
    
=======
 * @author hungs
 */
public interface SanPhamService {

>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/SanPhamService.java
    public List<SanPham> getListAll();

    public SanPham getOneObj(String ma);

<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/SanPhamService.java
    public void save(SanPham sp) throws Exception;

    public void update(SanPham sp) throws Exception;
=======
    public void save(SanPham tk) throws Exception;

    public void update(SanPham tk) throws Exception;
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/SanPhamService.java

    public void delete(String ma) throws Exception;
}
