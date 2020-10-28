package com.acme.mod2;

import com.acme.mod1.Mod1;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Mod1().getName());
        System.out.println(new Mod2().getName());
    }
}