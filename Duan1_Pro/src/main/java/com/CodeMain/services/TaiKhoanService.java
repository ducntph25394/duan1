/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CodeMain.services;

import com.CodeMain.domainModel.TaiKhoan;
import java.util.List;

/**
 *
 * @author hungs
 */
public interface TaiKhoanService {

    public List<TaiKhoan> getListAll();

    public TaiKhoan getOneObj(String ma);

    public void save(TaiKhoan tk) throws Exception;

    public void update(TaiKhoan tk) throws Exception;

    public void delete(String ma) throws Exception;
}
