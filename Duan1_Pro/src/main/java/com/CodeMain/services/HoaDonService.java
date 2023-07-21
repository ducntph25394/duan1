/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CodeMain.services;

import com.CodeMain.Response.ViewHoaDonResponse;
import com.CodeMain.domainModel.HoaDon;
import java.util.List;

/**
 *
 * @author hungs
 */
public interface HoaDonService {

    public List<ViewHoaDonResponse> getListRes();

    public List<HoaDon> getListAll();

    public HoaDon getOneObj(String ma);

    public void save(HoaDon hd) throws Exception;

    public void update(HoaDon hd) throws Exception;

    public void delete(String ma) throws Exception;
}
