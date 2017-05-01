import java.sql.*;

public class BudgetDao {
    private static final String URL = "jdbc:mysql://localhost:3306/16_budzet_domowy";
    private static final String USER = "root";
    private static final String PASS = "admin";
    private Connection connection;

    public BudgetDao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            System.out.println("No driver found");
        } catch (SQLException e) {
            System.out.println("Could not establish connection");
        }

    }

    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void save(Income income) {
        final String sql = "insert into income(type, description, amout, date) values (?,?,?,?)";
        try {
            PreparedStatement prepStmt = connection.prepareStatement(sql);
            prepStmt.setString(1, income.getType());
            prepStmt.setString(2, income.getDescription());
            prepStmt.setDouble(3, income.getAmout());
            prepStmt.setString(4, income.getDate());
            prepStmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Income read(long id) {
        final String sql = "select id, description, amout, date from income where id=?";
        try {
            PreparedStatement prepStmt = connection.prepareStatement(sql);
            prepStmt.setLong(1, id);
            ResultSet result = prepStmt.executeQuery();
            if ((result.next())) {
                Income income = new Income();
                income.setId(result.getInt("id"));
                income.setType((result.getType("type")));
                income.setDescription(result.getString("description"));
                income.setAmout(result.getDouble("amout"));
                income.setDate(result.getString("date"));

                return income;
            }
        } catch (SQLException e) {
            System.out.println("Could not get income " + e.getMessage());
        }
        return null;
    }

    public void update(Income income) {
        final String sql = "update income set type = ?, description=?, amout=?, date=?";
        try {
            PreparedStatement prepStmt = connection.prepareStatement(sql);
            prepStmt.setString(1, income.getType());
            prepStmt.setString(2, income.getDescription());
            prepStmt.setDouble(3, income.getAmout());
            prepStmt.setString(4, income.getDate());
            prepStmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Could not update record");
        }
    }

    public void delete(long id) {
        final String sql = "delete from income where id = ?";
        try {
            PreparedStatement prepStmt = connection.prepareStatement(sql);
            prepStmt.setLong(1, id);
            prepStmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Could not delete row");
            e.printStackTrace();
        }
    }
}
