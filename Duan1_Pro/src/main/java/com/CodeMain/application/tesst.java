package com.CodeMain.application;

import com.CodeMain.domainModel.Voucher;
import com.CodeMain.services.VoucherService;
import com.CodeMain.services.serviceImp.VoucherServiceImp;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author hungs
 */
public class tesst {

    public static void main(String[] args) {
        tesst test = new tesst();
        DecimalFormat df = new DecimalFormat("#,###.0");

        Locale lc = new Locale("nv", "VN");
        NumberFormat nf = NumberFormat.getInstance(lc);
        double a = 346263466.67;
        String b = nf.format(a);

        float c = Float.parseFloat(test.fomartFloat(b));
        System.out.println(c);

        //
        
    }

    public static String currencyWithChosenLocalisation(double value, Locale locale) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        return nf.format(value);
    }

    public String deleteLastKey(String str) {
        if (str.charAt(str.length() - 1) == 'đ') {
            str = str.replace(str.substring(str.length() - 1), "");
            return str;
        } else {
            return str;
        }
    }

    public String fomartFloat(String txt) {
        String pattern = deleteLastKey(txt);
        return pattern = pattern.replaceAll(",", "");
    }
}
