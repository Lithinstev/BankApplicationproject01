package com.nt.main;

import com.nt.service.Bankingoperation;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args)
     {
           System.out.println(new Bankingoperation().withdrawal(1000));
    }
}
