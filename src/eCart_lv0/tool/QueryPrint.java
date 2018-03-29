package eCart_lv0.tool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class QueryPrint {
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    public static int query(GoodsOperate oper) {
        int gid = -1;

        switch (oper) {
            case SEARCH:
                //TODO: query for search of view all goods.
                break;
            case DEL:
                //TODO: query for search of delete goods.
                break;
        }
        return gid;
    }
}