package simple_prj.ec_lv0.dao;

import simple_prj.ec_lv0.db.DbConn;
import simple_prj.ec_lv0.entity.Goods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GoodsDAO {
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    /**
     * 1. Add a new item into the "goods" table.
     *
     * @param goods item name
     * @return boolean
     */

    public boolean addGoods(Goods goods) {
        boolean bool = false;
        conn = DbConn.get_conn();
        String sql = "INSERT INTO GOODS(GNAME, GPRICE, GNUM) VALUES(?,?,?)";
        
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, goods.getGname());
            pstmt.setDouble(2, goods.getGprice());
            pstmt.setInt(3, goods.getGnum());

            int rs = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            
        }

        return bool;
    }
}
