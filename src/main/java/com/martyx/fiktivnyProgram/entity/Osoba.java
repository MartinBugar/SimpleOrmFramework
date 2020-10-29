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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public Integer getVek() {
        return vek;
    }

    public void setVek(Integer vek) {
        this.vek = vek;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}
