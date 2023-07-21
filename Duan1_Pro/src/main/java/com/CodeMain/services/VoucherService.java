/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CodeMain.services;

import com.CodeMain.domainModel.Voucher;
import java.util.List;

/**
 *
 * @author hungs
 */
public interface VoucherService {
    
    public List<Voucher> getListAll();

    public Voucher getOneObj(String ma);

    public void save(Voucher ms) throws Exception;

    public void update(Voucher ms) throws Exception;

    public void delete(String ma) throws Exception;
}
