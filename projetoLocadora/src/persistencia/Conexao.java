package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private static final String URL = "jdbc:mysql://localhost:3306/java2";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    public static Connection getConexao() {
        try{
            Connection c = DriverManager.getConnection(URL, USER, PASSWORD);
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
