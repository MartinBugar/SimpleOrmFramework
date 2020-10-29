package com.martyx.fiktivnyProgram;

import com.martyx.fiktivnyProgram.entity.Osoba;
import com.martyx.simpleormframework.dbaccess.SOrmManager;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws Exception {

        SOrmManager manager = new SOrmManager();
        Osoba osoba = manager.getEntityById(0L, Osoba.class);

        System.out.println(osoba.getId());
        System.out.println(osoba.getMeno());
        System.out.println(osoba.getPriezvisko());
        System.out.println(osoba.getVek());
        System.out.println(osoba.getAdresa());
    }
}
