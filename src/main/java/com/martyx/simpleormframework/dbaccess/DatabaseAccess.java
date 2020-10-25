package com.martyx.simpleormframework.dbaccess;

import java.sql.ResultSet;

public class DatabaseAccess {
    public ResultSet executeQuery(String query) {
        return new ResultSetImpl();
    }
}
