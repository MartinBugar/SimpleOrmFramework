package com.martyx.fiktivnyProgram.entity;

import com.martyx.simpleormframework.dbaccess.SOrmManager;

public class Main {

    public static void main(String[] args) {

        SOrmManager manager = new SOrmManager();
        Osoba osoba = manager.getEntityById(0L, Osoba.class);
    }
}
