package com.martyx.simpleormframework.anotacie;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // dostupne za behu programu
@Target(ElementType.FIELD) // dostupne len nad fieldom
public @interface  ID {

}
