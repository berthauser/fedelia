package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

/*
 * Creado por bertHäuser - 07/06/2021
 * 
 */

public class DBUtil {
	
	public static Connection conn = null;
	
	public static Boolean dbConnect() {
		try {
			Class.forName("org.sqlite.JDBC");
			String connStr = "jdbc:sqlite::resource:data/fedelia.db";
			conn = DriverManager.getConnection(connStr);
//			DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
//            System.out.println("Driver name: " + dm.getDriverName());
//            System.out.println("Driver version: " + dm.getDriverVersion());
//            System.out.println("Product name: " + dm.getDatabaseProductName());
//            System.out.println("Product version: " + dm.getDatabaseProductVersion());
			return true;
		} catch (SQLException | ClassNotFoundException e) {
			return false;
		}
	}
	
	public static void dbDisconnect() throws SQLException {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}		
		} catch (Exception e) {
			throw e;
		}
	}

	public static ResultSet dbExecuteQuery(String queryStmt) throws SQLException, ClassNotFoundException {
		Statement stmt = null;
		ResultSet resultSet = null;
		try {
			stmt = conn.createStatement();
			resultSet = stmt.executeQuery(queryStmt);
		} catch (SQLException e) {
			Alert alert2 = new Alert(AlertType.ERROR);
			alert2.setTitle("Error de SQL");
			alert2.setContentText("Problema en la ejecución del Query " + e);
			e.printStackTrace();
			alert2.showAndWait();
			throw e;
		}
		return resultSet;
	}
	
	public static int dbExecuteSQL(String queryStmt) throws SQLException, ClassNotFoundException {
		Statement stmt = conn.createStatement();
		ResultSet valorRetorno = stmt.executeQuery(queryStmt);
		int count = 0;

		try {
			if(valorRetorno.next()) {
				count = valorRetorno.getInt(1);
			}
		} catch (SQLException e) {
			Alert alert2 = new Alert(AlertType.ERROR);
			alert2.setTitle("Error de SQL");
			alert2.setContentText("Problema en la ejecución del Query " + e);
			e.printStackTrace();
			alert2.showAndWait();
			throw e;
		}
		return count;
	}
	
	public static Double executeSQL(String queryStmt) throws SQLException, ClassNotFoundException {
		Statement stmt = conn.createStatement();
		ResultSet valorRetorno = stmt.executeQuery(queryStmt);
		Double count = 0.0;
		
		try {
			if(valorRetorno.next()) {
				count = valorRetorno.getDouble(1);
			}
		} catch (SQLException e) {
			Alert alert2 = new Alert(AlertType.ERROR);
			alert2.setTitle("Error de SQL");
			alert2.setContentText("Problema en la ejecución del Query " + e);
			e.printStackTrace();
			alert2.showAndWait();
			throw e;
		}
		return count;
	}

	public static void dbExecuteUpdate(String sqlStmt) throws SQLException, ClassNotFoundException {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sqlStmt);
		} catch (SQLException e) {
			Alert alert2 = new Alert(AlertType.ERROR);
			alert2.setTitle("Error de SQL");
			alert2.setContentText("Problema con operación de Update/Insert/Delete " + e);
			e.printStackTrace();
			alert2.showAndWait();
			throw e;
		}
	}
}