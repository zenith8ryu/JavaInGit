package demoMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoMySQL {

	// JDBC �����������ݿ� URL
//	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/default?useSSL=true";

	// ���ݿ���û��������룬��Ҫ�����Լ�������
	static final String USER = "root";
	static final String PASS = "liu_m";

	public static void main(String[] args) {
		Connection conn = null;
//		Statement st = null;
		PreparedStatement ps = null;
		try {
			// ע�� JDBC ����
//			Class.forName("com.mysql.jdbc.Driver");

			// ������
//			System.out.println("�������ݿ�...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// ִ�в�ѯ
//			System.out.println(" ʵ����Statement��...");
			String sql;
			sql = "SELECT id, name, url FROM websites";
			
//			st = conn.createStatement();
			ps = conn.prepareStatement(sql);
//			ResultSet rs = st.executeQuery();
			ResultSet rs = ps.executeQuery();

			
			// չ����������ݿ�
			while (rs.next()) {
				// ͨ���ֶμ���
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String url = rs.getString("url");

				// �������
				System.out.print("ID: " + id);
				System.out.print(", վ������: " + name);
				System.out.print(", վ�� URL: " + url);
				System.out.print("\n");
			}
			// ��ɺ�ر�
			rs.close();
//			st.close();
			ps.close();
			conn.close();
		} catch (SQLException se) {
			// ���� JDBC ����
			se.printStackTrace();
		} catch (Exception e) {
			// ���� Class.forName ����
			e.printStackTrace();
		} finally {
			// �ر���Դ
			try {
//				if (st != null)
				if (ps != null)
//					st.close();
					ps.close();
			} catch (SQLException se2) {
			} // ʲô������
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		System.out.println("Goodbye!");
	}
}
