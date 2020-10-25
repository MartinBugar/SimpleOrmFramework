package com.martyx.simpleormframework.reflection;

import com.martyx.simpleormframework.anotacie.Stlpec;
import com.martyx.simpleormframework.anotacie.Tabulka;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ObjectReflector {
    public static <T> boolean isTable(Class<T> clazz) {
        return clazz.isAnnotationPresent(Tabulka.class);
    }

    public static <T> String getTableName(Class<T> clazz) {
        return clazz.getAnnotation(Tabulka.class).value(); // zisti mi hodnotu v anotaci tabulka v danej triede
    }

    public static <T> List<String> getColumnNames(Class<T> clazz) {

        List<String> stlpce = new ArrayList<>();

        for (Field f : clazz.getDeclaredFields()){
            if (f.isAnnotationPresent(Stlpec.class)){ // bude prechadzat doradu vsetky fieldy s anotaciou stlpec
                Stlpec stlpec = f.getAnnotation(Stlpec.class); //ulozi celu anotaciu stlpec
                stlpce.add(stlpec.value()); // vyberie z ulozeneho stlpca hodnotu a vlozi ju do listu
                System.out.println("stlpec: "+ stlpec.value()); // vypiseme si danu hodnotu
            }
        }
        return stlpce;
    }
}
