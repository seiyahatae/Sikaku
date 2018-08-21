package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.Sikaku;
import dto.Students;

public class SikakuDao {



	public static ArrayList<Students> disp_ichiran(){	//テーブル表示
		ArrayList<Students> resultList = new ArrayList<Students>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sikaku?useSSL=false",
					"root",
					"sm0902360");

			String sql = "select students.id,students.name,sikaku.siname,sikaku.results from students,sikaku  where students.sikakuid = sikaku.siid;";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while(rs.next()){

				String name = rs.getString("name");
				String siname = rs.getString("siname");
				String results = rs.getString("results");



				resultList.add(new Students(name,siname,results, results));

			}
		} catch (SQLException e){
			System.out.println("DBアクセスに失敗しました。");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if( rs != null){
					rs.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if( pstmt != null){
					pstmt.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if( con != null){
					con.close();
				}
			} catch (SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
		}

		return resultList;
	}


	public static int insert1Dao(int siid, String siname, String results){
		int result = 0;

		//変数の初期化
		Connection con = null;
		PreparedStatement pstmt = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sikaku?useSSL=false",
					"root",
					"sm0902360");

			String sql = "Insert into sikaku values (?,?,?)";

			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1,siid);
			pstmt.setString(2,siname);
			pstmt.setString(3,results);

			result = pstmt.executeUpdate();

		} catch (SQLException e){
			System.out.println("DBアクセスに失敗しました。");
			e.printStackTrace();
		} catch (Exception e){
			System.out.println("数字を指定してください。");
		} finally {
			try {
				if( pstmt != null){
					pstmt.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}

			try {
				if( con != null){
					con.close();
				}
			} catch (SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
		}


		return result;
	}

	public static int insert2Dao(int id, String name, String sikakuid){
		int result = 0;

		//変数の初期化
		Connection con = null;
		PreparedStatement pstmt = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sikaku?useSSL=false",
					"root",
					"sm0902360");

			String sql = "Insert into students values (?,?,?)";

			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1,id);
			pstmt.setString(2,name);
			pstmt.setString(3,sikakuid);


			result = pstmt.executeUpdate();

		} catch (SQLException e){
			System.out.println("DBアクセスに失敗しました。");
			e.printStackTrace();
		} catch (Exception e){
			System.out.println("数字を指定してください。");
		} finally {
			try {
				if( pstmt != null){
					pstmt.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}

			try {
				if( con != null){
					con.close();
				}
			} catch (SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
		}


		return result;
	}

	public static Sikaku Delete1Dao(int siid){
		Sikaku result = null;

		Connection con = null;
		PreparedStatement pstmt = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sikaku?useSSL=false",
					"root",
					"sm0902360");

			String sql = "DELETE FROM sikaku where siid = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,siid);
			pstmt.executeUpdate();
			result = new Sikaku(siid);

		} catch (SQLException e){
			System.out.println("DBアクセスに失敗しました。");
			e.printStackTrace();
		} catch (Exception e){
			System.out.println("数字を指定してください。");
		} finally {
			try {
				if( pstmt != null){
					pstmt.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}

			try {
				if( con != null){
					con.close();
				}
			} catch (SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
		}

		return result;
	}

	public static Students Delete2Dao(int id){
		Students result = null;

		Connection con = null;
		PreparedStatement pstmt = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sikaku?useSSL=false",
					"root",
					"sm0902360");

			String sql = "DELETE FROM students where id = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,id);
			pstmt.executeUpdate();
			result = new Students(id);

		} catch (SQLException e){
			System.out.println("DBアクセスに失敗しました。");
			e.printStackTrace();
		} catch (Exception e){
			System.out.println("数字を指定してください。");
		} finally {
			try {
				if( pstmt != null){
					pstmt.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}

			try {
				if( con != null){
					con.close();
				}
			} catch (SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
		}

		return result;
	}
}

