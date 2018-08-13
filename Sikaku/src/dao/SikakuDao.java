package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.Sikaku;
import dto.Students;

public class SikakuDao {

	public static Sikaku  searchDao(int key){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Sikaku result = null;

		try {
			// ②JDBCドライバをロードする
			//tes
			Class.forName("com.mysql.jdbc.Driver");

			// ③DBMSとの接続を確立する
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sikaku?useSSL=false",
					"root",
					"sm0902360");
			// ④SQL文を作成する
			String sql = "select students.id,students.name,sikaku.name,sikaku.results,sikaku.day from students,sikaku  where students.sikakuid = sikaku.id;";

			// ⑤SQL文を実行するための準備を行う
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, key);

			// ⑥SQL文を実行してDBMSから結果を受信する
			rs = pstmt.executeQuery();

			// ⑦実行結果を含んだインスタンスからデータを取り出す
			rs.next();
			int id = rs.getInt("id");
			String day = rs.getString("day");
			String name = rs.getString("name");
			String results = rs.getString("results");
            int sikakuid = rs.getInt("sikakuid");

			result = new Sikaku(id,day,name,results);

		} catch (ClassNotFoundException e) {
			System.out.println("JDBCドライバが見つかりません。");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DBアクセス時にエラーが発生しました。");
			e.printStackTrace();
		} finally {
			// ⑧DBMSから切断する
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
		}
		return result;
	}


	public static int insert1Dao(int id, String name, String day,String results){
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

			String sql = "Insert into sikaku values (?,?,?,?)";

			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1,id);
			pstmt.setString(2,name);
			pstmt.setString(3,day);
			pstmt.setString(4,results);

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

public static Sikaku Delete1Dao(int id){
	Sikaku result = null;

	Connection con = null;
	PreparedStatement pstmt = null;
	try{
		Class.forName("com.mysql.jdbc.Driver");

		con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/sikaku?useSSL=false",
				"root",
				"sm0902360");

		String sql = "DELETE FROM sikaku where id = ?";

		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1,id);
		pstmt.executeUpdate();
		result = new Sikaku(id);

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
