package pack1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;



public class Dbtest6ex {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public Dbtest6ex() {
		dbload();
		insertData();
		showData();
	}
	
	private void dbload() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://192.168.0.193:3306/test","root","123");
		}catch(Exception e) {
			System.out.println("loading fail : " + e);
			
			System.exit(0);
		}
	}
	
	
	private void insertData() {
		try {
			Scanner scanner = new Scanner(System.in);
			
			
				System.out.print("직급: ");
				String jikwonjik = scanner.next();
			
				
				
			
			scanner.close();
			
			
		}catch(Exception e) {
			System.out.println("InsertData err : " + e);
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {

			}
		}
	}
	
	private void showData() {
		try {
			conn = DriverManager.getConnection("jdbc:mariadb://192.168.0.193:3306/test","root","123");
			
			pstmt = conn.prepareStatement("select jikwonno,jikwonname,busername,jikwonjik,jikwongen from jikwon inner join buser on busernum=buserno where jikwonjik");
			rs = pstmt.executeQuery();
			
			
						
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) +" " + rs.getString(5));
			System.out.println("인원수 :" );
			}
		}catch(Exception e) {
			System.out.println("showData err : " + e);
		}finally {
			try {
				if(rs != null)	rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {

			}
		}
	}
	
	
	

	public static void main(String[] args) {
		new Dbtest6ex();

	}

}
