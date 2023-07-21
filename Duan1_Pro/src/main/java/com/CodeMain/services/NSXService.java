/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
<<<<<<< HEAD:Duan1_ui/src/main/java/CodeMain/services/NSXService.java
package CodeMain.services;

import CodeMain.domainModel.NoiSX;
=======
package com.CodeMain.services;

import com.CodeMain.domainModel.NoiSX;
>>>>>>> 9465c0c113e4293aba461b914ed495f1f8d2042e:Duan1_Pro/src/main/java/com/CodeMain/services/NSXService.java
import java.util.List;
import javax.naming.NoInitialContextException;

/**
 *
 * @author NhatAn
 */
public interface NSXService {

    public List<NoiSX> getListAll();

    public NoiSX getOneObj(String ma);

    public void save(NoiSX nsx) throws Exception;

    public void update(NoiSX ctsp) throws Exception;

    public void delete(String ma) throws Exception;
}
