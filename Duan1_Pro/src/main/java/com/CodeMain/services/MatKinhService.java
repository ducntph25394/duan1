/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/MatKinhService.java
package CodeMain.services;

import CodeMain.domainModel.MatKinh;
=======
package com.CodeMain.services;

import com.CodeMain.domainModel.MatKinh;
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/MatKinhService.java
import java.util.List;

/**
 *
 * @author NhatAn
 */
public interface MatKinhService {
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/MatKinhService.java
=======

>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/MatKinhService.java
    public List<MatKinh> getListAll();

    public MatKinh getOneObj(String ma);

    public void save(MatKinh mk) throws Exception;

    public void update(MatKinh mk) throws Exception;

    public void delete(String ma) throws Exception;
}
