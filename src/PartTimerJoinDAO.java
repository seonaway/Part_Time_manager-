import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class PartTimerJoinDAO {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521/xe";
	String user = "c##february";
	String password = "wl887087wl";

	private Connection con;
	private Statement stmt;
	private ResultSet rs;

	public ArrayList<PartTimerVo> list(String pname) {
		ArrayList<PartTimerVo> list = new ArrayList<PartTimerVo>();

		try {
			connDB();

			String query = "SELECT * FROM PartTimers";
			if (pname != null) {
				query += " WHERE name = '" + pname + "'";
			}

			System.out.println(query);
			rs = stmt.executeQuery(query);
			rs.last();
			System.out.println("rs.getRow() : " + rs.getRow());

			if (rs.getRow() == 0) {
				System.out.println("0 row selected.....");
			} else {
				System.out.println(rs.getRow() + " rows selected.....");
				rs.previous();
				while (rs.next()) {
					String name = rs.getString("1");
					String tel = rs.getString("2");
					String part = rs.getString("3");
					String role = rs.getString("4");

					PartTimerVo data = new PartTimerVo(name, tel, part, role);
					list.add(data);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}

	public void connDB() {
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.");
			// stmt = con.createStatement();
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			System.out.println("statement create success.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
