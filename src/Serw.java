import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Serw {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/16_budzet_domowy";
        String userName = "root";
        String password = "admin";
        Connection connection = DriverManager.getConnection(url, userName, password);  // to wzwyż  standardowo dodajemy do baz sql

    }
}