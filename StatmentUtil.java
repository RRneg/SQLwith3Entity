package UtilClass;

import com.mysql.jdbc.Statement;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StatmentUtil {

    public static PreparedStatement getPrStatement(String sql) throws SQLException {
        return ConnectionUtil.getConnect().prepareStatement(sql);
    }

    public static PreparedStatement getPrStatementBackId(String sql) throws SQLException{
        return ConnectionUtil.getConnect().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    }
}
