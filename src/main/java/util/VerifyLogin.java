package util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import server.db.StatementManager;

public class VerifyLogin {

	public static synchronized boolean verifyNameandPassword(final String name, final String password){
		
		Statement statement = StatementManager.getStatement();
		String sql = "select * from user where username=\""+name+"\";";
		try {
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()){
			if(name.equals(resultSet.getString("username"))
					&&password.equals(resultSet.getString("userpassword")))
				return true;
			else
				return false;
			}
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public static synchronized boolean verifyPassword(String name, String password) {
		//test
		Statement statement = StatementManager.getStatement();
		String sql = "select * from user where username=\""+name+"\";";
		try {
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()){
			if(name.equals(resultSet.getString("username"))
					&&password.equals(resultSet.getString("userpassword")))
				return true;
			else
				return false;
			}
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public static synchronized boolean verifyName(String name) {
		Statement statement = StatementManager.getStatement();
		String sql = "select * from user where username=\""+name+"\";";
		try {
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()){
			if(name.equals(resultSet.getString("username")))
				return true;
			else
				return false;
			}
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	
}
