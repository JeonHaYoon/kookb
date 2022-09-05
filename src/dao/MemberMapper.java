package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import domain.MemberDTO;
import domain.MemberVO;

public class MemberMapper {

	// C
	public void create(MemberDTO dto) {

		String jdbc_driver = "com.mysql.cj.jdbc.Driver";
		String jdbc_url = "jdbc:mysql://localhost:3306/bigdata?serverTimezone=UTC";
		Connection con = null;
		Statement st = null;

		try {

			Class.forName(jdbc_driver);
			con = DriverManager.getConnection(jdbc_url, "root", "bigdata");
			st = con.createStatement();

//	         INSERT INTO big_member (mb_id, mb_pw, mb_name) 
//	         VALUES ('big004', 'bigdata', '날이야');

			StringBuffer qry = new StringBuffer();
			qry.append(" INSERT INTO big_member (mb_id, mb_pw, mb_name) ");
			qry.append(" VALUES ('" + dto.getMb_id() + "', '" + dto.getMb_pw() + "', '" + dto.getMb_name() + "') ");
			String sql = qry.toString();
			int rs = st.executeUpdate(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				if(st!=null)  st.close();
				if(con!=null)  con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// R
	public List<MemberVO> read() {

		String jdbc_driver = "com.mysql.cj.jdbc.Driver";
		String jdbc_url = "jdbc:mysql://localhost:3306/bigdata?serverTimezone=UTC";
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();    //값이 여러개이므로 배열을 사용해야한다.

		try {

			Class.forName(jdbc_driver);
			con = DriverManager.getConnection(jdbc_url, "root", "bigdata"); // 연결
			st = con.createStatement(); // statement 객체생성

//	         INSERT INTO big_member (mb_id, mb_pw, mb_name) 
//	         VALUES ('big004', 'bigdata', '날이야');

			StringBuffer qry = new StringBuffer();
			qry.append(" SELECT * FROM big_member ORDER BY mb_name ");// 회원 이름별로 오름차순 조회
			String sql = qry.toString();
			
			rs = st.executeQuery(sql); // read는 executeQuery다

			while (rs.next()) { // 첫번째행이 있냐
				list.add(				    //값을 list에 넣는다
						new MemberVO(rs.getString("mb_id"), rs.getString("mb_pw"), rs.getString("mb_name"), 
								null, null, null,null, null, null, null, null,
								rs.getTimestamp("mb_joindate"))
						);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				if(rs !=null)   rs.close();
				if(st!=null)  st.close();
				if(con!=null)  con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	

	// U
//	create->update
	public void update(MemberDTO dto) {

		String jdbc_driver = "com.mysql.cj.jdbc.Driver";
		String jdbc_url = "jdbc:mysql://localhost:3306/bigdata?serverTimezone=UTC";
		Connection con = null;
		Statement st = null;

		try {

			Class.forName(jdbc_driver);
			con = DriverManager.getConnection(jdbc_url, "root", "bigdata");
			st = con.createStatement();

//	         INSERT INTO big_member (mb_id, mb_pw, mb_name) 
//	         VALUES ('big004', 'bigdata', '날이야');

			StringBuffer qry = new StringBuffer();
			qry.append(" UPDATE big_member SET mb_pw='" + dto.getMb_pw() + "', mb_name= '" + dto.getMb_name() + "' ");
			qry.append(" WHERE mb_id='" + dto.getMb_id() + "' ");
			String sql = qry.toString();
			
		
			int rs = st.executeUpdate(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				if(st!=null)  st.close();
				if(con!=null)  con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	

	// D

	
	public void delete(String mb_id) {

		String jdbc_driver = "com.mysql.cj.jdbc.Driver";
		String jdbc_url = "jdbc:mysql://localhost:3306/bigdata?serverTimezone=UTC";
		Connection con = null;
		Statement st = null;

		try {

			Class.forName(jdbc_driver);
			con = DriverManager.getConnection(jdbc_url, "root", "bigdata");
			st = con.createStatement();

//	         INSERT INTO big_member (mb_id, mb_pw, mb_name) 
//	         VALUES ('big004', 'bigdata', '날이야');

			//String->StringBuffer 로 변경
			
			StringBuffer qry = new StringBuffer();
			qry.append(" DELETE FROM big_member ");
			qry.append(" WHERE mb_id='" + mb_id + "' ");
			String sql = qry.toString();
			
//			String sql = " DELETE FROM big_member ";
//			sql += " WHERE mb_id='" + mb_id + "' ";
			
			int rs = st.executeUpdate(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				if(st!=null)  st.close();
				if(con!=null)  con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
