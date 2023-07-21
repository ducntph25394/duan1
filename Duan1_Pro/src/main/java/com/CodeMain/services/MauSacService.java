/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/MauSacService.java
package CodeMain.services;

import CodeMain.domainModel.MauSac;
=======
package com.CodeMain.services;

import com.CodeMain.domainModel.MauSac;
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/MauSacService.java
import java.util.List;

/**
 *
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/MauSacService.java
 * @author NhatAn
 */
public interface MauSacService {
    public List<MauSac> getListAll();

    public MauSac getOneObj(String ma);
=======
 * @author hungs
 */
public interface MauSacService {

    public List<MauSac> getListAll();

    public MauSac getOneObj(String sdt);
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/MauSacService.java

    public void save(MauSac ms) throws Exception;

    public void update(MauSac ms) throws Exception;

    public void delete(String ma) throws Exception;
}
