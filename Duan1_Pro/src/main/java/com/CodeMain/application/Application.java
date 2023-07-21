package com.CodeMain.application;

import com.CodeMain.view.Form_chucNang.DangNhap;
import com.raven.main.Main;

public class Application {
    
    public void RUnn(int i) {
        if (i == 0) {
            new DangNhap().setVisible(true);
        } else {
            new Main().setVisible(true);
        }
    }
    
    public static void main(String[] args) {
        //0 la login , 1 la homepage,
        int i = 0;
        
        Application a = new Application();
        a.RUnn(i);
    }
    
}
