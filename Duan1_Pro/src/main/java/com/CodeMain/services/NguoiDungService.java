/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CodeMain.services;

import com.CodeMain.domainModel.NguoiDung;
import java.util.List;

/**
 *
 * @author hungs
 */
public interface NguoiDungService {

    public List<NguoiDung> getListAll();

    public NguoiDung getOneObj(String ma);

    public void save(NguoiDung tk) throws Exception;

    public void update(NguoiDung tk) throws Exception;

    public void delete(String ma) throws Exception;
}
