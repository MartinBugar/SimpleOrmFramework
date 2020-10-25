package com.martyx.fiktivnyProgram.entity;

import com.martyx.simpleormframework.anotacie.ID;
import com.martyx.simpleormframework.anotacie.Stlpec;
import com.martyx.simpleormframework.anotacie.Tabulka;

@Tabulka("OSOBA")
public class Osoba {
    @ID
    @Stlpec("ID")
    private Long id;

    @Stlpec("NAME")
    private String meno;

    @Stlpec("SURNAME")
    private String priezvisko;

    @Stlpec("AGE")
    private int vek;

    @Stlpec("ADDRESS")
    private String adresa;



}
