package ch14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcSelect4 {
	
	public static void main(String[] args) throws ClassNotFoundException {
		// db 와 연결
		Connection connection = null;
		// SQL 명령
		PreparedStatement ps = null;
		// 쿼리실행 결과
		ResultSet rs = null;
		// 1.드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("등록실패");
			System.exit(0);
		}
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String db_id = "java";
		String db_pw = "oracle";
		try {
			connection = DriverManager.getConnection(url, db_id, db_pw);
			System.out.println("커넥션 성공");
			
			StringBuffer query = new StringBuffer();
			query.append("delete from tb_user");
			query.append(" where");
			query.append(" user_nm = ?");
			
		
			ps = connection.prepareStatement(query.toString());
			int idx = 1;
			ps.setString(idx++, "팽쭌");
			
			
			int cnt = ps.executeUpdate(); //쿼리문 실행 cnt <-- insert 건수 리턴
			if(cnt > 0) {
				System.out.println(cnt + "행이 삽입되었습니다.");
			}	
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("커넥션 오류 계정정보를 확인하세요");		
	}		finally {
				if(rs != null) {try {rs.close();} catch (SQLException e) {e.printStackTrace();}}
				if(ps != null) {try {ps.close();}catch (SQLException e) {e.printStackTrace();}}
				if(connection != null) {try {connection.close();}catch (SQLException e) {
				}
				}
	}
	}
}