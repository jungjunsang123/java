package model2;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;


public class MemberDAO2 {
	private static MemberDAO2 dao2 = new MemberDAO2();
	private DataSource dataSource2;
	private MemberDAO2() {
		dataSource2 = DataSourceManager2.getInstance().getDataSource();
	}
	public static MemberDAO2 getInstance() {
		return dao2;
	}
	public void closeAll(Connection con, PreparedStatement pstmt, ResultSet rs) throws SQLException {
		if(con!=null) {
			con.close();
		}
		if(pstmt!=null) {
			pstmt.close();
		}
		if(rs!=null) {
			rs.close();
		}
	}
	public int getMemberCount() throws SQLException {
		int count=0;
		Connection con = null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		try {
			String sql="select count(*) from web_member";
			con=dataSource2.getConnection();
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				count=rs.getInt(1);
			}
			
		}finally {
			closeAll(con, pstmt, rs);
		}
		return count;
	}
	public void registerMember(MemberVO2 vo) throws SQLException {
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		 
		try {
			String sql="insert into web_member (id,password,name,address) values(?,?,?,?)";
			con = dataSource2.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setNString(1, vo.getId());
			pstmt.setString(2, vo.getPassword());
			pstmt.setNString(3, vo.getName());
			pstmt.setString(4, vo.getAddress());
			pstmt.executeUpdate();
		}finally {
			closeAll(con, pstmt, rs);
		}
		
	}
	
	
}
