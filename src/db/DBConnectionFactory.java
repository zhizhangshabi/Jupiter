
package db;

import db.mysql.MySQLConnection;

public class DBConnectionFactory {
    // This should change based on the pipeline. //在切换不同类型数据库的时候只要改下面这一行所有结果都变了。提供了编程的方便
    private static final String DEFAULT_DB = "mysql";
    
    public static DBConnection getConnection(String db) {
        switch (db) {
        case "mysql":
            // return new MySQLConnection();
        	return new MySQLConnection();
        case "mongodb":
            // return new MongoDBConnection();
            return null;
        default:
            throw new IllegalArgumentException("Invalid db:" + db);
        }

    }

    public static DBConnection getConnection() {
        return getConnection(DEFAULT_DB);
    }
}


