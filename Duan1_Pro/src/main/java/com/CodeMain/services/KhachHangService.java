/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CodeMain.services;

import com.CodeMain.domainModel.KhachHang;
import java.util.List;

/**
 *
 * @author hungs
 */
public interface KhachHangService {

    public List<KhachHang> getListAll();

    public KhachHang getOneObj(String sdt);

    public void save(KhachHang hd) throws Exception;

    public void update(KhachHang hd) throws Exception;

    public void delete(String ma) throws Exception;
}
