package com.martyx.simpleormframework.dbaccess;

import com.martyx.simpleormframework.exceptions.AnnotationMissingException;
import com.martyx.simpleormframework.reflection.ObjectReflector;
import com.martyx.simpleormframework.sql.SqlBuilder;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SOrmManager {

    public <T> T getEntityById(Long id, Class<T> clazz) throws Exception {

        T o = null;

        if (id == null){
            throw new IllegalArgumentException("id nemoze byt prazdne");
        }

        if (!ObjectReflector.isTable(clazz)){ // ak tam anotacia neni vyhodi  exception
            throw new AnnotationMissingException("Objekt nema anotaciu tabulka");
        }else {
            System.out.println("is table " + clazz.getName());
        }

        //nacitame data z databazy
        ResultSet resultSet = loadData(id, clazz);
        System.out.println(resultSet.getString("ADDRESS"));

        // nasetujeme na objekt

        o = ObjectReflector.getFilledData(resultSet, clazz);

        return null;
    }

    private <T> ResultSet loadData(Long id, Class<T> clazz) {
        String tableName = ObjectReflector.getTableName(clazz);
        List<String> tableColumns = ObjectReflector.getColumnNames(clazz);
        String idColumnName = ObjectReflector.getIdColumnName(clazz);

         String query = SqlBuilder.buildQuery(id,tableName,idColumnName,tableColumns);
        System.out.println(query);

         //ziskat resultset
        DatabaseAccess databaseAccess = new DatabaseAccess();

        return databaseAccess.executeQuery(query);
    }
}
