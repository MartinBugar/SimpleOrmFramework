package com.martyx.simpleormframework.dbaccess;

import com.martyx.simpleormframework.exceptions.AnnotationMissingException;

public class SOrmManager {

    public <T> T getEntityById(Long id, Class<T> clazz)  {
        if (id == null){
            throw new IllegalArgumentException("id nemoze byt prazdne");
        }

        if (!isTable(clazz)){
            throw new AnnotationMissingException("Objekt nema anotaciu tabulka");
        }else {
            System.out.println("is table " + clazz.getName());
        }

        //nacitame data z databazy a nasetujeme na objekt
        return null;
    }
}
