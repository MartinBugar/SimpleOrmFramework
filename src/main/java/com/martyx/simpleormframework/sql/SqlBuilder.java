package com.martyx.simpleormframework.sql;

import java.util.List;

public class SqlBuilder {
    public static String buildQuery(Long id, String tableName, String idColumnName, List<String> tableColumns) {

        StringBuilder stlpce = new StringBuilder();

        for (String s : tableColumns){
            stlpce.append(s).append(","); //do stlpcov pripojim tableColumn + ciarku
        }
        // este potrebujem odsranit poslednu ciarku aby z toho bol sql prikaz
        String stlpceQuery = stlpce.toString().substring(0,stlpce.lastIndexOf(",")); //pojde to od nulteho indexu az po poslednu ciarku, takze mi vypise vsetky culumny doradu

        return String.format("SELECT %s FROM %s WHERE %s=%d", stlpceQuery, tableName, idColumnName,id);
    }
}
