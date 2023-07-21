/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CodeMain.Utilities;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author hungs
 */
public class Validate {

    public boolean validateNullAndisNumber(String num) {
        try {
            double number = Double.parseDouble(num);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
