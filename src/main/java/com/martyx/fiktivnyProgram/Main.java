package com.martyx.fiktivnyProgram;

import com.martyx.fiktivnyProgram.entity.Osoba;
import com.martyx.simpleormframework.dbaccess.SOrmManager;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        SOrmManager manager = new SOrmManager();
        Osoba osoba = manager.getEntityById(0L, Osoba.class);
    }
}
