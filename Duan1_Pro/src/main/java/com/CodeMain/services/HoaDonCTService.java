/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CodeMain.services;

import com.CodeMain.Response.ViewHoaDonCTResponse;
import com.CodeMain.domainModel.ChiTietSP;
import com.CodeMain.domainModel.HoaDon;
import com.CodeMain.domainModel.HoaDonCT;
import java.util.List;

/**
 *
 * @author hungs
 */
public interface HoaDonCTService {

    public List<ViewHoaDonCTResponse> getListRes();
    
    public List<HoaDonCT> getListAll();

    public HoaDonCT getOneObj(String id);

    public void save(HoaDonCT hdct) throws Exception;

    public void update(HoaDonCT hdct) throws Exception;

    public void delete(String id) throws Exception;
    
    
}
