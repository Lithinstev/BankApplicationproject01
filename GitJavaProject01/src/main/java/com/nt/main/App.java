package com.nt.main;

import com.nt.service.Bankingoperation;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("App.main()");
        Bankingoperation B1=new Bankingoperation();
        double wd=B1.withdrawal(500);
        System.out.println(wd);
        double dd=B1.Deposit(1000);
        System.out.println(dd);
        

    }
}
