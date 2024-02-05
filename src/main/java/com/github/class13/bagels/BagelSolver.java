package com.github.class13.bagels;

import javassist.*;

public class BagelSolver {

    static {
        try {
            CtClass bagelClass = ClassPool.getDefault().get("com.github.class13.bagels.Bagel");

            CtMethod method = bagelClass.getDeclaredMethod("getValue");

            method.setBody("{return 4;}");

            bagelClass.toClass();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Bagel getBagel()  {
        return new Bagel();
    }
}
