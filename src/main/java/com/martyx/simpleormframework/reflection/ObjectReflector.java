package com.martyx.simpleormframework.reflection;

import com.martyx.simpleormframework.anotacie.Tabulka;

public class ObjectReflector {
    public static <T> boolean isTable(Class<T> clazz) {
        return clazz.isAnnotationPresent(Tabulka.class);
    }

    public static <T> String getTableName(Class<T> clazz) {
        return clazz.getAnnotation(Tabulka.class).value(); // zisti mi hodnotu v anotaci tabulka v danej triede
    }
}
