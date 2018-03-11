package simple_prj.ec_lv0.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DbConn {
    /**
     * Connect to MySQL_DB
     *
     * @author zenith8ryu
     */
    public static Connection getConn() {
        Connection conn = null;

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/ec_lv0?useUnicode=true&characterEncoding=utf8&useSSL=true";// "ec_lv0" is name of the connected db instance
        String user = "root";
        String passwd = "pass";

        //Loading MySQL driver
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, passwd);
            System.out.println("DB Connection OK!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("DB Connection failed.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
