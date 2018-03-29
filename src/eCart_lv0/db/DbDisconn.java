package eCart_lv0.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class DbDisconn {

    /**
     * Close data stream for addition, update and deletion of goods
     *
     * @param pstmt
     * @param conn
     */
    public static void addClose(PreparedStatement pstmt, Connection conn) {
        try {
            if (pstmt != null) {
                pstmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e2) {
            e2.printStackTrace();
        }
    }

    /**
     * Close data stream for search and query of goods
     *
     * @param rs
     * @param pstmt
     * @param conn
     */
    public static void queryClose(ResultSet rs, PreparedStatement pstmt, Connection conn) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        try {
            if (pstmt != null) {
                pstmt.close();
            }
        } catch (SQLException e2) {
            e2.printStackTrace();
        }
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e3) {
            e3.printStackTrace();
        }
    }
}
