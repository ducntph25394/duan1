/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/HangService.java
package CodeMain.services;

import CodeMain.domainModel.ChiTietSP;
import CodeMain.domainModel.Hang;
=======
package com.com.CodeMain.services;

import com.CodeMain.domainModel.Hang;
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/HangService.java
import java.util.List;

/**
 *
 * @author NhatAn
 */
public interface HangService {
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/HangService.java
    public List<Hang> getListAll();
=======

    public List<Hang> getAll();
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/HangService.java

    public Hang getOneObj(String ma);

    public void save(Hang hang) throws Exception;

    public void update(Hang hang) throws Exception;

    public void delete(String ma) throws Exception;

}
