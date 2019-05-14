package cat.iespaucasesnoves.swpro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		consulta1("Anglesa");

	}

	public static void consulta(String nacionalitat) {
		String sql = "Select * from AUTORS where FK_NACIONALITAT='" + nacionalitat + '\'';
		System.out.println(sql);
		try (Connection con = DriverManager.getConnection(
				"jdbc:mysql://192.168.1.134:3306/biblioteca?user=usuari&password=seCret_18&useSSL=false");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql)) {
			int contador = 0;
			while (rs.next()) {
				contador++;
				System.out.println(rs.getString("NOM_AUT"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// PreparedStatement
	public static void consulta1(String nacionalitat) {
		try (Connection con = DriverManager.getConnection(
				"jdbc:mysql://192.168.1.134:3306/biblioteca?user=usuari&password=seCret_18&useSSL=false");
				PreparedStatement st = con.prepareStatement("Select * from AUTORS where FK_NACIONALITAT=?")) {
			st.setString(1, nacionalitat);
			System.out.println(st);
			try (ResultSet rs = st.executeQuery()) {
				while (rs.next()) {
					System.out.println(rs.getString("NOM_AUT"));
				}

			} 
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

}
